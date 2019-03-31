package com.mobileApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.mobileApp.dto.MobileDTO;

public class MobileDAo {
	public MobileDTO updateMobDetailsbiId(int id, double mprice) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		MobileDTO md = session.get(MobileDTO.class, id);
		md.setMprice(mprice);
		session.update(md);
		transaction.commit();
		return md;
	}
}