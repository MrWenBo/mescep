package com.mes.cep.meta;

import com.bstek.urule.model.Label;
/**
 * @author Stephen·Wen
 * @email 872003894@qq.com
 * @Chinesename 人员
 * 
 */
public class Employee {

	@Label("姓名")
	private String employeename;
	@Label("位置")
	private String positionid;
	@Label("员工类型")
	private String employeetype;
	
	
	
	
	
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getPositionid() {
		return positionid;
	}
	public void setPositionid(String positionid) {
		this.positionid = positionid;
	}
	public String getEmployeetype() {
		return employeetype;
	}
	public void setEmployeetype(String employeetype) {
		this.employeetype = employeetype;
	}
	
	

}
