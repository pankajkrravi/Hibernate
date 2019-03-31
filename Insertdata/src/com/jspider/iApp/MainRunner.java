package com.jspider.iApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainRunner {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Customer customer1 = new Customer("pankanj", 12, "Hyd", 85000.12);
		Customer customer2 = new Customer("ravi", 45, "btm", 50000.12);
		Customer customer3 = new Customer("Dinga", 10, "KA", 6000.12);
		session.save(customer1);
		session.save(customer2);
		session.save(customer3);
		transaction.commit();
		System.out.println("Data ibsetted in db!!!!");
		session.close();
		factory.close();
	}
}
