package com.jspiders.hibernate.dao;

/*import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;*/

import com.jspiders.hibernate.dto.FoodDTO;

public class FoodDAO {

	public void saveFood(FoodDTO dto) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(dto);
	
		tx.commit();
	}

	public FoodDTO getFood(int primaryKey) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		FoodDTO foodDTO = session.get(FoodDTO.class, new Integer(primaryKey));
		
		return foodDTO;
	}
	
	
}
