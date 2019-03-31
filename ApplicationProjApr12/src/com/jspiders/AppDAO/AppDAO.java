package com.jspiders.AppDAO;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.jspiders.AppDTO.AppDTO;
public class AppDAO {
	public void saveApp(AppDTO dto)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();
		
	}
}
