package com.mes.cep.event;

import org.springframework.beans.factory.annotation.Autowired;

import com.bstek.urule.model.Label;

public class EmployeeEvent extends Event {
	@Label("Ա���ڸ�")
	@Autowired
	private String employeeWork;
	@Label("Ա�����ڸ�")
	@Autowired
	private String employeeAbsence;
/*	public String getEmployeeWork() {
		return employeeWork;
	}
	public void setEmployeeWork(String employeeWork) {
		this.employeeWork = employeeWork;
	}
	public String getEmployeeAbsence() {
		return employeeAbsence;
	}
	public void setEmployeeAbsence(String employeeAbsence) {
		this.employeeAbsence = employeeAbsence;
	}*/
	
	
	
}
