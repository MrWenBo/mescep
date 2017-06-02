package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * TvExtrataskId generated by hbm2java
 */
public class TvExtrataskId implements java.io.Serializable {

	private String taskuid;
	private String taskname;
	private String model;
	private BigDecimal opuid;
	private String operationIddesc;
	private String batchnum;
	private String partNumber;
	private Date planstart;
	private Date planfinish;
	private Long planstate;
	private Date schedulestart;
	private Date schedulefinish;
	private Date actualstart;
	private Date actualfinish;
	private Date earlystart;
	private Date latefinish;
	private Long priority;
	private String tasktype;
	private BigDecimal taskwork;
	private BigDecimal preoptime;
	private BigDecimal runtime;
	private BigDecimal planqty;
	private BigDecimal completeqty;
	private String deptid;
	private String mastershop;
	private String routing;
	private BigDecimal operationId;
	private BigDecimal taskstate;
	private Integer resourcestate;
	private Integer routinestate;
	private Integer materialstate;
	private String creator;
	private Date createtime;
	private String notes;
	private BigDecimal check1qty;
	private String parentuid;
	private String rootbatchnum;
	private String costid;
	private Date basestart;
	private Date basefinish;
	private Byte agreestate;
	private String reasoncode;
	private BigDecimal plantaskwork;
	private BigDecimal check8qty;
	private Long noneneeddispatch;
	private String modeldesc;
	private Byte needcheck;
	private Byte suspended;
	private BigDecimal manhourstate;
	private Long optype;
	private BigDecimal tryqty;
	private BigDecimal estipretime;
	private BigDecimal estiruntime;
	private String partName;
	private String taskstatedesc;
	private String tasktypedesc;
	private String agreestatedesc;
	private String deptiddesc;
	private String mastershopdesc;
	private String drawingid;
	private String versionid;

	public TvExtrataskId() {
	}

	public TvExtrataskId(String taskuid, String partNumber, String deptid) {
		this.taskuid = taskuid;
		this.partNumber = partNumber;
		this.deptid = deptid;
	}

