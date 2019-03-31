package com.hql.matrimony.tester;

import com.hql.matrimony.dao.StudentDAO;
import com.hql.matrimony.dto.Student;

public class AppTester 
{public static void main(String[] args) {
	

Student student=new Student();


StudentDAO studentDAO =new StudentDAO();

Object[] ref=studentDAO.getstudentDetails(2);




for (Object object : ref)
{
	System.out.println(object);
}

}
}
