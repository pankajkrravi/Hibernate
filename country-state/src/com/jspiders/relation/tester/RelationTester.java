package com.jspiders.relation.tester;

import java.util.ArrayList;
import java.util.List;

import com.jspiders.relation.dao.CountryDAO;
import com.jspiders.relation.dao.StateDAO;
import com.jspiders.relation.dto.CountryDTO;
import com.jspiders.relation.dto.StateDTO;

public class RelationTester {

	public static void main(String[] args) {
/*		CountryDTO countryDTO = new CountryDTO();
		countryDTO.setCountryName("Pakistan");
		countryDTO.setCountryCode(92);
		countryDTO.setTimeZone("+530");
		
		StateDTO stateDTO1 = new StateDTO();
		stateDTO1.setStateName("Lahore");
		stateDTO1.setPopulation(6000000);
		stateDTO1.setCountry(countryDTO);
		
		StateDTO stateDTO2 = new StateDTO();
		stateDTO2.setStateName("Karachi");
		stateDTO2.setPopulation(6000000);
		stateDTO2.setCountry(countryDTO);
		
		StateDTO stateDTO3 = new StateDTO();
		stateDTO3.setStateName("Hyderabad");
		stateDTO3.setPopulation(10000000);
		stateDTO3.setCountry(countryDTO);


		StateDTO stateDTO4 = new StateDTO();
		stateDTO4.setStateName("Biryani Galli");
		stateDTO4.setPopulation(10000000);
		stateDTO4.setCountry(countryDTO);
		
		List<StateDTO> listOfStates = new ArrayList<StateDTO>();
		listOfStates.add(stateDTO1);
		listOfStates.add(stateDTO2);
		listOfStates.add(stateDTO3);
		listOfStates.add(stateDTO4);
		
		countryDTO.setListOfStates(listOfStates);
		
		CountryDAO countryDAO = new CountryDAO();
		Integer primaryKey= countryDAO.saveCountry(countryDTO);
		
		System.out.println("Country saved with ID: " + primaryKey);*/
		
		/*StateDAO stateDAO = new StateDAO();
		stateDAO.saveState(listOfStates);*/
		
		CountryDAO countryDAO = new CountryDAO();
		CountryDTO countryDTO = countryDAO.fetchCountryById(1);
		if (countryDTO != null) {
			System.out.println("Country Name: " + countryDTO.getCountryName());
			System.out.println("Country Code: " + countryDTO.getCountryCode());
			System.out.println("Number of states: " + countryDTO.getListOfStates().size());
			/*List<StateDTO> listOfStates = countryDTO.getListOfStates();
			for (StateDTO stateDTO : listOfStates) {
				System.out.println("--------------------------------");
				System.out.println(stateDTO.getStateName());
				System.out.println("--------------------------------");
			}*/
		}
	}

}
