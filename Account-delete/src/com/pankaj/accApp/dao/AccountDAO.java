package com.pankaj.accApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pankaj.accApp.dto.AccountDTO;

public class AccountDAO {
	public void deleteAccount(int primarykey) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		AccountDTO accountDTO = session.get(AccountDTO.class, primarykey);
		session.delete(accountDTO);
		transaction.commit();
		session.close();
	}
}
