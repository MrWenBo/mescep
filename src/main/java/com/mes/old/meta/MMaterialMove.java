package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * MMaterialMove generated by hbm2java
 */
public class MMaterialMove implements java.io.Serializable {

	private BigDecimal uniqueid;
	private String materialusn;
	private BigDecimal materialqty;
	private String deptid;
	private String employeeid;
	private String taskuid;
	private String resuid;
	private String creator;
	private Date createtime;
	private String notes;

	public MMaterialMove() {
	}

	public MMaterialMove(BigDecimal uniqueid, String materialusn) {
		this.uniqueid = uniqueid;
		this.materialusn = materialusn;
	}

	public MMaterialMove(BigDecimal uniqueid, String materialusn, BigDecimal materialqty, String deptid,
			String employeeid, String taskuid, String resuid, String creator, Date createtime, String notes) {
		this.uniqueid = uniqueid;
		this.materialusn = materialusn;
		this.materialqty = materialqty;
		this.deptid = deptid;
		this.employeeid = employeeid;
		this.taskuid = taskuid;
		this.resuid = resuid;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
	}

	public BigDecimal getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(BigDecimal uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getMaterialusn() {
		return this.materialusn;
	}

	public void setMaterialusn(String materialusn) {
		this.materialusn = materialusn;
	}

	public BigDecimal getMaterialqty() {
		return this.materialqty;
	}

	public void setMaterialqty(BigDecimal materialqty) {
		this.materialqty = materialqty;
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

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public String getResuid() {
		return this.resuid;
	}

	public void setResuid(String resuid) {
		this.resuid = resuid;
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

}