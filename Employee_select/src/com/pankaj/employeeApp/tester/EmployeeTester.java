package com.pankaj.employeeApp.tester;

import com.pankaj.employeeApp.dao.EmployeeDAO;
import com.pankaj.employeeApp.dto.employeeDTO;

public class EmployeeTester {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		employeeDTO dto = dao.selectrecord(1);
		System.out.println("name  =" + dto.getEname() + "  salary =" + dto.getEsal());
	}
}
