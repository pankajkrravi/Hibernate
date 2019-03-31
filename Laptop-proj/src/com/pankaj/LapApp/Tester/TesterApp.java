package com.pankaj.LapApp.Tester;
import com.pankaj.LapApp.dao.LaptopADAO;
import com.pankaj.LapApp.dto.LaptopDTO;
public class TesterApp {
	public static void main(String[] args) {
		/*
		 * LaptopDTO laptopDTO = new LaptopDTO(); //laptopDTO.setId(01);
		 * laptopDTO.setName("Acse"); laptopDTO.setPrice(25000.00);
		 * laptopDTO.setColor("white");
		 * 
		 * LaptopADAO ap = new LaptopADAO(); ap.savelaptop(laptopDTO);
		 */
		// fetch data
		/*
		 * LaptopADAO laptopADAO=new LaptopADAO(); LaptopDTO
		 * lp=laptopADAO.getlaptopByid(4);
		 * System.out.println("name ="+lp.getName()+" price ="+lp.getPrice()
		 * +" color ="+lp.getColor());
		 */
		// UPDATE CODE
		/*
		 * LaptopADAO adao=new LaptopADAO(); adao.updatePriceById(1, 100000.00);
		 */
		LaptopADAO adao = new LaptopADAO();
		adao.deleteByid(4);
	}
}