	public TvExtrataskId(String taskuid, String taskname, String model, BigDecimal opuid, String operationIddesc,
			String batchnum, String partNumber, Date planstart, Date planfinish, Long planstate, Date schedulestart,
			Date schedulefinish, Date actualstart, Date actualfinish, Date earlystart, Date latefinish, Long priority,
			String tasktype, BigDecimal taskwork, BigDecimal preoptime, BigDecimal runtime, BigDecimal planqty,
			BigDecimal completeqty, String deptid, String mastershop, String routing, BigDecimal operationId,
			BigDecimal taskstate, Integer resourcestate, Integer routinestate, Integer materialstate, String creator,
			Date createtime, String notes, BigDecimal check1qty, String parentuid, String rootbatchnum, String costid,
			Date basestart, Date basefinish, Byte agreestate, String reasoncode, BigDecimal plantaskwork,
			BigDecimal check8qty, Long noneneeddispatch, String modeldesc, Byte needcheck, Byte suspended,
			BigDecimal manhourstate, Long optype, BigDecimal tryqty, BigDecimal estipretime, BigDecimal estiruntime,
			String partName, String taskstatedesc, String tasktypedesc, String agreestatedesc, String deptiddesc,
			String mastershopdesc, String drawingid, String versionid) {
		this.taskuid = taskuid;
		this.taskname = taskname;
		this.model = model;
		this.opuid = opuid;
		this.operationIddesc = operationIddesc;
		this.batchnum = batchnum;
		this.partNumber = partNumber;
		this.planstart = planstart;
		this.planfinish = planfinish;
		this.planstate = planstate;
		this.schedulestart = schedulestart;
		this.schedulefinish = schedulefinish;
		this.actualstart = actualstart;
		this.actualfinish = actualfinish;
		this.earlystart = earlystart;
		this.latefinish = latefinish;
		this.priority = priority;
		this.tasktype = tasktype;
		this.taskwork = taskwork;
		this.preoptime = preoptime;
		this.runtime = runtime;
		this.planqty = planqty;
		this.completeqty = completeqty;
		this.deptid = deptid;
		this.mastershop = mastershop;
		this.routing = routing;
		this.operationId = operationId;
		this.taskstate = taskstate;
		this.resourcestate = resourcestate;
		this.routinestate = routinestate;
		this.materialstate = materialstate;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
		this.check1qty = check1qty;
		this.parentuid = parentuid;
		this.rootbatchnum = rootbatchnum;
		this.costid = costid;
		this.basestart = basestart;
		this.basefinish = basefinish;
		this.agreestate = agreestate;
		this.reasoncode = reasoncode;
		this.plantaskwork = plantaskwork;
		this.check8qty = check8qty;
		this.noneneeddispatch = noneneeddispatch;
		this.modeldesc = modeldesc;
		this.needcheck = needcheck;
		this.suspended = suspended;
		this.manhourstate = manhourstate;
		this.optype = optype;
		this.tryqty = tryqty;
		this.estipretime = estipretime;
		this.estiruntime = estiruntime;
		this.partName = partName;
		this.taskstatedesc = taskstatedesc;
		this.tasktypedesc = tasktypedesc;
		this.agreestatedesc = agreestatedesc;
		this.deptiddesc = deptiddesc;
		this.mastershopdesc = mastershopdesc;
		this.drawingid = drawingid;
		this.versionid = versionid;
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

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BigDecimal getOpuid() {
		return this.opuid;
	}

	public void setOpuid(BigDecimal opuid) {
		this.opuid = opuid;
	}

	public String getOperationIddesc() {
		return this.operationIddesc;
	}

	public void setOperationIddesc(String operationIddesc) {
		this.operationIddesc = operationIddesc;
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

	public BigDecimal getRuntime() {
		return this.runtime;
	}

	public void setRuntime(BigDecimal runtime) {
		this.runtime = runtime;
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

	public BigDecimal getOperationId() {
		return this.operationId;
	}

	public void setOperationId(BigDecimal operationId) {
		this.operationId = operationId;
	}

	public BigDecimal getTaskstate() {
		return this.taskstate;
	}

	public void setTaskstate(BigDecimal taskstate) {
		this.taskstate = taskstate;
	}

	public Integer getResourcestate() {
		return this.resourcestate;
	}

	public void setResourcestate(Integer resourcestate) {
		this.resourcestate = resourcestate;
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

	public String getParentuid() {
		return this.parentuid;
	}

	public void setParentuid(String parentuid) {
		this.parentuid = parentuid;
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

	public Date getBasestart() {
		return this.basestart;
	}

	public void setBasestart(Date basestart) {
		this.basestart = basestart;
	}

	public Date getBasefinish() {
		return this.basefinish;
	}

	public void setBasefinish(Date basefinish) {
		this.basefinish = basefinish;
	}

	public Byte getAgreestate() {
		return this.agreestate;
	}

	public void setAgreestate(Byte agreestate) {
		this.agreestate = agreestate;
	}

	public String getReasoncode() {
		return this.reasoncode;
	}

	public void setReasoncode(String reasoncode) {
		this.reasoncode = reasoncode;
	}

	public BigDecimal getPlantaskwork() {
		return this.plantaskwork;
	}

	public void setPlantaskwork(BigDecimal plantaskwork) {
		this.plantaskwork = plantaskwork;
	}

	public BigDecimal getCheck8qty() {
		return this.check8qty;
	}

	public void setCheck8qty(BigDecimal check8qty) {
		this.check8qty = check8qty;
	}

	public Long getNoneneeddispatch() {
		return this.noneneeddispatch;
	}

	public void setNoneneeddispatch(Long noneneeddispatch) {
		this.noneneeddispatch = noneneeddispatch;
	}

	public String getModeldesc() {
		return this.modeldesc;
	}

	public void setModeldesc(String modeldesc) {
		this.modeldesc = modeldesc;
	}

	public Byte getNeedcheck() {
		return this.needcheck;
	}

	public void setNeedcheck(Byte needcheck) {
		this.needcheck = needcheck;
	}

	public Byte getSuspended() {
		return this.suspended;
	}

	public void setSuspended(Byte suspended) {
		this.suspended = suspended;
	}

	public BigDecimal getManhourstate() {
		return this.manhourstate;
	}

	public void setManhourstate(BigDecimal manhourstate) {
		this.manhourstate = manhourstate;
	}

	public Long getOptype() {
		return this.optype;
	}

	public void setOptype(Long optype) {
		this.optype = optype;
	}

	public BigDecimal getTryqty() {
		return this.tryqty;
	}

	public void setTryqty(BigDecimal tryqty) {
		this.tryqty = tryqty;
	}

	public BigDecimal getEstipretime() {
		return this.estipretime;
	}

	public void setEstipretime(BigDecimal estipretime) {
		this.estipretime = estipretime;
	}

	public BigDecimal getEstiruntime() {
		return this.estiruntime;
	}

	public void setEstiruntime(BigDecimal estiruntime) {
		this.estiruntime = estiruntime;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
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

	public String getAgreestatedesc() {
		return this.agreestatedesc;
	}

	public void setAgreestatedesc(String agreestatedesc) {
		this.agreestatedesc = agreestatedesc;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TvExtrataskId))
			return false;
		TvExtrataskId castOther = (TvExtrataskId) other;

		return ((this.getTaskuid() == castOther.getTaskuid()) || (this.getTaskuid() != null
				&& castOther.getTaskuid() != null && this.getTaskuid().equals(castOther.getTaskuid())))
				&& ((this.getTaskname() == castOther.getTaskname()) || (this.getTaskname() != null
						&& castOther.getTaskname() != null && this.getTaskname().equals(castOther.getTaskname())))
				&& ((this.getModel() == castOther.getModel()) || (this.getModel() != null
						&& castOther.getModel() != null && this.getModel().equals(castOther.getModel())))
				&& ((this.getOpuid() == castOther.getOpuid()) || (this.getOpuid() != null
						&& castOther.getOpuid() != null && this.getOpuid().equals(castOther.getOpuid())))
				&& ((this.getOperationIddesc() == castOther.getOperationIddesc())
						|| (this.getOperationIddesc() != null && castOther.getOperationIddesc() != null
								&& this.getOperationIddesc().equals(castOther.getOperationIddesc())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
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
				&& ((this.getLatefinish() == castOther.getLatefinish()) || (this.getLatefinish() != null
						&& castOther.getLatefinish() != null && this.getLatefinish().equals(castOther.getLatefinish())))
				&& ((this.getPriority() == castOther.getPriority()) || (this.getPriority() != null
						&& castOther.getPriority() != null && this.getPriority().equals(castOther.getPriority())))
				&& ((this.getTasktype() == castOther.getTasktype()) || (this.getTasktype() != null
						&& castOther.getTasktype() != null && this.getTasktype().equals(castOther.getTasktype())))
				&& ((this.getTaskwork() == castOther.getTaskwork()) || (this.getTaskwork() != null
						&& castOther.getTaskwork() != null && this.getTaskwork().equals(castOther.getTaskwork())))
				&& ((this.getPreoptime() == castOther.getPreoptime()) || (this.getPreoptime() != null
						&& castOther.getPreoptime() != null && this.getPreoptime().equals(castOther.getPreoptime())))
				&& ((this.getRuntime() == castOther.getRuntime()) || (this.getRuntime() != null
						&& castOther.getRuntime() != null && this.getRuntime().equals(castOther.getRuntime())))
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
				&& ((this.getOperationId() == castOther.getOperationId())
						|| (this.getOperationId() != null && castOther.getOperationId() != null
								&& this.getOperationId().equals(castOther.getOperationId())))
				&& ((this.getTaskstate() == castOther.getTaskstate()) || (this.getTaskstate() != null
						&& castOther.getTaskstate() != null && this.getTaskstate().equals(castOther.getTaskstate())))
				&& ((this.getResourcestate() == castOther.getResourcestate())
						|| (this.getResourcestate() != null && castOther.getResourcestate() != null
								&& this.getResourcestate().equals(castOther.getResourcestate())))
				&& ((this.getRoutinestate() == castOther.getRoutinestate())
						|| (this.getRoutinestate() != null && castOther.getRoutinestate() != null
								&& this.getRoutinestate().equals(castOther.getRoutinestate())))
				&& ((this.getMaterialstate() == castOther.getMaterialstate())
						|| (this.getMaterialstate() != null && castOther.getMaterialstate() != null
								&& this.getMaterialstate().equals(castOther.getMaterialstate())))
				&& ((this.getCreator() == castOther.getCreator()) || (this.getCreator() != null
						&& castOther.getCreator() != null && this.getCreator().equals(castOther.getCreator())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getCheck1qty() == castOther.getCheck1qty()) || (this.getCheck1qty() != null
						&& castOther.getCheck1qty() != null && this.getCheck1qty().equals(castOther.getCheck1qty())))
				&& ((this.getParentuid() == castOther.getParentuid()) || (this.getParentuid() != null
						&& castOther.getParentuid() != null && this.getParentuid().equals(castOther.getParentuid())))
				&& ((this.getRootbatchnum() == castOther.getRootbatchnum())
						|| (this.getRootbatchnum() != null && castOther.getRootbatchnum() != null
								&& this.getRootbatchnum().equals(castOther.getRootbatchnum())))
				&& ((this.getCostid() == castOther.getCostid()) || (this.getCostid() != null
						&& castOther.getCostid() != null && this.getCostid().equals(castOther.getCostid())))
				&& ((this.getBasestart() == castOther.getBasestart()) || (this.getBasestart() != null
						&& castOther.getBasestart() != null && this.getBasestart().equals(castOther.getBasestart())))
				&& ((this.getBasefinish() == castOther.getBasefinish()) || (this.getBasefinish() != null
						&& castOther.getBasefinish() != null && this.getBasefinish().equals(castOther.getBasefinish())))
				&& ((this.getAgreestate() == castOther.getAgreestate()) || (this.getAgreestate() != null
						&& castOther.getAgreestate() != null && this.getAgreestate().equals(castOther.getAgreestate())))
				&& ((this.getReasoncode() == castOther.getReasoncode()) || (this.getReasoncode() != null
						&& castOther.getReasoncode() != null && this.getReasoncode().equals(castOther.getReasoncode())))
				&& ((this.getPlantaskwork() == castOther.getPlantaskwork())
						|| (this.getPlantaskwork() != null && castOther.getPlantaskwork() != null
								&& this.getPlantaskwork().equals(castOther.getPlantaskwork())))
				&& ((this.getCheck8qty() == castOther.getCheck8qty()) || (this.getCheck8qty() != null
						&& castOther.getCheck8qty() != null && this.getCheck8qty().equals(castOther.getCheck8qty())))
				&& ((this.getNoneneeddispatch() == castOther.getNoneneeddispatch())
						|| (this.getNoneneeddispatch() != null && castOther.getNoneneeddispatch() != null
								&& this.getNoneneeddispatch().equals(castOther.getNoneneeddispatch())))
				&& ((this.getModeldesc() == castOther.getModeldesc()) || (this.getModeldesc() != null
						&& castOther.getModeldesc() != null && this.getModeldesc().equals(castOther.getModeldesc())))
				&& ((this.getNeedcheck() == castOther.getNeedcheck()) || (this.getNeedcheck() != null
						&& castOther.getNeedcheck() != null && this.getNeedcheck().equals(castOther.getNeedcheck())))
				&& ((this.getSuspended() == castOther.getSuspended()) || (this.getSuspended() != null
						&& castOther.getSuspended() != null && this.getSuspended().equals(castOther.getSuspended())))
				&& ((this.getManhourstate() == castOther.getManhourstate())
						|| (this.getManhourstate() != null && castOther.getManhourstate() != null
								&& this.getManhourstate().equals(castOther.getManhourstate())))
				&& ((this.getOptype() == castOther.getOptype()) || (this.getOptype() != null
						&& castOther.getOptype() != null && this.getOptype().equals(castOther.getOptype())))
				&& ((this.getTryqty() == castOther.getTryqty()) || (this.getTryqty() != null
						&& castOther.getTryqty() != null && this.getTryqty().equals(castOther.getTryqty())))
				&& ((this.getEstipretime() == castOther.getEstipretime())
						|| (this.getEstipretime() != null && castOther.getEstipretime() != null
								&& this.getEstipretime().equals(castOther.getEstipretime())))
				&& ((this.getEstiruntime() == castOther.getEstiruntime())
						|| (this.getEstiruntime() != null && castOther.getEstiruntime() != null
								&& this.getEstiruntime().equals(castOther.getEstiruntime())))
				&& ((this.getPartName() == castOther.getPartName()) || (this.getPartName() != null
						&& castOther.getPartName() != null && this.getPartName().equals(castOther.getPartName())))
				&& ((this.getTaskstatedesc() == castOther.getTaskstatedesc())
						|| (this.getTaskstatedesc() != null && castOther.getTaskstatedesc() != null
								&& this.getTaskstatedesc().equals(castOther.getTaskstatedesc())))
				&& ((this.getTasktypedesc() == castOther.getTasktypedesc())
						|| (this.getTasktypedesc() != null && castOther.getTasktypedesc() != null
								&& this.getTasktypedesc().equals(castOther.getTasktypedesc())))
				&& ((this.getAgreestatedesc() == castOther.getAgreestatedesc())
						|| (this.getAgreestatedesc() != null && castOther.getAgreestatedesc() != null
								&& this.getAgreestatedesc().equals(castOther.getAgreestatedesc())))
				&& ((this.getDeptiddesc() == castOther.getDeptiddesc()) || (this.getDeptiddesc() != null
						&& castOther.getDeptiddesc() != null && this.getDeptiddesc().equals(castOther.getDeptiddesc())))
				&& ((this.getMastershopdesc() == castOther.getMastershopdesc())
						|| (this.getMastershopdesc() != null && castOther.getMastershopdesc() != null
								&& this.getMastershopdesc().equals(castOther.getMastershopdesc())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getVersionid() == castOther.getVersionid()) || (this.getVersionid() != null
						&& castOther.getVersionid() != null && this.getVersionid().equals(castOther.getVersionid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaskuid() == null ? 0 : this.getTaskuid().hashCode());
		result = 37 * result + (getTaskname() == null ? 0 : this.getTaskname().hashCode());
		result = 37 * result + (getModel() == null ? 0 : this.getModel().hashCode());
		result = 37 * result + (getOpuid() == null ? 0 : this.getOpuid().hashCode());
		result = 37 * result + (getOperationIddesc() == null ? 0 : this.getOperationIddesc().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getPlanstart() == null ? 0 : this.getPlanstart().hashCode());
		result = 37 * result + (getPlanfinish() == null ? 0 : this.getPlanfinish().hashCode());
		result = 37 * result + (getPlanstate() == null ? 0 : this.getPlanstate().hashCode());
		result = 37 * result + (getSchedulestart() == null ? 0 : this.getSchedulestart().hashCode());
		result = 37 * result + (getSchedulefinish() == null ? 0 : this.getSchedulefinish().hashCode());
		result = 37 * result + (getActualstart() == null ? 0 : this.getActualstart().hashCode());
		result = 37 * result + (getActualfinish() == null ? 0 : this.getActualfinish().hashCode());
		result = 37 * result + (getEarlystart() == null ? 0 : this.getEarlystart().hashCode());
		result = 37 * result + (getLatefinish() == null ? 0 : this.getLatefinish().hashCode());
		result = 37 * result + (getPriority() == null ? 0 : this.getPriority().hashCode());
		result = 37 * result + (getTasktype() == null ? 0 : this.getTasktype().hashCode());
		result = 37 * result + (getTaskwork() == null ? 0 : this.getTaskwork().hashCode());
		result = 37 * result + (getPreoptime() == null ? 0 : this.getPreoptime().hashCode());
		result = 37 * result + (getRuntime() == null ? 0 : this.getRuntime().hashCode());
		result = 37 * result + (getPlanqty() == null ? 0 : this.getPlanqty().hashCode());
		result = 37 * result + (getCompleteqty() == null ? 0 : this.getCompleteqty().hashCode());
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getMastershop() == null ? 0 : this.getMastershop().hashCode());
		result = 37 * result + (getRouting() == null ? 0 : this.getRouting().hashCode());
		result = 37 * result + (getOperationId() == null ? 0 : this.getOperationId().hashCode());
		result = 37 * result + (getTaskstate() == null ? 0 : this.getTaskstate().hashCode());
		result = 37 * result + (getResourcestate() == null ? 0 : this.getResourcestate().hashCode());
		result = 37 * result + (getRoutinestate() == null ? 0 : this.getRoutinestate().hashCode());
		result = 37 * result + (getMaterialstate() == null ? 0 : this.getMaterialstate().hashCode());
		result = 37 * result + (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getCheck1qty() == null ? 0 : this.getCheck1qty().hashCode());
		result = 37 * result + (getParentuid() == null ? 0 : this.getParentuid().hashCode());
		result = 37 * result + (getRootbatchnum() == null ? 0 : this.getRootbatchnum().hashCode());
		result = 37 * result + (getCostid() == null ? 0 : this.getCostid().hashCode());
		result = 37 * result + (getBasestart() == null ? 0 : this.getBasestart().hashCode());
		result = 37 * result + (getBasefinish() == null ? 0 : this.getBasefinish().hashCode());
		result = 37 * result + (getAgreestate() == null ? 0 : this.getAgreestate().hashCode());
		result = 37 * result + (getReasoncode() == null ? 0 : this.getReasoncode().hashCode());
		result = 37 * result + (getPlantaskwork() == null ? 0 : this.getPlantaskwork().hashCode());
		result = 37 * result + (getCheck8qty() == null ? 0 : this.getCheck8qty().hashCode());
		result = 37 * result + (getNoneneeddispatch() == null ? 0 : this.getNoneneeddispatch().hashCode());
		result = 37 * result + (getModeldesc() == null ? 0 : this.getModeldesc().hashCode());
		result = 37 * result + (getNeedcheck() == null ? 0 : this.getNeedcheck().hashCode());
		result = 37 * result + (getSuspended() == null ? 0 : this.getSuspended().hashCode());
		result = 37 * result + (getManhourstate() == null ? 0 : this.getManhourstate().hashCode());
		result = 37 * result + (getOptype() == null ? 0 : this.getOptype().hashCode());
		result = 37 * result + (getTryqty() == null ? 0 : this.getTryqty().hashCode());
		result = 37 * result + (getEstipretime() == null ? 0 : this.getEstipretime().hashCode());
		result = 37 * result + (getEstiruntime() == null ? 0 : this.getEstiruntime().hashCode());
		result = 37 * result + (getPartName() == null ? 0 : this.getPartName().hashCode());
		result = 37 * result + (getTaskstatedesc() == null ? 0 : this.getTaskstatedesc().hashCode());
		result = 37 * result + (getTasktypedesc() == null ? 0 : this.getTasktypedesc().hashCode());
		result = 37 * result + (getAgreestatedesc() == null ? 0 : this.getAgreestatedesc().hashCode());
		result = 37 * result + (getDeptiddesc() == null ? 0 : this.getDeptiddesc().hashCode());
		result = 37 * result + (getMastershopdesc() == null ? 0 : this.getMastershopdesc().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getVersionid() == null ? 0 : this.getVersionid().hashCode());
		return result;
	}

}
