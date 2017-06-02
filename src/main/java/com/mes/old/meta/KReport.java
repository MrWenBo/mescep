package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * KReport generated by hbm2java
 */
public class KReport implements java.io.Serializable {

	private String reportid;
	private String reportname;
	private String reporturl;
	private String reporttype;
	private String btype;
	private String otype;
	private Date createtime;
	private String creator;
	private String ftype;
	private String notes;

	public KReport() {
	}

	public KReport(String reportid) {
		this.reportid = reportid;
	}

	public KReport(String reportid, String reportname, String reporturl, String reporttype, String btype, String otype,
			Date createtime, String creator, String ftype, String notes) {
		this.reportid = reportid;
		this.reportname = reportname;
		this.reporturl = reporturl;
		this.reporttype = reporttype;
		this.btype = btype;
		this.otype = otype;
		this.createtime = createtime;
		this.creator = creator;
		this.ftype = ftype;
		this.notes = notes;
	}

	public String getReportid() {
		return this.reportid;
	}

	public void setReportid(String reportid) {
		this.reportid = reportid;
	}

	public String getReportname() {
		return this.reportname;
	}

	public void setReportname(String reportname) {
		this.reportname = reportname;
	}

	public String getReporturl() {
		return this.reporturl;
	}

	public void setReporturl(String reporturl) {
		this.reporturl = reporturl;
	}

	public String getReporttype() {
		return this.reporttype;
	}

	public void setReporttype(String reporttype) {
		this.reporttype = reporttype;
	}

	public String getBtype() {
		return this.btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public String getOtype() {
		return this.otype;
	}

	public void setOtype(String otype) {
		this.otype = otype;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getFtype() {
		return this.ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
