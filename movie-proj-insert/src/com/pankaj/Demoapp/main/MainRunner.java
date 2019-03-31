package com.pankaj.Demoapp.main;

import com.pankaj.Demoapp.dao.MovieDAO;
import com.pankaj.Demoapp.dto.MovieDTO;

public class MainRunner {
	public static void main(String[] args) {
		MovieDTO dto = new MovieDTO();
		dto.setMid(102);
		dto.setMname("DDLJ");
		dto.setMcast("kajol");
		dto.setMbudget(100000.12);
		MovieDAO dao=new MovieDAO();
		dao.savemovieDetails(dto);
	}
}
