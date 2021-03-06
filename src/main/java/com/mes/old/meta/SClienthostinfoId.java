package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * SClienthostinfoId generated by hbm2java
 */
public class SClienthostinfoId implements java.io.Serializable {

	private String uniqueid;
	private String hostIp;
	private String operationId;
	private String deptid;
	private String creator;
	private Date createtime;
	private String notes;

	public SClienthostinfoId() {
	}

	public SClienthostinfoId(String uniqueid, String hostIp, String operationId, String deptid, String creator,
			Date createtime, String notes) {
		this.uniqueid = uniqueid;
		this.hostIp = hostIp;
		this.operationId = operationId;
		this.deptid = deptid;
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

	public String getHostIp() {
		return this.hostIp;
	}

	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}

	public String getOperationId() {
		return this.operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
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
		if (!(other instanceof SClienthostinfoId))
			return false;
		SClienthostinfoId castOther = (SClienthostinfoId) other;

		return ((this.getUniqueid() == castOther.getUniqueid()) || (this.getUniqueid() != null
				&& castOther.getUniqueid() != null && this.getUniqueid().equals(castOther.getUniqueid())))
				&& ((this.getHostIp() == castOther.getHostIp()) || (this.getHostIp() != null
						&& castOther.getHostIp() != null && this.getHostIp().equals(castOther.getHostIp())))
				&& ((this.getOperationId() == castOther.getOperationId())
						|| (this.getOperationId() != null && castOther.getOperationId() != null
								&& this.getOperationId().equals(castOther.getOperationId())))
				&& ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
						&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
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
		result = 37 * result + (getHostIp() == null ? 0 : this.getHostIp().hashCode());
		result = 37 * result + (getOperationId() == null ? 0 : this.getOperationId().hashCode());
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		return result;
	}

}
