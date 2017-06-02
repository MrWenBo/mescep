package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * KWipCountId generated by hbm2java
 */
public class KWipCountId implements java.io.Serializable {

	private String deptid;
	private Long wipqty;
	private Long cpart;

	public KWipCountId() {
	}

	public KWipCountId(String deptid, Long wipqty, Long cpart) {
		this.deptid = deptid;
		this.wipqty = wipqty;
		this.cpart = cpart;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KWipCountId))
			return false;
		KWipCountId castOther = (KWipCountId) other;

		return ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
				&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getWipqty() == castOther.getWipqty()) || (this.getWipqty() != null
						&& castOther.getWipqty() != null && this.getWipqty().equals(castOther.getWipqty())))
				&& ((this.getCpart() == castOther.getCpart()) || (this.getCpart() != null
						&& castOther.getCpart() != null && this.getCpart().equals(castOther.getCpart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getWipqty() == null ? 0 : this.getWipqty().hashCode());
		result = 37 * result + (getCpart() == null ? 0 : this.getCpart().hashCode());
		return result;
	}

}
