package com.pankaj.Demoapp.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.pankaj.Demoapp.dto.MovieDTO;
public class MovieDAO {
	public void savemovieDetails(MovieDTO dto) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
	}
}
