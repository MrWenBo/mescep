package com.mes.cep.test;

import com.mes.cep.meta.Location;

/**
* @author Stephen¡¤Wen  
* @email 872003894@qq.com
* @date 2017Äê4ÔÂ12ÈÕ
* @Chinesename
*/
public class TestLocation {
	private int id;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public static void main(String[] args) {
		System.out.println(Location.AGV1);
	}

}
