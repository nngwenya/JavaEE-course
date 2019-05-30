package com.airline.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class FlightService {

	String from = "Egoli";
	String To = "Natal";
	Integer id = 12345;
	Integer price = 400;
	String planeModel = "Boeing 787";
	
    public FlightService() {
        // TODO Auto-generated constructor stub
    }

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return To;
	}

	public void setTo(String to) {
		To = to;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPlaneModel() {
		return planeModel;
	}

	public void setPlaneModel(String planeModel) {
		this.planeModel = planeModel;
	}

	@Override
	public String toString() {
		return "FlightService [from=" + from + ", To=" + To + ", id=" + id + ", price=" + price + ", planeModel="
				+ planeModel + "]";
	}
    

}
