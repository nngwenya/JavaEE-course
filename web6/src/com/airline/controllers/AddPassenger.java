package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddPassenger")
public class AddPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AddPassenger() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/add_passenger.jsp");
	
	view.forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//doGet(request, response);
		String firstName = request.getParameter("firstname");
		System.out.println("firstName: " + firstName);
		
		String lastName = request.getParameter("lastname");
		
		String dob_raw = request.getParameter("dob");
		String array[] = dob_raw.split("\\/");
		
		String month = array[0];
		String day = array[1];
		String year = array[2];
		
		
		Calendar cal =  Calendar.getInstance();
		
		cal.set(Calendar.YEAR, Integer.parseInt(year));
		cal.set(Calendar.MONTH, Integer.parseInt(month));
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
		
		cal.getTime();
		
		String gender = request.getParameter("gender");
		
		
		
		
		
	}

}
