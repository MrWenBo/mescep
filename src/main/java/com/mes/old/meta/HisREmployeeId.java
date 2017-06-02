package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.io.Serializable;

/**
 * HisREmployeeId generated by hbm2java
 */
public class HisREmployeeId implements java.io.Serializable {

	private Serializable deptid;
	private Serializable groupid;
	private Serializable sex;
	private Serializable employeename;
	private Serializable password;
	private Serializable positionid;
	private Serializable employeeid;
	private Serializable web;
	private Serializable married;
	private Serializable email;
	private Serializable cellphone;
	private Serializable employeetype;
	private Serializable degree;
	private Serializable birth;
	private Serializable employeeid1;
	private Serializable job;
	private Serializable REmployeeOutUid;
	private Serializable employeestate;
	private Serializable confirmtype;
	private Serializable cardid;

	public HisREmployeeId() {
	}

	public HisREmployeeId(Serializable deptid, Serializable groupid, Serializable sex, Serializable employeename,
			Serializable password, Serializable positionid, Serializable employeeid, Serializable web,
			Serializable married, Serializable email, Serializable cellphone, Serializable employeetype,
			Serializable degree, Serializable birth, Serializable employeeid1, Serializable job,
			Serializable REmployeeOutUid, Serializable employeestate, Serializable confirmtype, Serializable cardid) {
		this.deptid = deptid;
		this.groupid = groupid;
		this.sex = sex;
		this.employeename = employeename;
		this.password = password;
		this.positionid = positionid;
		this.employeeid = employeeid;
		this.web = web;
		this.married = married;
		this.email = email;
		this.cellphone = cellphone;
		this.employeetype = employeetype;
		this.degree = degree;
		this.birth = birth;
		this.employeeid1 = employeeid1;
		this.job = job;
		this.REmployeeOutUid = REmployeeOutUid;
		this.employeestate = employeestate;
		this.confirmtype = confirmtype;
		this.cardid = cardid;
	}

	public Serializable getDeptid() {
		return this.deptid;
	}

	public void setDeptid(Serializable deptid) {
		this.deptid = deptid;
	}

	public Serializable getGroupid() {
		return this.groupid;
	}

	public void setGroupid(Serializable groupid) {
		this.groupid = groupid;
	}

	public Serializable getSex() {
		return this.sex;
	}

	public void setSex(Serializable sex) {
		this.sex = sex;
	}

	public Serializable getEmployeename() {
		return this.employeename;
	}

	public void setEmployeename(Serializable employeename) {
		this.employeename = employeename;
	}

	public Serializable getPassword() {
		return this.password;
	}

	public void setPassword(Serializable password) {
		this.password = password;
	}

	public Serializable getPositionid() {
		return this.positionid;
	}

	public void setPositionid(Serializable positionid) {
		this.positionid = positionid;
	}

	public Serializable getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(Serializable employeeid) {
		this.employeeid = employeeid;
	}

	public Serializable getWeb() {
		return this.web;
	}

	public void setWeb(Serializable web) {
		this.web = web;
	}

	public Serializable getMarried() {
		return this.married;
	}

	public void setMarried(Serializable married) {
		this.married = married;
	}

	public Serializable getEmail() {
		return this.email;
	}

	public void setEmail(Serializable email) {
		this.email = email;
	}

	public Serializable getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(Serializable cellphone) {
		this.cellphone = cellphone;
	}

	public Serializable getEmployeetype() {
		return this.employeetype;
	}

	public void setEmployeetype(Serializable employeetype) {
		this.employeetype = employeetype;
	}

	public Serializable getDegree() {
		return this.degree;
	}

	public void setDegree(Serializable degree) {
		this.degree = degree;
	}

	public Serializable getBirth() {
		return this.birth;
	}

	public void setBirth(Serializable birth) {
		this.birth = birth;
	}

	public Serializable getEmployeeid1() {
		return this.employeeid1;
	}

	public void setEmployeeid1(Serializable employeeid1) {
		this.employeeid1 = employeeid1;
	}

	public Serializable getJob() {
		return this.job;
	}

	public void setJob(Serializable job) {
		this.job = job;
	}

	public Serializable getREmployeeOutUid() {
		return this.REmployeeOutUid;
	}

	public void setREmployeeOutUid(Serializable REmployeeOutUid) {
		this.REmployeeOutUid = REmployeeOutUid;
	}

	public Serializable getEmployeestate() {
		return this.employeestate;
	}

	public void setEmployeestate(Serializable employeestate) {
		this.employeestate = employeestate;
	}

	public Serializable getConfirmtype() {
		return this.confirmtype;
	}

	public void setConfirmtype(Serializable confirmtype) {
		this.confirmtype = confirmtype;
	}

	public Serializable getCardid() {
		return this.cardid;
	}

