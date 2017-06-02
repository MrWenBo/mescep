package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * MRejectdetailId generated by hbm2java
 */
public class MRejectdetailId implements java.io.Serializable {

	private String rejectuid;
	private BigDecimal seq;

	public MRejectdetailId() {
	}

	public MRejectdetailId(String rejectuid, BigDecimal seq) {
		this.rejectuid = rejectuid;
		this.seq = seq;
	}

	public String getRejectuid() {
		return this.rejectuid;
	}

	public void setRejectuid(String rejectuid) {
		this.rejectuid = rejectuid;
	}

	public BigDecimal getSeq() {
		return this.seq;
	}

	public void setSeq(BigDecimal seq) {
		this.seq = seq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MRejectdetailId))
			return false;
		MRejectdetailId castOther = (MRejectdetailId) other;

		return ((this.getRejectuid() == castOther.getRejectuid()) || (this.getRejectuid() != null
				&& castOther.getRejectuid() != null && this.getRejectuid().equals(castOther.getRejectuid())))
				&& ((this.getSeq() == castOther.getSeq()) || (this.getSeq() != null && castOther.getSeq() != null
						&& this.getSeq().equals(castOther.getSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRejectuid() == null ? 0 : this.getRejectuid().hashCode());
		result = 37 * result + (getSeq() == null ? 0 : this.getSeq().hashCode());
		return result;
	}

}