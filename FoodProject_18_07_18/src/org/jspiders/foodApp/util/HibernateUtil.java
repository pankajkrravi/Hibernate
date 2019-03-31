package org.jspiders.foodApp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory factory;
	
	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
