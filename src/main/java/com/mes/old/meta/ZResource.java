package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * ZResource generated by hbm2java
 */
public class ZResource implements java.io.Serializable {

	private String resuid;
	private String resname;
	private String calUid;
	private String calName;

	public ZResource() {
	}

	public ZResource(String resuid) {
		this.resuid = resuid;
	}

	public ZResource(String resuid, String resname, String calUid, String calName) {
		this.resuid = resuid;
		this.resname = resname;
		this.calUid = calUid;
		this.calName = calName;
	}

	public String getResuid() {
		return this.resuid;
	}

	public void setResuid(String resuid) {
		this.resuid = resuid;
	}

	public String getResname() {
		return this.resname;
	}

	public void setResname(String resname) {
		this.resname = resname;
	}

	public String getCalUid() {
		return this.calUid;
	}

	public void setCalUid(String calUid) {
		this.calUid = calUid;
	}

	public String getCalName() {
		return this.calName;
	}

	public void setCalName(String calName) {
		this.calName = calName;
	}

}
