package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * SfEcoDetailId generated by hbm2java
 */
public class SfEcoDetailId implements java.io.Serializable {

	private String changeuid;
	private String seq;

	public SfEcoDetailId() {
	}

	public SfEcoDetailId(String changeuid, String seq) {
		this.changeuid = changeuid;
		this.seq = seq;
	}

	public String getChangeuid() {
		return this.changeuid;
	}

	public void setChangeuid(String changeuid) {
		this.changeuid = changeuid;
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SfEcoDetailId))
			return false;
		SfEcoDetailId castOther = (SfEcoDetailId) other;

		return ((this.getChangeuid() == castOther.getChangeuid()) || (this.getChangeuid() != null
				&& castOther.getChangeuid() != null && this.getChangeuid().equals(castOther.getChangeuid())))
				&& ((this.getSeq() == castOther.getSeq()) || (this.getSeq() != null && castOther.getSeq() != null
						&& this.getSeq().equals(castOther.getSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getChangeuid() == null ? 0 : this.getChangeuid().hashCode());
		result = 37 * result + (getSeq() == null ? 0 : this.getSeq().hashCode());
		return result;
	}

}
