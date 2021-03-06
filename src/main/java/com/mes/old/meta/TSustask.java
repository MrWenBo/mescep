package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * TSustask generated by hbm2java
 */
public class TSustask implements java.io.Serializable {

	private String uniqueid;
	private String taskuid;
	private Date suspendtime;
	private String suspender;
	private String suspendreason;
	private String notes;
	private Boolean susstate;
	private Date resumetime;
	private String resumer;
	private String creator;
	private Date createtime;
	private Date planresume;

	public TSustask() {
	}

	public TSustask(String uniqueid, String taskuid) {
		this.uniqueid = uniqueid;
		this.taskuid = taskuid;
	}

	public TSustask(String uniqueid, String taskuid, Date suspendtime, String suspender, String suspendreason,
			String notes, Boolean susstate, Date resumetime, String resumer, String creator, Date createtime,
			Date planresume) {
		this.uniqueid = uniqueid;
		this.taskuid = taskuid;
		this.suspendtime = suspendtime;
		this.suspender = suspender;
		this.suspendreason = suspendreason;
		this.notes = notes;
		this.susstate = susstate;
		this.resumetime = resumetime;
		this.resumer = resumer;
		this.creator = creator;
		this.createtime = createtime;
		this.planresume = planresume;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public Date getSuspendtime() {
		return this.suspendtime;
	}

	public void setSuspendtime(Date suspendtime) {
		this.suspendtime = suspendtime;
	}

	public String getSuspender() {
		return this.suspender;
	}

	public void setSuspender(String suspender) {
		this.suspender = suspender;
	}

	public String getSuspendreason() {
		return this.suspendreason;
	}

	public void setSuspendreason(String suspendreason) {
		this.suspendreason = suspendreason;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Boolean getSusstate() {
		return this.susstate;
	}

	public void setSusstate(Boolean susstate) {
		this.susstate = susstate;
	}

	public Date getResumetime() {
		return this.resumetime;
	}

	public void setResumetime(Date resumetime) {
		this.resumetime = resumetime;
	}

	public String getResumer() {
		return this.resumer;
	}

	public void setResumer(String resumer) {
		this.resumer = resumer;
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

	public Date getPlanresume() {
		return this.planresume;
	}

	public void setPlanresume(Date planresume) {
		this.planresume = planresume;
	}

}
