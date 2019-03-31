package com.jspiders.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.hibernate.dto.FoodDTO;

public class FoodDAO {

	public void saveFood(FoodDTO dto) {
		//component-1
		Configuration cfg = new Configuration();
		cfg.configure();
		
		//component-2
		SessionFactory factory = cfg.buildSessionFactory();
		
		//component-3
		Session session = factory.openSession();
		
		//sub-component-1
		Transaction tx = session.beginTransaction();
		
		session.save(dto);
	
		tx.commit();
	}
}
