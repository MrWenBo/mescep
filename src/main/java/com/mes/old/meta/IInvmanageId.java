package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * IInvmanageId generated by hbm2java
 */
public class IInvmanageId implements java.io.Serializable {

	private String materialusn;
	private String warehouseid;
	private String binid;

	public IInvmanageId() {
	}

	public IInvmanageId(String materialusn, String warehouseid, String binid) {
		this.materialusn = materialusn;
		this.warehouseid = warehouseid;
		this.binid = binid;
	}

	public String getMaterialusn() {
		return this.materialusn;
	}

	public void setMaterialusn(String materialusn) {
		this.materialusn = materialusn;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public String getBinid() {
		return this.binid;
	}

	public void setBinid(String binid) {
		this.binid = binid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IInvmanageId))
			return false;
		IInvmanageId castOther = (IInvmanageId) other;

		return ((this.getMaterialusn() == castOther.getMaterialusn()) || (this.getMaterialusn() != null
				&& castOther.getMaterialusn() != null && this.getMaterialusn().equals(castOther.getMaterialusn())))
				&& ((this.getWarehouseid() == castOther.getWarehouseid())
						|| (this.getWarehouseid() != null && castOther.getWarehouseid() != null
								&& this.getWarehouseid().equals(castOther.getWarehouseid())))
				&& ((this.getBinid() == castOther.getBinid()) || (this.getBinid() != null
						&& castOther.getBinid() != null && this.getBinid().equals(castOther.getBinid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMaterialusn() == null ? 0 : this.getMaterialusn().hashCode());
		result = 37 * result + (getWarehouseid() == null ? 0 : this.getWarehouseid().hashCode());
		result = 37 * result + (getBinid() == null ? 0 : this.getBinid().hashCode());
		return result;
	}

}
