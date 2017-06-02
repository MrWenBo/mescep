package com.mes.cep.event;

import org.springframework.beans.factory.annotation.Autowired;

import com.bstek.urule.model.Label;

public class EmployeeEvent extends Event {
	@Label("员工在岗")
	@Autowired
	private String employeeWork;
	@Label("员工不在岗")
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
