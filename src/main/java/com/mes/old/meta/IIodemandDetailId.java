package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * IIodemandDetailId generated by hbm2java
 */
public class IIodemandDetailId implements java.io.Serializable {

	private String invdemandid;
	private long seq;

	public IIodemandDetailId() {
	}

	public IIodemandDetailId(String invdemandid, long seq) {
		this.invdemandid = invdemandid;
		this.seq = seq;
	}

	public String getInvdemandid() {
		return this.invdemandid;
	}

	public void setInvdemandid(String invdemandid) {
		this.invdemandid = invdemandid;
	}

	public long getSeq() {
		return this.seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IIodemandDetailId))
			return false;
		IIodemandDetailId castOther = (IIodemandDetailId) other;

		return ((this.getInvdemandid() == castOther.getInvdemandid()) || (this.getInvdemandid() != null
				&& castOther.getInvdemandid() != null && this.getInvdemandid().equals(castOther.getInvdemandid())))
				&& (this.getSeq() == castOther.getSeq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getInvdemandid() == null ? 0 : this.getInvdemandid().hashCode());
		result = 37 * result + (int) this.getSeq();
		return result;
	}

}