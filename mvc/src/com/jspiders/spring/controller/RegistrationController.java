package com.jspiders.spring.controller;

//import java.io.IOException;

//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.spring.dto.UserDTO;
import com.jspiders.spring.service.RegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;

	/*@PostMapping("/reg.do")
	public String registerUser(@RequestParam String name, @RequestParam String password, @RequestParam Long contactNumber) {
		System.out.println(name);
		System.out.println(password);
		System.out.println(contactNumber);
		return "Success.jsp";
	}*/
	
	@PostMapping("/reg.do")
	public ModelAndView registerUser(@ModelAttribute UserDTO userDTO) {
		Integer identifier = service.persistUserIntoDB(userDTO);
		System.out.println(userDTO.getEmailId());
		if (identifier != null) {
			return new ModelAndView("Success.jsp", "user", userDTO);
		} else {
			return new ModelAndView("Error.jsp");
		}
	}
	
	
}
