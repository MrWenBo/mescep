package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * KManuCycleId generated by hbm2java
 */
public class KManuCycleId implements java.io.Serializable {

	private String deptid;
	private String partNumber;
	private BigDecimal avgcycle;
	private Date kday;

	public KManuCycleId() {
	}

	public KManuCycleId(String deptid, String partNumber, BigDecimal avgcycle, Date kday) {
		this.deptid = deptid;
		this.partNumber = partNumber;
		this.avgcycle = avgcycle;
		this.kday = kday;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public BigDecimal getAvgcycle() {
		return this.avgcycle;
	}

	public void setAvgcycle(BigDecimal avgcycle) {
		this.avgcycle = avgcycle;
	}

	public Date getKday() {
		return this.kday;
	}

	public void setKday(Date kday) {
		this.kday = kday;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KManuCycleId))
			return false;
		KManuCycleId castOther = (KManuCycleId) other;

		return ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
				&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& ((this.getAvgcycle() == castOther.getAvgcycle()) || (this.getAvgcycle() != null
						&& castOther.getAvgcycle() != null && this.getAvgcycle().equals(castOther.getAvgcycle())))
				&& ((this.getKday() == castOther.getKday()) || (this.getKday() != null && castOther.getKday() != null
						&& this.getKday().equals(castOther.getKday())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getAvgcycle() == null ? 0 : this.getAvgcycle().hashCode());
		result = 37 * result + (getKday() == null ? 0 : this.getKday().hashCode());
		return result;
	}

}
