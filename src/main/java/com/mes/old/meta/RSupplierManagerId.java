package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * RSupplierManagerId generated by hbm2java
 */
public class RSupplierManagerId implements java.io.Serializable {

	private String uniqueid;
	private String suppleruid;
	private String manager;
	private String dutyType;
	private String creator;
	private Date createtime;
	private String notes;

	public RSupplierManagerId() {
	}

	public RSupplierManagerId(String uniqueid, String suppleruid, String manager, String dutyType, String creator,
			Date createtime, String notes) {
		this.uniqueid = uniqueid;
		this.suppleruid = suppleruid;
		this.manager = manager;
		this.dutyType = dutyType;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getSuppleruid() {
		return this.suppleruid;
	}

	public void setSuppleruid(String suppleruid) {
		this.suppleruid = suppleruid;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getDutyType() {
		return this.dutyType;
	}

	public void setDutyType(String dutyType) {
		this.dutyType = dutyType;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RSupplierManagerId))
			return false;
		RSupplierManagerId castOther = (RSupplierManagerId) other;

		return ((this.getUniqueid() == castOther.getUniqueid()) || (this.getUniqueid() != null
				&& castOther.getUniqueid() != null && this.getUniqueid().equals(castOther.getUniqueid())))
				&& ((this.getSuppleruid() == castOther.getSuppleruid()) || (this.getSuppleruid() != null
						&& castOther.getSuppleruid() != null && this.getSuppleruid().equals(castOther.getSuppleruid())))
				&& ((this.getManager() == castOther.getManager()) || (this.getManager() != null
						&& castOther.getManager() != null && this.getManager().equals(castOther.getManager())))
				&& ((this.getDutyType() == castOther.getDutyType()) || (this.getDutyType() != null
						&& castOther.getDutyType() != null && this.getDutyType().equals(castOther.getDutyType())))
				&& ((this.getCreator() == castOther.getCreator()) || (this.getCreator() != null
						&& castOther.getCreator() != null && this.getCreator().equals(castOther.getCreator())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUniqueid() == null ? 0 : this.getUniqueid().hashCode());
		result = 37 * result + (getSuppleruid() == null ? 0 : this.getSuppleruid().hashCode());
		result = 37 * result + (getManager() == null ? 0 : this.getManager().hashCode());
		result = 37 * result + (getDutyType() == null ? 0 : this.getDutyType().hashCode());
		result = 37 * result + (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		return result;
	}

}