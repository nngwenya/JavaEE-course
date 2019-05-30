package com.airline.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.FlightService;


@WebServlet("/FightDetails")
public class FightDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	FlightService fs;
	
	@EJB
	FlightService fs2;
	
	@EJB
	FlightService fs3;
	
	@EJB
	FlightService fs4;
	
	@EJB
	FlightService fs5;

    public FightDetails() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		fs.setFrom("Jozi");
		out.println(fs.getFrom());
		fs2.setFrom("Cape town");
		out.println(fs.getFrom());
		fs3.setFrom("Durban");
		out.println(fs.getFrom());
		fs4.setFrom("Mpumalanga");
		out.println(fs.getFrom());
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
