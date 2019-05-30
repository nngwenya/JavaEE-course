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
		
		//RequestDispatcher view = request.getRequestDispatcher("");
		//view.forward(request, response);
		PrintWriter out = response.getWriter();
		
		out.println("Id : " + fs.getId());
		out.println("From : " + fs.getFrom());
		out.println("To : " + fs.getTo());
		out.println("price : " + fs.getPrice());
		out.println("planeModel : " + fs.getPlaneModel());
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
