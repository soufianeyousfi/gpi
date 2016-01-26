package org.gpi.service;

import java.util.List;

import org.gpi.domain.Admin;
import org.gpi.domain.Iuser;
import org.gpi.domain.User;
import org.gpi.exception.LoginIncorrectException;
import org.gpi.utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class IUserService {

	public Iuser authentificationUser(Iuser userInstance) throws LoginIncorrectException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		try {
			Criteria userCriteria = session.createCriteria(User.class);
			userCriteria.add(Restrictions.like("login",userInstance.getLogin()));
			Criteria adminCriteria = session.createCriteria(Admin.class);
			adminCriteria.add(Restrictions.like("login",userInstance.getLogin()));
		
			if (userCriteria.list().size() > 0) {
				User user=(User) userCriteria.list().get(0);
				user.setType(Iuser.User);
				return user;
			} else if (adminCriteria.list().size() > 0) {
				Admin admin=(Admin) adminCriteria.list().get(0);
				admin.setType(Iuser.ADMIN);
				return  admin;
			
			} else
				throw new LoginIncorrectException();
		} catch (HibernateException e) {
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return null;
	}

	public User addUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try{
		session.save(user); }
		catch (HibernateException e){
			e.printStackTrace();
			System.err.println("can t save Object User");
		session.getTransaction().rollback();}
		session.getTransaction().commit();
		
		session.close();
		return user;
		
	}

	@SuppressWarnings("unchecked")
	public List<Iuser> listUser(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Iuser>	users = null;
		try {
			
		users = (List<Iuser>) session.createQuery("FROM User").list();
		
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		
		session.getTransaction().commit();
		session.close();
		return users;
	}
	
	
	
	public User deleteUser(User user) {
		Session session =  HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			user = (User) session.get(User.class, user.getIuserID());
			session.delete(user);
			
		} catch (HibernateException e) {
session.getTransaction().rollback();
		}
		
		session.getTransaction().commit();
		
		session.close();
		return user;
	
		
	}

	public User initUpdateUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
try {
	user =	(User)session.get(user.getClass(), user.getIuserID()) ;

} catch (HibernateException e) {
	e.printStackTrace();
	session.getTransaction().rollback();
	
}
		
	session.getTransaction().commit();	
		session.close();
		
		return user;
		
		
	}

	public User updateUser(User user){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			session.update(user);
		} catch (Exception e) {
session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return user;
		
		
		
	}
	
}
