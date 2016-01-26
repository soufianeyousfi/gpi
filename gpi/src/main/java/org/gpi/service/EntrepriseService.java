package org.gpi.service;


import java.util.ArrayList;
import java.util.List;

import org.gpi.domain.Entreprise;
import org.gpi.domain.ProprieteMateriel;
import org.gpi.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class EntrepriseService {
	

	public Entreprise addEntreprise(Entreprise entreprise) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		try {
			
			entreprise.setEntrepriseID((Integer) session.save(entreprise));
		
			session.save(entreprise);
		} catch (HibernateException e) {
			e.printStackTrace();

			session.getTransaction().rollback();
		}
		session.getTransaction().commit();

		session.close();

		return entreprise;

	}

	@SuppressWarnings("unchecked")
	public List<Entreprise> listEnreprise() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
List<Entreprise> entreprises = null ;
		try {
			entreprises = (List<Entreprise>) session.createQuery(
					"from Entreprise").list();

		} catch (Exception e) {
			session.getTransaction().rollback();
		}

		session.getTransaction().commit();
		session.close();
		return entreprises;
	}



	public Entreprise deleteEntreprise(Entreprise entreprise) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			entreprise = (Entreprise) session.get(Entreprise.class,
					entreprise.getEntrepriseID());

			session.delete(entreprise);
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}
		session.getTransaction().commit();
		session.close();

		return entreprise;

	}

	public Entreprise initUpdate(Entreprise entreprise) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			entreprise = (Entreprise) session.get(entreprise.getClass(), entreprise.getEntrepriseID());

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}
		session.getTransaction().commit();
		session.close();

		return entreprise;
	}

	public Entreprise updateEntreprise(Entreprise entreprise) {
Session session = HibernateUtil.getSessionFactory().openSession();
session.beginTransaction();
try {session.update(entreprise);
	
} catch (Exception e) {
	session.getTransaction().rollback();
}
session.getTransaction().commit();
session.close();
		
		
		return entreprise ;
	}

	@SuppressWarnings({ "unchecked" })
	public List<ProprieteMateriel> listMaterielEntreprise(Entreprise entreprise) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<ProprieteMateriel> proprieteMateriels = new ArrayList<ProprieteMateriel>();
	
		
		try {
			
			proprieteMateriels = session.createQuery("FROM ProprieteMateriel WHERE entrepriseID ="+entreprise.getEntrepriseID()+" ").list();
//			proprieteMateriels = (List<ProprieteMateriel>) session.createQuery( "FROM ProprieteMateriel where entreprise.entrepriseID ="+proprieteMateriel.getEntreprise().getEntrepriseID()+" ").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();  
		}
		session.getTransaction().commit();
		session.close();
		return proprieteMateriels;
		
	}

}
