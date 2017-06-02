package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * KWipAnalyseId generated by hbm2java
 */
public class KWipAnalyseId implements java.io.Serializable {

	private String deptid;
	private String model;
	private Long wipqty;
	private Long cpart;
	private Long invqty;

	public KWipAnalyseId() {
	}

	public KWipAnalyseId(String deptid, String model, Long wipqty, Long cpart, Long invqty) {
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

	public Long getWipqty() {
		return this.wipqty;
	}

	public void setWipqty(Long wipqty) {
		this.wipqty = wipqty;
	}

	public Long getCpart() {
		return this.cpart;
	}

	public void setCpart(Long cpart) {
		this.cpart = cpart;
	}

	public Long getInvqty() {
		return this.invqty;
	}

	public void setInvqty(Long invqty) {
		this.invqty = invqty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KWipAnalyseId))
			return false;
		KWipAnalyseId castOther = (KWipAnalyseId) other;

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
