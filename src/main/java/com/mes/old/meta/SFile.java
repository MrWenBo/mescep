package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * SFile generated by hbm2java
 */
public class SFile implements java.io.Serializable {

	private String id;
	private String filename;
	private String filelocation;
	private String ownerid;
	private String deptid;
	private Date uploaddate;
	private String type;
	private String length;
	private String fileField;
	private Date createtime;
	private String creator;
	private String changer;
	private String changereason;
	private Date changetime;

	public SFile() {
	}

	public SFile(String id) {
		this.id = id;
	}

	public SFile(String id, String filename, String filelocation, String ownerid, String deptid, Date uploaddate,
			String type, String length, String fileField, Date createtime, String creator, String changer,
			String changereason, Date changetime) {
		this.id = id;
		this.filename = filename;
		this.filelocation = filelocation;
		this.ownerid = ownerid;
		this.deptid = deptid;
		this.uploaddate = uploaddate;
		this.type = type;
		this.length = length;
		this.fileField = fileField;
		this.createtime = createtime;
		this.creator = creator;
		this.changer = changer;
		this.changereason = changereason;
		this.changetime = changetime;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilelocation() {
		return this.filelocation;
	}

	public void setFilelocation(String filelocation) {
		this.filelocation = filelocation;
	}

	public String getOwnerid() {
		return this.ownerid;
	}

	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public Date getUploaddate() {
		return this.uploaddate;
	}

	public void setUploaddate(Date uploaddate) {
		this.uploaddate = uploaddate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getFileField() {
		return this.fileField;
	}

	public void setFileField(String fileField) {
		this.fileField = fileField;
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

	public String getChanger() {
		return this.changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public String getChangereason() {
		return this.changereason;
	}

	public void setChangereason(String changereason) {
		this.changereason = changereason;
	}

	public Date getChangetime() {
		return this.changetime;
	}

	public void setChangetime(Date changetime) {
		this.changetime = changetime;
	}

}
