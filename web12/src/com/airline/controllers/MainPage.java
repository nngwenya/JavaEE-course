package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.models.Passenger;

/**
 * Servlet implementation class MainPage
 */
@WebServlet("")
public class MainPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public MainPage() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		ServletContext sc = this.getServletContext();
		ArrayList<Passenger> plist = (ArrayList<Passenger>) sc.getAttribute("passengers");
		
		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("Passenger has been succesfully added to the list...." + "Number of passengers : " + plist.size());
		out.println("</html></body>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
