package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * LagdaysSumZongjianId generated by hbm2java
 */
public class LagdaysSumZongjianId implements java.io.Serializable {

	private BigDecimal 总项数;
	private BigDecimal 总件数;

	public LagdaysSumZongjianId() {
	}

	public LagdaysSumZongjianId(BigDecimal 总项数, BigDecimal 总件数) {
		this.总项数 = 总项数;
		this.总件数 = 总件数;
	}

	public BigDecimal get总项数() {
		return this.总项数;
	}

	public void set总项数(BigDecimal 总项数) {
		this.总项数 = 总项数;
	}

	public BigDecimal get总件数() {
		return this.总件数;
	}

	public void set总件数(BigDecimal 总件数) {
		this.总件数 = 总件数;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LagdaysSumZongjianId))
			return false;
		LagdaysSumZongjianId castOther = (LagdaysSumZongjianId) other;

		return ((this.get总项数() == castOther.get总项数())
				|| (this.get总项数() != null && castOther.get总项数() != null && this.get总项数().equals(castOther.get总项数())))
				&& ((this.get总件数() == castOther.get总件数()) || (this.get总件数() != null && castOther.get总件数() != null
						&& this.get总件数().equals(castOther.get总件数())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get总项数() == null ? 0 : this.get总项数().hashCode());
		result = 37 * result + (get总件数() == null ? 0 : this.get总件数().hashCode());
		return result;
	}

}
