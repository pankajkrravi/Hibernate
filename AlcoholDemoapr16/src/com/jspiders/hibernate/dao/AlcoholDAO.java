package com.jspiders.hibernate.dao;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.jspiders.hibernate.dto.AlcohalDTO;
import com.jspiders.hibernate.util.HibernateUtil;
public class AlcoholDAO {
	private  SessionFactory factory=HibernateUtil.getSessionFactory();
	public void save(AlcohalDTO alchDto)
	{
		Session session=null;
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
		}
	}
	public AlcohalDTO getAlcoholByName(String name) {
		
		Session session = null;
		AlcohalDTO dto = null;
		try {
			String hql = "SELECT alcohol FROM AlcohalDTO alcohol WHERE alcohol.name=:nm";
			session = factory.openSession();
			Query query = session.createQuery(hql);
			query.setParameter("nm", name);
			dto = (AlcohalDTO) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return dto;
	}
}
