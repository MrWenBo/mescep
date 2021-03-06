package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

/**
 * TvProcesstaskPrjId generated by hbm2java
 */
public class TvProcesstaskPrjId implements java.io.Serializable {

	private String taskuid;
	private String taskname;
	private Long startendmark;
	private BigDecimal taskstate;
	private String model;
	private String batchnum;
	private String partNumber;
	private Date latestart;
	private Date latefinish;
	private Long constrainttype;
	private Date constraintdate;
	private Date planstart;
	private Date planfinish;
	private Long planstate;
	private Date schedulestart;
	private Date schedulefinish;
	private Date actualstart;
	private Date actualfinish;
	private Date earlystart;
	private Date earlyfinish;
	private Long priority;
	private String tasktype;
	private BigDecimal taskwork;
	private BigDecimal preoptime;
	private BigDecimal postoptime;
	private BigDecimal runtime;
	private byte[] estitaskwork;
	private String estipretime;
	private String estiruntime;
	private BigDecimal planqty;
	private BigDecimal completeqty;
	private String deptid;
	private String mastershop;
	private BigDecimal operationId;
	private String operationIddesc;
	private String parentuid;
	private Byte agreestate;
	private Byte locked;
	private String text1;
	private String partName;
	private String drawingid;
	private Long plangrade;

	public TvProcesstaskPrjId() {
	}

	public TvProcesstaskPrjId(String taskuid, String partNumber, String deptid) {
		this.taskuid = taskuid;
		this.partNumber = partNumber;
		this.deptid = deptid;
	}

