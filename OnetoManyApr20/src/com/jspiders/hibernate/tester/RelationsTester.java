package com.jspiders.hibernate.tester;

import com.jspiders.hibernate.dao.EngineDAO;
import com.jspiders.hibernate.dto.CarDTO;
import com.jspiders.hibernate.dto.EngineDTO;

public class RelationsTester {

	public static void main(String[] args) {
		/*CarDTO car = new CarDTO();
		car.setColour("Black");
		car.setName("Lambhorgini");
		car.setPrice(20000000);
		
		EngineDTO engine = new EngineDTO();
		engine.setBrand("Lambhorgini");
		engine.setPower(1300);
		engine.setPrice(5000000);

		
		engine.setCar(car);
		car.setEngine(engine);*/
		
		EngineDAO engineDAO = new EngineDAO();
		/*Integer engineId = engineDAO.saveEngine(engine);
		System.out.println("Engine Id: " + engineId);*/
		
		EngineDTO engineDTFromDb = engineDAO.getEngineById(1);
		System.out.println(engineDTFromDb.getBrand() + "\t" + engineDTFromDb.getPower());
		CarDTO car = engineDTFromDb.getCar();
		System.out.println(car.getName() + "\t" + car.getPrice());
	}

}
