package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.models.Gender;
import com.airline.models.Passenger;


@WebServlet("/AddPassenger")
public class AddPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AddPassenger() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	request.setAttribute("firstname", "");
	request.setAttribute("lastname", "");	
	request.setAttribute("dob", "");	
	RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/add_passenger.jsp");
	
	view.forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//doGet(request, response);
		
		Passenger p = new Passenger();
		
		request.setAttribute("Error", false);
		String firstName = request.getParameter("firstname");
		System.out.println("firstName: " + firstName);
		
		if (firstName.length() == 0) {
			System.out.println("Field firstname is empty error");
			
			request.setAttribute("Error", true);
			request.setAttribute("First_nameError", true);
			request.setAttribute("firstname", "");
		}else {
			p.setFirstName(firstName);
			
			request.setAttribute("firstname", firstName);
		}
		
		String lastName = request.getParameter("lastname");
		System.out.println("Lastname :" + lastName);
		
		if (lastName.length() == 0) {
			System.out.println("Field lastname is empty error");
			
			request.setAttribute("Error", true);
			request.setAttribute("last_nameError", true);
			request.setAttribute("lastname", "");
			
		}else {
			p.setLastName(lastName);
			
			request.setAttribute("lastname", lastName);
		}
		
		String dob_raw = request.getParameter("dob");
		String array[] = dob_raw.split("\\/");
		
		String pattern = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
		Pattern r = Pattern.compile(pattern);
		
		Matcher m = r.matcher(dob_raw);
		
		if(m.find()) {
			
			String month = array[0];
			String day = array[1];
			String year = array[2];
			
			
			Calendar cal =  Calendar.getInstance();
			
			cal.set(Calendar.YEAR, Integer.parseInt(year));
			cal.set(Calendar.MONTH, Integer.parseInt(month) - 1);
			cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
			
			Date dob = cal.getTime();
			System.out.println("DateOfBirth :" + dob);
			p.setDob(dob);
			
			request.setAttribute("dob", dob_raw);
		}else {
			System.out.println("Invalid date of birth error");
			
			request.setAttribute("Error", true);
			request.setAttribute("date_FormatError", true);
			request.setAttribute("dob", dob_raw);
			
			if (dob_raw.length() == 0) {
				request.setAttribute("dob", "");
			}
			
		}
	
		
		String gender = request.getParameter("gender");
		System.out.println("Gender : " + gender);
		p.setGender(Gender.valueOf(gender));
		request.setAttribute("gender", gender);
		if ((Boolean)request.getAttribute("Error")) {
			
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/add_passenger.jsp");
			view.forward(request, response);
			
		}else {
			
			ServletContext sc = this.getServletContext();
			
			synchronized (this){
				
				ArrayList<Passenger> plist = (ArrayList<Passenger>) sc.getAttribute("passengers");
				
				System.out.println("List : " + plist);
				
				plist.add(p);
				sc.setAttribute("passengers", plist);
				
			}
			
			response.sendRedirect("");
		}
		
	}

}
