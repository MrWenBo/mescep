package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * TTasksBc generated by hbm2java
 */
public class TTasksBc implements java.io.Serializable {

	private String uniqueid;
	private String taskType;
	private String taskState;
	private Date createTime;
	private String creatorId;
	private Date dispatchTime;
	private String dispatcherId;
	private String shift;
	private String employeeId;
	private String taskuid;
	private BigDecimal qtyShift;
	private BigDecimal qtyComplete;
	private BigDecimal qtyConfirm;
	private String reason;
	private String notes;
	private BigDecimal finishRate;
	private BigDecimal ratio;
	private Date shiftTime;
	private Date actualStartTime;
	private Date actualFinishTime;

	public TTasksBc() {
	}

	public TTasksBc(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public TTasksBc(String uniqueid, String taskType, String taskState, Date createTime, String creatorId,
			Date dispatchTime, String dispatcherId, String shift, String employeeId, String taskuid,
			BigDecimal qtyShift, BigDecimal qtyComplete, BigDecimal qtyConfirm, String reason, String notes,
			BigDecimal finishRate, BigDecimal ratio, Date shiftTime, Date actualStartTime, Date actualFinishTime) {
		this.uniqueid = uniqueid;
		this.taskType = taskType;
		this.taskState = taskState;
		this.createTime = createTime;
		this.creatorId = creatorId;
		this.dispatchTime = dispatchTime;
		this.dispatcherId = dispatcherId;
		this.shift = shift;
		this.employeeId = employeeId;
		this.taskuid = taskuid;
		this.qtyShift = qtyShift;
		this.qtyComplete = qtyComplete;
		this.qtyConfirm = qtyConfirm;
		this.reason = reason;
		this.notes = notes;
		this.finishRate = finishRate;
		this.ratio = ratio;
		this.shiftTime = shiftTime;
		this.actualStartTime = actualStartTime;
		this.actualFinishTime = actualFinishTime;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskState() {
		return this.taskState;
	}

	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Date getDispatchTime() {
		return this.dispatchTime;
	}

	public void setDispatchTime(Date dispatchTime) {
		this.dispatchTime = dispatchTime;
	}

	public String getDispatcherId() {
		return this.dispatcherId;
	}

	public void setDispatcherId(String dispatcherId) {
		this.dispatcherId = dispatcherId;
	}

	public String getShift() {
		return this.shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public BigDecimal getQtyShift() {
		return this.qtyShift;
	}

	public void setQtyShift(BigDecimal qtyShift) {
		this.qtyShift = qtyShift;
	}

	public BigDecimal getQtyComplete() {
		return this.qtyComplete;
	}

	public void setQtyComplete(BigDecimal qtyComplete) {
		this.qtyComplete = qtyComplete;
	}

	public BigDecimal getQtyConfirm() {
		return this.qtyConfirm;
	}

	public void setQtyConfirm(BigDecimal qtyConfirm) {
		this.qtyConfirm = qtyConfirm;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BigDecimal getFinishRate() {
		return this.finishRate;
	}

	public void setFinishRate(BigDecimal finishRate) {
		this.finishRate = finishRate;
	}

	public BigDecimal getRatio() {
		return this.ratio;
	}

	public void setRatio(BigDecimal ratio) {
		this.ratio = ratio;
	}

	public Date getShiftTime() {
		return this.shiftTime;
	}

	public void setShiftTime(Date shiftTime) {
		this.shiftTime = shiftTime;
	}

	public Date getActualStartTime() {
		return this.actualStartTime;
	}

	public void setActualStartTime(Date actualStartTime) {
		this.actualStartTime = actualStartTime;
	}

	public Date getActualFinishTime() {
		return this.actualFinishTime;
	}

	public void setActualFinishTime(Date actualFinishTime) {
		this.actualFinishTime = actualFinishTime;
	}

}