package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * TvToolId generated by hbm2java
 */
public class TvToolId implements java.io.Serializable {

	private String taskuid;
	private String resuid;
	private Long assntype;
	private String resname;
	private String deptid;
	private String machineNumber;
	private String toolname;
	private Long leadTime;
	private String partNumberType;
	private String tooltype;
	private String partDescription;
	private BigDecimal taskwork;
	private Long dispatchgrade;
	private String dispatchgradedesc;
	private BigDecimal numOperators;
	private Date plansatisfy;
	private BigDecimal resinvqty;
	private Byte toolchecklevel;
	private String toolcheckleveldesc;
	private BigDecimal uniqueid2;
	private String employeeid;
	private BigDecimal assnunits;
	private BigDecimal assnqty;
	private String giveemployeename;
	private Long assnstate;
	private String assnstatedesc;
	private String notes;
	private String toolchecker;
	private String toolcheckername;

	public TvToolId() {
	}

	public TvToolId(String taskuid, String deptid, String dispatchgradedesc, String toolcheckleveldesc,
			BigDecimal uniqueid2, String assnstatedesc) {
		this.taskuid = taskuid;
		this.deptid = deptid;
		this.dispatchgradedesc = dispatchgradedesc;
		this.toolcheckleveldesc = toolcheckleveldesc;
		this.uniqueid2 = uniqueid2;
		this.assnstatedesc = assnstatedesc;
	}

