package org.jspiders.foodApp.tester;

import org.jspiders.foodApp.dto.FoodDTO;

public class AppTester {

	public static void main(String[] args) {
		FoodDTO foodDTO = new FoodDTO();
		
		foodDTO.setName("Idli");
		foodDTO.setPrice(30.00);
		foodDTO.setQuantity(50);
		foodDTO.setType("Veg");
		
		System.out.println(foodDTO);
		
	}

}
