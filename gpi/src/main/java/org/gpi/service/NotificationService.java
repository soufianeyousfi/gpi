package org.gpi.service;

import java.util.ArrayList;
import java.util.List;

import org.gpi.domain.Notification;
import org.gpi.domain.Iuser;
import org.gpi.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class NotificationService extends HibernateUtil {


	
	public Notification getNotification(Notification notification) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			notification=(Notification) session.get(Notification.class,notification.getNotificationID() );
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return notification;
	}

	
	public Notification addNotification(Notification notification) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(notification);
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return notification;
	}


	@SuppressWarnings("unchecked")
	public List<Notification> getNotificationsByUser(Iuser iuser) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Notification> notifications = new ArrayList<Notification>();
		try {
		SQLQuery query = null;
		if(Iuser.ADMIN.equals(iuser.getType())){
			 query=session.createSQLQuery("SELECT Notification.NotificationID,Notification.name,Notification.seen,Notification.description,ADMIN.materielID "
						+ "FROM Notification,Admin  WHERE Notification.notificationID=Admin.notificationID AND (AdminID="+iuser.getIuserID()+") ORDER BY Notification.NotificationID desc");
		}
//		else if(User.EXPERT_TECHNIQUE.equals(user.getType())){
//			 query=session.createSQLQuery("SELECT Notification.NotificationID,Notification.name,Notification.seen,Notification.description,ExpertTechniqueAssignment.presaleID "
//					+ "FROM Notification,ExpertTechniqueAssignment  WHERE ExpertTechniqueAssignment.NotificationID=Notification.NotificationID AND (ExpertTechniqueAssignment.expertTechniqueID="+user.getUserID()+") ORDER BY Notification.NotificationID desc");
//		}
		
		query.addEntity(Notification.class);
		notifications=query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return notifications;
	}
	@SuppressWarnings("unchecked")
	public List<Notification> listNotification() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Notification> notifications = new ArrayList<>();
		try {
		
			 notifications =   session.createQuery(" from Notification where seen=null ").list()		;
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		System.out.println(notifications.get(0).getDescription());
		return notifications;
	}
	
	public Long countNotificationsByUser(Iuser iuser) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Long count=new Long(0);
		try {
		SQLQuery query = null;
		if(Iuser.ADMIN.equals(iuser.getType())){
			 query=session.createSQLQuery("SELECT Notification.NotificationID,Notification.name,Notification.seen,Notification.description,Admin.materielID "
						+ "FROM Notification,BussinessAnalystAssignment  WHERE Notification.notificationID=BussinessAnalystAssignment.notificationID AND (BussinessAnalystAssignment.bussinessAnalystID="+iuser.getIuserID()+") AND (Notification.seen=0) ORDER BY Notification.NotificationID desc");
		}
//		else if(User.EXPERT_TECHNIQUE.equals(user.getType())){
//			 query=session.createSQLQuery("SELECT Notification.NotificationID,Notification.name,Notification.seen,Notification.description,ExpertTechniqueAssignment.presaleID "
//					+ "FROM Notification,ExpertTechniqueAssignment  WHERE ExpertTechniqueAssignment.NotificationID=Notification.NotificationID AND (ExpertTechniqueAssignment.expertTechniqueID="+user.getUserID()+") AND (Notification.seen=0) ORDER BY Notification.NotificationID desc");
//		}
		query.addEntity(Notification.class);
		count=(long) query.list().size();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return count;
	}


	public void updateNotificationStatut(Notification notificationInstance) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			notificationInstance=(Notification) session.get(Notification.class,notificationInstance.getNotificationID() );
			notificationInstance.setSeen(true);
			session.saveOrUpdate(notificationInstance);
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		
	}
	

}