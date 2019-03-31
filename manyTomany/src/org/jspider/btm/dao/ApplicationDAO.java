package org.jspider.btm.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspider.btm.dto.ApplicationDto;

import com.jspiders.hibernate.util.HibernateUtil;

public class ApplicationDAO 
{
	private SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	public void saveApplication(ApplicationDto applicationDto)
	{
		Session session=null;
		Transaction transaction=null;
		try {
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.persist(applicationDto);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
		finally {
			if(session!=null)
			session.close();
		}
		
	}
}
