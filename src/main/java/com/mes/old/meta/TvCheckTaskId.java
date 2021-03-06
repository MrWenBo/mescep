package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * TvCheckTaskId generated by hbm2java
 */
public class TvCheckTaskId implements java.io.Serializable {

	private String taskuid;
	private String taskid;
	private Long priority;
	private String tasktype;
	private BigDecimal taskstate;
	private BigDecimal operationId;
	private String operationIddesc;
	private String taskname;
	private String partNumber;
	private String drawingid;
	private String batchnum;
	private Long operationDistance;
	private Date planstart;
	private Date planfinish;
	private String deptid;
	private String mastershop;
	private String mastershopName;
	private String routing;
	private BigDecimal opuid;
	private String checkToolState;
	private String invdemandstate;

	public TvCheckTaskId() {
	}

	public TvCheckTaskId(String taskuid, String partNumber, String deptid) {
		this.taskuid = taskuid;
		this.partNumber = partNumber;
		this.deptid = deptid;
	}

	public TvCheckTaskId(String taskuid, String taskid, Long priority, String tasktype, BigDecimal taskstate,
			BigDecimal operationId, String operationIddesc, String taskname, String partNumber, String drawingid,
			String batchnum, Long operationDistance, Date planstart, Date planfinish, String deptid, String mastershop,
			String mastershopName, String routing, BigDecimal opuid, String checkToolState, String invdemandstate) {
		this.taskuid = taskuid;
		this.taskid = taskid;
		this.priority = priority;
		this.tasktype = tasktype;
		this.taskstate = taskstate;
		this.operationId = operationId;
		this.operationIddesc = operationIddesc;
		this.taskname = taskname;
		this.partNumber = partNumber;
		this.drawingid = drawingid;
		this.batchnum = batchnum;
		this.operationDistance = operationDistance;
		this.planstart = planstart;
		this.planfinish = planfinish;
		this.deptid = deptid;
		this.mastershop = mastershop;
		this.mastershopName = mastershopName;
		this.routing = routing;
		this.opuid = opuid;
		this.checkToolState = checkToolState;
		this.invdemandstate = invdemandstate;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public String getTaskid() {
		return this.taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getTasktype() {
		return this.tasktype;
	}

	public void setTasktype(String tasktype) {
		this.tasktype = tasktype;
	}

	public BigDecimal getTaskstate() {
		return this.taskstate;
	}

	public void setTaskstate(BigDecimal taskstate) {
		this.taskstate = taskstate;
	}

	public BigDecimal getOperationId() {
		return this.operationId;
	}

	public void setOperationId(BigDecimal operationId) {
		this.operationId = operationId;
	}

	public String getOperationIddesc() {
		return this.operationIddesc;
	}

	public void setOperationIddesc(String operationIddesc) {
		this.operationIddesc = operationIddesc;
	}

	public String getTaskname() {
		return this.taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public String getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
	}

	public Long getOperationDistance() {
		return this.operationDistance;
	}

	public void setOperationDistance(Long operationDistance) {
		this.operationDistance = operationDistance;
	}

	public Date getPlanstart() {
		return this.planstart;
	}

	public void setPlanstart(Date planstart) {
		this.planstart = planstart;
	}

	public Date getPlanfinish() {
		return this.planfinish;
	}

	public void setPlanfinish(Date planfinish) {
		this.planfinish = planfinish;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getMastershop() {
		return this.mastershop;
	}

	public void setMastershop(String mastershop) {
		this.mastershop = mastershop;
	}

	public String getMastershopName() {
		return this.mastershopName;
	}

	public void setMastershopName(String mastershopName) {
		this.mastershopName = mastershopName;
	}

	public String getRouting() {
		return this.routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public BigDecimal getOpuid() {
		return this.opuid;
	}

	public void setOpuid(BigDecimal opuid) {
		this.opuid = opuid;
	}

	public String getCheckToolState() {
		return this.checkToolState;
	}

	public void setCheckToolState(String checkToolState) {
		this.checkToolState = checkToolState;
	}

	public String getInvdemandstate() {
		return this.invdemandstate;
	}

	public void setInvdemandstate(String invdemandstate) {
		this.invdemandstate = invdemandstate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TvCheckTaskId))
			return false;
		TvCheckTaskId castOther = (TvCheckTaskId) other;

		return ((this.getTaskuid() == castOther.getTaskuid()) || (this.getTaskuid() != null
				&& castOther.getTaskuid() != null && this.getTaskuid().equals(castOther.getTaskuid())))
				&& ((this.getTaskid() == castOther.getTaskid()) || (this.getTaskid() != null
						&& castOther.getTaskid() != null && this.getTaskid().equals(castOther.getTaskid())))
				&& ((this.getPriority() == castOther.getPriority()) || (this.getPriority() != null
						&& castOther.getPriority() != null && this.getPriority().equals(castOther.getPriority())))
				&& ((this.getTasktype() == castOther.getTasktype()) || (this.getTasktype() != null
						&& castOther.getTasktype() != null && this.getTasktype().equals(castOther.getTasktype())))
				&& ((this.getTaskstate() == castOther.getTaskstate()) || (this.getTaskstate() != null
						&& castOther.getTaskstate() != null && this.getTaskstate().equals(castOther.getTaskstate())))
				&& ((this.getOperationId() == castOther.getOperationId())
						|| (this.getOperationId() != null && castOther.getOperationId() != null
								&& this.getOperationId().equals(castOther.getOperationId())))
				&& ((this.getOperationIddesc() == castOther.getOperationIddesc())
						|| (this.getOperationIddesc() != null && castOther.getOperationIddesc() != null
								&& this.getOperationIddesc().equals(castOther.getOperationIddesc())))
				&& ((this.getTaskname() == castOther.getTaskname()) || (this.getTaskname() != null
						&& castOther.getTaskname() != null && this.getTaskname().equals(castOther.getTaskname())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getOperationDistance() == castOther.getOperationDistance())
						|| (this.getOperationDistance() != null && castOther.getOperationDistance() != null
								&& this.getOperationDistance().equals(castOther.getOperationDistance())))
				&& ((this.getPlanstart() == castOther.getPlanstart()) || (this.getPlanstart() != null
						&& castOther.getPlanstart() != null && this.getPlanstart().equals(castOther.getPlanstart())))
				&& ((this.getPlanfinish() == castOther.getPlanfinish()) || (this.getPlanfinish() != null
						&& castOther.getPlanfinish() != null && this.getPlanfinish().equals(castOther.getPlanfinish())))
				&& ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
						&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getMastershop() == castOther.getMastershop()) || (this.getMastershop() != null
						&& castOther.getMastershop() != null && this.getMastershop().equals(castOther.getMastershop())))
				&& ((this.getMastershopName() == castOther.getMastershopName())
						|| (this.getMastershopName() != null && castOther.getMastershopName() != null
								&& this.getMastershopName().equals(castOther.getMastershopName())))
				&& ((this.getRouting() == castOther.getRouting()) || (this.getRouting() != null
						&& castOther.getRouting() != null && this.getRouting().equals(castOther.getRouting())))
				&& ((this.getOpuid() == castOther.getOpuid()) || (this.getOpuid() != null
						&& castOther.getOpuid() != null && this.getOpuid().equals(castOther.getOpuid())))
				&& ((this.getCheckToolState() == castOther.getCheckToolState())
						|| (this.getCheckToolState() != null && castOther.getCheckToolState() != null
								&& this.getCheckToolState().equals(castOther.getCheckToolState())))
				&& ((this.getInvdemandstate() == castOther.getInvdemandstate())
						|| (this.getInvdemandstate() != null && castOther.getInvdemandstate() != null
								&& this.getInvdemandstate().equals(castOther.getInvdemandstate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaskuid() == null ? 0 : this.getTaskuid().hashCode());
		result = 37 * result + (getTaskid() == null ? 0 : this.getTaskid().hashCode());
		result = 37 * result + (getPriority() == null ? 0 : this.getPriority().hashCode());
		result = 37 * result + (getTasktype() == null ? 0 : this.getTasktype().hashCode());
		result = 37 * result + (getTaskstate() == null ? 0 : this.getTaskstate().hashCode());
		result = 37 * result + (getOperationId() == null ? 0 : this.getOperationId().hashCode());
		result = 37 * result + (getOperationIddesc() == null ? 0 : this.getOperationIddesc().hashCode());
		result = 37 * result + (getTaskname() == null ? 0 : this.getTaskname().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getOperationDistance() == null ? 0 : this.getOperationDistance().hashCode());
		result = 37 * result + (getPlanstart() == null ? 0 : this.getPlanstart().hashCode());
		result = 37 * result + (getPlanfinish() == null ? 0 : this.getPlanfinish().hashCode());
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getMastershop() == null ? 0 : this.getMastershop().hashCode());
		result = 37 * result + (getMastershopName() == null ? 0 : this.getMastershopName().hashCode());
		result = 37 * result + (getRouting() == null ? 0 : this.getRouting().hashCode());
		result = 37 * result + (getOpuid() == null ? 0 : this.getOpuid().hashCode());
		result = 37 * result + (getCheckToolState() == null ? 0 : this.getCheckToolState().hashCode());
		result = 37 * result + (getInvdemandstate() == null ? 0 : this.getInvdemandstate().hashCode());
		return result;
	}

}
