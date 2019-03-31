package org.jspiders.hibernate.onetooneuni.apptester;

import org.jspiders.hibernate.onetooneuni.dao.AadharDAO;
import org.jspiders.hibernate.onetooneuni.dto.AadharDTO;
import org.jspiders.hibernate.onetooneuni.dto.PersonDTO;

public class AppTester {
	public static void main(String[] args) {

		PersonDTO personDTO = new PersonDTO();
		personDTO.setAge(25);
		personDTO.setId(1);
		personDTO.setMobileNumber(958476622);
		personDTO.setName("pankaj");
		System.out.println("1");

		AadharDTO aadharDTO = new AadharDTO();
		aadharDTO.setAadharid(5426);
		aadharDTO.setAddress("bihar");
		aadharDTO.setTagline("amm aadhmi");
		System.out.println("2");
		aadharDTO.setDto(personDTO);
		System.out.println("3");

		AadharDAO aadharDAO = new AadharDAO();
		System.out.println("4");
		long val = aadharDAO.saveAadhar(aadharDTO, personDTO);
		System.out.println("5");

	}

}
