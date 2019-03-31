package com.demoApp;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainrunner {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		OldStudent oldStudent=new OldStudent();
		Query query = session.createQuery(
				"insert into student9(id,name,email,address) select from s.id,s.name,s.email s.address fromstudent8 s");
		session.save(oldStudent);
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
