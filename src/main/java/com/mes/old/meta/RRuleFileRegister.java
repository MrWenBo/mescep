package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * RRuleFileRegister generated by hbm2java
 */
public class RRuleFileRegister implements java.io.Serializable {

	private String fileuid;
	private String fileid;
	private String filename;
	private String filepath;

	public RRuleFileRegister() {
	}

	public RRuleFileRegister(String fileuid) {
		this.fileuid = fileuid;
	}

	public RRuleFileRegister(String fileuid, String fileid, String filename, String filepath) {
		this.fileuid = fileuid;
		this.fileid = fileid;
		this.filename = filename;
		this.filepath = filepath;
	}

	public String getFileuid() {
		return this.fileuid;
	}

	public void setFileuid(String fileuid) {
		this.fileuid = fileuid;
	}

	public String getFileid() {
		return this.fileid;
	}

	public void setFileid(String fileid) {
		this.fileid = fileid;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

}
