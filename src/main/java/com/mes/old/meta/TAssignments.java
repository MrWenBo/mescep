package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * TAssignments generated by hbm2java
 */
public class TAssignments implements java.io.Serializable {

	private BigDecimal uniqueid;
	private RResource RResource;
	private TTasks TTasks;
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

	public TAssignments() {
	}

	public TAssignments(BigDecimal uniqueid, TTasks TTasks) {
		this.uniqueid = uniqueid;
		this.TTasks = TTasks;
	}

	public TAssignments(BigDecimal uniqueid, RResource RResource, TTasks TTasks, String employeeid,
			BigDecimal assnunits, Long assntype, String creator, Date createtime, Long consumeLife, Byte isineffect,
			Date assnstart, Date assnfinish, BigDecimal assnqty, BigDecimal assnwork, Long assnstate, String notes,
			Long remindinterval, Date lastremind, Date plansatisfy, String toolchecker, String taskexecstate,
			BigDecimal preoptime, BigDecimal runtime, Long dispatchtype, BigDecimal completeqty, Date actualstart,
			Date actualfinish, String ncuid, String preassnQty, Date preassnDate, String prepareEmployeeid,
			String prepareWarehouseid, BigDecimal completework, BigDecimal actualwork) {
		this.uniqueid = uniqueid;
		this.RResource = RResource;
		this.TTasks = TTasks;
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
	}

	public BigDecimal getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(BigDecimal uniqueid) {
		this.uniqueid = uniqueid;
	}

	public RResource getRResource() {
		return this.RResource;
	}

	public void setRResource(RResource RResource) {
		this.RResource = RResource;
	}

	public TTasks getTTasks() {
		return this.TTasks;
	}

	public void setTTasks(TTasks TTasks) {
		this.TTasks = TTasks;
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

}