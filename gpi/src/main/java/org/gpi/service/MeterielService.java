package org.gpi.service;

import org.gpi.domain.Materiel;
import org.gpi.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class MeterielService {

	public  Materiel addMateriel(Materiel materiel) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			session.save(materiel);
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		
		
		session.close();
		return materiel;

	}

}
