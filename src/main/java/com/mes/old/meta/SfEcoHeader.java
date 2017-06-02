package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * SfEcoHeader generated by hbm2java
 */
public class SfEcoHeader implements java.io.Serializable {

	private String changeuid;
	private String changeid;
	private String ecotype;
	private String frommodel;
	private String tomodel;
	private String creator;
	private Date createtime;
	private String notes;
	private String ecostate;
	private Date validdate;
	private String partNumber;

	public SfEcoHeader() {
	}

	public SfEcoHeader(String changeuid, String partNumber) {
		this.changeuid = changeuid;
		this.partNumber = partNumber;
	}

	public SfEcoHeader(String changeuid, String changeid, String ecotype, String frommodel, String tomodel,
			String creator, Date createtime, String notes, String ecostate, Date validdate, String partNumber) {
		this.changeuid = changeuid;
		this.changeid = changeid;
		this.ecotype = ecotype;
		this.frommodel = frommodel;
		this.tomodel = tomodel;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
		this.ecostate = ecostate;
		this.validdate = validdate;
		this.partNumber = partNumber;
	}

	public String getChangeuid() {
		return this.changeuid;
	}

	public void setChangeuid(String changeuid) {
		this.changeuid = changeuid;
	}

	public String getChangeid() {
		return this.changeid;
	}

	public void setChangeid(String changeid) {
		this.changeid = changeid;
	}

	public String getEcotype() {
		return this.ecotype;
	}

	public void setEcotype(String ecotype) {
		this.ecotype = ecotype;
	}

	public String getFrommodel() {
		return this.frommodel;
	}

	public void setFrommodel(String frommodel) {
		this.frommodel = frommodel;
	}

	public String getTomodel() {
		return this.tomodel;
	}

	public void setTomodel(String tomodel) {
		this.tomodel = tomodel;
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

	public String getEcostate() {
		return this.ecostate;
	}

	public void setEcostate(String ecostate) {
		this.ecostate = ecostate;
	}

	public Date getValiddate() {
		return this.validdate;
	}

	public void setValiddate(Date validdate) {
		this.validdate = validdate;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

}