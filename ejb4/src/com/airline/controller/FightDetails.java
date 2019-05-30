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

    public FightDetails() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		fs.setFrom("Jozi");//5th flightService bean object from the pool
		fs.setPrice(1500);//1st flightService bean object from the pool
		fs.setTo("Cape town");//3rd  flightService bean object from the pool
		fs.setFrom("jozi");//4ht flightService bean object from the pool
		fs.setFrom("jozi");//2nd flightService bean object from the pool
		
		out.println(fs.getFrom());//4th flightService bean object from the pool 
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