	public TvToolId(String taskuid, String resuid, Long assntype, String resname, String deptid, String machineNumber,
			String toolname, Long leadTime, String partNumberType, String tooltype, String partDescription,
			BigDecimal taskwork, Long dispatchgrade, String dispatchgradedesc, BigDecimal numOperators,
			Date plansatisfy, BigDecimal resinvqty, Byte toolchecklevel, String toolcheckleveldesc,
			BigDecimal uniqueid2, String employeeid, BigDecimal assnunits, BigDecimal assnqty, String giveemployeename,
			Long assnstate, String assnstatedesc, String notes, String toolchecker, String toolcheckername) {
		this.taskuid = taskuid;
		this.resuid = resuid;
		this.assntype = assntype;
		this.resname = resname;
		this.deptid = deptid;
		this.machineNumber = machineNumber;
		this.toolname = toolname;
		this.leadTime = leadTime;
		this.partNumberType = partNumberType;
		this.tooltype = tooltype;
		this.partDescription = partDescription;
		this.taskwork = taskwork;
		this.dispatchgrade = dispatchgrade;
		this.dispatchgradedesc = dispatchgradedesc;
		this.numOperators = numOperators;
		this.plansatisfy = plansatisfy;
		this.resinvqty = resinvqty;
		this.toolchecklevel = toolchecklevel;
		this.toolcheckleveldesc = toolcheckleveldesc;
		this.uniqueid2 = uniqueid2;
		this.employeeid = employeeid;
		this.assnunits = assnunits;
		this.assnqty = assnqty;
		this.giveemployeename = giveemployeename;
		this.assnstate = assnstate;
		this.assnstatedesc = assnstatedesc;
		this.notes = notes;
		this.toolchecker = toolchecker;
		this.toolcheckername = toolcheckername;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public String getResuid() {
		return this.resuid;
	}

	public void setResuid(String resuid) {
		this.resuid = resuid;
	}

	public Long getAssntype() {
		return this.assntype;
	}

	public void setAssntype(Long assntype) {
		this.assntype = assntype;
	}

	public String getResname() {
		return this.resname;
	}

	public void setResname(String resname) {
		this.resname = resname;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getMachineNumber() {
		return this.machineNumber;
	}

	public void setMachineNumber(String machineNumber) {
		this.machineNumber = machineNumber;
	}

	public String getToolname() {
		return this.toolname;
	}

	public void setToolname(String toolname) {
		this.toolname = toolname;
	}

	public Long getLeadTime() {
		return this.leadTime;
	}

	public void setLeadTime(Long leadTime) {
		this.leadTime = leadTime;
	}

	public String getPartNumberType() {
		return this.partNumberType;
	}

	public void setPartNumberType(String partNumberType) {
		this.partNumberType = partNumberType;
	}

	public String getTooltype() {
		return this.tooltype;
	}

	public void setTooltype(String tooltype) {
		this.tooltype = tooltype;
	}

	public String getPartDescription() {
		return this.partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public BigDecimal getTaskwork() {
		return this.taskwork;
	}

	public void setTaskwork(BigDecimal taskwork) {
		this.taskwork = taskwork;
	}

	public Long getDispatchgrade() {
		return this.dispatchgrade;
	}

	public void setDispatchgrade(Long dispatchgrade) {
		this.dispatchgrade = dispatchgrade;
	}

	public String getDispatchgradedesc() {
		return this.dispatchgradedesc;
	}

	public void setDispatchgradedesc(String dispatchgradedesc) {
		this.dispatchgradedesc = dispatchgradedesc;
	}

	public BigDecimal getNumOperators() {
		return this.numOperators;
	}

	public void setNumOperators(BigDecimal numOperators) {
		this.numOperators = numOperators;
	}

	public Date getPlansatisfy() {
		return this.plansatisfy;
	}

	public void setPlansatisfy(Date plansatisfy) {
		this.plansatisfy = plansatisfy;
	}

	public BigDecimal getResinvqty() {
		return this.resinvqty;
	}

	public void setResinvqty(BigDecimal resinvqty) {
		this.resinvqty = resinvqty;
	}

	public Byte getToolchecklevel() {
		return this.toolchecklevel;
	}

	public void setToolchecklevel(Byte toolchecklevel) {
		this.toolchecklevel = toolchecklevel;
	}

	public String getToolcheckleveldesc() {
		return this.toolcheckleveldesc;
	}

	public void setToolcheckleveldesc(String toolcheckleveldesc) {
		this.toolcheckleveldesc = toolcheckleveldesc;
	}

	public BigDecimal getUniqueid2() {
		return this.uniqueid2;
	}

	public void setUniqueid2(BigDecimal uniqueid2) {
		this.uniqueid2 = uniqueid2;
	}

	public String getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public BigDecimal getAssnunits() {
		return this.assnunits;
	}

	public void setAssnunits(BigDecimal assnunits) {
		this.assnunits = assnunits;
	}

	public BigDecimal getAssnqty() {
		return this.assnqty;
	}

	public void setAssnqty(BigDecimal assnqty) {
		this.assnqty = assnqty;
	}

	public String getGiveemployeename() {
		return this.giveemployeename;
	}

	public void setGiveemployeename(String giveemployeename) {
		this.giveemployeename = giveemployeename;
	}

	public Long getAssnstate() {
		return this.assnstate;
	}

	public void setAssnstate(Long assnstate) {
		this.assnstate = assnstate;
	}

	public String getAssnstatedesc() {
		return this.assnstatedesc;
	}

	public void setAssnstatedesc(String assnstatedesc) {
		this.assnstatedesc = assnstatedesc;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getToolchecker() {
		return this.toolchecker;
	}

	public void setToolchecker(String toolchecker) {
		this.toolchecker = toolchecker;
	}

	public String getToolcheckername() {
		return this.toolcheckername;
	}

	public void setToolcheckername(String toolcheckername) {
		this.toolcheckername = toolcheckername;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TvToolId))
			return false;
		TvToolId castOther = (TvToolId) other;

		return ((this.getTaskuid() == castOther.getTaskuid()) || (this.getTaskuid() != null
				&& castOther.getTaskuid() != null && this.getTaskuid().equals(castOther.getTaskuid())))
				&& ((this.getResuid() == castOther.getResuid()) || (this.getResuid() != null
						&& castOther.getResuid() != null && this.getResuid().equals(castOther.getResuid())))
				&& ((this.getAssntype() == castOther.getAssntype()) || (this.getAssntype() != null
						&& castOther.getAssntype() != null && this.getAssntype().equals(castOther.getAssntype())))
				&& ((this.getResname() == castOther.getResname()) || (this.getResname() != null
						&& castOther.getResname() != null && this.getResname().equals(castOther.getResname())))
				&& ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
						&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getMachineNumber() == castOther.getMachineNumber())
						|| (this.getMachineNumber() != null && castOther.getMachineNumber() != null
								&& this.getMachineNumber().equals(castOther.getMachineNumber())))
				&& ((this.getToolname() == castOther.getToolname()) || (this.getToolname() != null
						&& castOther.getToolname() != null && this.getToolname().equals(castOther.getToolname())))
				&& ((this.getLeadTime() == castOther.getLeadTime()) || (this.getLeadTime() != null
						&& castOther.getLeadTime() != null && this.getLeadTime().equals(castOther.getLeadTime())))
				&& ((this.getPartNumberType() == castOther.getPartNumberType())
						|| (this.getPartNumberType() != null && castOther.getPartNumberType() != null
								&& this.getPartNumberType().equals(castOther.getPartNumberType())))
				&& ((this.getTooltype() == castOther.getTooltype()) || (this.getTooltype() != null
						&& castOther.getTooltype() != null && this.getTooltype().equals(castOther.getTooltype())))
				&& ((this.getPartDescription() == castOther.getPartDescription())
						|| (this.getPartDescription() != null && castOther.getPartDescription() != null
								&& this.getPartDescription().equals(castOther.getPartDescription())))
				&& ((this.getTaskwork() == castOther.getTaskwork()) || (this.getTaskwork() != null
						&& castOther.getTaskwork() != null && this.getTaskwork().equals(castOther.getTaskwork())))
				&& ((this.getDispatchgrade() == castOther.getDispatchgrade())
						|| (this.getDispatchgrade() != null && castOther.getDispatchgrade() != null
								&& this.getDispatchgrade().equals(castOther.getDispatchgrade())))
				&& ((this.getDispatchgradedesc() == castOther.getDispatchgradedesc())
						|| (this.getDispatchgradedesc() != null && castOther.getDispatchgradedesc() != null
								&& this.getDispatchgradedesc().equals(castOther.getDispatchgradedesc())))
				&& ((this.getNumOperators() == castOther.getNumOperators())
						|| (this.getNumOperators() != null && castOther.getNumOperators() != null
								&& this.getNumOperators().equals(castOther.getNumOperators())))
				&& ((this.getPlansatisfy() == castOther.getPlansatisfy())
						|| (this.getPlansatisfy() != null && castOther.getPlansatisfy() != null
								&& this.getPlansatisfy().equals(castOther.getPlansatisfy())))
				&& ((this.getResinvqty() == castOther.getResinvqty()) || (this.getResinvqty() != null
						&& castOther.getResinvqty() != null && this.getResinvqty().equals(castOther.getResinvqty())))
				&& ((this.getToolchecklevel() == castOther.getToolchecklevel())
						|| (this.getToolchecklevel() != null && castOther.getToolchecklevel() != null
								&& this.getToolchecklevel().equals(castOther.getToolchecklevel())))
				&& ((this.getToolcheckleveldesc() == castOther.getToolcheckleveldesc())
						|| (this.getToolcheckleveldesc() != null && castOther.getToolcheckleveldesc() != null
								&& this.getToolcheckleveldesc().equals(castOther.getToolcheckleveldesc())))
				&& ((this.getUniqueid2() == castOther.getUniqueid2()) || (this.getUniqueid2() != null
						&& castOther.getUniqueid2() != null && this.getUniqueid2().equals(castOther.getUniqueid2())))
				&& ((this.getEmployeeid() == castOther.getEmployeeid()) || (this.getEmployeeid() != null
						&& castOther.getEmployeeid() != null && this.getEmployeeid().equals(castOther.getEmployeeid())))
				&& ((this.getAssnunits() == castOther.getAssnunits()) || (this.getAssnunits() != null
						&& castOther.getAssnunits() != null && this.getAssnunits().equals(castOther.getAssnunits())))
				&& ((this.getAssnqty() == castOther.getAssnqty()) || (this.getAssnqty() != null
						&& castOther.getAssnqty() != null && this.getAssnqty().equals(castOther.getAssnqty())))
				&& ((this.getGiveemployeename() == castOther.getGiveemployeename())
						|| (this.getGiveemployeename() != null && castOther.getGiveemployeename() != null
								&& this.getGiveemployeename().equals(castOther.getGiveemployeename())))
				&& ((this.getAssnstate() == castOther.getAssnstate()) || (this.getAssnstate() != null
						&& castOther.getAssnstate() != null && this.getAssnstate().equals(castOther.getAssnstate())))
				&& ((this.getAssnstatedesc() == castOther.getAssnstatedesc())
						|| (this.getAssnstatedesc() != null && castOther.getAssnstatedesc() != null
								&& this.getAssnstatedesc().equals(castOther.getAssnstatedesc())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getToolchecker() == castOther.getToolchecker())
						|| (this.getToolchecker() != null && castOther.getToolchecker() != null
								&& this.getToolchecker().equals(castOther.getToolchecker())))
				&& ((this.getToolcheckername() == castOther.getToolcheckername())
						|| (this.getToolcheckername() != null && castOther.getToolcheckername() != null
								&& this.getToolcheckername().equals(castOther.getToolcheckername())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaskuid() == null ? 0 : this.getTaskuid().hashCode());
		result = 37 * result + (getResuid() == null ? 0 : this.getResuid().hashCode());
		result = 37 * result + (getAssntype() == null ? 0 : this.getAssntype().hashCode());
		result = 37 * result + (getResname() == null ? 0 : this.getResname().hashCode());
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getMachineNumber() == null ? 0 : this.getMachineNumber().hashCode());
		result = 37 * result + (getToolname() == null ? 0 : this.getToolname().hashCode());
		result = 37 * result + (getLeadTime() == null ? 0 : this.getLeadTime().hashCode());
		result = 37 * result + (getPartNumberType() == null ? 0 : this.getPartNumberType().hashCode());
		result = 37 * result + (getTooltype() == null ? 0 : this.getTooltype().hashCode());
		result = 37 * result + (getPartDescription() == null ? 0 : this.getPartDescription().hashCode());
		result = 37 * result + (getTaskwork() == null ? 0 : this.getTaskwork().hashCode());
		result = 37 * result + (getDispatchgrade() == null ? 0 : this.getDispatchgrade().hashCode());
		result = 37 * result + (getDispatchgradedesc() == null ? 0 : this.getDispatchgradedesc().hashCode());
		result = 37 * result + (getNumOperators() == null ? 0 : this.getNumOperators().hashCode());
		result = 37 * result + (getPlansatisfy() == null ? 0 : this.getPlansatisfy().hashCode());
		result = 37 * result + (getResinvqty() == null ? 0 : this.getResinvqty().hashCode());
		result = 37 * result + (getToolchecklevel() == null ? 0 : this.getToolchecklevel().hashCode());
		result = 37 * result + (getToolcheckleveldesc() == null ? 0 : this.getToolcheckleveldesc().hashCode());
		result = 37 * result + (getUniqueid2() == null ? 0 : this.getUniqueid2().hashCode());
		result = 37 * result + (getEmployeeid() == null ? 0 : this.getEmployeeid().hashCode());
		result = 37 * result + (getAssnunits() == null ? 0 : this.getAssnunits().hashCode());
		result = 37 * result + (getAssnqty() == null ? 0 : this.getAssnqty().hashCode());
		result = 37 * result + (getGiveemployeename() == null ? 0 : this.getGiveemployeename().hashCode());
		result = 37 * result + (getAssnstate() == null ? 0 : this.getAssnstate().hashCode());
		result = 37 * result + (getAssnstatedesc() == null ? 0 : this.getAssnstatedesc().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getToolchecker() == null ? 0 : this.getToolchecker().hashCode());
		result = 37 * result + (getToolcheckername() == null ? 0 : this.getToolcheckername().hashCode());
		return result;
	}

}
