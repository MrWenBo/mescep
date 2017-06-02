package com.mes.cep.event;

import java.util.Date;

import com.bstek.urule.model.Label;

public class Event {
	@Label("编号")
	private int id;
	@Label("名称")
	private String name;
	@Label("开始时间")
	private Date startTime;
	@Label("结束时间")
	private Date endTime;
	@Label("发生地点")
	private String location;
	@Label("事件的过去")
	private String past;
	@Label("事件的未来")
	private String future;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPast() {
		return past;
	}
	public void setPast(String past) {
		this.past = past;
	}
	public String getFuture() {
		return future;
	}
	public void setFuture(String future) {
		this.future = future;
	}
	
	
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(int id, String name, Date startTime, Date endTime, String location, String past, String future) {
		this.id = id;
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location;
		this.past = past;
		this.future = future;
	}

	
}
