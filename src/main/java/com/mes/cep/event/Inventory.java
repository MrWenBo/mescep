package com.mes.cep.event;

import com.bstek.urule.model.Label;

/**
* @author Stephen·Wen  
* @email 872003894@qq.com
* @date 2017年5月15日
* @Chinesename 库存
*/

public class Inventory {

	@Label("编号")
	private String id;
	
	@Label("数量")
	private int number;
	
	@Label("位置")
	private String location;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
