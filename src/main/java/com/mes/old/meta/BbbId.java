package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * BbbId generated by hbm2java
 */
public class BbbId implements java.io.Serializable {

	private String parentUid;
	private String childUid;
	private Long childQty;
	private String childDept;
	private Long isok;

	public BbbId() {
	}

	public BbbId(String parentUid, String childUid, Long childQty, String childDept, Long isok) {
		this.parentUid = parentUid;
		this.childUid = childUid;
		this.childQty = childQty;
		this.childDept = childDept;
		this.isok = isok;
	}

	public String getParentUid() {
		return this.parentUid;
	}

	public void setParentUid(String parentUid) {
		this.parentUid = parentUid;
	}

	public String getChildUid() {
		return this.childUid;
	}

	public void setChildUid(String childUid) {
		this.childUid = childUid;
	}

	public Long getChildQty() {
		return this.childQty;
	}

	public void setChildQty(Long childQty) {
		this.childQty = childQty;
	}

	public String getChildDept() {
		return this.childDept;
	}

	public void setChildDept(String childDept) {
		this.childDept = childDept;
	}

	public Long getIsok() {
		return this.isok;
	}

	public void setIsok(Long isok) {
		this.isok = isok;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BbbId))
			return false;
		BbbId castOther = (BbbId) other;

		return ((this.getParentUid() == castOther.getParentUid()) || (this.getParentUid() != null
				&& castOther.getParentUid() != null && this.getParentUid().equals(castOther.getParentUid())))
				&& ((this.getChildUid() == castOther.getChildUid()) || (this.getChildUid() != null
						&& castOther.getChildUid() != null && this.getChildUid().equals(castOther.getChildUid())))
				&& ((this.getChildQty() == castOther.getChildQty()) || (this.getChildQty() != null
						&& castOther.getChildQty() != null && this.getChildQty().equals(castOther.getChildQty())))
				&& ((this.getChildDept() == castOther.getChildDept()) || (this.getChildDept() != null
						&& castOther.getChildDept() != null && this.getChildDept().equals(castOther.getChildDept())))
				&& ((this.getIsok() == castOther.getIsok()) || (this.getIsok() != null && castOther.getIsok() != null
						&& this.getIsok().equals(castOther.getIsok())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getParentUid() == null ? 0 : this.getParentUid().hashCode());
		result = 37 * result + (getChildUid() == null ? 0 : this.getChildUid().hashCode());
		result = 37 * result + (getChildQty() == null ? 0 : this.getChildQty().hashCode());
		result = 37 * result + (getChildDept() == null ? 0 : this.getChildDept().hashCode());
		result = 37 * result + (getIsok() == null ? 0 : this.getIsok().hashCode());
		return result;
	}

}