package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * ErpPartId generated by hbm2java
 */
public class ErpPartId implements java.io.Serializable {

	private String bh;
	private String mc;

	public ErpPartId() {
	}

	public ErpPartId(String bh, String mc) {
		this.bh = bh;
		this.mc = mc;
	}

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getMc() {
		return this.mc;
	}

	public void setMc(String mc) {
		this.mc = mc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ErpPartId))
			return false;
		ErpPartId castOther = (ErpPartId) other;

		return ((this.getBh() == castOther.getBh())
				|| (this.getBh() != null && castOther.getBh() != null && this.getBh().equals(castOther.getBh())))
				&& ((this.getMc() == castOther.getMc()) || (this.getMc() != null && castOther.getMc() != null
						&& this.getMc().equals(castOther.getMc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBh() == null ? 0 : this.getBh().hashCode());
		result = 37 * result + (getMc() == null ? 0 : this.getMc().hashCode());
		return result;
	}

}
