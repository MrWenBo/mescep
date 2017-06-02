package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * MCheckupRec generated by hbm2java
 */
public class MCheckupRec implements java.io.Serializable {

	private String uniqueid;
	private MMaterial MMaterial;
	private Date checktime;
	private String checker;
	private Date nextChecktime;
	private String creator;
	private Date createtime;
	private String notes;
	private Byte qualitystate;

	public MCheckupRec() {
	}

	public MCheckupRec(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public MCheckupRec(String uniqueid, MMaterial MMaterial, Date checktime, String checker, Date nextChecktime,
			String creator, Date createtime, String notes, Byte qualitystate) {
		this.uniqueid = uniqueid;
		this.MMaterial = MMaterial;
		this.checktime = checktime;
		this.checker = checker;
		this.nextChecktime = nextChecktime;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
		this.qualitystate = qualitystate;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public MMaterial getMMaterial() {
		return this.MMaterial;
	}

	public void setMMaterial(MMaterial MMaterial) {
		this.MMaterial = MMaterial;
	}

	public Date getChecktime() {
		return this.checktime;
	}

	public void setChecktime(Date checktime) {
		this.checktime = checktime;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Date getNextChecktime() {
		return this.nextChecktime;
	}

	public void setNextChecktime(Date nextChecktime) {
		this.nextChecktime = nextChecktime;
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

	public Byte getQualitystate() {
		return this.qualitystate;
	}

	public void setQualitystate(Byte qualitystate) {
		this.qualitystate = qualitystate;
	}

}
