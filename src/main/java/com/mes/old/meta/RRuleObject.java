package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * RRuleObject generated by hbm2java
 */
public class RRuleObject implements java.io.Serializable {

	private String objectuid;
	private String objectid;
	private String objectalias;
	private String objectname;
	private String objectdomain;
	private String objecttype;
	private String objectlocation;
	private String creator;
	private Date createtime;
	private String isresolve;
	private String uniqueid;

	public RRuleObject() {
	}

	public RRuleObject(String objectuid) {
		this.objectuid = objectuid;
	}

	public RRuleObject(String objectuid, String objectid, String objectalias, String objectname, String objectdomain,
			String objecttype, String objectlocation, String creator, Date createtime, String isresolve,
			String uniqueid) {
		this.objectuid = objectuid;
		this.objectid = objectid;
		this.objectalias = objectalias;
		this.objectname = objectname;
		this.objectdomain = objectdomain;
		this.objecttype = objecttype;
		this.objectlocation = objectlocation;
		this.creator = creator;
		this.createtime = createtime;
		this.isresolve = isresolve;
		this.uniqueid = uniqueid;
	}

	public String getObjectuid() {
		return this.objectuid;
	}

	public void setObjectuid(String objectuid) {
		this.objectuid = objectuid;
	}

	public String getObjectid() {
		return this.objectid;
	}

	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}

	public String getObjectalias() {
		return this.objectalias;
	}

	public void setObjectalias(String objectalias) {
		this.objectalias = objectalias;
	}

	public String getObjectname() {
		return this.objectname;
	}

	public void setObjectname(String objectname) {
		this.objectname = objectname;
	}

	public String getObjectdomain() {
		return this.objectdomain;
	}

	public void setObjectdomain(String objectdomain) {
		this.objectdomain = objectdomain;
	}

	public String getObjecttype() {
		return this.objecttype;
	}

	public void setObjecttype(String objecttype) {
		this.objecttype = objecttype;
	}

	public String getObjectlocation() {
		return this.objectlocation;
	}

	public void setObjectlocation(String objectlocation) {
		this.objectlocation = objectlocation;
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

	public String getIsresolve() {
		return this.isresolve;
	}

	public void setIsresolve(String isresolve) {
		this.isresolve = isresolve;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

}
