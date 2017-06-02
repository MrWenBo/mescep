package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * RRuleFile generated by hbm2java
 */
public class RRuleFile implements java.io.Serializable {

	private RRuleFileId id;
	private String filename;
	private String filepath;
	private String classid;
	private String uniqueid;

	public RRuleFile() {
	}

	public RRuleFile(RRuleFileId id) {
		this.id = id;
	}

	public RRuleFile(RRuleFileId id, String filename, String filepath, String classid, String uniqueid) {
		this.id = id;
		this.filename = filename;
		this.filepath = filepath;
		this.classid = classid;
		this.uniqueid = uniqueid;
	}

	public RRuleFileId getId() {
		return this.id;
	}

	public void setId(RRuleFileId id) {
		this.id = id;
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

	public String getClassid() {
		return this.classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

}
