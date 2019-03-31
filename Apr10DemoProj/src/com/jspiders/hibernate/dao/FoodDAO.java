package com.jspiders.hibernate.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.jspiders.hibernate.dto.FoodDTO;
import com.jspiders.hibernate.util.HibernateUtil;
public class FoodDAO {
	private SessionFactory factory = HibernateUtil.getSessionFactory();
	public void saveFood(FoodDTO dto) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(dto);
		tx.commit();
	}
	public FoodDTO getFood(int primaryKey) {
		Session session = factory.openSession();

		FoodDTO foodDTO = session.get(FoodDTO.class, new Integer(primaryKey));
		return foodDTO;
	}
}
