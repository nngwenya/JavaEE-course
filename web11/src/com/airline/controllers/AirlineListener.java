package com.airline.controllers;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.airline.models.Passenger;


@WebListener
public class AirlineListener implements ServletContextListener {

  
    public AirlineListener() {
    
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	
    }

    public void contextInitialized(ServletContextEvent event)  { 
    	
    	ServletContext sc = event.getServletContext();
    	
    	ArrayList<Passenger> plist = (ArrayList<Passenger>) sc.getAttribute("passengers");
    	
    	if (plist == null) {
    		
    		System.out.println("The are no passeangers add.. Create new passengers here :");
    		
    		plist = new ArrayList<Passenger>();
    		
    		sc.setAttribute("passengers", plist);
    	}
       
    }
	
}
