package com.jspiders.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.hibernate.dto.AadharDTO;
import com.jspiders.hibernate.dto.PersonDTO;

public class AadharDAO {

//	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Configuration configuration=new Configuration();
	
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	
	public Long saveAadhar(AadharDTO aadharDTO) {
		
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session = null;
		Transaction transaction = null;
		Long primaryKey = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			primaryKey = (Long) session.save(aadharDTO);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return primaryKey;
	}
	
	public AadharDTO fetchAadharById(long primaryKey) {
		Session session = null;
		AadharDTO aadharDTO = null;
		try {
			session = sessionFactory.openSession();
			aadharDTO = session.get(AadharDTO.class, new Long(primaryKey));
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return aadharDTO;
	}
}