	public void setCardid(Serializable cardid) {
		this.cardid = cardid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HisREmployeeId))
			return false;
		HisREmployeeId castOther = (HisREmployeeId) other;

		return ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
				&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getGroupid() == castOther.getGroupid()) || (this.getGroupid() != null
						&& castOther.getGroupid() != null && this.getGroupid().equals(castOther.getGroupid())))
				&& ((this.getSex() == castOther.getSex()) || (this.getSex() != null && castOther.getSex() != null
						&& this.getSex().equals(castOther.getSex())))
				&& ((this.getEmployeename() == castOther.getEmployeename())
						|| (this.getEmployeename() != null && castOther.getEmployeename() != null
								&& this.getEmployeename().equals(castOther.getEmployeename())))
				&& ((this.getPassword() == castOther.getPassword()) || (this.getPassword() != null
						&& castOther.getPassword() != null && this.getPassword().equals(castOther.getPassword())))
				&& ((this.getPositionid() == castOther.getPositionid()) || (this.getPositionid() != null
						&& castOther.getPositionid() != null && this.getPositionid().equals(castOther.getPositionid())))
				&& ((this.getEmployeeid() == castOther.getEmployeeid()) || (this.getEmployeeid() != null
						&& castOther.getEmployeeid() != null && this.getEmployeeid().equals(castOther.getEmployeeid())))
				&& ((this.getWeb() == castOther.getWeb()) || (this.getWeb() != null && castOther.getWeb() != null
						&& this.getWeb().equals(castOther.getWeb())))
				&& ((this.getMarried() == castOther.getMarried()) || (this.getMarried() != null
						&& castOther.getMarried() != null && this.getMarried().equals(castOther.getMarried())))
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& ((this.getCellphone() == castOther.getCellphone()) || (this.getCellphone() != null
						&& castOther.getCellphone() != null && this.getCellphone().equals(castOther.getCellphone())))
				&& ((this.getEmployeetype() == castOther.getEmployeetype())
						|| (this.getEmployeetype() != null && castOther.getEmployeetype() != null
								&& this.getEmployeetype().equals(castOther.getEmployeetype())))
				&& ((this.getDegree() == castOther.getDegree()) || (this.getDegree() != null
						&& castOther.getDegree() != null && this.getDegree().equals(castOther.getDegree())))
				&& ((this.getBirth() == castOther.getBirth()) || (this.getBirth() != null
						&& castOther.getBirth() != null && this.getBirth().equals(castOther.getBirth())))
				&& ((this.getEmployeeid1() == castOther.getEmployeeid1())
						|| (this.getEmployeeid1() != null && castOther.getEmployeeid1() != null
								&& this.getEmployeeid1().equals(castOther.getEmployeeid1())))
				&& ((this.getJob() == castOther.getJob()) || (this.getJob() != null && castOther.getJob() != null
						&& this.getJob().equals(castOther.getJob())))
				&& ((this.getREmployeeOutUid() == castOther.getREmployeeOutUid())
						|| (this.getREmployeeOutUid() != null && castOther.getREmployeeOutUid() != null
								&& this.getREmployeeOutUid().equals(castOther.getREmployeeOutUid())))
				&& ((this.getEmployeestate() == castOther.getEmployeestate())
						|| (this.getEmployeestate() != null && castOther.getEmployeestate() != null
								&& this.getEmployeestate().equals(castOther.getEmployeestate())))
				&& ((this.getConfirmtype() == castOther.getConfirmtype())
						|| (this.getConfirmtype() != null && castOther.getConfirmtype() != null
								&& this.getConfirmtype().equals(castOther.getConfirmtype())))
				&& ((this.getCardid() == castOther.getCardid()) || (this.getCardid() != null
						&& castOther.getCardid() != null && this.getCardid().equals(castOther.getCardid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getGroupid() == null ? 0 : this.getGroupid().hashCode());
		result = 37 * result + (getSex() == null ? 0 : this.getSex().hashCode());
		result = 37 * result + (getEmployeename() == null ? 0 : this.getEmployeename().hashCode());
		result = 37 * result + (getPassword() == null ? 0 : this.getPassword().hashCode());
		result = 37 * result + (getPositionid() == null ? 0 : this.getPositionid().hashCode());
		result = 37 * result + (getEmployeeid() == null ? 0 : this.getEmployeeid().hashCode());
		result = 37 * result + (getWeb() == null ? 0 : this.getWeb().hashCode());
		result = 37 * result + (getMarried() == null ? 0 : this.getMarried().hashCode());
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + (getCellphone() == null ? 0 : this.getCellphone().hashCode());
		result = 37 * result + (getEmployeetype() == null ? 0 : this.getEmployeetype().hashCode());
		result = 37 * result + (getDegree() == null ? 0 : this.getDegree().hashCode());
		result = 37 * result + (getBirth() == null ? 0 : this.getBirth().hashCode());
		result = 37 * result + (getEmployeeid1() == null ? 0 : this.getEmployeeid1().hashCode());
		result = 37 * result + (getJob() == null ? 0 : this.getJob().hashCode());
		result = 37 * result + (getREmployeeOutUid() == null ? 0 : this.getREmployeeOutUid().hashCode());
		result = 37 * result + (getEmployeestate() == null ? 0 : this.getEmployeestate().hashCode());
		result = 37 * result + (getConfirmtype() == null ? 0 : this.getConfirmtype().hashCode());
		result = 37 * result + (getCardid() == null ? 0 : this.getCardid().hashCode());
		return result;
	}

}