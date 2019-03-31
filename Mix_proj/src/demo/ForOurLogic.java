package demo;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ForOurLogic {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Query qry = session.createQuery("delete from Product pwhere p.productId=:java4s");
		qry.setParameter("java4s", 110);
		int res = qry.executeUpdate();

		System.out.println("Command successfully executed....");
		System.out.println("Numer of records effected due to delete query" + res);

		session.close();
		factory.close();
	}

}