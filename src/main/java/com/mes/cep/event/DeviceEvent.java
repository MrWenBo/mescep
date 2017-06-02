package com.mes.cep.event;

import com.bstek.urule.model.Label;

public class DeviceEvent extends Event {
	@Label("设备运转")
	private String work;

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	
}
