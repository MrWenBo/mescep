package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.io.Serializable;

/**
 * J4SpringBean generated by hbm2java
 */
public class J4SpringBean implements java.io.Serializable {

	private String beanid;
	private String beanname;
	private String beandesc;
	private String creator;
	private Serializable createtime;
	private String beantype;
	private String beanapplytype;

	public J4SpringBean() {
	}

	public J4SpringBean(String beanid) {
		this.beanid = beanid;
	}

	public J4SpringBean(String beanid, String beanname, String beandesc, String creator, Serializable createtime,
			String beantype, String beanapplytype) {
		this.beanid = beanid;
		this.beanname = beanname;
		this.beandesc = beandesc;
		this.creator = creator;
		this.createtime = createtime;
		this.beantype = beantype;
		this.beanapplytype = beanapplytype;
	}

	public String getBeanid() {
		return this.beanid;
	}

	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}

	public String getBeanname() {
		return this.beanname;
	}

	public void setBeanname(String beanname) {
		this.beanname = beanname;
	}

	public String getBeandesc() {
		return this.beandesc;
	}

	public void setBeandesc(String beandesc) {
		this.beandesc = beandesc;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Serializable getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Serializable createtime) {
		this.createtime = createtime;
	}

	public String getBeantype() {
		return this.beantype;
	}

	public void setBeantype(String beantype) {
		this.beantype = beantype;
	}

	public String getBeanapplytype() {
		return this.beanapplytype;
	}

	public void setBeanapplytype(String beanapplytype) {
		this.beanapplytype = beanapplytype;
	}

}
