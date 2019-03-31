package com.jspiders.hibernate.tester;

import com.jspiders.hibernate.dao.AadharDAO;
import com.jspiders.hibernate.dao.PersonDAO;
import com.jspiders.hibernate.dto.AadharDTO;
import com.jspiders.hibernate.dto.PersonDTO;

public class RelationTester {

	public static void main(String[] args) 
	{
		/*PersonDTO personDTO = new PersonDTO();
		
		AadharDTO aadharDTO = new AadharDTO();
		
		personDTO.setName("Divyesh");
		personDTO.setMobileNumber(999999);
		personDTO.setAge(99.9);
		
		aadharDTO.setAddress("Gujarat");
		aadharDTO.setTagline("Bhaio aur beheno");
		
		//bi-directional relationship
		aadharDTO.setPerson(personDTO);
		personDTO.setAadhar(aadharDTO);
		*/
		/*AadharDAO aadharDAOs = new AadharDAO();
		aadharDAO.saveAadhar(aadharDTO);*/
		
		/*PersonDAO personDAO = new PersonDAO();
		personDAO.savePerson(personDTO);*/
		
		AadharDAO aadharDAO = new AadharDAO();
		AadharDTO aadharDTO = aadharDAO.fetchAadharById(9);
		if (aadharDTO != null) {
			PersonDTO personDTO = aadharDTO.getPerson();
			
			System.out.println("Address: " + aadharDTO.getAddress());
			System.out.println("Name of the person with id 2: "+ personDTO.getName());
		}
	}

}
