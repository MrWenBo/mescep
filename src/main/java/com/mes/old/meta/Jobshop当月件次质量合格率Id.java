package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * Jobshop当月件次质量合格率Id generated by hbm2java
 */
public class Jobshop当月件次质量合格率Id implements java.io.Serializable {

	private String deptid;
	private BigDecimal submitqty;
	private BigDecimal defectqty;
	private BigDecimal qualityrate;

	public Jobshop当月件次质量合格率Id() {
	}

	public Jobshop当月件次质量合格率Id(String deptid) {
		this.deptid = deptid;
	}

	public Jobshop当月件次质量合格率Id(String deptid, BigDecimal submitqty, BigDecimal defectqty, BigDecimal qualityrate) {
		this.deptid = deptid;
		this.submitqty = submitqty;
		this.defectqty = defectqty;
		this.qualityrate = qualityrate;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public BigDecimal getSubmitqty() {
		return this.submitqty;
	}

	public void setSubmitqty(BigDecimal submitqty) {
		this.submitqty = submitqty;
	}

	public BigDecimal getDefectqty() {
		return this.defectqty;
	}

	public void setDefectqty(BigDecimal defectqty) {
		this.defectqty = defectqty;
	}

	public BigDecimal getQualityrate() {
		return this.qualityrate;
	}

	public void setQualityrate(BigDecimal qualityrate) {
		this.qualityrate = qualityrate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Jobshop当月件次质量合格率Id))
			return false;
		Jobshop当月件次质量合格率Id castOther = (Jobshop当月件次质量合格率Id) other;

		return ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
				&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getSubmitqty() == castOther.getSubmitqty()) || (this.getSubmitqty() != null
						&& castOther.getSubmitqty() != null && this.getSubmitqty().equals(castOther.getSubmitqty())))
				&& ((this.getDefectqty() == castOther.getDefectqty()) || (this.getDefectqty() != null
						&& castOther.getDefectqty() != null && this.getDefectqty().equals(castOther.getDefectqty())))
				&& ((this.getQualityrate() == castOther.getQualityrate())
						|| (this.getQualityrate() != null && castOther.getQualityrate() != null
								&& this.getQualityrate().equals(castOther.getQualityrate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getSubmitqty() == null ? 0 : this.getSubmitqty().hashCode());
		result = 37 * result + (getDefectqty() == null ? 0 : this.getDefectqty().hashCode());
		result = 37 * result + (getQualityrate() == null ? 0 : this.getQualityrate().hashCode());
		return result;
	}

}
