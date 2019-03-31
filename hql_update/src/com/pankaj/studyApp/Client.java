package com.pankaj.studyApp;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Client {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String uqury = "UPDATE Student set sname='and3' WHERE sid=2";
		Query query = session.createQuery(uqury);
		query.executeUpdate();
		
		System.out.println("program executed successfully!!!");
		session.close();
		
	}
}