	public TvProcesstaskPrjId(String taskuid, String taskname, Long startendmark, BigDecimal taskstate, String model,
			String batchnum, String partNumber, Date latestart, Date latefinish, Long constrainttype,
			Date constraintdate, Date planstart, Date planfinish, Long planstate, Date schedulestart,
			Date schedulefinish, Date actualstart, Date actualfinish, Date earlystart, Date earlyfinish, Long priority,
			String tasktype, BigDecimal taskwork, BigDecimal preoptime, BigDecimal postoptime, BigDecimal runtime,
			byte[] estitaskwork, String estipretime, String estiruntime, BigDecimal planqty, BigDecimal completeqty,
			String deptid, String mastershop, BigDecimal operationId, String operationIddesc, String parentuid,
			Byte agreestate, Byte locked, String text1, String partName, String drawingid, Long plangrade) {
		this.taskuid = taskuid;
		this.taskname = taskname;
		this.startendmark = startendmark;
		this.taskstate = taskstate;
		this.model = model;
		this.batchnum = batchnum;
		this.partNumber = partNumber;
		this.latestart = latestart;
		this.latefinish = latefinish;
		this.constrainttype = constrainttype;
		this.constraintdate = constraintdate;
		this.planstart = planstart;
		this.planfinish = planfinish;
		this.planstate = planstate;
		this.schedulestart = schedulestart;
		this.schedulefinish = schedulefinish;
		this.actualstart = actualstart;
		this.actualfinish = actualfinish;
		this.earlystart = earlystart;
		this.earlyfinish = earlyfinish;
		this.priority = priority;
		this.tasktype = tasktype;
		this.taskwork = taskwork;
		this.preoptime = preoptime;
		this.postoptime = postoptime;
		this.runtime = runtime;
		this.estitaskwork = estitaskwork;
		this.estipretime = estipretime;
		this.estiruntime = estiruntime;
		this.planqty = planqty;
		this.completeqty = completeqty;
		this.deptid = deptid;
		this.mastershop = mastershop;
		this.operationId = operationId;
		this.operationIddesc = operationIddesc;
		this.parentuid = parentuid;
		this.agreestate = agreestate;
		this.locked = locked;
		this.text1 = text1;
		this.partName = partName;
		this.drawingid = drawingid;
		this.plangrade = plangrade;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public String getTaskname() {
		return this.taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public Long getStartendmark() {
		return this.startendmark;
	}

	public void setStartendmark(Long startendmark) {
		this.startendmark = startendmark;
	}

	public BigDecimal getTaskstate() {
		return this.taskstate;
	}

	public void setTaskstate(BigDecimal taskstate) {
		this.taskstate = taskstate;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public Date getLatestart() {
		return this.latestart;
	}

	public void setLatestart(Date latestart) {
		this.latestart = latestart;
	}

	public Date getLatefinish() {
		return this.latefinish;
	}

	public void setLatefinish(Date latefinish) {
		this.latefinish = latefinish;
	}

	public Long getConstrainttype() {
		return this.constrainttype;
	}

	public void setConstrainttype(Long constrainttype) {
		this.constrainttype = constrainttype;
	}

	public Date getConstraintdate() {
		return this.constraintdate;
	}

	public void setConstraintdate(Date constraintdate) {
		this.constraintdate = constraintdate;
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

	public Long getPlanstate() {
		return this.planstate;
	}

	public void setPlanstate(Long planstate) {
		this.planstate = planstate;
	}

	public Date getSchedulestart() {
		return this.schedulestart;
	}

	public void setSchedulestart(Date schedulestart) {
		this.schedulestart = schedulestart;
	}

	public Date getSchedulefinish() {
		return this.schedulefinish;
	}

	public void setSchedulefinish(Date schedulefinish) {
		this.schedulefinish = schedulefinish;
	}

	public Date getActualstart() {
		return this.actualstart;
	}

	public void setActualstart(Date actualstart) {
		this.actualstart = actualstart;
	}

	public Date getActualfinish() {
		return this.actualfinish;
	}

	public void setActualfinish(Date actualfinish) {
		this.actualfinish = actualfinish;
	}

	public Date getEarlystart() {
		return this.earlystart;
	}

	public void setEarlystart(Date earlystart) {
		this.earlystart = earlystart;
	}

	public Date getEarlyfinish() {
		return this.earlyfinish;
	}

	public void setEarlyfinish(Date earlyfinish) {
		this.earlyfinish = earlyfinish;
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

	public BigDecimal getTaskwork() {
		return this.taskwork;
	}

	public void setTaskwork(BigDecimal taskwork) {
		this.taskwork = taskwork;
	}

	public BigDecimal getPreoptime() {
		return this.preoptime;
	}

	public void setPreoptime(BigDecimal preoptime) {
		this.preoptime = preoptime;
	}

	public BigDecimal getPostoptime() {
		return this.postoptime;
	}

	public void setPostoptime(BigDecimal postoptime) {
		this.postoptime = postoptime;
	}

	public BigDecimal getRuntime() {
		return this.runtime;
	}

	public void setRuntime(BigDecimal runtime) {
		this.runtime = runtime;
	}

	public byte[] getEstitaskwork() {
		return this.estitaskwork;
	}

	public void setEstitaskwork(byte[] estitaskwork) {
		this.estitaskwork = estitaskwork;
	}

	public String getEstipretime() {
		return this.estipretime;
	}

	public void setEstipretime(String estipretime) {
		this.estipretime = estipretime;
	}

	public String getEstiruntime() {
		return this.estiruntime;
	}

	public void setEstiruntime(String estiruntime) {
		this.estiruntime = estiruntime;
	}

	public BigDecimal getPlanqty() {
		return this.planqty;
	}

	public void setPlanqty(BigDecimal planqty) {
		this.planqty = planqty;
	}

	public BigDecimal getCompleteqty() {
		return this.completeqty;
	}

	public void setCompleteqty(BigDecimal completeqty) {
		this.completeqty = completeqty;
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

	public String getParentuid() {
		return this.parentuid;
	}

	public void setParentuid(String parentuid) {
		this.parentuid = parentuid;
	}

	public Byte getAgreestate() {
		return this.agreestate;
	}

	public void setAgreestate(Byte agreestate) {
		this.agreestate = agreestate;
	}

	public Byte getLocked() {
		return this.locked;
	}

	public void setLocked(Byte locked) {
		this.locked = locked;
	}

	public String getText1() {
		return this.text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public Long getPlangrade() {
		return this.plangrade;
	}

	public void setPlangrade(Long plangrade) {
		this.plangrade = plangrade;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TvProcesstaskPrjId))
			return false;
		TvProcesstaskPrjId castOther = (TvProcesstaskPrjId) other;

		return ((this.getTaskuid() == castOther.getTaskuid()) || (this.getTaskuid() != null
				&& castOther.getTaskuid() != null && this.getTaskuid().equals(castOther.getTaskuid())))
				&& ((this.getTaskname() == castOther.getTaskname()) || (this.getTaskname() != null
						&& castOther.getTaskname() != null && this.getTaskname().equals(castOther.getTaskname())))
				&& ((this.getStartendmark() == castOther.getStartendmark())
						|| (this.getStartendmark() != null && castOther.getStartendmark() != null
								&& this.getStartendmark().equals(castOther.getStartendmark())))
				&& ((this.getTaskstate() == castOther.getTaskstate()) || (this.getTaskstate() != null
						&& castOther.getTaskstate() != null && this.getTaskstate().equals(castOther.getTaskstate())))
				&& ((this.getModel() == castOther.getModel()) || (this.getModel() != null
						&& castOther.getModel() != null && this.getModel().equals(castOther.getModel())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& ((this.getLatestart() == castOther.getLatestart()) || (this.getLatestart() != null
						&& castOther.getLatestart() != null && this.getLatestart().equals(castOther.getLatestart())))
				&& ((this.getLatefinish() == castOther.getLatefinish()) || (this.getLatefinish() != null
						&& castOther.getLatefinish() != null && this.getLatefinish().equals(castOther.getLatefinish())))
				&& ((this.getConstrainttype() == castOther.getConstrainttype())
						|| (this.getConstrainttype() != null && castOther.getConstrainttype() != null
								&& this.getConstrainttype().equals(castOther.getConstrainttype())))
				&& ((this.getConstraintdate() == castOther.getConstraintdate())
						|| (this.getConstraintdate() != null && castOther.getConstraintdate() != null
								&& this.getConstraintdate().equals(castOther.getConstraintdate())))
				&& ((this.getPlanstart() == castOther.getPlanstart()) || (this.getPlanstart() != null
						&& castOther.getPlanstart() != null && this.getPlanstart().equals(castOther.getPlanstart())))
				&& ((this.getPlanfinish() == castOther.getPlanfinish()) || (this.getPlanfinish() != null
						&& castOther.getPlanfinish() != null && this.getPlanfinish().equals(castOther.getPlanfinish())))
				&& ((this.getPlanstate() == castOther.getPlanstate()) || (this.getPlanstate() != null
						&& castOther.getPlanstate() != null && this.getPlanstate().equals(castOther.getPlanstate())))
				&& ((this.getSchedulestart() == castOther.getSchedulestart())
						|| (this.getSchedulestart() != null && castOther.getSchedulestart() != null
								&& this.getSchedulestart().equals(castOther.getSchedulestart())))
				&& ((this.getSchedulefinish() == castOther.getSchedulefinish())
						|| (this.getSchedulefinish() != null && castOther.getSchedulefinish() != null
								&& this.getSchedulefinish().equals(castOther.getSchedulefinish())))
				&& ((this.getActualstart() == castOther.getActualstart())
						|| (this.getActualstart() != null && castOther.getActualstart() != null
								&& this.getActualstart().equals(castOther.getActualstart())))
				&& ((this.getActualfinish() == castOther.getActualfinish())
						|| (this.getActualfinish() != null && castOther.getActualfinish() != null
								&& this.getActualfinish().equals(castOther.getActualfinish())))
				&& ((this.getEarlystart() == castOther.getEarlystart()) || (this.getEarlystart() != null
						&& castOther.getEarlystart() != null && this.getEarlystart().equals(castOther.getEarlystart())))
				&& ((this.getEarlyfinish() == castOther.getEarlyfinish())
						|| (this.getEarlyfinish() != null && castOther.getEarlyfinish() != null
								&& this.getEarlyfinish().equals(castOther.getEarlyfinish())))
				&& ((this.getPriority() == castOther.getPriority()) || (this.getPriority() != null
						&& castOther.getPriority() != null && this.getPriority().equals(castOther.getPriority())))
				&& ((this.getTasktype() == castOther.getTasktype()) || (this.getTasktype() != null
						&& castOther.getTasktype() != null && this.getTasktype().equals(castOther.getTasktype())))
				&& ((this.getTaskwork() == castOther.getTaskwork()) || (this.getTaskwork() != null
						&& castOther.getTaskwork() != null && this.getTaskwork().equals(castOther.getTaskwork())))
				&& ((this.getPreoptime() == castOther.getPreoptime()) || (this.getPreoptime() != null
						&& castOther.getPreoptime() != null && this.getPreoptime().equals(castOther.getPreoptime())))
				&& ((this.getPostoptime() == castOther.getPostoptime()) || (this.getPostoptime() != null
						&& castOther.getPostoptime() != null && this.getPostoptime().equals(castOther.getPostoptime())))
				&& ((this.getRuntime() == castOther.getRuntime()) || (this.getRuntime() != null
						&& castOther.getRuntime() != null && this.getRuntime().equals(castOther.getRuntime())))
				&& ((this.getEstitaskwork() == castOther.getEstitaskwork())
						|| (this.getEstitaskwork() != null && castOther.getEstitaskwork() != null
								&& Arrays.equals(this.getEstitaskwork(), castOther.getEstitaskwork())))
				&& ((this.getEstipretime() == castOther.getEstipretime())
						|| (this.getEstipretime() != null && castOther.getEstipretime() != null
								&& this.getEstipretime().equals(castOther.getEstipretime())))
				&& ((this.getEstiruntime() == castOther.getEstiruntime())
						|| (this.getEstiruntime() != null && castOther.getEstiruntime() != null
								&& this.getEstiruntime().equals(castOther.getEstiruntime())))
				&& ((this.getPlanqty() == castOther.getPlanqty()) || (this.getPlanqty() != null
						&& castOther.getPlanqty() != null && this.getPlanqty().equals(castOther.getPlanqty())))
				&& ((this.getCompleteqty() == castOther.getCompleteqty())
						|| (this.getCompleteqty() != null && castOther.getCompleteqty() != null
								&& this.getCompleteqty().equals(castOther.getCompleteqty())))
				&& ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
						&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getMastershop() == castOther.getMastershop()) || (this.getMastershop() != null
						&& castOther.getMastershop() != null && this.getMastershop().equals(castOther.getMastershop())))
				&& ((this.getOperationId() == castOther.getOperationId())
						|| (this.getOperationId() != null && castOther.getOperationId() != null
								&& this.getOperationId().equals(castOther.getOperationId())))
				&& ((this.getOperationIddesc() == castOther.getOperationIddesc())
						|| (this.getOperationIddesc() != null && castOther.getOperationIddesc() != null
								&& this.getOperationIddesc().equals(castOther.getOperationIddesc())))
				&& ((this.getParentuid() == castOther.getParentuid()) || (this.getParentuid() != null
						&& castOther.getParentuid() != null && this.getParentuid().equals(castOther.getParentuid())))
				&& ((this.getAgreestate() == castOther.getAgreestate()) || (this.getAgreestate() != null
						&& castOther.getAgreestate() != null && this.getAgreestate().equals(castOther.getAgreestate())))
				&& ((this.getLocked() == castOther.getLocked()) || (this.getLocked() != null
						&& castOther.getLocked() != null && this.getLocked().equals(castOther.getLocked())))
				&& ((this.getText1() == castOther.getText1()) || (this.getText1() != null
						&& castOther.getText1() != null && this.getText1().equals(castOther.getText1())))
				&& ((this.getPartName() == castOther.getPartName()) || (this.getPartName() != null
						&& castOther.getPartName() != null && this.getPartName().equals(castOther.getPartName())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getPlangrade() == castOther.getPlangrade()) || (this.getPlangrade() != null
						&& castOther.getPlangrade() != null && this.getPlangrade().equals(castOther.getPlangrade())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaskuid() == null ? 0 : this.getTaskuid().hashCode());
		result = 37 * result + (getTaskname() == null ? 0 : this.getTaskname().hashCode());
		result = 37 * result + (getStartendmark() == null ? 0 : this.getStartendmark().hashCode());
		result = 37 * result + (getTaskstate() == null ? 0 : this.getTaskstate().hashCode());
		result = 37 * result + (getModel() == null ? 0 : this.getModel().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getLatestart() == null ? 0 : this.getLatestart().hashCode());
		result = 37 * result + (getLatefinish() == null ? 0 : this.getLatefinish().hashCode());
		result = 37 * result + (getConstrainttype() == null ? 0 : this.getConstrainttype().hashCode());
		result = 37 * result + (getConstraintdate() == null ? 0 : this.getConstraintdate().hashCode());
		result = 37 * result + (getPlanstart() == null ? 0 : this.getPlanstart().hashCode());
		result = 37 * result + (getPlanfinish() == null ? 0 : this.getPlanfinish().hashCode());
		result = 37 * result + (getPlanstate() == null ? 0 : this.getPlanstate().hashCode());
		result = 37 * result + (getSchedulestart() == null ? 0 : this.getSchedulestart().hashCode());
		result = 37 * result + (getSchedulefinish() == null ? 0 : this.getSchedulefinish().hashCode());
		result = 37 * result + (getActualstart() == null ? 0 : this.getActualstart().hashCode());
		result = 37 * result + (getActualfinish() == null ? 0 : this.getActualfinish().hashCode());
		result = 37 * result + (getEarlystart() == null ? 0 : this.getEarlystart().hashCode());
		result = 37 * result + (getEarlyfinish() == null ? 0 : this.getEarlyfinish().hashCode());
		result = 37 * result + (getPriority() == null ? 0 : this.getPriority().hashCode());
		result = 37 * result + (getTasktype() == null ? 0 : this.getTasktype().hashCode());
		result = 37 * result + (getTaskwork() == null ? 0 : this.getTaskwork().hashCode());
		result = 37 * result + (getPreoptime() == null ? 0 : this.getPreoptime().hashCode());
		result = 37 * result + (getPostoptime() == null ? 0 : this.getPostoptime().hashCode());
		result = 37 * result + (getRuntime() == null ? 0 : this.getRuntime().hashCode());
		int estitaskworkHashcode = 0;
		byte[] estitaskworkProperty = this.getEstitaskwork();
		if (estitaskworkProperty != null) {
			estitaskworkHashcode = 1;
			for (int i = 0; i < estitaskworkProperty.length; i++) {
				estitaskworkHashcode = 37 * estitaskworkHashcode + estitaskworkProperty[i];
			}
		}

		result = 37 * result + estitaskworkHashcode;

		result = 37 * result + (getEstipretime() == null ? 0 : this.getEstipretime().hashCode());
		result = 37 * result + (getEstiruntime() == null ? 0 : this.getEstiruntime().hashCode());
		result = 37 * result + (getPlanqty() == null ? 0 : this.getPlanqty().hashCode());
		result = 37 * result + (getCompleteqty() == null ? 0 : this.getCompleteqty().hashCode());
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getMastershop() == null ? 0 : this.getMastershop().hashCode());
		result = 37 * result + (getOperationId() == null ? 0 : this.getOperationId().hashCode());
		result = 37 * result + (getOperationIddesc() == null ? 0 : this.getOperationIddesc().hashCode());
		result = 37 * result + (getParentuid() == null ? 0 : this.getParentuid().hashCode());
		result = 37 * result + (getAgreestate() == null ? 0 : this.getAgreestate().hashCode());
		result = 37 * result + (getLocked() == null ? 0 : this.getLocked().hashCode());
		result = 37 * result + (getText1() == null ? 0 : this.getText1().hashCode());
		result = 37 * result + (getPartName() == null ? 0 : this.getPartName().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getPlangrade() == null ? 0 : this.getPlangrade().hashCode());
		return result;
	}

}
