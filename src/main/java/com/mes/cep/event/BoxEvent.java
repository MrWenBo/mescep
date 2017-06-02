package com.mes.cep.event;

import com.bstek.urule.model.Label;

public class BoxEvent extends Event {
	@Label("周转箱离开")
	private String boxLeave;
	@Label("周转箱存在")
	private String boxCurrent;
	
	
	public String getBoxLeave() {
		return boxLeave;
	}
	public void setBoxLeave(String boxLeave) {
		this.boxLeave = boxLeave;
	}
	public String getBoxCurrent() {
		return boxCurrent;
	}
	public void setBoxCurrent(String boxCurrent) {
		this.boxCurrent = boxCurrent;
	}
	
	
}
