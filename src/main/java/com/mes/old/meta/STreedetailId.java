package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * STreedetailId generated by hbm2java
 */
public class STreedetailId implements java.io.Serializable {

	private BigDecimal treeid;
	private String itemname;

	public STreedetailId() {
	}

	public STreedetailId(BigDecimal treeid, String itemname) {
		this.treeid = treeid;
		this.itemname = itemname;
	}

	public BigDecimal getTreeid() {
		return this.treeid;
	}

	public void setTreeid(BigDecimal treeid) {
		this.treeid = treeid;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof STreedetailId))
			return false;
		STreedetailId castOther = (STreedetailId) other;

		return ((this.getTreeid() == castOther.getTreeid()) || (this.getTreeid() != null
				&& castOther.getTreeid() != null && this.getTreeid().equals(castOther.getTreeid())))
				&& ((this.getItemname() == castOther.getItemname()) || (this.getItemname() != null
						&& castOther.getItemname() != null && this.getItemname().equals(castOther.getItemname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTreeid() == null ? 0 : this.getTreeid().hashCode());
		result = 37 * result + (getItemname() == null ? 0 : this.getItemname().hashCode());
		return result;
	}

}
