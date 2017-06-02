package com.mes.cep.event;

import com.bstek.urule.model.Label;

public class CheckEvent extends Event {
	
	@Label("检验请求")
	private String checkRequest;
	@Label("检验完成")
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
