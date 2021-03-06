package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * ErpinvId generated by hbm2java
 */
public class ErpinvId implements java.io.Serializable {

	private String drawingid;
	private BigDecimal invqty;

	public ErpinvId() {
	}

	public ErpinvId(String drawingid, BigDecimal invqty) {
		this.drawingid = drawingid;
		this.invqty = invqty;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public BigDecimal getInvqty() {
		return this.invqty;
	}

	public void setInvqty(BigDecimal invqty) {
		this.invqty = invqty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ErpinvId))
			return false;
		ErpinvId castOther = (ErpinvId) other;

		return ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
				&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getInvqty() == castOther.getInvqty()) || (this.getInvqty() != null
						&& castOther.getInvqty() != null && this.getInvqty().equals(castOther.getInvqty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getInvqty() == null ? 0 : this.getInvqty().hashCode());
		return result;
	}

}
