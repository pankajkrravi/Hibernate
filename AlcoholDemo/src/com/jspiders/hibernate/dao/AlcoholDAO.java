package com.jspiders.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import com.jspdiders.hibernate.util.HibernateUtil;
import com.jspiders.hibernate.dto.AlcohalDTO;
import com.jspiders.hibernate.util.HibernateUtil;

public class AlcoholDAO {
	private  SessionFactory factory=HibernateUtil.getSessionFactory();
	
	public void save(AlcohalDTO alchDto)
	{
		/*Session session=null;
		Transaction tx= null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			session.save(alchDto);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		finally
		{
			if(session !=null)	
				session.close();
		}*/
			String hql="update alco_table set Alco_name='abc' from hibernatedb.alco_table where Alco_id=1";
	}
}
