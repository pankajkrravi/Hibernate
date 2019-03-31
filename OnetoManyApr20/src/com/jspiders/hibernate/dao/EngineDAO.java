package com.jspiders.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.jspiders.hibernate.dto.CarDTO;
import com.jspiders.hibernate.dto.EngineDTO;
import com.jspiders.hibernate.util.HibernateUtil;

public class EngineDAO {

	private SessionFactory factory = HibernateUtil.getSessionFactory();
	
	public Integer saveEngine(EngineDTO engineDTO) {
		Transaction tx = null;
		Integer id = null;
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			id = (Integer) session.save(engineDTO);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		return id;
	}

	public EngineDTO getEngineById(int primaryKey) {
		EngineDTO engine = null;
		Session session = null;
		try {
			session = factory.openSession();
			engine = session.get(EngineDTO.class, new Integer(primaryKey));
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return engine;
	}
	
	
}
