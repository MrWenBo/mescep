package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * RGroup generated by hbm2java
 */
public class RGroup implements java.io.Serializable {

	private String groupuid;
	private String groupname;
	private String deptid;
	private String grouptype;
	private String notes;
	private String creator;
	private Date createtime;
	private String groupid;
	private String groupdesc;

	public RGroup() {
	}

	public RGroup(String groupuid) {
		this.groupuid = groupuid;
	}

	public RGroup(String groupuid, String groupname, String deptid, String grouptype, String notes, String creator,
			Date createtime, String groupid, String groupdesc) {
		this.groupuid = groupuid;
		this.groupname = groupname;
		this.deptid = deptid;
		this.grouptype = grouptype;
		this.notes = notes;
		this.creator = creator;
		this.createtime = createtime;
		this.groupid = groupid;
		this.groupdesc = groupdesc;
	}

	public String getGroupuid() {
		return this.groupuid;
	}

	public void setGroupuid(String groupuid) {
		this.groupuid = groupuid;
	}

	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getGrouptype() {
		return this.grouptype;
	}

	public void setGrouptype(String grouptype) {
		this.grouptype = grouptype;
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

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getGroupdesc() {
		return this.groupdesc;
	}

	public void setGroupdesc(String groupdesc) {
		this.groupdesc = groupdesc;
	}

}
