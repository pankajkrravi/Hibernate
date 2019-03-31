package com.jspiders.hibernate.tester;

import com.jspiders.hibernate.dao.FoodDAO;
import com.jspiders.hibernate.dto.FoodDTO;

public class AppTester {

	public static void main(String[] args) {
		/*FoodDTO foodDTO = new FoodDTO();
		foodDTO.setFoodId(5);
		foodDTO.setName("Biriyani");
		foodDTO.setType("spicy");
		foodDTO.setQuantity(70);
		foodDTO.setPrice(120);
		
		System.out.println(foodDTO.getName() + "\t" + foodDTO.getPrice());
		*/
		FoodDAO dao = new FoodDAO();
		
		//dao.saveFood(foodDTO);
		
		FoodDTO dtoFromDb = dao.getFood(3);
		
		System.out.println(dtoFromDb.getName() + "\t" + dtoFromDb.getQuantity());
	}
}
