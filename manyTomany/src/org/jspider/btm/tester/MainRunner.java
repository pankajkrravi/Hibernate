package org.jspider.btm.tester;

import java.util.ArrayList;
import java.util.List;

import org.jspider.btm.dao.ApplicationDAO;
import org.jspider.btm.dto.ApplicationDto;
import org.jspider.btm.dto.DeveloperDto;

public class MainRunner {

	public static void main(String[] args) {
		
		ApplicationDto applicationDto = new ApplicationDto();
		applicationDto.setName("Useless App");
		applicationDto.setType("Entertainment");
		applicationDto.setVersion(3.2);
		
		DeveloperDto developerDto = new DeveloperDto();
		developerDto.setName("Pranav");
		developerDto.setSkill("Frameworks,Servlets");
		developerDto.setYearsOfExperience(5.0);
		
		DeveloperDto developerDto1=new DeveloperDto();
		developerDto1.setName("Raj");
		developerDto1.setSkill("Java,Sql,Jdbc,Hadoop");
		developerDto1.setYearsOfExperience(0);
		
		List<DeveloperDto> developerDtos = new ArrayList<DeveloperDto>();
		developerDtos.add(developerDto);
		developerDtos.add(developerDto1);
		
		List<ApplicationDto> applicationDtos = new ArrayList<ApplicationDto>();
		applicationDtos.add(applicationDto);
		
		
		applicationDto.setDevelopersList(developerDtos);
		developerDto.setListOfApplications(applicationDtos);
		developerDto1.setListOfApplications(applicationDtos);
		
		ApplicationDAO applicationDAO = new ApplicationDAO();
		applicationDAO.saveApplication(applicationDto);
		
		
	}

}
