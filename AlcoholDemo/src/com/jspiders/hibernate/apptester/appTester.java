package com.jspiders.hibernate.apptester;

import com.jspiders.hibernate.dao.AlcoholDAO;
import com.jspiders.hibernate.dto.AlcohalDTO;

public class appTester {
	public static void main(String[] args) {
		AlcohalDTO dto=new AlcohalDTO();
		dto.setName("OMR");
		dto.setId(123);
		dto.setQuantity(180);
		dto.setPrice(130.0);
		AlcoholDAO dao=new AlcoholDAO();
		dao.save(dto);
	}
}