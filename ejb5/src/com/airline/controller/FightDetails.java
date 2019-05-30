package com.airline.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
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
	
	private FlightService fs = null;

    public FightDetails() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		out.print("Gwen flight service....!");
		
		try {
			
			Context context = new InitialContext();
			Object fobject = context.lookup("java:global/ejb5/FlightService!com.airline.service.FlightService");
			fs = (FlightService) fobject;
			
		}catch(NamingException e) {
			System.out.println("Naming exception has occured while trying to lookup the EJB");
			e.printStackTrace();
		}
		if (fs != null) {
			out.println("Flight Details : " + fs.getFrom() + " " + fs.getTo());
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
