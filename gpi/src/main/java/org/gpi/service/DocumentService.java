package org.gpi.service;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.gpi.domain.Document;
import org.gpi.utils.HibernateUtil;

public class DocumentService extends HibernateUtil {

	
	@SuppressWarnings("unchecked")
	public List<Document> listPersales() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Document> Documents = null;
		try {
			Documents = (List<Document>) session.createQuery("from Document").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return Documents;
	}

	public Document getDocument(Document Document) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			Document = (Document) session.get(Document.class, Document.getDocumentID());
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return Document;
	}

	public Document addDocument(Document Document) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(Document);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return Document;
	}
	
	public Set<Document> addDocuments(Set<Document> documents) {
		Set<Document> documentsTemp=new HashSet<Document>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		for (Document document : documents) {
			session.beginTransaction();
			document.setDocumentID((Long) session.save(document));
			session.getTransaction().commit();
			documentsTemp.add(document);
		}
		return documentsTemp;
	}

	public Document updateDocument(Document Document) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(Document);
		session.getTransaction().commit();
		return Document;
	}

	public Document deleteDocument(Document Document) throws IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Document = (Document) session.get(Document.class, Document.getDocumentID());
		if (null != Document) {
			session.delete(Document); 
			deleteFile(Document.getUrl());
		}
		session.getTransaction().commit();
		return Document;
	}
	
	private void deleteFile(String Url) throws IOException{
		File fileToDelete = new File(Url);
		fileToDelete.delete();
	}

}