package com.mes.cep.event;

import com.bstek.urule.model.Label;

public class TaskEvent extends Event {
	@Label("����ʼ")
	private String taskStart;
	
	@Label("����׼�����")
	private String taskReady;
	
	@Label("�������")
	private String taskComplete;
	
	@Label("�����ɹ�")
	private String taskDispatch;
	
	@Label("����ȡ��")
	private String taskCancel;
	
	@Label("�����ж� ")
	private String taskInterrupt;
	
	@Label("�����´�")
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
