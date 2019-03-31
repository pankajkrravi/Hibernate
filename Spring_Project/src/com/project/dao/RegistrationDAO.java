package com.project.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dto.StudentDTO;

//import com.jspiders.spring.dto.UserDTO;

@Repository
public class RegistrationDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Integer saveStudent(StudentDTO studentDTO) {
		Transaction tx = null;
		Integer identifier = null;
		try (Session session = sessionFactory.openSession()) {
			tx = session.beginTransaction();
			identifier = (Integer) session.save(studentDTO);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		return identifier;
	}
	
}