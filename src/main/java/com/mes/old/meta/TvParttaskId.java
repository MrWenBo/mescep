package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * TvParttaskId generated by hbm2java
 */
public class TvParttaskId implements java.io.Serializable {

	private String taskuid;
	private String taskid;
	private String taskname;
	private String model;
	private String batchnum;
	private String partNumber;
	private Date planstart;
	private Date planfinish;
	private Date earlystart;
	private Date latefinish;
	private Long priority;
	private String prioritydesc;
	private String tasktype;
	private BigDecimal taskwork;
	private BigDecimal planqty;
	private BigDecimal completeqty;
	private String deptid;
	private String mastershop;
	private String routing;
	private String routineVersionid;
	private String routineVersionidDesc;
	private BigDecimal deliveryqty;
	private BigDecimal taskstate;
	private Integer routinestate;
	private Integer materialstate;
	private String materialstatedesc;
	private Integer resourcestate;
	private String creator;
	private String employeename;
	private Date createtime;
	private String notes;
	private BigDecimal check1qty;
	private String rootbatchnum;
	private String costid;
	private Boolean isprint;
	private String reasoncode;
	private BigDecimal check8qty;
	private String modeldesc;
	private Byte suspended;
	private Boolean isturned;
	private String partName;
	private Long isImportantPart;
	private Long isCriticalPart;
	private String productPhase;
	private String taskstatedesc;
	private String tasktypedesc;
	private String deptiddesc;
	private String mastershopdesc;
	private String drawingid;
	private String versionid;
	private Date actualstart;
	private Date actualfinish;
	private Byte locked;
	private BigDecimal dueqty;
	private Boolean isUrgent;
	private BigDecimal demandlinkqty;
	private String roughNumber;
	private String materialNumber;
	private String importantdesc;

	public TvParttaskId() {
	}

	public TvParttaskId(String taskuid, String partNumber, String deptid) {
		this.taskuid = taskuid;
		this.partNumber = partNumber;
		this.deptid = deptid;
	}

