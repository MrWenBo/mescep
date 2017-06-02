package com.mes.cep.event;

import com.bstek.urule.model.Label;

/**
* @author Stephen��Wen  
* @email 872003894@qq.com
* @date 2017��5��15��
* @Chinesename ���
*/

public class Inventory {

	@Label("���")
	private String id;
	
	@Label("����")
	private int number;
	
	@Label("λ��")
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
