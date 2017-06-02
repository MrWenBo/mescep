package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

/**
 * RvEmployeeId generated by hbm2java
 */
public class RvEmployeeId implements java.io.Serializable {

	private String deptid;
	private String groupid;
	private BigDecimal sex;
	private String employeename;
	private byte[] password;
	private String positionid;
	private String employeeid;
	private String web;
	private BigDecimal married;
	private String email;
	private String cellphone;
	private String employeetype;
	private String degree;
	private Date birth;
	private String employeeid1;
	private String job;
	private String REmployeeOutUid;
	private Long employeestate;
	private Long confirmtype;
	private String cardid;
	private String deptname;

	public RvEmployeeId() {
	}

	public RvEmployeeId(String deptid, String employeename, String employeeid) {
		this.deptid = deptid;
		this.employeename = employeename;
		this.employeeid = employeeid;
	}

	public RvEmployeeId(String deptid, String groupid, BigDecimal sex, String employeename, byte[] password,
			String positionid, String employeeid, String web, BigDecimal married, String email, String cellphone,
			String employeetype, String degree, Date birth, String employeeid1, String job, String REmployeeOutUid,
			Long employeestate, Long confirmtype, String cardid, String deptname) {
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
		this.deptname = deptname;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public BigDecimal getSex() {
		return this.sex;
	}

	public void setSex(BigDecimal sex) {
		this.sex = sex;
	}

	public String getEmployeename() {
		return this.employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public byte[] getPassword() {
		return this.password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public String getPositionid() {
		return this.positionid;
	}

	public void setPositionid(String positionid) {
		this.positionid = positionid;
	}

	public String getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public BigDecimal getMarried() {
		return this.married;
	}

	public void setMarried(BigDecimal married) {
		this.married = married;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmployeetype() {
		return this.employeetype;
	}

	public void setEmployeetype(String employeetype) {
		this.employeetype = employeetype;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmployeeid1() {
		return this.employeeid1;
	}

	public void setEmployeeid1(String employeeid1) {
		this.employeeid1 = employeeid1;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getREmployeeOutUid() {
		return this.REmployeeOutUid;
	}

	public void setREmployeeOutUid(String REmployeeOutUid) {
		this.REmployeeOutUid = REmployeeOutUid;
	}

	public Long getEmployeestate() {
		return this.employeestate;
	}

	public void setEmployeestate(Long employeestate) {
		this.employeestate = employeestate;
	}

	public Long getConfirmtype() {
		return this.confirmtype;
	}

	public void setConfirmtype(Long confirmtype) {
		this.confirmtype = confirmtype;
	}

	public String getCardid() {
		return this.cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RvEmployeeId))
			return false;
		RvEmployeeId castOther = (RvEmployeeId) other;

		return ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
				&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getGroupid() == castOther.getGroupid()) || (this.getGroupid() != null
						&& castOther.getGroupid() != null && this.getGroupid().equals(castOther.getGroupid())))
				&& ((this.getSex() == castOther.getSex()) || (this.getSex() != null && castOther.getSex() != null
						&& this.getSex().equals(castOther.getSex())))
				&& ((this.getEmployeename() == castOther.getEmployeename())
						|| (this.getEmployeename() != null && castOther.getEmployeename() != null
								&& this.getEmployeename().equals(castOther.getEmployeename())))
				&& ((this.getPassword() == castOther.getPassword())
						|| (this.getPassword() != null && castOther.getPassword() != null
								&& Arrays.equals(this.getPassword(), castOther.getPassword())))
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
						&& castOther.getCardid() != null && this.getCardid().equals(castOther.getCardid())))
				&& ((this.getDeptname() == castOther.getDeptname()) || (this.getDeptname() != null
						&& castOther.getDeptname() != null && this.getDeptname().equals(castOther.getDeptname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getGroupid() == null ? 0 : this.getGroupid().hashCode());
		result = 37 * result + (getSex() == null ? 0 : this.getSex().hashCode());
		result = 37 * result + (getEmployeename() == null ? 0 : this.getEmployeename().hashCode());
		int passwordHashcode = 0;
		byte[] passwordProperty = this.getPassword();
		if (passwordProperty != null) {
			passwordHashcode = 1;
			for (int i = 0; i < passwordProperty.length; i++) {
				passwordHashcode = 37 * passwordHashcode + passwordProperty[i];
			}
		}

		result = 37 * result + passwordHashcode;

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
		result = 37 * result + (getDeptname() == null ? 0 : this.getDeptname().hashCode());
		return result;
	}

}