package com.jspiders.relation.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernate.util.HibernateUtil;
import com.jspiders.relation.dto.StateDTO;

public class StateDAO {

private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public void saveState(List<StateDTO> stateDTOList) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			for (StateDTO stateDTO : stateDTOList) {
				session.persist(stateDTO);
			}
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
	}

}
