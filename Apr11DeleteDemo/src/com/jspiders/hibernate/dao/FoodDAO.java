package com.jspiders.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.hibernate.dto.FoodDTO;
import com.jspiders.hibernate.util.HibernateUtil;

public class FoodDAO {

	private SessionFactory factory = HibernateUtil.getSessionFactory();

	public void saveFood(FoodDTO dto) {
		Session session = null;
		Transaction tx = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			session.save(dto);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

	public FoodDTO getFood(int primaryKey) {
		FoodDTO foodDTO = null;
		Session session = null;
		try {
			session = factory.openSession();
			foodDTO = session.get(FoodDTO.class, new Integer(primaryKey));
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return foodDTO;
	}
	
	public void updateFoodTypeById(int primaryKey, String type) {
		FoodDTO foodDTO = null;
		Session session = null;
		Transaction tx = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			foodDTO = session.load(FoodDTO.class, new Integer(primaryKey));
			foodDTO.setType(type);
			session.update(foodDTO);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

}
