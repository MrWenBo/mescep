package com.mes.cep.meta;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.bstek.urule.model.Label;

public class Task {
	@Label("任务号")
	@Autowired
	private String taskid;
	@Label("任务名")
	@Autowired
	private String taskname;
	@Label("型号")
	@Autowired
	private String model;
	@Label("需求数量")
	@Autowired
	private int dueqty;
	@Label("交货期")
	@Autowired
	private Date demandfinish;
	@Label("优先级")
	@Autowired
	private int priority;
	/*
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getDueqty() {
		return dueqty;
	}
	public void setDueqty(int dueqty) {
		this.dueqty = dueqty;
	}
	public Date getDemandfinish() {
		return demandfinish;
	}
	public void setDemandfinish(Date demandfinish) {
		this.demandfinish = demandfinish;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}*/
	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", taskname=" + taskname + ", model=" + model + ", dueqty=" + dueqty
				+ ", demandfinish=" + demandfinish + ", priority=" + priority + "]";
	}

	
	

}
