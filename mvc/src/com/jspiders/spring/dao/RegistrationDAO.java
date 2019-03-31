package com.jspiders.spring.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspiders.spring.dto.UserDTO;

@Repository
public class RegistrationDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer saveUser(UserDTO userDTO) {
		Transaction tx = null;
		Integer identifier = null;
		try(Session session = sessionFactory.openSession()) {
			tx = session.beginTransaction();
			identifier = (Integer) session.save(userDTO);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		return identifier;
	}
}
