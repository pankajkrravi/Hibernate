package org.jspiders.foodApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jspiders.foodApp.dto.FoodDTO;
import org.jspiders.foodApp.util.HibernateUtil;

public class FoodDAO {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public void saveFood(FoodDTO foodDTO) {
		Session session = sessionFactory.openSession();
		
		//Sub-Component 1
		Transaction transaction = session.beginTransaction();
		
		session.save(foodDTO);
		
		transaction.commit();
		
		session.close();
	}
	
	public FoodDTO getFoodById(int primaryKey) {
		Session session = sessionFactory.openSession();
		
		
		FoodDTO foodDTO = session.get(FoodDTO.class, new Integer(primaryKey));
		
		session.close();
		
		return foodDTO;
	}
	
	public FoodDTO UpdateFoodPriceById(int primaryKey, double price) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		FoodDTO foodDTO = session.get(FoodDTO.class, new Integer(primaryKey));
		foodDTO.setPrice(price);
		session.update(foodDTO);
		transaction.commit();
		session.close();
		return foodDTO;
	}
	
	
	
	
	
	
	
}
