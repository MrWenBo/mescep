package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * Jobshop一次交检合格率Id generated by hbm2java
 */
public class Jobshop一次交检合格率Id implements java.io.Serializable {

	private String deptid;
	private String checktime;
	private BigDecimal qtyrate;

	public Jobshop一次交检合格率Id() {
	}

	public Jobshop一次交检合格率Id(String deptid) {
		this.deptid = deptid;
	}

	public Jobshop一次交检合格率Id(String deptid, String checktime, BigDecimal qtyrate) {
		this.deptid = deptid;
		this.checktime = checktime;
		this.qtyrate = qtyrate;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getChecktime() {
		return this.checktime;
	}

	public void setChecktime(String checktime) {
		this.checktime = checktime;
	}

	public BigDecimal getQtyrate() {
		return this.qtyrate;
	}

	public void setQtyrate(BigDecimal qtyrate) {
		this.qtyrate = qtyrate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Jobshop一次交检合格率Id))
			return false;
		Jobshop一次交检合格率Id castOther = (Jobshop一次交检合格率Id) other;

		return ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
				&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getChecktime() == castOther.getChecktime()) || (this.getChecktime() != null
						&& castOther.getChecktime() != null && this.getChecktime().equals(castOther.getChecktime())))
				&& ((this.getQtyrate() == castOther.getQtyrate()) || (this.getQtyrate() != null
						&& castOther.getQtyrate() != null && this.getQtyrate().equals(castOther.getQtyrate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getChecktime() == null ? 0 : this.getChecktime().hashCode());
		result = 37 * result + (getQtyrate() == null ? 0 : this.getQtyrate().hashCode());
		return result;
	}

}
