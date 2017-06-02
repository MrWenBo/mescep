package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * Jobshop制造周期Id generated by hbm2java
 */
public class Jobshop制造周期Id implements java.io.Serializable {

	private String deptid;
	private String deptname;
	private String partNumber;
	private String partName;
	private BigDecimal avgcycle;

	public Jobshop制造周期Id() {
	}

	public Jobshop制造周期Id(String deptid, String partNumber) {
		this.deptid = deptid;
		this.partNumber = partNumber;
	}

	public Jobshop制造周期Id(String deptid, String deptname, String partNumber, String partName, BigDecimal avgcycle) {
		this.deptid = deptid;
		this.deptname = deptname;
		this.partNumber = partNumber;
		this.partName = partName;
		this.avgcycle = avgcycle;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public BigDecimal getAvgcycle() {
		return this.avgcycle;
	}

	public void setAvgcycle(BigDecimal avgcycle) {
		this.avgcycle = avgcycle;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Jobshop制造周期Id))
			return false;
		Jobshop制造周期Id castOther = (Jobshop制造周期Id) other;

		return ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
				&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getDeptname() == castOther.getDeptname()) || (this.getDeptname() != null
						&& castOther.getDeptname() != null && this.getDeptname().equals(castOther.getDeptname())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& ((this.getPartName() == castOther.getPartName()) || (this.getPartName() != null
						&& castOther.getPartName() != null && this.getPartName().equals(castOther.getPartName())))
				&& ((this.getAvgcycle() == castOther.getAvgcycle()) || (this.getAvgcycle() != null
						&& castOther.getAvgcycle() != null && this.getAvgcycle().equals(castOther.getAvgcycle())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getDeptname() == null ? 0 : this.getDeptname().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getPartName() == null ? 0 : this.getPartName().hashCode());
		result = 37 * result + (getAvgcycle() == null ? 0 : this.getAvgcycle().hashCode());
		return result;
	}

}
