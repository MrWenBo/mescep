package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * TvTaskAidresourceId generated by hbm2java
 */
public class TvTaskAidresourceId implements java.io.Serializable {

	private BigDecimal uniqueid;
	private String resuid;
	private String taskuid;
	private String employeeid;
	private BigDecimal assnunits;
	private Long assntype;
	private String creator;
	private Date createtime;
	private Long consumeLife;
	private Byte isineffect;
	private Date assnstart;
	private Date assnfinish;
	private BigDecimal assnqty;
	private BigDecimal assnwork;
	private Long assnstate;
	private String notes;
	private Long remindinterval;
	private Date lastremind;
	private Date plansatisfy;
	private String toolchecker;
	private String taskexecstate;
	private BigDecimal preoptime;
	private BigDecimal runtime;
	private Long dispatchtype;
	private BigDecimal completeqty;
	private Date actualstart;
	private Date actualfinish;
	private String ncuid;
	private String preassnQty;
	private Date preassnDate;
	private String prepareEmployeeid;
	private String prepareWarehouseid;
	private BigDecimal completework;
	private BigDecimal actualwork;
	private String model;
	private Integer resourcestate;
	private String partNumber;
	private String drawingid;
	private String prepareEmployeename;
	private String prepareWarehousename;
	private String batchnum;
	private Date planstart;
	private Date planfinish;
	private BigDecimal taskstate;
	private String mastershop;
	private Byte suspended;
	private String modeldesc;
	private String partName;
	private String resourceDrawingid;
	private String resourceName;
	private String taskname;
	private String resourceType;
	private Byte toolchecklevel;
	private Long prepareLeadTime;
	private String resourceDescription;
	private String workcenteruid;
	private String toolcheckleveldesc;
	private String toolcheckleveldesc1;
	private BigDecimal pretreatqty;

	public TvTaskAidresourceId() {
	}

	public TvTaskAidresourceId(BigDecimal uniqueid, String taskuid, String partNumber) {
		this.uniqueid = uniqueid;
		this.taskuid = taskuid;
		this.partNumber = partNumber;
	}

	public TvTaskAidresourceId(BigDecimal uniqueid, String resuid, String taskuid, String employeeid,
			BigDecimal assnunits, Long assntype, String creator, Date createtime, Long consumeLife, Byte isineffect,
			Date assnstart, Date assnfinish, BigDecimal assnqty, BigDecimal assnwork, Long assnstate, String notes,
			Long remindinterval, Date lastremind, Date plansatisfy, String toolchecker, String taskexecstate,
			BigDecimal preoptime, BigDecimal runtime, Long dispatchtype, BigDecimal completeqty, Date actualstart,
			Date actualfinish, String ncuid, String preassnQty, Date preassnDate, String prepareEmployeeid,
			String prepareWarehouseid, BigDecimal completework, BigDecimal actualwork, String model,
			Integer resourcestate, String partNumber, String drawingid, String prepareEmployeename,
			String prepareWarehousename, String batchnum, Date planstart, Date planfinish, BigDecimal taskstate,
			String mastershop, Byte suspended, String modeldesc, String partName, String resourceDrawingid,
			String resourceName, String taskname, String resourceType, Byte toolchecklevel, Long prepareLeadTime,
			String resourceDescription, String workcenteruid, String toolcheckleveldesc, String toolcheckleveldesc1,
			BigDecimal pretreatqty) {
		this.uniqueid = uniqueid;
		this.resuid = resuid;
		this.taskuid = taskuid;
		this.employeeid = employeeid;
		this.assnunits = assnunits;
		this.assntype = assntype;
		this.creator = creator;
		this.createtime = createtime;
		this.consumeLife = consumeLife;
		this.isineffect = isineffect;
		this.assnstart = assnstart;
		this.assnfinish = assnfinish;
		this.assnqty = assnqty;
		this.assnwork = assnwork;
		this.assnstate = assnstate;
		this.notes = notes;
		this.remindinterval = remindinterval;
		this.lastremind = lastremind;
		this.plansatisfy = plansatisfy;
		this.toolchecker = toolchecker;
		this.taskexecstate = taskexecstate;
		this.preoptime = preoptime;
		this.runtime = runtime;
		this.dispatchtype = dispatchtype;
		this.completeqty = completeqty;
		this.actualstart = actualstart;
		this.actualfinish = actualfinish;
		this.ncuid = ncuid;
		this.preassnQty = preassnQty;
		this.preassnDate = preassnDate;
		this.prepareEmployeeid = prepareEmployeeid;
		this.prepareWarehouseid = prepareWarehouseid;
		this.completework = completework;
		this.actualwork = actualwork;
		this.model = model;
		this.resourcestate = resourcestate;
		this.partNumber = partNumber;
		this.drawingid = drawingid;
		this.prepareEmployeename = prepareEmployeename;
		this.prepareWarehousename = prepareWarehousename;
		this.batchnum = batchnum;
		this.planstart = planstart;
		this.planfinish = planfinish;
		this.taskstate = taskstate;
		this.mastershop = mastershop;
		this.suspended = suspended;
		this.modeldesc = modeldesc;
		this.partName = partName;
		this.resourceDrawingid = resourceDrawingid;
		this.resourceName = resourceName;
		this.taskname = taskname;
		this.resourceType = resourceType;
		this.toolchecklevel = toolchecklevel;
		this.prepareLeadTime = prepareLeadTime;
		this.resourceDescription = resourceDescription;
		this.workcenteruid = workcenteruid;
		this.toolcheckleveldesc = toolcheckleveldesc;
		this.toolcheckleveldesc1 = toolcheckleveldesc1;
		this.pretreatqty = pretreatqty;
	}

