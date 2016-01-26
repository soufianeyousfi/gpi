package org.gpi.service;

import java.util.ArrayList;
import java.util.List;

import org.gpi.domain.Iuser;
import org.gpi.domain.ProprieteMateriel;
import org.gpi.domain.Statut;
import org.gpi.domain.TypeMateriel;
import org.gpi.domain.User;
import org.gpi.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;



public class ProprieteService extends HibernateUtil {

	public ProprieteMateriel addPropriete(ProprieteMateriel proprieteMateriel) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			session.saveOrUpdate(proprieteMateriel);
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}

		session.getTransaction().commit();

		session.close();
		return proprieteMateriel;

	}

	@SuppressWarnings({ "unchecked" })
	public List<ProprieteMateriel> listMateriel() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<ProprieteMateriel> proprieteMateriels = null;
		
	
		try {
			proprieteMateriels = (List<ProprieteMateriel>) session.createQuery( "FROM ProprieteMateriel where archive = null and statutID != 6").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();  
		}
		session.getTransaction().commit();
		session.close();
		return proprieteMateriels;

	}
	@SuppressWarnings("unchecked")
	public List<ProprieteMateriel> listImprimante() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<ProprieteMateriel> proprieteMateriels = null;
		try {
			
			proprieteMateriels = (List<ProprieteMateriel>) session.createQuery( "FROM ProprieteMateriel where typeMaterielID=2 and archive = null and statutID != 6").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();  
		}
		session.getTransaction().commit();
		session.close();
		return proprieteMateriels;
		
	}
	@SuppressWarnings("unchecked")
	public List<ProprieteMateriel> listComputer() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<ProprieteMateriel> proprieteMateriels = null;
		try {
			
			proprieteMateriels = (List<ProprieteMateriel>) session.createQuery( "FROM ProprieteMateriel where typeMaterielID=1 and archive = null and statutID != 6 ").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();  
		}
		session.getTransaction().commit();
		session.close();
		return proprieteMateriels;
		
	}
	@SuppressWarnings("unchecked")
	public List<ProprieteMateriel> listArchive() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<ProprieteMateriel> proprieteMateriels = null;
		try {
			
			proprieteMateriels = (List<ProprieteMateriel>) session.createQuery( "FROM ProprieteMateriel where statutID=6 or archive=1").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();  
		}
		session.getTransaction().commit();
		session.close();
		return proprieteMateriels;
		
	}

	public ProprieteMateriel initUpdate(ProprieteMateriel proprieteMateriel) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		try {
			proprieteMateriel = (ProprieteMateriel) session.get(
					proprieteMateriel.getClass(),
					proprieteMateriel.getMaterID());

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

		session.getTransaction().commit();
		session.close();
		return proprieteMateriel;
	}

	public ProprieteMateriel updateMateriel(ProprieteMateriel proprieteMateriel) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			session.saveOrUpdate(proprieteMateriel);

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}
		session.getTransaction().commit();
		session.close();

		return proprieteMateriel;

	}


	public ProprieteMateriel deleteMateriel(Iuser iuser ,ProprieteMateriel proprieteMateriel) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
	
	
		proprieteMateriel = getProprieteMateriel(proprieteMateriel);
		proprieteMateriel.setArchive(true);
		proprieteMateriel.setUser((User) iuser);
		

			
			session.saveOrUpdate(proprieteMateriel);
			
			
			
//			session.delete(proprieteMateriel);

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}
		session.getTransaction().commit();
		session.close();
	
		return proprieteMateriel;
		
	}
	public ProprieteMateriel confirmDeleteMateriel(ProprieteMateriel proprieteMateriel) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			
			
			
			session.delete(proprieteMateriel);
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			
		}
		session.getTransaction().commit();
		session.close();
		
		return proprieteMateriel;
		
	}

	@SuppressWarnings("unchecked")
	public List<TypeMateriel> initCreate() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<TypeMateriel>typeMateriels = null ;
		
		try { typeMateriels = (List<TypeMateriel>) session.createQuery("from TypeMateriel").list();
		
		} catch (HibernateException e) {
		e.printStackTrace();
		session.getTransaction().rollback();
		
		}
		session.getTransaction().commit();
		session.close();
		
		return typeMateriels  ;
		
	}

	public ProprieteMateriel getProprieteMateriel(
			ProprieteMateriel proprieteMateriel) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try { proprieteMateriel = (ProprieteMateriel) session.get(proprieteMateriel.getClass(),proprieteMateriel.getMaterID());
			
		} catch (HibernateException e) {
		e.printStackTrace();
		session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return proprieteMateriel;
	}

   
   public TypeMateriel getType(TypeMateriel typeMateriel){
	  
	   Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {		typeMateriel = (TypeMateriel) session.get(TypeMateriel.class, typeMateriel.getTypeMaterielID());

			
		} catch (HibernateException e) {
e.printStackTrace();
session.getTransaction().rollback();
		} 
		
		
		session.getTransaction().commit();
		session.close();
	   return typeMateriel;
	   
   }
//    Init Create Form with liste Status
   
   @SuppressWarnings("unchecked")
	public List<Statut> listStatut() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Statut> statuts = null ;
		
		try { statuts = (List<Statut>) session.createQuery("from Statut").list();
		
		} catch (HibernateException e) {
		e.printStackTrace();
		session.getTransaction().rollback();
		
		}
		session.getTransaction().commit();
		session.close();
		
		return statuts  ;
		
	}



   @SuppressWarnings("unchecked")
public List<ProprieteMateriel> search(String q) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<ProprieteMateriel> proprieteMateriels = new ArrayList<ProprieteMateriel>();
		try {
			
		
				
				proprieteMateriels = (List<ProprieteMateriel>) session.createQuery("FROM ProprieteMateriel WHERE nom Like '%"+q+"%' or ppm Like '%"+q+"%' order by nom asc").list();}
					
			
			
		 catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return proprieteMateriels;
	}
   


}
