package com.jspiders.relation.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernate.util.HibernateUtil;
import com.jspiders.relation.dto.CountryDTO;

public class CountryDAO {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public Integer saveCountry(CountryDTO countryDTO) {
		Session session = null;
		Transaction transaction = null;
		Integer identifier = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			identifier = (Integer) session.save(countryDTO);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return identifier;
	}
}
