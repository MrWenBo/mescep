package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * IBackHeader generated by hbm2java
 */
public class IBackHeader implements java.io.Serializable {

	private String invbackid;
	private String invbacktype;
	private String invbackstate;
	private String deptid;
	private String warehouseid;
	private String resuid;
	private String creator;
	private Date createtime;
	private String relationid;
	private String employeeid;
	private Date backtime;
	private String relationOutOrder;
	private String relationInOrder;
	private Set IBackDetails = new HashSet(0);

	public IBackHeader() {
	}

	public IBackHeader(String invbackid) {
		this.invbackid = invbackid;
	}

	public IBackHeader(String invbackid, String invbacktype, String invbackstate, String deptid, String warehouseid,
			String resuid, String creator, Date createtime, String relationid, String employeeid, Date backtime,
			String relationOutOrder, String relationInOrder, Set IBackDetails) {
		this.invbackid = invbackid;
		this.invbacktype = invbacktype;
		this.invbackstate = invbackstate;
		this.deptid = deptid;
		this.warehouseid = warehouseid;
		this.resuid = resuid;
		this.creator = creator;
		this.createtime = createtime;
		this.relationid = relationid;
		this.employeeid = employeeid;
		this.backtime = backtime;
		this.relationOutOrder = relationOutOrder;
		this.relationInOrder = relationInOrder;
		this.IBackDetails = IBackDetails;
	}

	public String getInvbackid() {
		return this.invbackid;
	}

	public void setInvbackid(String invbackid) {
		this.invbackid = invbackid;
	}

	public String getInvbacktype() {
		return this.invbacktype;
	}

	public void setInvbacktype(String invbacktype) {
		this.invbacktype = invbacktype;
	}

	public String getInvbackstate() {
		return this.invbackstate;
	}

	public void setInvbackstate(String invbackstate) {
		this.invbackstate = invbackstate;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public String getResuid() {
		return this.resuid;
	}

	public void setResuid(String resuid) {
		this.resuid = resuid;
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

	public String getRelationid() {
		return this.relationid;
	}

	public void setRelationid(String relationid) {
		this.relationid = relationid;
	}

	public String getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public Date getBacktime() {
		return this.backtime;
	}

	public void setBacktime(Date backtime) {
		this.backtime = backtime;
	}

	public String getRelationOutOrder() {
		return this.relationOutOrder;
	}

	public void setRelationOutOrder(String relationOutOrder) {
		this.relationOutOrder = relationOutOrder;
	}

	public String getRelationInOrder() {
		return this.relationInOrder;
	}

	public void setRelationInOrder(String relationInOrder) {
		this.relationInOrder = relationInOrder;
	}

	public Set getIBackDetails() {
		return this.IBackDetails;
	}

	public void setIBackDetails(Set IBackDetails) {
		this.IBackDetails = IBackDetails;
	}

}