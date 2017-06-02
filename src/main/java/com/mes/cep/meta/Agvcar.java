package com.mes.cep.meta;

import java.math.BigDecimal;

/**
*@author Stephen·Wen  
*@email 872003894@qq.com
*@date 2017年4月11日
*@Chinesename AGV小车
*/

public class Agvcar {
	
	private Integer id;
	private String name;
	private double electricity;
	private String departure;
	private String destination;
	private String location;
	

	

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getElectricity() {
		return electricity;
	}

	public void setElectricity(double electricity) {
		this.electricity = electricity;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Agvcar(BigDecimal id, String name, Double electricity, String departure, String destination,
			String location) {
		this.id = id.intValue();
		this.name = name;
		this.electricity = electricity;
		this.departure = departure;
		this.destination = destination;
		this.location = location;
	}
	
	public Agvcar(BigDecimal id) {
		// TODO Auto-generated constructor stub
		this.id = id.intValue();
	}
	

	@Override
	public String toString() {
		return "AGVCar [id=" + id + ", name=" + name + ", electricity=" + electricity + ", departure=" + departure
				+ ", destination=" + destination + ", location=" + location + "]";
	}
	
	
	
}
