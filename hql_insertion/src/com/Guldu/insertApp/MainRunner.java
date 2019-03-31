package com.Guldu.insertApp;

import javax.persistence.Entity;
import javax.persistence.Query;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainRunner {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Recuirement recuirement = new Recuirement();
		String iqry = "insert into Recuirement(4,'pk',6.2) ";
		Query query = session.createQuery(iqry);
		query.executeUpdate();
		transaction.commit();
		System.out.println("data inserted into db!!!!");
		session.close();
		factory.close();
	}
}
