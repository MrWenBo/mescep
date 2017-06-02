package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * RResourceLog generated by hbm2java
 */
public class RResourceLog implements java.io.Serializable {

	private BigDecimal uniqueid;
	private String resuid;
	private String resourcestate;
	private String notes;
	private String creator;
	private Date createtime;
	private Boolean effective;
	private Date planresumetime;

	public RResourceLog() {
	}

	public RResourceLog(BigDecimal uniqueid, String resuid) {
		this.uniqueid = uniqueid;
		this.resuid = resuid;
	}

	public RResourceLog(BigDecimal uniqueid, String resuid, String resourcestate, String notes, String creator,
			Date createtime, Boolean effective, Date planresumetime) {
		this.uniqueid = uniqueid;
		this.resuid = resuid;
		this.resourcestate = resourcestate;
		this.notes = notes;
		this.creator = creator;
		this.createtime = createtime;
		this.effective = effective;
		this.planresumetime = planresumetime;
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

	public String getResourcestate() {
		return this.resourcestate;
	}

	public void setResourcestate(String resourcestate) {
		this.resourcestate = resourcestate;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public Boolean getEffective() {
		return this.effective;
	}

	public void setEffective(Boolean effective) {
		this.effective = effective;
	}

	public Date getPlanresumetime() {
		return this.planresumetime;
	}

	public void setPlanresumetime(Date planresumetime) {
		this.planresumetime = planresumetime;
	}

}
