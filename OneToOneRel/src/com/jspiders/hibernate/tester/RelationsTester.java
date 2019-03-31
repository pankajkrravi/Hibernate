package com.jspiders.hibernate.tester;

import com.jspiders.hibernate.dao.EngineDAO;
import com.jspiders.hibernate.dto.CarDTO;
import com.jspiders.hibernate.dto.EngineDTO;

public class RelationsTester {

	public static void main(String[] args) {
		CarDTO car = new CarDTO();
		car.setColour("blue");
		car.setName("Audi");
		car.setPrice(4000000);
		
		EngineDTO engine = new EngineDTO();
		engine.setBrand("Audi");
		engine.setPower(1000);
		engine.setPrice(2000000);

		
		engine.setCar(car);
		
		EngineDAO engineDAO = new EngineDAO();
		Integer engineId = engineDAO.saveEngine(engine, car);
		System.out.println("Engine Id: " + engineId);
		
	}

}
