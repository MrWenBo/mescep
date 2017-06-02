package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * PDataDetailId generated by hbm2java
 */
public class PDataDetailId implements java.io.Serializable {

	private String dataid;
	private int dataseq;

	public PDataDetailId() {
	}

	public PDataDetailId(String dataid, int dataseq) {
		this.dataid = dataid;
		this.dataseq = dataseq;
	}

	public String getDataid() {
		return this.dataid;
	}

	public void setDataid(String dataid) {
		this.dataid = dataid;
	}

	public int getDataseq() {
		return this.dataseq;
	}

	public void setDataseq(int dataseq) {
		this.dataseq = dataseq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PDataDetailId))
			return false;
		PDataDetailId castOther = (PDataDetailId) other;

		return ((this.getDataid() == castOther.getDataid()) || (this.getDataid() != null
				&& castOther.getDataid() != null && this.getDataid().equals(castOther.getDataid())))
				&& (this.getDataseq() == castOther.getDataseq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDataid() == null ? 0 : this.getDataid().hashCode());
		result = 37 * result + this.getDataseq();
		return result;
	}

}
