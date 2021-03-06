package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * TMrpItemId generated by hbm2java
 */
public class TMrpItemId implements java.io.Serializable {

	private String mrpuid;
	private String partNumber;

	public TMrpItemId() {
	}

	public TMrpItemId(String mrpuid, String partNumber) {
		this.mrpuid = mrpuid;
		this.partNumber = partNumber;
	}

	public String getMrpuid() {
		return this.mrpuid;
	}

	public void setMrpuid(String mrpuid) {
		this.mrpuid = mrpuid;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TMrpItemId))
			return false;
		TMrpItemId castOther = (TMrpItemId) other;

		return ((this.getMrpuid() == castOther.getMrpuid()) || (this.getMrpuid() != null
				&& castOther.getMrpuid() != null && this.getMrpuid().equals(castOther.getMrpuid())))
				&& ((this.getPartNumber() == castOther.getPartNumber())
						|| (this.getPartNumber() != null && castOther.getPartNumber() != null
								&& this.getPartNumber().equals(castOther.getPartNumber())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMrpuid() == null ? 0 : this.getMrpuid().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		return result;
	}

}
