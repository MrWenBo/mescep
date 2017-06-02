package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * MAssortnumId generated by hbm2java
 */
public class MAssortnumId implements java.io.Serializable {

	private String materialusn;
	private String assortnum;

	public MAssortnumId() {
	}

	public MAssortnumId(String materialusn, String assortnum) {
		this.materialusn = materialusn;
		this.assortnum = assortnum;
	}

	public String getMaterialusn() {
		return this.materialusn;
	}

	public void setMaterialusn(String materialusn) {
		this.materialusn = materialusn;
	}

	public String getAssortnum() {
		return this.assortnum;
	}

	public void setAssortnum(String assortnum) {
		this.assortnum = assortnum;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MAssortnumId))
			return false;
		MAssortnumId castOther = (MAssortnumId) other;

		return ((this.getMaterialusn() == castOther.getMaterialusn()) || (this.getMaterialusn() != null
				&& castOther.getMaterialusn() != null && this.getMaterialusn().equals(castOther.getMaterialusn())))
				&& ((this.getAssortnum() == castOther.getAssortnum()) || (this.getAssortnum() != null
						&& castOther.getAssortnum() != null && this.getAssortnum().equals(castOther.getAssortnum())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMaterialusn() == null ? 0 : this.getMaterialusn().hashCode());
		result = 37 * result + (getAssortnum() == null ? 0 : this.getAssortnum().hashCode());
		return result;
	}

}