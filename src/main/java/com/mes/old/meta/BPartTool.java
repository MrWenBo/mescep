package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * BPartTool generated by hbm2java
 */
public class BPartTool implements java.io.Serializable {

	private String uniqueid;
	private BPartNumber BPartNumberByToolPartNumber;
	private BPartNumber BPartNumberByPartNumber;
	private String creator;
	private Date createtime;
	private String notes;

	public BPartTool() {
	}

	public BPartTool(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public BPartTool(String uniqueid, BPartNumber BPartNumberByToolPartNumber, BPartNumber BPartNumberByPartNumber,
			String creator, Date createtime, String notes) {
		this.uniqueid = uniqueid;
		this.BPartNumberByToolPartNumber = BPartNumberByToolPartNumber;
		this.BPartNumberByPartNumber = BPartNumberByPartNumber;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public BPartNumber getBPartNumberByToolPartNumber() {
		return this.BPartNumberByToolPartNumber;
	}

	public void setBPartNumberByToolPartNumber(BPartNumber BPartNumberByToolPartNumber) {
		this.BPartNumberByToolPartNumber = BPartNumberByToolPartNumber;
	}

	public BPartNumber getBPartNumberByPartNumber() {
		return this.BPartNumberByPartNumber;
	}

	public void setBPartNumberByPartNumber(BPartNumber BPartNumberByPartNumber) {
		this.BPartNumberByPartNumber = BPartNumberByPartNumber;
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
