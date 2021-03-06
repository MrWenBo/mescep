package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * BTypesdata generated by hbm2java
 */
public class BTypesdata implements java.io.Serializable {

	private BTypesdataId id;
	private String iddesc;
	private String min;
	private String max;
	private Date createtime;
	private String notes;
	private String creator;
	private String BTypesdataOutUid;
	private String value;
	private String iconpath;
	private String iconuid;

	public BTypesdata() {
	}

	public BTypesdata(BTypesdataId id, String iddesc) {
		this.id = id;
		this.iddesc = iddesc;
	}

	public BTypesdata(BTypesdataId id, String iddesc, String min, String max, Date createtime, String notes,
			String creator, String BTypesdataOutUid, String value, String iconpath, String iconuid) {
		this.id = id;
		this.iddesc = iddesc;
		this.min = min;
		this.max = max;
		this.createtime = createtime;
		this.notes = notes;
		this.creator = creator;
		this.BTypesdataOutUid = BTypesdataOutUid;
		this.value = value;
		this.iconpath = iconpath;
		this.iconuid = iconuid;
	}

	public BTypesdataId getId() {
		return this.id;
	}

	public void setId(BTypesdataId id) {
		this.id = id;
	}

	public String getIddesc() {
		return this.iddesc;
	}

	public void setIddesc(String iddesc) {
		this.iddesc = iddesc;
	}

	public String getMin() {
		return this.min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getMax() {
		return this.max;
	}

	public void setMax(String max) {
		this.max = max;
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

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getBTypesdataOutUid() {
		return this.BTypesdataOutUid;
	}

	public void setBTypesdataOutUid(String BTypesdataOutUid) {
		this.BTypesdataOutUid = BTypesdataOutUid;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getIconpath() {
		return this.iconpath;
	}

	public void setIconpath(String iconpath) {
		this.iconpath = iconpath;
	}

	public String getIconuid() {
		return this.iconuid;
	}

	public void setIconuid(String iconuid) {
		this.iconuid = iconuid;
	}

}