	public TvParttaskId(String taskuid, String taskid, String taskname, String model, String batchnum,
			String partNumber, Date planstart, Date planfinish, Date earlystart, Date latefinish, Long priority,
			String prioritydesc, String tasktype, BigDecimal taskwork, BigDecimal planqty, BigDecimal completeqty,
			String deptid, String mastershop, String routing, String routineVersionid, String routineVersionidDesc,
			BigDecimal deliveryqty, BigDecimal taskstate, Integer routinestate, Integer materialstate,
			String materialstatedesc, Integer resourcestate, String creator, String employeename, Date createtime,
			String notes, BigDecimal check1qty, String rootbatchnum, String costid, Boolean isprint, String reasoncode,
			BigDecimal check8qty, String modeldesc, Byte suspended, Boolean isturned, String partName,
			Long isImportantPart, Long isCriticalPart, String productPhase, String taskstatedesc, String tasktypedesc,
			String deptiddesc, String mastershopdesc, String drawingid, String versionid, Date actualstart,
			Date actualfinish, Byte locked, BigDecimal dueqty, Boolean isUrgent, BigDecimal demandlinkqty,
			String roughNumber, String materialNumber, String importantdesc) {
		this.taskuid = taskuid;
		this.taskid = taskid;
		this.taskname = taskname;
		this.model = model;
		this.batchnum = batchnum;
		this.partNumber = partNumber;
		this.planstart = planstart;
		this.planfinish = planfinish;
		this.earlystart = earlystart;
		this.latefinish = latefinish;
		this.priority = priority;
		this.prioritydesc = prioritydesc;
		this.tasktype = tasktype;
		this.taskwork = taskwork;
		this.planqty = planqty;
		this.completeqty = completeqty;
		this.deptid = deptid;
		this.mastershop = mastershop;
		this.routing = routing;
		this.routineVersionid = routineVersionid;
		this.routineVersionidDesc = routineVersionidDesc;
		this.deliveryqty = deliveryqty;
		this.taskstate = taskstate;
		this.routinestate = routinestate;
		this.materialstate = materialstate;
		this.materialstatedesc = materialstatedesc;
		this.resourcestate = resourcestate;
		this.creator = creator;
		this.employeename = employeename;
		this.createtime = createtime;
		this.notes = notes;
		this.check1qty = check1qty;
		this.rootbatchnum = rootbatchnum;
		this.costid = costid;
		this.isprint = isprint;
		this.reasoncode = reasoncode;
		this.check8qty = check8qty;
		this.modeldesc = modeldesc;
		this.suspended = suspended;
		this.isturned = isturned;
		this.partName = partName;
		this.isImportantPart = isImportantPart;
		this.isCriticalPart = isCriticalPart;
		this.productPhase = productPhase;
		this.taskstatedesc = taskstatedesc;
		this.tasktypedesc = tasktypedesc;
		this.deptiddesc = deptiddesc;
		this.mastershopdesc = mastershopdesc;
		this.drawingid = drawingid;
		this.versionid = versionid;
		this.actualstart = actualstart;
		this.actualfinish = actualfinish;
		this.locked = locked;
		this.dueqty = dueqty;
		this.isUrgent = isUrgent;
		this.demandlinkqty = demandlinkqty;
		this.roughNumber = roughNumber;
		this.materialNumber = materialNumber;
		this.importantdesc = importantdesc;
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

	public String getTaskname() {
		return this.taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
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

	public Date getEarlystart() {
		return this.earlystart;
	}

	public void setEarlystart(Date earlystart) {
		this.earlystart = earlystart;
	}

	public Date getLatefinish() {
		return this.latefinish;
	}

	public void setLatefinish(Date latefinish) {
		this.latefinish = latefinish;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getPrioritydesc() {
		return this.prioritydesc;
	}

	public void setPrioritydesc(String prioritydesc) {
		this.prioritydesc = prioritydesc;
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

	public String getRouting() {
		return this.routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public String getRoutineVersionid() {
		return this.routineVersionid;
	}

	public void setRoutineVersionid(String routineVersionid) {
		this.routineVersionid = routineVersionid;
	}

	public String getRoutineVersionidDesc() {
		return this.routineVersionidDesc;
	}

	public void setRoutineVersionidDesc(String routineVersionidDesc) {
		this.routineVersionidDesc = routineVersionidDesc;
	}

	public BigDecimal getDeliveryqty() {
		return this.deliveryqty;
	}

	public void setDeliveryqty(BigDecimal deliveryqty) {
		this.deliveryqty = deliveryqty;
	}

	public BigDecimal getTaskstate() {
		return this.taskstate;
	}

	public void setTaskstate(BigDecimal taskstate) {
		this.taskstate = taskstate;
	}

	public Integer getRoutinestate() {
		return this.routinestate;
	}

	public void setRoutinestate(Integer routinestate) {
		this.routinestate = routinestate;
	}

	public Integer getMaterialstate() {
		return this.materialstate;
	}

	public void setMaterialstate(Integer materialstate) {
		this.materialstate = materialstate;
	}

	public String getMaterialstatedesc() {
		return this.materialstatedesc;
	}

	public void setMaterialstatedesc(String materialstatedesc) {
		this.materialstatedesc = materialstatedesc;
	}

	public Integer getResourcestate() {
		return this.resourcestate;
	}

	public void setResourcestate(Integer resourcestate) {
		this.resourcestate = resourcestate;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getEmployeename() {
		return this.employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BigDecimal getCheck1qty() {
		return this.check1qty;
	}

	public void setCheck1qty(BigDecimal check1qty) {
		this.check1qty = check1qty;
	}

	public String getRootbatchnum() {
		return this.rootbatchnum;
	}

	public void setRootbatchnum(String rootbatchnum) {
		this.rootbatchnum = rootbatchnum;
	}

	public String getCostid() {
		return this.costid;
	}

	public void setCostid(String costid) {
		this.costid = costid;
	}

	public Boolean getIsprint() {
		return this.isprint;
	}

	public void setIsprint(Boolean isprint) {
		this.isprint = isprint;
	}

	public String getReasoncode() {
		return this.reasoncode;
	}

	public void setReasoncode(String reasoncode) {
		this.reasoncode = reasoncode;
	}

	public BigDecimal getCheck8qty() {
		return this.check8qty;
	}

	public void setCheck8qty(BigDecimal check8qty) {
		this.check8qty = check8qty;
	}

	public String getModeldesc() {
		return this.modeldesc;
	}

	public void setModeldesc(String modeldesc) {
		this.modeldesc = modeldesc;
	}

	public Byte getSuspended() {
		return this.suspended;
	}

	public void setSuspended(Byte suspended) {
		this.suspended = suspended;
	}

	public Boolean getIsturned() {
		return this.isturned;
	}

	public void setIsturned(Boolean isturned) {
		this.isturned = isturned;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public Long getIsImportantPart() {
		return this.isImportantPart;
	}

	public void setIsImportantPart(Long isImportantPart) {
		this.isImportantPart = isImportantPart;
	}

	public Long getIsCriticalPart() {
		return this.isCriticalPart;
	}

	public void setIsCriticalPart(Long isCriticalPart) {
		this.isCriticalPart = isCriticalPart;
	}

	public String getProductPhase() {
		return this.productPhase;
	}

	public void setProductPhase(String productPhase) {
		this.productPhase = productPhase;
	}

	public String getTaskstatedesc() {
		return this.taskstatedesc;
	}

	public void setTaskstatedesc(String taskstatedesc) {
		this.taskstatedesc = taskstatedesc;
	}

	public String getTasktypedesc() {
		return this.tasktypedesc;
	}

	public void setTasktypedesc(String tasktypedesc) {
		this.tasktypedesc = tasktypedesc;
	}

	public String getDeptiddesc() {
		return this.deptiddesc;
	}

	public void setDeptiddesc(String deptiddesc) {
		this.deptiddesc = deptiddesc;
	}

	public String getMastershopdesc() {
		return this.mastershopdesc;
	}

	public void setMastershopdesc(String mastershopdesc) {
		this.mastershopdesc = mastershopdesc;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public String getVersionid() {
		return this.versionid;
	}

	public void setVersionid(String versionid) {
		this.versionid = versionid;
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

	public Byte getLocked() {
		return this.locked;
	}

	public void setLocked(Byte locked) {
		this.locked = locked;
	}

	public BigDecimal getDueqty() {
		return this.dueqty;
	}

	public void setDueqty(BigDecimal dueqty) {
		this.dueqty = dueqty;
	}

	public Boolean getIsUrgent() {
		return this.isUrgent;
	}

	public void setIsUrgent(Boolean isUrgent) {
		this.isUrgent = isUrgent;
	}

	public BigDecimal getDemandlinkqty() {
		return this.demandlinkqty;
	}

	public void setDemandlinkqty(BigDecimal demandlinkqty) {
		this.demandlinkqty = demandlinkqty;
	}

	public String getRoughNumber() {
		return this.roughNumber;
	}

	public void setRoughNumber(String roughNumber) {
		this.roughNumber = roughNumber;
	}

	public String getMaterialNumber() {
		return this.materialNumber;
	}

	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}

	public String getImportantdesc() {
		return this.importantdesc;
	}

	public void setImportantdesc(String importantdesc) {
		this.importantdesc = importantdesc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TvParttaskId))
			return false;
		TvParttaskId castOther = (TvParttaskId) other;

		return ((this.getTaskuid() == castOther.getTaskuid()) || (this.getTaskuid() != null
				&& castOther.getTaskuid() != null && this.getTaskuid().equals(castOther.getTaskuid())))
				&& ((this.getTaskid() == castOther.getTaskid()) || (this.getTaskid() != null
						&& castOther.getTaskid() != null && this.getTaskid().equals(castOther.getTaskid())))
				&& ((this.getTaskname() == castOther.getTaskname()) || (this.getTaskname() != null
						&& castOther.getTaskname() != null && this.getTaskname().equals(castOther.getTaskname())))
				&& ((this.getModel() == castOther.getModel()) || (this.getModel() != null
						&& castOther.getModel() != null && this.getModel().equals(castOther.getModel())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& ((this.getPlanstart() == castOther.getPlanstart()) || (this.getPlanstart() != null
						&& castOther.getPlanstart() != null && this.getPlanstart().equals(castOther.getPlanstart())))
				&& ((this.getPlanfinish() == castOther.getPlanfinish()) || (this.getPlanfinish() != null
						&& castOther.getPlanfinish() != null && this.getPlanfinish().equals(castOther.getPlanfinish())))
				&& ((this.getEarlystart() == castOther.getEarlystart()) || (this.getEarlystart() != null
						&& castOther.getEarlystart() != null && this.getEarlystart().equals(castOther.getEarlystart())))
				&& ((this.getLatefinish() == castOther.getLatefinish()) || (this.getLatefinish() != null
						&& castOther.getLatefinish() != null && this.getLatefinish().equals(castOther.getLatefinish())))
				&& ((this.getPriority() == castOther.getPriority()) || (this.getPriority() != null
						&& castOther.getPriority() != null && this.getPriority().equals(castOther.getPriority())))
				&& ((this.getPrioritydesc() == castOther.getPrioritydesc())
						|| (this.getPrioritydesc() != null && castOther.getPrioritydesc() != null
								&& this.getPrioritydesc().equals(castOther.getPrioritydesc())))
				&& ((this.getTasktype() == castOther.getTasktype()) || (this.getTasktype() != null
						&& castOther.getTasktype() != null && this.getTasktype().equals(castOther.getTasktype())))
				&& ((this.getTaskwork() == castOther.getTaskwork()) || (this.getTaskwork() != null
						&& castOther.getTaskwork() != null && this.getTaskwork().equals(castOther.getTaskwork())))
				&& ((this.getPlanqty() == castOther.getPlanqty()) || (this.getPlanqty() != null
						&& castOther.getPlanqty() != null && this.getPlanqty().equals(castOther.getPlanqty())))
				&& ((this.getCompleteqty() == castOther.getCompleteqty())
						|| (this.getCompleteqty() != null && castOther.getCompleteqty() != null
								&& this.getCompleteqty().equals(castOther.getCompleteqty())))
				&& ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
						&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getMastershop() == castOther.getMastershop()) || (this.getMastershop() != null
						&& castOther.getMastershop() != null && this.getMastershop().equals(castOther.getMastershop())))
				&& ((this.getRouting() == castOther.getRouting()) || (this.getRouting() != null
						&& castOther.getRouting() != null && this.getRouting().equals(castOther.getRouting())))
				&& ((this.getRoutineVersionid() == castOther.getRoutineVersionid())
						|| (this.getRoutineVersionid() != null && castOther.getRoutineVersionid() != null
								&& this.getRoutineVersionid().equals(castOther.getRoutineVersionid())))
				&& ((this.getRoutineVersionidDesc() == castOther.getRoutineVersionidDesc())
						|| (this.getRoutineVersionidDesc() != null && castOther.getRoutineVersionidDesc() != null
								&& this.getRoutineVersionidDesc().equals(castOther.getRoutineVersionidDesc())))
				&& ((this.getDeliveryqty() == castOther.getDeliveryqty())
						|| (this.getDeliveryqty() != null && castOther.getDeliveryqty() != null
								&& this.getDeliveryqty().equals(castOther.getDeliveryqty())))
				&& ((this.getTaskstate() == castOther.getTaskstate()) || (this.getTaskstate() != null
						&& castOther.getTaskstate() != null && this.getTaskstate().equals(castOther.getTaskstate())))
				&& ((this.getRoutinestate() == castOther.getRoutinestate())
						|| (this.getRoutinestate() != null && castOther.getRoutinestate() != null
								&& this.getRoutinestate().equals(castOther.getRoutinestate())))
				&& ((this.getMaterialstate() == castOther.getMaterialstate())
						|| (this.getMaterialstate() != null && castOther.getMaterialstate() != null
								&& this.getMaterialstate().equals(castOther.getMaterialstate())))
				&& ((this.getMaterialstatedesc() == castOther.getMaterialstatedesc())
						|| (this.getMaterialstatedesc() != null && castOther.getMaterialstatedesc() != null
								&& this.getMaterialstatedesc().equals(castOther.getMaterialstatedesc())))
				&& ((this.getResourcestate() == castOther.getResourcestate())
						|| (this.getResourcestate() != null && castOther.getResourcestate() != null
								&& this.getResourcestate().equals(castOther.getResourcestate())))
				&& ((this.getCreator() == castOther.getCreator()) || (this.getCreator() != null
						&& castOther.getCreator() != null && this.getCreator().equals(castOther.getCreator())))
				&& ((this.getEmployeename() == castOther.getEmployeename())
						|| (this.getEmployeename() != null && castOther.getEmployeename() != null
								&& this.getEmployeename().equals(castOther.getEmployeename())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getCheck1qty() == castOther.getCheck1qty()) || (this.getCheck1qty() != null
						&& castOther.getCheck1qty() != null && this.getCheck1qty().equals(castOther.getCheck1qty())))
				&& ((this.getRootbatchnum() == castOther.getRootbatchnum())
						|| (this.getRootbatchnum() != null && castOther.getRootbatchnum() != null
								&& this.getRootbatchnum().equals(castOther.getRootbatchnum())))
				&& ((this.getCostid() == castOther.getCostid()) || (this.getCostid() != null
						&& castOther.getCostid() != null && this.getCostid().equals(castOther.getCostid())))
				&& ((this.getIsprint() == castOther.getIsprint()) || (this.getIsprint() != null
						&& castOther.getIsprint() != null && this.getIsprint().equals(castOther.getIsprint())))
				&& ((this.getReasoncode() == castOther.getReasoncode()) || (this.getReasoncode() != null
						&& castOther.getReasoncode() != null && this.getReasoncode().equals(castOther.getReasoncode())))
				&& ((this.getCheck8qty() == castOther.getCheck8qty()) || (this.getCheck8qty() != null
						&& castOther.getCheck8qty() != null && this.getCheck8qty().equals(castOther.getCheck8qty())))
				&& ((this.getModeldesc() == castOther.getModeldesc()) || (this.getModeldesc() != null
						&& castOther.getModeldesc() != null && this.getModeldesc().equals(castOther.getModeldesc())))
				&& ((this.getSuspended() == castOther.getSuspended()) || (this.getSuspended() != null
						&& castOther.getSuspended() != null && this.getSuspended().equals(castOther.getSuspended())))
				&& ((this.getIsturned() == castOther.getIsturned()) || (this.getIsturned() != null
						&& castOther.getIsturned() != null && this.getIsturned().equals(castOther.getIsturned())))
				&& ((this.getPartName() == castOther.getPartName()) || (this.getPartName() != null
						&& castOther.getPartName() != null && this.getPartName().equals(castOther.getPartName())))
				&& ((this.getIsImportantPart() == castOther.getIsImportantPart())
						|| (this.getIsImportantPart() != null && castOther.getIsImportantPart() != null
								&& this.getIsImportantPart().equals(castOther.getIsImportantPart())))
				&& ((this.getIsCriticalPart() == castOther.getIsCriticalPart())
						|| (this.getIsCriticalPart() != null && castOther.getIsCriticalPart() != null
								&& this.getIsCriticalPart().equals(castOther.getIsCriticalPart())))
				&& ((this.getProductPhase() == castOther.getProductPhase())
						|| (this.getProductPhase() != null && castOther.getProductPhase() != null
								&& this.getProductPhase().equals(castOther.getProductPhase())))
				&& ((this.getTaskstatedesc() == castOther.getTaskstatedesc())
						|| (this.getTaskstatedesc() != null && castOther.getTaskstatedesc() != null
								&& this.getTaskstatedesc().equals(castOther.getTaskstatedesc())))
				&& ((this.getTasktypedesc() == castOther.getTasktypedesc())
						|| (this.getTasktypedesc() != null && castOther.getTasktypedesc() != null
								&& this.getTasktypedesc().equals(castOther.getTasktypedesc())))
				&& ((this.getDeptiddesc() == castOther.getDeptiddesc()) || (this.getDeptiddesc() != null
						&& castOther.getDeptiddesc() != null && this.getDeptiddesc().equals(castOther.getDeptiddesc())))
				&& ((this.getMastershopdesc() == castOther.getMastershopdesc())
						|| (this.getMastershopdesc() != null && castOther.getMastershopdesc() != null
								&& this.getMastershopdesc().equals(castOther.getMastershopdesc())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getVersionid() == castOther.getVersionid()) || (this.getVersionid() != null
						&& castOther.getVersionid() != null && this.getVersionid().equals(castOther.getVersionid())))
				&& ((this.getActualstart() == castOther.getActualstart())
						|| (this.getActualstart() != null && castOther.getActualstart() != null
								&& this.getActualstart().equals(castOther.getActualstart())))
				&& ((this.getActualfinish() == castOther.getActualfinish())
						|| (this.getActualfinish() != null && castOther.getActualfinish() != null
								&& this.getActualfinish().equals(castOther.getActualfinish())))
				&& ((this.getLocked() == castOther.getLocked()) || (this.getLocked() != null
						&& castOther.getLocked() != null && this.getLocked().equals(castOther.getLocked())))
				&& ((this.getDueqty() == castOther.getDueqty()) || (this.getDueqty() != null
						&& castOther.getDueqty() != null && this.getDueqty().equals(castOther.getDueqty())))
				&& ((this.getIsUrgent() == castOther.getIsUrgent()) || (this.getIsUrgent() != null
						&& castOther.getIsUrgent() != null && this.getIsUrgent().equals(castOther.getIsUrgent())))
				&& ((this.getDemandlinkqty() == castOther.getDemandlinkqty())
						|| (this.getDemandlinkqty() != null && castOther.getDemandlinkqty() != null
								&& this.getDemandlinkqty().equals(castOther.getDemandlinkqty())))
				&& ((this.getRoughNumber() == castOther.getRoughNumber())
						|| (this.getRoughNumber() != null && castOther.getRoughNumber() != null
								&& this.getRoughNumber().equals(castOther.getRoughNumber())))
				&& ((this.getMaterialNumber() == castOther.getMaterialNumber())
						|| (this.getMaterialNumber() != null && castOther.getMaterialNumber() != null
								&& this.getMaterialNumber().equals(castOther.getMaterialNumber())))
				&& ((this.getImportantdesc() == castOther.getImportantdesc())
						|| (this.getImportantdesc() != null && castOther.getImportantdesc() != null
								&& this.getImportantdesc().equals(castOther.getImportantdesc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaskuid() == null ? 0 : this.getTaskuid().hashCode());
		result = 37 * result + (getTaskid() == null ? 0 : this.getTaskid().hashCode());
		result = 37 * result + (getTaskname() == null ? 0 : this.getTaskname().hashCode());
		result = 37 * result + (getModel() == null ? 0 : this.getModel().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getPlanstart() == null ? 0 : this.getPlanstart().hashCode());
		result = 37 * result + (getPlanfinish() == null ? 0 : this.getPlanfinish().hashCode());
		result = 37 * result + (getEarlystart() == null ? 0 : this.getEarlystart().hashCode());
		result = 37 * result + (getLatefinish() == null ? 0 : this.getLatefinish().hashCode());
		result = 37 * result + (getPriority() == null ? 0 : this.getPriority().hashCode());
		result = 37 * result + (getPrioritydesc() == null ? 0 : this.getPrioritydesc().hashCode());
		result = 37 * result + (getTasktype() == null ? 0 : this.getTasktype().hashCode());
		result = 37 * result + (getTaskwork() == null ? 0 : this.getTaskwork().hashCode());
		result = 37 * result + (getPlanqty() == null ? 0 : this.getPlanqty().hashCode());
		result = 37 * result + (getCompleteqty() == null ? 0 : this.getCompleteqty().hashCode());
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getMastershop() == null ? 0 : this.getMastershop().hashCode());
		result = 37 * result + (getRouting() == null ? 0 : this.getRouting().hashCode());
		result = 37 * result + (getRoutineVersionid() == null ? 0 : this.getRoutineVersionid().hashCode());
		result = 37 * result + (getRoutineVersionidDesc() == null ? 0 : this.getRoutineVersionidDesc().hashCode());
		result = 37 * result + (getDeliveryqty() == null ? 0 : this.getDeliveryqty().hashCode());
		result = 37 * result + (getTaskstate() == null ? 0 : this.getTaskstate().hashCode());
		result = 37 * result + (getRoutinestate() == null ? 0 : this.getRoutinestate().hashCode());
		result = 37 * result + (getMaterialstate() == null ? 0 : this.getMaterialstate().hashCode());
		result = 37 * result + (getMaterialstatedesc() == null ? 0 : this.getMaterialstatedesc().hashCode());
		result = 37 * result + (getResourcestate() == null ? 0 : this.getResourcestate().hashCode());
		result = 37 * result + (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37 * result + (getEmployeename() == null ? 0 : this.getEmployeename().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getCheck1qty() == null ? 0 : this.getCheck1qty().hashCode());
		result = 37 * result + (getRootbatchnum() == null ? 0 : this.getRootbatchnum().hashCode());
		result = 37 * result + (getCostid() == null ? 0 : this.getCostid().hashCode());
		result = 37 * result + (getIsprint() == null ? 0 : this.getIsprint().hashCode());
		result = 37 * result + (getReasoncode() == null ? 0 : this.getReasoncode().hashCode());
		result = 37 * result + (getCheck8qty() == null ? 0 : this.getCheck8qty().hashCode());
		result = 37 * result + (getModeldesc() == null ? 0 : this.getModeldesc().hashCode());
		result = 37 * result + (getSuspended() == null ? 0 : this.getSuspended().hashCode());
		result = 37 * result + (getIsturned() == null ? 0 : this.getIsturned().hashCode());
		result = 37 * result + (getPartName() == null ? 0 : this.getPartName().hashCode());
		result = 37 * result + (getIsImportantPart() == null ? 0 : this.getIsImportantPart().hashCode());
		result = 37 * result + (getIsCriticalPart() == null ? 0 : this.getIsCriticalPart().hashCode());
		result = 37 * result + (getProductPhase() == null ? 0 : this.getProductPhase().hashCode());
		result = 37 * result + (getTaskstatedesc() == null ? 0 : this.getTaskstatedesc().hashCode());
		result = 37 * result + (getTasktypedesc() == null ? 0 : this.getTasktypedesc().hashCode());
		result = 37 * result + (getDeptiddesc() == null ? 0 : this.getDeptiddesc().hashCode());
		result = 37 * result + (getMastershopdesc() == null ? 0 : this.getMastershopdesc().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getVersionid() == null ? 0 : this.getVersionid().hashCode());
		result = 37 * result + (getActualstart() == null ? 0 : this.getActualstart().hashCode());
		result = 37 * result + (getActualfinish() == null ? 0 : this.getActualfinish().hashCode());
		result = 37 * result + (getLocked() == null ? 0 : this.getLocked().hashCode());
		result = 37 * result + (getDueqty() == null ? 0 : this.getDueqty().hashCode());
		result = 37 * result + (getIsUrgent() == null ? 0 : this.getIsUrgent().hashCode());
		result = 37 * result + (getDemandlinkqty() == null ? 0 : this.getDemandlinkqty().hashCode());
		result = 37 * result + (getRoughNumber() == null ? 0 : this.getRoughNumber().hashCode());
		result = 37 * result + (getMaterialNumber() == null ? 0 : this.getMaterialNumber().hashCode());
		result = 37 * result + (getImportantdesc() == null ? 0 : this.getImportantdesc().hashCode());
		return result;
	}

}
