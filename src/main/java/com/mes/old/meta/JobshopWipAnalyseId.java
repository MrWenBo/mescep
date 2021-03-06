package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * JobshopWipAnalyseId generated by hbm2java
 */
public class JobshopWipAnalyseId implements java.io.Serializable {

	private String deptid;
	private String model;
	private String wipqty;
	private String cpart;
	private String invqty;

	public JobshopWipAnalyseId() {
	}

	public JobshopWipAnalyseId(String deptid) {
		this.deptid = deptid;
	}

	public JobshopWipAnalyseId(String deptid, String model, String wipqty, String cpart, String invqty) {
		this.deptid = deptid;
		this.model = model;
		this.wipqty = wipqty;
		this.cpart = cpart;
		this.invqty = invqty;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getWipqty() {
		return this.wipqty;
	}

	public void setWipqty(String wipqty) {
		this.wipqty = wipqty;
	}

	public String getCpart() {
		return this.cpart;
	}

	public void setCpart(String cpart) {
		this.cpart = cpart;
	}

	public String getInvqty() {
		return this.invqty;
	}

	public void setInvqty(String invqty) {
		this.invqty = invqty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof JobshopWipAnalyseId))
			return false;
		JobshopWipAnalyseId castOther = (JobshopWipAnalyseId) other;

		return ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
				&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getModel() == castOther.getModel()) || (this.getModel() != null
						&& castOther.getModel() != null && this.getModel().equals(castOther.getModel())))
				&& ((this.getWipqty() == castOther.getWipqty()) || (this.getWipqty() != null
						&& castOther.getWipqty() != null && this.getWipqty().equals(castOther.getWipqty())))
				&& ((this.getCpart() == castOther.getCpart()) || (this.getCpart() != null
						&& castOther.getCpart() != null && this.getCpart().equals(castOther.getCpart())))
				&& ((this.getInvqty() == castOther.getInvqty()) || (this.getInvqty() != null
						&& castOther.getInvqty() != null && this.getInvqty().equals(castOther.getInvqty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getModel() == null ? 0 : this.getModel().hashCode());
		result = 37 * result + (getWipqty() == null ? 0 : this.getWipqty().hashCode());
		result = 37 * result + (getCpart() == null ? 0 : this.getCpart().hashCode());
		result = 37 * result + (getInvqty() == null ? 0 : this.getInvqty().hashCode());
		return result;
	}

}
