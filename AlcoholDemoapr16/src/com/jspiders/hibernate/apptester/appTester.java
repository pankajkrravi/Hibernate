package com.jspiders.hibernate.apptester;
import com.jspiders.hibernate.dao.AlcoholDAO;
import com.jspiders.hibernate.dto.AlcohalDTO;
public class appTester {
	public static void main(String[] args) {
		AlcoholDAO dao = new AlcoholDAO();
		AlcohalDTO alcohalDTO = dao.getAlcoholByName("OMR");
		System.out.println(alcohalDTO.getQuantity() + "\t" + alcohalDTO.getPrice());
	}
}
