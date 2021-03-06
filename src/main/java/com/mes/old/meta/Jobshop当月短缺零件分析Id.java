package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * Jobshop当月短缺零件分析Id generated by hbm2java
 */
public class Jobshop当月短缺零件分析Id implements java.io.Serializable {

	private String deptid;
	private String drawingid;
	private BigDecimal planqty1;
	private BigDecimal lackqty1;
	private BigDecimal planqty2;
	private BigDecimal lackqty2;
	private BigDecimal planqty3;
	private BigDecimal lackqty3;

	public Jobshop当月短缺零件分析Id() {
	}

	public Jobshop当月短缺零件分析Id(String deptid) {
		this.deptid = deptid;
	}

	public Jobshop当月短缺零件分析Id(String deptid, String drawingid, BigDecimal planqty1, BigDecimal lackqty1,
			BigDecimal planqty2, BigDecimal lackqty2, BigDecimal planqty3, BigDecimal lackqty3) {
		this.deptid = deptid;
		this.drawingid = drawingid;
		this.planqty1 = planqty1;
		this.lackqty1 = lackqty1;
		this.planqty2 = planqty2;
		this.lackqty2 = lackqty2;
		this.planqty3 = planqty3;
		this.lackqty3 = lackqty3;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public BigDecimal getPlanqty1() {
		return this.planqty1;
	}

	public void setPlanqty1(BigDecimal planqty1) {
		this.planqty1 = planqty1;
	}

	public BigDecimal getLackqty1() {
		return this.lackqty1;
	}

	public void setLackqty1(BigDecimal lackqty1) {
		this.lackqty1 = lackqty1;
	}

	public BigDecimal getPlanqty2() {
		return this.planqty2;
	}

	public void setPlanqty2(BigDecimal planqty2) {
		this.planqty2 = planqty2;
	}

	public BigDecimal getLackqty2() {
		return this.lackqty2;
	}

	public void setLackqty2(BigDecimal lackqty2) {
		this.lackqty2 = lackqty2;
	}

	public BigDecimal getPlanqty3() {
		return this.planqty3;
	}

	public void setPlanqty3(BigDecimal planqty3) {
		this.planqty3 = planqty3;
	}

	public BigDecimal getLackqty3() {
		return this.lackqty3;
	}

	public void setLackqty3(BigDecimal lackqty3) {
		this.lackqty3 = lackqty3;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Jobshop当月短缺零件分析Id))
			return false;
		Jobshop当月短缺零件分析Id castOther = (Jobshop当月短缺零件分析Id) other;

		return ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
				&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getPlanqty1() == castOther.getPlanqty1()) || (this.getPlanqty1() != null
						&& castOther.getPlanqty1() != null && this.getPlanqty1().equals(castOther.getPlanqty1())))
				&& ((this.getLackqty1() == castOther.getLackqty1()) || (this.getLackqty1() != null
						&& castOther.getLackqty1() != null && this.getLackqty1().equals(castOther.getLackqty1())))
				&& ((this.getPlanqty2() == castOther.getPlanqty2()) || (this.getPlanqty2() != null
						&& castOther.getPlanqty2() != null && this.getPlanqty2().equals(castOther.getPlanqty2())))
				&& ((this.getLackqty2() == castOther.getLackqty2()) || (this.getLackqty2() != null
						&& castOther.getLackqty2() != null && this.getLackqty2().equals(castOther.getLackqty2())))
				&& ((this.getPlanqty3() == castOther.getPlanqty3()) || (this.getPlanqty3() != null
						&& castOther.getPlanqty3() != null && this.getPlanqty3().equals(castOther.getPlanqty3())))
				&& ((this.getLackqty3() == castOther.getLackqty3()) || (this.getLackqty3() != null
						&& castOther.getLackqty3() != null && this.getLackqty3().equals(castOther.getLackqty3())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getPlanqty1() == null ? 0 : this.getPlanqty1().hashCode());
		result = 37 * result + (getLackqty1() == null ? 0 : this.getLackqty1().hashCode());
		result = 37 * result + (getPlanqty2() == null ? 0 : this.getPlanqty2().hashCode());
		result = 37 * result + (getLackqty2() == null ? 0 : this.getLackqty2().hashCode());
		result = 37 * result + (getPlanqty3() == null ? 0 : this.getPlanqty3().hashCode());
		result = 37 * result + (getLackqty3() == null ? 0 : this.getLackqty3().hashCode());
		return result;
	}

}
