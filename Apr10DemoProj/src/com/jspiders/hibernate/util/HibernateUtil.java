package com.jspiders.hibernate.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	private static final SessionFactory factory;
	static {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.xml");
		factory = cfg.buildSessionFactory();
		System.out.println("factory object created");
	}
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
