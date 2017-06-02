package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.sql.Blob;
import java.util.Date;

/**
 * FFile generated by hbm2java
 */
public class FFile implements java.io.Serializable {

	private String fileuid;
	private String version;
	private String filetype;
	private String filepath;
	private String creator;
	private Date createtime;
	private String changer;
	private Date changetime;
	private String changereason;
	private String filename;
	private String deptid;
	private String fileformat;
	private String length;
	private Blob filebinary;
	private String FFileOutUid;
	private String filecreator;
	private String notes;
	private Byte premodel;

	public FFile() {
	}

	public FFile(String fileuid) {
		this.fileuid = fileuid;
	}

	public FFile(String fileuid, String filetype, String filepath, String creator, Date createtime, String changer,
			Date changetime, String changereason, String filename, String deptid, String fileformat, String length,
			Blob filebinary, String FFileOutUid, String filecreator, String notes, Byte premodel) {
		this.fileuid = fileuid;
		this.filetype = filetype;
		this.filepath = filepath;
		this.creator = creator;
		this.createtime = createtime;
		this.changer = changer;
		this.changetime = changetime;
		this.changereason = changereason;
		this.filename = filename;
		this.deptid = deptid;
		this.fileformat = fileformat;
		this.length = length;
		this.filebinary = filebinary;
		this.FFileOutUid = FFileOutUid;
		this.filecreator = filecreator;
		this.notes = notes;
		this.premodel = premodel;
	}

	public String getFileuid() {
		return this.fileuid;
	}

	public void setFileuid(String fileuid) {
		this.fileuid = fileuid;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getFiletype() {
		return this.filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
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

	public String getChanger() {
		return this.changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public Date getChangetime() {
		return this.changetime;
	}

	public void setChangetime(Date changetime) {
		this.changetime = changetime;
	}

	public String getChangereason() {
		return this.changereason;
	}

	public void setChangereason(String changereason) {
		this.changereason = changereason;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getFileformat() {
		return this.fileformat;
	}

	public void setFileformat(String fileformat) {
		this.fileformat = fileformat;
	}

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public Blob getFilebinary() {
		return this.filebinary;
	}

	public void setFilebinary(Blob filebinary) {
		this.filebinary = filebinary;
	}

	public String getFFileOutUid() {
		return this.FFileOutUid;
	}

	public void setFFileOutUid(String FFileOutUid) {
		this.FFileOutUid = FFileOutUid;
	}

	public String getFilecreator() {
		return this.filecreator;
	}

	public void setFilecreator(String filecreator) {
		this.filecreator = filecreator;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Byte getPremodel() {
		return this.premodel;
	}

	public void setPremodel(Byte premodel) {
		this.premodel = premodel;
	}

}
