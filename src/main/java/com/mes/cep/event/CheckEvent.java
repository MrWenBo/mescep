package com.mes.cep.event;

import com.bstek.urule.model.Label;

public class CheckEvent extends Event {
	
	@Label("��������")
	private String checkRequest;
	@Label("�������")
	private String checkFinish;
	public String getCheckRequest() {
		return checkRequest;
	}
	public void setCheckRequest(String checkRequest) {
		this.checkRequest = checkRequest;
	}
	public String getCheckFinish() {
		return checkFinish;
	}
	public void setCheckFinish(String checkFinish) {
		this.checkFinish = checkFinish;
	}
	
	
}
