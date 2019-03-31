package com.pankaj.LapApp.dao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pankaj.LapApp.dto.LaptopDTO;
public class LaptopADAO {
	/*insert the data 
	 * public void savelaptop(LaptopDTO laptopDTO) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Transaction tx = null;
		Session session = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(laptopDTO);//save data in db
			tx.commit();
			session.close();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
	}*/
		/*fetch the data 
		 * 
		 * public LaptopDTO getlaptopByid(int primarykey)

		{
			Configuration configuration = new Configuration();
			configuration.configure();

			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session=sessionFactory.openSession();
			LaptopDTO rs=session.get(LaptopDTO.class, new Integer(primarykey));//fetch record by id
			session.close();
			return rs;
		}*/
	
	/*UPDATE RECORD BY ID
	public LaptopDTO updatePriceById(int primarykey,double price)
	{
		Configuration cf=new  Configuration();
		cf.configure();
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction ctx=session.beginTransaction();
		LaptopDTO lp=session.get(LaptopDTO.class, new Integer(primarykey));

			lp.setPrice(price);
			session.update(lp);
			ctx.commit();
			return lp;
}*/
	public void deleteByid(int primaryke)
	{
		
		Configuration cf=new  Configuration();
		cf.configure();
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction ctx=session.beginTransaction();
		
		LaptopDTO laptopDTO=session.get(LaptopDTO.class, primaryke);
		session.delete(laptopDTO);
		ctx.commit();
		session.close();
	}
}
