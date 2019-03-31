package com.hql.matrimony.dao;

import javax.persistence.Query;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspiders.hibernate.util.HibernateUtil;

public class StudentDAO {
	SessionFactory factory = HibernateUtil.getSessionFactory();

	public Object[] getstudentDetails(int primarykey)
	{
		Object[] objects = null;
		String hql = "select s.name,s.perc FROM Student s WHERE s.id=:pk";
		try {
			Session session = factory.openSession();
			Query query = session.createQuery(hql);
			query.setParameter("pk", primarykey);
			objects=(Object[])((org.hibernate.query.Query) query).uniqueResult();

		} catch (Exception e) 
		{
		}
		
		return objects;

	}
}
