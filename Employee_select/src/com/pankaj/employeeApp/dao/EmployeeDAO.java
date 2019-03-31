package com.pankaj.employeeApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.pankaj.employeeApp.dto.employeeDTO;
public class EmployeeDAO {
	public employeeDTO selectrecord(int primarykey) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		employeeDTO rs = session.get(employeeDTO.class, primarykey);
		session.close();
		return rs;
	}
}
