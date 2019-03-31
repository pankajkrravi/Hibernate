package com.jspiders.hibernate.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.hibernate.dto.PersonDTO;


public class PersonDAO {

	
	public Integer savePerson(PersonDTO personDTO) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session = null;
		Transaction transaction = null;
		Integer primaryKey = null;
		try {
			
			
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			primaryKey = (Integer) session.save(personDTO);
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
}
