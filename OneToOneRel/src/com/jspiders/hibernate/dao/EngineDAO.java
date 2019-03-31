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
	
	public Integer saveEngine(EngineDTO engineDTO, CarDTO carDTO) {
		Transaction tx = null;
		Integer id = null;
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			session.save(carDTO);
			id = (Integer) session.save(engineDTO);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		return id;
	}
}
