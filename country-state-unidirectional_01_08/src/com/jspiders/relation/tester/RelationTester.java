package com.jspiders.relation.tester;

import java.util.ArrayList;
import java.util.List;

import com.jspiders.relation.dao.CountryDAO;
import com.jspiders.relation.dao.StateDAO;
import com.jspiders.relation.dto.CountryDTO;
import com.jspiders.relation.dto.StateDTO;

public class RelationTester {

	public static void main(String[] args) {
		CountryDTO countryDTO = new CountryDTO();
		countryDTO.setCountryName("India");
		countryDTO.setCountryCode(91);
		countryDTO.setTimeZone("+530");
		
		StateDTO stateDTO1 = new StateDTO();
		stateDTO1.setStateName("Karnataka");
		stateDTO1.setPopulation(6000000);
		stateDTO1.setCountry(countryDTO);
		
		StateDTO stateDTO2 = new StateDTO();
		stateDTO2.setStateName("Rajasthan");
		stateDTO2.setPopulation(6000000);
		stateDTO2.setCountry(countryDTO);
		
		StateDTO stateDTO3 = new StateDTO();
		stateDTO3.setStateName("Orissa");
		stateDTO3.setPopulation(10000000);
		stateDTO3.setCountry(countryDTO);

		
		List<StateDTO> listOfSates = new ArrayList<StateDTO>();
		listOfSates.add(stateDTO1);
		listOfSates.add(stateDTO2);
		listOfSates.add(stateDTO3);
		/*CountryDAO countryDAO = new CountryDAO();
		Integer primaryKey= countryDAO.saveCountry(countryDTO);
		
		System.out.println("Country saved with ID: " + primaryKey);*/
		
		StateDAO stateDAO = new StateDAO();
		stateDAO.saveState(listOfSates);
	}

}
