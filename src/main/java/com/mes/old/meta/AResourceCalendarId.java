package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * AResourceCalendarId generated by hbm2java
 */
public class AResourceCalendarId implements java.io.Serializable {

	private String warehouseid;
	private String binid;
	private String materialusn;
	private String relationId;

	public AResourceCalendarId() {
	}

	public AResourceCalendarId(String warehouseid, String binid, String materialusn, String relationId) {
		this.warehouseid = warehouseid;
		this.binid = binid;
		this.materialusn = materialusn;
		this.relationId = relationId;
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

	public String getMaterialusn() {
		return this.materialusn;
	}

	public void setMaterialusn(String materialusn) {
		this.materialusn = materialusn;
	}

	public String getRelationId() {
		return this.relationId;
	}

	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AResourceCalendarId))
			return false;
		AResourceCalendarId castOther = (AResourceCalendarId) other;

		return ((this.getWarehouseid() == castOther.getWarehouseid()) || (this.getWarehouseid() != null
				&& castOther.getWarehouseid() != null && this.getWarehouseid().equals(castOther.getWarehouseid())))
				&& ((this.getBinid() == castOther.getBinid()) || (this.getBinid() != null
						&& castOther.getBinid() != null && this.getBinid().equals(castOther.getBinid())))
				&& ((this.getMaterialusn() == castOther.getMaterialusn())
						|| (this.getMaterialusn() != null && castOther.getMaterialusn() != null
								&& this.getMaterialusn().equals(castOther.getMaterialusn())))
				&& ((this.getRelationId() == castOther.getRelationId())
						|| (this.getRelationId() != null && castOther.getRelationId() != null
								&& this.getRelationId().equals(castOther.getRelationId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getWarehouseid() == null ? 0 : this.getWarehouseid().hashCode());
		result = 37 * result + (getBinid() == null ? 0 : this.getBinid().hashCode());
		result = 37 * result + (getMaterialusn() == null ? 0 : this.getMaterialusn().hashCode());
		result = 37 * result + (getRelationId() == null ? 0 : this.getRelationId().hashCode());
		return result;
	}

}
