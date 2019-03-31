package com.jspiders.hibernate.tester;
import com.jspiders.hibernate.dao.FoodDAO;
import com.jspiders.hibernate.dto.FoodDTO;
public class AppTester {
	public static void main(String[] args) {
		FoodDTO foodDTO = new FoodDTO();
		foodDTO.setFoodId(1);
		foodDTO.setName("Dosa");
		foodDTO.setType("Mysore");
		foodDTO.setQuantity(50);
		foodDTO.setPrice(55);
		//System.out.println(foodDTO.getName() + "\t" + foodDTO.getPrice());*/
		FoodDAO dao = new FoodDAO();
		dao.saveFood(foodDTO);
	    FoodDTO dtoFromDb = dao.getFood(1);
		System.out.println(dtoFromDb.getName() + "\t" + dtoFromDb.getQuantity());
	}
}
