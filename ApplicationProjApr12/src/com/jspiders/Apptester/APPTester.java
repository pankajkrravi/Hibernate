package com.jspiders.Apptester;
import java.util.Scanner;
import com.jspiders.AppDAO.AppDAO;
import com.jspiders.AppDTO.AppDTO;
public class APPTester {
  public static void main(String[] args) {
	  System.out.println("Enter app id");
	  Scanner sc=new Scanner(System.in);
	  int id=sc.nextInt();
	  System.out.println("enter app name");
	  String n=sc.next();
	  System.out.println("Enter app type");
	  String t=sc.next();
	  System.out.println("Enter app version");
	  double v=sc.nextDouble();
	AppDTO adto=new AppDTO();
	adto.setAppid(id);
	adto.setName(n);
	adto.setType(t);
	adto.setVersion(v);
	//insert data
	AppDAO dao=new AppDAO();
	dao.saveApp(adto);
	//get data
	System.out.println(adto.getAppid()+" app id  "+adto.getName()+" app name "+adto.getType()+" app type "+adto.getVersion()+" app version");
	//update

  }
}
