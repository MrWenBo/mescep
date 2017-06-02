package com.mes.cep.event;

import com.bstek.urule.model.Label;

public class TaskEvent extends Event {
	@Label("任务开始")
	private String taskStart;
	
	@Label("任务准备完成")
	private String taskReady;
	
	@Label("任务完成")
	private String taskComplete;
	
	@Label("任务派工")
	private String taskDispatch;
	
	@Label("任务取消")
	private String taskCancel;
	
	@Label("任务中断 ")
	private String taskInterrupt;
	
	@Label("任务下达")
	private String taskCome;

	public String getTaskStart() {
		return taskStart;
	}

	public void setTaskStart(String taskStart) {
		this.taskStart = taskStart;
	}

	public String getTaskReady() {
		return taskReady;
	}

	public void setTaskReady(String taskReady) {
		this.taskReady = taskReady;
	}

	public String getTaskComplete() {
		return taskComplete;
	}

	public void setTaskComplete(String taskComplete) {
		this.taskComplete = taskComplete;
	}

	public String getTaskDispatch() {
		return taskDispatch;
	}

	public void setTaskDispatch(String taskDispatch) {
		this.taskDispatch = taskDispatch;
	}

	public String getTaskCancel() {
		return taskCancel;
	}

	public void setTaskCancel(String taskCancel) {
		this.taskCancel = taskCancel;
	}

	public String getTaskInterrupt() {
		return taskInterrupt;
	}

	public void setTaskInterrupt(String taskInterrupt) {
		this.taskInterrupt = taskInterrupt;
	}

	public String getTaskCome() {
		return taskCome;
	}

	public void setTaskCome(String taskCome) {
		this.taskCome = taskCome;
	}
	
	

}