	public BigDecimal getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(BigDecimal uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getResuid() {
		return this.resuid;
	}

	public void setResuid(String resuid) {
		this.resuid = resuid;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public String getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public BigDecimal getAssnunits() {
		return this.assnunits;
	}

	public void setAssnunits(BigDecimal assnunits) {
		this.assnunits = assnunits;
	}

	public Long getAssntype() {
		return this.assntype;
	}

	public void setAssntype(Long assntype) {
		this.assntype = assntype;
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

	public Long getConsumeLife() {
		return this.consumeLife;
	}

	public void setConsumeLife(Long consumeLife) {
		this.consumeLife = consumeLife;
	}

	public Byte getIsineffect() {
		return this.isineffect;
	}

	public void setIsineffect(Byte isineffect) {
		this.isineffect = isineffect;
	}

	public Date getAssnstart() {
		return this.assnstart;
	}

	public void setAssnstart(Date assnstart) {
		this.assnstart = assnstart;
	}

	public Date getAssnfinish() {
		return this.assnfinish;
	}

	public void setAssnfinish(Date assnfinish) {
		this.assnfinish = assnfinish;
	}

	public BigDecimal getAssnqty() {
		return this.assnqty;
	}

	public void setAssnqty(BigDecimal assnqty) {
		this.assnqty = assnqty;
	}

	public BigDecimal getAssnwork() {
		return this.assnwork;
	}

	public void setAssnwork(BigDecimal assnwork) {
		this.assnwork = assnwork;
	}

	public Long getAssnstate() {
		return this.assnstate;
	}

	public void setAssnstate(Long assnstate) {
		this.assnstate = assnstate;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Long getRemindinterval() {
		return this.remindinterval;
	}

	public void setRemindinterval(Long remindinterval) {
		this.remindinterval = remindinterval;
	}

	public Date getLastremind() {
		return this.lastremind;
	}

	public void setLastremind(Date lastremind) {
		this.lastremind = lastremind;
	}

	public Date getPlansatisfy() {
		return this.plansatisfy;
	}

	public void setPlansatisfy(Date plansatisfy) {
		this.plansatisfy = plansatisfy;
	}

	public String getToolchecker() {
		return this.toolchecker;
	}

	public void setToolchecker(String toolchecker) {
		this.toolchecker = toolchecker;
	}

	public String getTaskexecstate() {
		return this.taskexecstate;
	}

	public void setTaskexecstate(String taskexecstate) {
		this.taskexecstate = taskexecstate;
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

	public Long getDispatchtype() {
		return this.dispatchtype;
	}

	public void setDispatchtype(Long dispatchtype) {
		this.dispatchtype = dispatchtype;
	}

	public BigDecimal getCompleteqty() {
		return this.completeqty;
	}

	public void setCompleteqty(BigDecimal completeqty) {
		this.completeqty = completeqty;
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

	public String getNcuid() {
		return this.ncuid;
	}

	public void setNcuid(String ncuid) {
		this.ncuid = ncuid;
	}

	public String getPreassnQty() {
		return this.preassnQty;
	}

	public void setPreassnQty(String preassnQty) {
		this.preassnQty = preassnQty;
	}

	public Date getPreassnDate() {
		return this.preassnDate;
	}

	public void setPreassnDate(Date preassnDate) {
		this.preassnDate = preassnDate;
	}

	public String getPrepareEmployeeid() {
		return this.prepareEmployeeid;
	}

	public void setPrepareEmployeeid(String prepareEmployeeid) {
		this.prepareEmployeeid = prepareEmployeeid;
	}

	public String getPrepareWarehouseid() {
		return this.prepareWarehouseid;
	}

	public void setPrepareWarehouseid(String prepareWarehouseid) {
		this.prepareWarehouseid = prepareWarehouseid;
	}

	public BigDecimal getCompletework() {
		return this.completework;
	}

	public void setCompletework(BigDecimal completework) {
		this.completework = completework;
	}

	public BigDecimal getActualwork() {
		return this.actualwork;
	}

	public void setActualwork(BigDecimal actualwork) {
		this.actualwork = actualwork;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getResourcestate() {
		return this.resourcestate;
	}

	public void setResourcestate(Integer resourcestate) {
		this.resourcestate = resourcestate;
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

	public String getPrepareEmployeename() {
		return this.prepareEmployeename;
	}

	public void setPrepareEmployeename(String prepareEmployeename) {
		this.prepareEmployeename = prepareEmployeename;
	}

	public String getPrepareWarehousename() {
		return this.prepareWarehousename;
	}

	public void setPrepareWarehousename(String prepareWarehousename) {
		this.prepareWarehousename = prepareWarehousename;
	}

	public String getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
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

	public BigDecimal getTaskstate() {
		return this.taskstate;
	}

	public void setTaskstate(BigDecimal taskstate) {
		this.taskstate = taskstate;
	}

	public String getMastershop() {
		return this.mastershop;
	}

	public void setMastershop(String mastershop) {
		this.mastershop = mastershop;
	}

	public Byte getSuspended() {
		return this.suspended;
	}

	public void setSuspended(Byte suspended) {
		this.suspended = suspended;
	}

	public String getModeldesc() {
		return this.modeldesc;
	}

	public void setModeldesc(String modeldesc) {
		this.modeldesc = modeldesc;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getResourceDrawingid() {
		return this.resourceDrawingid;
	}

	public void setResourceDrawingid(String resourceDrawingid) {
		this.resourceDrawingid = resourceDrawingid;
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getTaskname() {
		return this.taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public Byte getToolchecklevel() {
		return this.toolchecklevel;
	}

	public void setToolchecklevel(Byte toolchecklevel) {
		this.toolchecklevel = toolchecklevel;
	}

	public Long getPrepareLeadTime() {
		return this.prepareLeadTime;
	}

	public void setPrepareLeadTime(Long prepareLeadTime) {
		this.prepareLeadTime = prepareLeadTime;
	}

	public String getResourceDescription() {
		return this.resourceDescription;
	}

	public void setResourceDescription(String resourceDescription) {
		this.resourceDescription = resourceDescription;
	}

	public String getWorkcenteruid() {
		return this.workcenteruid;
	}

	public void setWorkcenteruid(String workcenteruid) {
		this.workcenteruid = workcenteruid;
	}

	public String getToolcheckleveldesc() {
		return this.toolcheckleveldesc;
	}

	public void setToolcheckleveldesc(String toolcheckleveldesc) {
		this.toolcheckleveldesc = toolcheckleveldesc;
	}

	public String getToolcheckleveldesc1() {
		return this.toolcheckleveldesc1;
	}

	public void setToolcheckleveldesc1(String toolcheckleveldesc1) {
		this.toolcheckleveldesc1 = toolcheckleveldesc1;
	}

	public BigDecimal getPretreatqty() {
		return this.pretreatqty;
	}

	public void setPretreatqty(BigDecimal pretreatqty) {
		this.pretreatqty = pretreatqty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TvTaskAidresourceId))
			return false;
		TvTaskAidresourceId castOther = (TvTaskAidresourceId) other;

		return ((this.getUniqueid() == castOther.getUniqueid()) || (this.getUniqueid() != null
				&& castOther.getUniqueid() != null && this.getUniqueid().equals(castOther.getUniqueid())))
				&& ((this.getResuid() == castOther.getResuid()) || (this.getResuid() != null
						&& castOther.getResuid() != null && this.getResuid().equals(castOther.getResuid())))
				&& ((this.getTaskuid() == castOther.getTaskuid()) || (this.getTaskuid() != null
						&& castOther.getTaskuid() != null && this.getTaskuid().equals(castOther.getTaskuid())))
				&& ((this.getEmployeeid() == castOther.getEmployeeid()) || (this.getEmployeeid() != null
						&& castOther.getEmployeeid() != null && this.getEmployeeid().equals(castOther.getEmployeeid())))
				&& ((this.getAssnunits() == castOther.getAssnunits()) || (this.getAssnunits() != null
						&& castOther.getAssnunits() != null && this.getAssnunits().equals(castOther.getAssnunits())))
				&& ((this.getAssntype() == castOther.getAssntype()) || (this.getAssntype() != null
						&& castOther.getAssntype() != null && this.getAssntype().equals(castOther.getAssntype())))
				&& ((this.getCreator() == castOther.getCreator()) || (this.getCreator() != null
						&& castOther.getCreator() != null && this.getCreator().equals(castOther.getCreator())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getConsumeLife() == castOther.getConsumeLife())
						|| (this.getConsumeLife() != null && castOther.getConsumeLife() != null
								&& this.getConsumeLife().equals(castOther.getConsumeLife())))
				&& ((this.getIsineffect() == castOther.getIsineffect()) || (this.getIsineffect() != null
						&& castOther.getIsineffect() != null && this.getIsineffect().equals(castOther.getIsineffect())))
				&& ((this.getAssnstart() == castOther.getAssnstart()) || (this.getAssnstart() != null
						&& castOther.getAssnstart() != null && this.getAssnstart().equals(castOther.getAssnstart())))
				&& ((this.getAssnfinish() == castOther.getAssnfinish()) || (this.getAssnfinish() != null
						&& castOther.getAssnfinish() != null && this.getAssnfinish().equals(castOther.getAssnfinish())))
				&& ((this.getAssnqty() == castOther.getAssnqty()) || (this.getAssnqty() != null
						&& castOther.getAssnqty() != null && this.getAssnqty().equals(castOther.getAssnqty())))
				&& ((this.getAssnwork() == castOther.getAssnwork()) || (this.getAssnwork() != null
						&& castOther.getAssnwork() != null && this.getAssnwork().equals(castOther.getAssnwork())))
				&& ((this.getAssnstate() == castOther.getAssnstate()) || (this.getAssnstate() != null
						&& castOther.getAssnstate() != null && this.getAssnstate().equals(castOther.getAssnstate())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getRemindinterval() == castOther.getRemindinterval())
						|| (this.getRemindinterval() != null && castOther.getRemindinterval() != null
								&& this.getRemindinterval().equals(castOther.getRemindinterval())))
				&& ((this.getLastremind() == castOther.getLastremind()) || (this.getLastremind() != null
						&& castOther.getLastremind() != null && this.getLastremind().equals(castOther.getLastremind())))
				&& ((this.getPlansatisfy() == castOther.getPlansatisfy())
						|| (this.getPlansatisfy() != null && castOther.getPlansatisfy() != null
								&& this.getPlansatisfy().equals(castOther.getPlansatisfy())))
				&& ((this.getToolchecker() == castOther.getToolchecker())
						|| (this.getToolchecker() != null && castOther.getToolchecker() != null
								&& this.getToolchecker().equals(castOther.getToolchecker())))
				&& ((this.getTaskexecstate() == castOther.getTaskexecstate())
						|| (this.getTaskexecstate() != null && castOther.getTaskexecstate() != null
								&& this.getTaskexecstate().equals(castOther.getTaskexecstate())))
				&& ((this.getPreoptime() == castOther.getPreoptime()) || (this.getPreoptime() != null
						&& castOther.getPreoptime() != null && this.getPreoptime().equals(castOther.getPreoptime())))
				&& ((this.getRuntime() == castOther.getRuntime()) || (this.getRuntime() != null
						&& castOther.getRuntime() != null && this.getRuntime().equals(castOther.getRuntime())))
				&& ((this.getDispatchtype() == castOther.getDispatchtype())
						|| (this.getDispatchtype() != null && castOther.getDispatchtype() != null
								&& this.getDispatchtype().equals(castOther.getDispatchtype())))
				&& ((this.getCompleteqty() == castOther.getCompleteqty())
						|| (this.getCompleteqty() != null && castOther.getCompleteqty() != null
								&& this.getCompleteqty().equals(castOther.getCompleteqty())))
				&& ((this.getActualstart() == castOther.getActualstart())
						|| (this.getActualstart() != null && castOther.getActualstart() != null
								&& this.getActualstart().equals(castOther.getActualstart())))
				&& ((this.getActualfinish() == castOther.getActualfinish())
						|| (this.getActualfinish() != null && castOther.getActualfinish() != null
								&& this.getActualfinish().equals(castOther.getActualfinish())))
				&& ((this.getNcuid() == castOther.getNcuid()) || (this.getNcuid() != null
						&& castOther.getNcuid() != null && this.getNcuid().equals(castOther.getNcuid())))
				&& ((this.getPreassnQty() == castOther.getPreassnQty()) || (this.getPreassnQty() != null
						&& castOther.getPreassnQty() != null && this.getPreassnQty().equals(castOther.getPreassnQty())))
				&& ((this.getPreassnDate() == castOther.getPreassnDate())
						|| (this.getPreassnDate() != null && castOther.getPreassnDate() != null
								&& this.getPreassnDate().equals(castOther.getPreassnDate())))
				&& ((this.getPrepareEmployeeid() == castOther.getPrepareEmployeeid())
						|| (this.getPrepareEmployeeid() != null && castOther.getPrepareEmployeeid() != null
								&& this.getPrepareEmployeeid().equals(castOther.getPrepareEmployeeid())))
				&& ((this.getPrepareWarehouseid() == castOther.getPrepareWarehouseid())
						|| (this.getPrepareWarehouseid() != null && castOther.getPrepareWarehouseid() != null
								&& this.getPrepareWarehouseid().equals(castOther.getPrepareWarehouseid())))
				&& ((this.getCompletework() == castOther.getCompletework())
						|| (this.getCompletework() != null && castOther.getCompletework() != null
								&& this.getCompletework().equals(castOther.getCompletework())))
				&& ((this.getActualwork() == castOther.getActualwork()) || (this.getActualwork() != null
						&& castOther.getActualwork() != null && this.getActualwork().equals(castOther.getActualwork())))
				&& ((this.getModel() == castOther.getModel()) || (this.getModel() != null
						&& castOther.getModel() != null && this.getModel().equals(castOther.getModel())))
				&& ((this.getResourcestate() == castOther.getResourcestate())
						|| (this.getResourcestate() != null && castOther.getResourcestate() != null
								&& this.getResourcestate().equals(castOther.getResourcestate())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getPrepareEmployeename() == castOther.getPrepareEmployeename())
						|| (this.getPrepareEmployeename() != null && castOther.getPrepareEmployeename() != null
								&& this.getPrepareEmployeename().equals(castOther.getPrepareEmployeename())))
				&& ((this.getPrepareWarehousename() == castOther.getPrepareWarehousename())
						|| (this.getPrepareWarehousename() != null && castOther.getPrepareWarehousename() != null
								&& this.getPrepareWarehousename().equals(castOther.getPrepareWarehousename())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getPlanstart() == castOther.getPlanstart()) || (this.getPlanstart() != null
						&& castOther.getPlanstart() != null && this.getPlanstart().equals(castOther.getPlanstart())))
				&& ((this.getPlanfinish() == castOther.getPlanfinish()) || (this.getPlanfinish() != null
						&& castOther.getPlanfinish() != null && this.getPlanfinish().equals(castOther.getPlanfinish())))
				&& ((this.getTaskstate() == castOther.getTaskstate()) || (this.getTaskstate() != null
						&& castOther.getTaskstate() != null && this.getTaskstate().equals(castOther.getTaskstate())))
				&& ((this.getMastershop() == castOther.getMastershop()) || (this.getMastershop() != null
						&& castOther.getMastershop() != null && this.getMastershop().equals(castOther.getMastershop())))
				&& ((this.getSuspended() == castOther.getSuspended()) || (this.getSuspended() != null
						&& castOther.getSuspended() != null && this.getSuspended().equals(castOther.getSuspended())))
				&& ((this.getModeldesc() == castOther.getModeldesc()) || (this.getModeldesc() != null
						&& castOther.getModeldesc() != null && this.getModeldesc().equals(castOther.getModeldesc())))
				&& ((this.getPartName() == castOther.getPartName()) || (this.getPartName() != null
						&& castOther.getPartName() != null && this.getPartName().equals(castOther.getPartName())))
				&& ((this.getResourceDrawingid() == castOther.getResourceDrawingid())
						|| (this.getResourceDrawingid() != null && castOther.getResourceDrawingid() != null
								&& this.getResourceDrawingid().equals(castOther.getResourceDrawingid())))
				&& ((this.getResourceName() == castOther.getResourceName())
						|| (this.getResourceName() != null && castOther.getResourceName() != null
								&& this.getResourceName().equals(castOther.getResourceName())))
				&& ((this.getTaskname() == castOther.getTaskname()) || (this.getTaskname() != null
						&& castOther.getTaskname() != null && this.getTaskname().equals(castOther.getTaskname())))
				&& ((this.getResourceType() == castOther.getResourceType())
						|| (this.getResourceType() != null && castOther.getResourceType() != null
								&& this.getResourceType().equals(castOther.getResourceType())))
				&& ((this.getToolchecklevel() == castOther.getToolchecklevel())
						|| (this.getToolchecklevel() != null && castOther.getToolchecklevel() != null
								&& this.getToolchecklevel().equals(castOther.getToolchecklevel())))
				&& ((this.getPrepareLeadTime() == castOther.getPrepareLeadTime())
						|| (this.getPrepareLeadTime() != null && castOther.getPrepareLeadTime() != null
								&& this.getPrepareLeadTime().equals(castOther.getPrepareLeadTime())))
				&& ((this.getResourceDescription() == castOther.getResourceDescription())
						|| (this.getResourceDescription() != null && castOther.getResourceDescription() != null
								&& this.getResourceDescription().equals(castOther.getResourceDescription())))
				&& ((this.getWorkcenteruid() == castOther.getWorkcenteruid())
						|| (this.getWorkcenteruid() != null && castOther.getWorkcenteruid() != null
								&& this.getWorkcenteruid().equals(castOther.getWorkcenteruid())))
				&& ((this.getToolcheckleveldesc() == castOther.getToolcheckleveldesc())
						|| (this.getToolcheckleveldesc() != null && castOther.getToolcheckleveldesc() != null
								&& this.getToolcheckleveldesc().equals(castOther.getToolcheckleveldesc())))
				&& ((this.getToolcheckleveldesc1() == castOther.getToolcheckleveldesc1())
						|| (this.getToolcheckleveldesc1() != null && castOther.getToolcheckleveldesc1() != null
								&& this.getToolcheckleveldesc1().equals(castOther.getToolcheckleveldesc1())))
				&& ((this.getPretreatqty() == castOther.getPretreatqty())
						|| (this.getPretreatqty() != null && castOther.getPretreatqty() != null
								&& this.getPretreatqty().equals(castOther.getPretreatqty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUniqueid() == null ? 0 : this.getUniqueid().hashCode());
		result = 37 * result + (getResuid() == null ? 0 : this.getResuid().hashCode());
		result = 37 * result + (getTaskuid() == null ? 0 : this.getTaskuid().hashCode());
		result = 37 * result + (getEmployeeid() == null ? 0 : this.getEmployeeid().hashCode());
		result = 37 * result + (getAssnunits() == null ? 0 : this.getAssnunits().hashCode());
		result = 37 * result + (getAssntype() == null ? 0 : this.getAssntype().hashCode());
		result = 37 * result + (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getConsumeLife() == null ? 0 : this.getConsumeLife().hashCode());
		result = 37 * result + (getIsineffect() == null ? 0 : this.getIsineffect().hashCode());
		result = 37 * result + (getAssnstart() == null ? 0 : this.getAssnstart().hashCode());
		result = 37 * result + (getAssnfinish() == null ? 0 : this.getAssnfinish().hashCode());
		result = 37 * result + (getAssnqty() == null ? 0 : this.getAssnqty().hashCode());
		result = 37 * result + (getAssnwork() == null ? 0 : this.getAssnwork().hashCode());
		result = 37 * result + (getAssnstate() == null ? 0 : this.getAssnstate().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getRemindinterval() == null ? 0 : this.getRemindinterval().hashCode());
		result = 37 * result + (getLastremind() == null ? 0 : this.getLastremind().hashCode());
		result = 37 * result + (getPlansatisfy() == null ? 0 : this.getPlansatisfy().hashCode());
		result = 37 * result + (getToolchecker() == null ? 0 : this.getToolchecker().hashCode());
		result = 37 * result + (getTaskexecstate() == null ? 0 : this.getTaskexecstate().hashCode());
		result = 37 * result + (getPreoptime() == null ? 0 : this.getPreoptime().hashCode());
		result = 37 * result + (getRuntime() == null ? 0 : this.getRuntime().hashCode());
		result = 37 * result + (getDispatchtype() == null ? 0 : this.getDispatchtype().hashCode());
		result = 37 * result + (getCompleteqty() == null ? 0 : this.getCompleteqty().hashCode());
		result = 37 * result + (getActualstart() == null ? 0 : this.getActualstart().hashCode());
		result = 37 * result + (getActualfinish() == null ? 0 : this.getActualfinish().hashCode());
		result = 37 * result + (getNcuid() == null ? 0 : this.getNcuid().hashCode());
		result = 37 * result + (getPreassnQty() == null ? 0 : this.getPreassnQty().hashCode());
		result = 37 * result + (getPreassnDate() == null ? 0 : this.getPreassnDate().hashCode());
		result = 37 * result + (getPrepareEmployeeid() == null ? 0 : this.getPrepareEmployeeid().hashCode());
		result = 37 * result + (getPrepareWarehouseid() == null ? 0 : this.getPrepareWarehouseid().hashCode());
		result = 37 * result + (getCompletework() == null ? 0 : this.getCompletework().hashCode());
		result = 37 * result + (getActualwork() == null ? 0 : this.getActualwork().hashCode());
		result = 37 * result + (getModel() == null ? 0 : this.getModel().hashCode());
		result = 37 * result + (getResourcestate() == null ? 0 : this.getResourcestate().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getPrepareEmployeename() == null ? 0 : this.getPrepareEmployeename().hashCode());
		result = 37 * result + (getPrepareWarehousename() == null ? 0 : this.getPrepareWarehousename().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getPlanstart() == null ? 0 : this.getPlanstart().hashCode());
		result = 37 * result + (getPlanfinish() == null ? 0 : this.getPlanfinish().hashCode());
		result = 37 * result + (getTaskstate() == null ? 0 : this.getTaskstate().hashCode());
		result = 37 * result + (getMastershop() == null ? 0 : this.getMastershop().hashCode());
		result = 37 * result + (getSuspended() == null ? 0 : this.getSuspended().hashCode());
		result = 37 * result + (getModeldesc() == null ? 0 : this.getModeldesc().hashCode());
		result = 37 * result + (getPartName() == null ? 0 : this.getPartName().hashCode());
		result = 37 * result + (getResourceDrawingid() == null ? 0 : this.getResourceDrawingid().hashCode());
		result = 37 * result + (getResourceName() == null ? 0 : this.getResourceName().hashCode());
		result = 37 * result + (getTaskname() == null ? 0 : this.getTaskname().hashCode());
		result = 37 * result + (getResourceType() == null ? 0 : this.getResourceType().hashCode());
		result = 37 * result + (getToolchecklevel() == null ? 0 : this.getToolchecklevel().hashCode());
		result = 37 * result + (getPrepareLeadTime() == null ? 0 : this.getPrepareLeadTime().hashCode());
		result = 37 * result + (getResourceDescription() == null ? 0 : this.getResourceDescription().hashCode());
		result = 37 * result + (getWorkcenteruid() == null ? 0 : this.getWorkcenteruid().hashCode());
		result = 37 * result + (getToolcheckleveldesc() == null ? 0 : this.getToolcheckleveldesc().hashCode());
		result = 37 * result + (getToolcheckleveldesc1() == null ? 0 : this.getToolcheckleveldesc1().hashCode());
		result = 37 * result + (getPretreatqty() == null ? 0 : this.getPretreatqty().hashCode());
		return result;
	}

}
