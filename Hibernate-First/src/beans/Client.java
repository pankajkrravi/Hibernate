package beans;

import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {
		STUDENTBEAN studentbean = new STUDENTBEAN();
		studentbean.setId(120);
		studentbean.setName("pankaj");
		studentbean.setEmail("pankajravi25@gmail.com");
		studentbean.setMarks(600);
		// student obj is transiant
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		session.save(studentbean);
		// student obj state is persist
		session.beginTransaction().commit();
		// student obj will be move to db
		session.evict(studentbean);
		// student obj will be deleted(remove)  from persistance 
		//then gc can collect yr student object
	}
}
