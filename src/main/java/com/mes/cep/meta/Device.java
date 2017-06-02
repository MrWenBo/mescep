package com.mes.cep.meta;

import com.bstek.urule.model.Label;

/**
 * @author Stephen��Wen
 * @email 872003894@qq.com
 * @Chinesename ��Ա
 * 
 */
public class Device {
	@Label("�豸����")
	private String resname;
	@Label("�豸����")
	private int device_table_count;
	
	public String getResname() {
		return resname;
	}
	public void setResname(String resname) {
		this.resname = resname;
	}
	public int getDevice_table_count() {
		return device_table_count;
	}
	public void setDevice_table_count(int device_table_count) {
		this.device_table_count = device_table_count;
	}
	@Override
	public String toString() {
		return "Device [resname=" + resname + ", device_table_count=" + device_table_count + "]";
	}
	
	

}
