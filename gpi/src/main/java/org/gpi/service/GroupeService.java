package org.gpi.service;

import java.util.List;

import org.gpi.domain.Entreprise;
import org.gpi.domain.Groupe;
import org.gpi.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class GroupeService {

	
	
	@SuppressWarnings("unchecked")
	public List<Groupe> listGroupe() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Groupe> groupes = null;
		try {
			
			groupes = session.createQuery("from Groupe ").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		
		return groupes;
	}



public Groupe addGroupe(Groupe groupe){
	Session session = HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	try {
		session.save(groupe);
		
	} catch (HibernateException e) {
e.printStackTrace();
	session.getTransaction().rollback();
	}
	
	session.getTransaction().commit();
	session.close();
	return groupe;
}
	
	
	
	@SuppressWarnings("unchecked")
	public List<Entreprise> listEntreprise() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Entreprise> entreprises = null;
		try {
			
			entreprises = session.createQuery("from Entreprise").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
//		System.out.println(entreprises.get(0));
		
		return entreprises;
		
	}
	

}
