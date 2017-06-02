package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * AResourceDataDetailId generated by hbm2java
 */
public class AResourceDataDetailId implements java.io.Serializable {

	private String dataId;
	private int dataSeq;

	public AResourceDataDetailId() {
	}

	public AResourceDataDetailId(String dataId, int dataSeq) {
		this.dataId = dataId;
		this.dataSeq = dataSeq;
	}

	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public int getDataSeq() {
		return this.dataSeq;
	}

	public void setDataSeq(int dataSeq) {
		this.dataSeq = dataSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AResourceDataDetailId))
			return false;
		AResourceDataDetailId castOther = (AResourceDataDetailId) other;

		return ((this.getDataId() == castOther.getDataId()) || (this.getDataId() != null
				&& castOther.getDataId() != null && this.getDataId().equals(castOther.getDataId())))
				&& (this.getDataSeq() == castOther.getDataSeq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDataId() == null ? 0 : this.getDataId().hashCode());
		result = 37 * result + this.getDataSeq();
		return result;
	}

}