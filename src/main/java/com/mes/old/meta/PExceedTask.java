package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * PExceedTask generated by hbm2java
 */
public class PExceedTask implements java.io.Serializable {

	private String exceedUid;
	private String prepareTaskuid;
	private String taskuid;
	private String exceedType;
	private String exceedState;
	private String deptid;
	private String employeeid;
	private Date finalTime;
	private Date nextTime;
	private String creator;
	private Date createtime;
	private String partNumber;
	private Integer priority;
	private String isValid;
	private String relationid;
	private Integer relationseq;
	private BigDecimal relationnum;
	private String warehouseid;
	private BigDecimal currentnum;

	public PExceedTask() {
	}

	public PExceedTask(String exceedUid) {
		this.exceedUid = exceedUid;
	}

	public PExceedTask(String exceedUid, String prepareTaskuid, String taskuid, String exceedType, String exceedState,
			String deptid, String employeeid, Date finalTime, Date nextTime, String creator, Date createtime,
			String partNumber, Integer priority, String isValid, String relationid, Integer relationseq,
			BigDecimal relationnum, String warehouseid, BigDecimal currentnum) {
		this.exceedUid = exceedUid;
		this.prepareTaskuid = prepareTaskuid;
		this.taskuid = taskuid;
		this.exceedType = exceedType;
		this.exceedState = exceedState;
		this.deptid = deptid;
		this.employeeid = employeeid;
		this.finalTime = finalTime;
		this.nextTime = nextTime;
		this.creator = creator;
		this.createtime = createtime;
		this.partNumber = partNumber;
		this.priority = priority;
		this.isValid = isValid;
		this.relationid = relationid;
		this.relationseq = relationseq;
		this.relationnum = relationnum;
		this.warehouseid = warehouseid;
		this.currentnum = currentnum;
	}

	public String getExceedUid() {
		return this.exceedUid;
	}

	public void setExceedUid(String exceedUid) {
		this.exceedUid = exceedUid;
	}

	public String getPrepareTaskuid() {
		return this.prepareTaskuid;
	}

	public void setPrepareTaskuid(String prepareTaskuid) {
		this.prepareTaskuid = prepareTaskuid;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public String getExceedType() {
		return this.exceedType;
	}

	public void setExceedType(String exceedType) {
		this.exceedType = exceedType;
	}

	public String getExceedState() {
		return this.exceedState;
	}

	public void setExceedState(String exceedState) {
		this.exceedState = exceedState;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public Date getFinalTime() {
		return this.finalTime;
	}

	public void setFinalTime(Date finalTime) {
		this.finalTime = finalTime;
	}

	public Date getNextTime() {
		return this.nextTime;
	}

	public void setNextTime(Date nextTime) {
		this.nextTime = nextTime;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getIsValid() {
		return this.isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public String getRelationid() {
		return this.relationid;
	}

	public void setRelationid(String relationid) {
		this.relationid = relationid;
	}

	public Integer getRelationseq() {
		return this.relationseq;
	}

	public void setRelationseq(Integer relationseq) {
		this.relationseq = relationseq;
	}

	public BigDecimal getRelationnum() {
		return this.relationnum;
	}

	public void setRelationnum(BigDecimal relationnum) {
		this.relationnum = relationnum;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public BigDecimal getCurrentnum() {
		return this.currentnum;
	}

	public void setCurrentnum(BigDecimal currentnum) {
		this.currentnum = currentnum;
	}

}