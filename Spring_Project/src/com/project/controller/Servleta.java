package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.mysql.jdbc.PreparedStatement;

@WebServlet("/ls")
public class Servleta extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		String mobileno = req.getParameter("mob");
		String dob = req.getParameter("bday");
		String email = req.getParameter("em");
		String address = req.getParameter("addr");
		String brancgh = req.getParameter("br");
		long mob = Long.parseLong(mobileno);
		// long dte = Date.parse(dob);
		java.sql.PreparedStatement preparedStatement = null;
		String qry = "insert into sesm7.student_table values(?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connectio = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("connection");
			preparedStatement = connectio.prepareStatement(qry);
			preparedStatement.setLong(1, mob);
			preparedStatement.setString(2, address);
			preparedStatement.setString(3, brancgh);
			// preparedStatement.setLong(4, dte);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, name);
			int tt = preparedStatement.executeUpdate();
			System.out.println(tt);
			PrintWriter out = resp.getWriter();
			out.println("<body bgcolor='lightgreen'><form>" + "<h1>!!!Wel come  !!!!</h1>" + "<br></form></body>");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
