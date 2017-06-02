package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * KReportRoleId generated by hbm2java
 */
public class KReportRoleId implements java.io.Serializable {

	private String roleid;
	private String reportid;

	public KReportRoleId() {
	}

	public KReportRoleId(String roleid, String reportid) {
		this.roleid = roleid;
		this.reportid = reportid;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getReportid() {
		return this.reportid;
	}

	public void setReportid(String reportid) {
		this.reportid = reportid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KReportRoleId))
			return false;
		KReportRoleId castOther = (KReportRoleId) other;

		return ((this.getRoleid() == castOther.getRoleid()) || (this.getRoleid() != null
				&& castOther.getRoleid() != null && this.getRoleid().equals(castOther.getRoleid())))
				&& ((this.getReportid() == castOther.getReportid()) || (this.getReportid() != null
						&& castOther.getReportid() != null && this.getReportid().equals(castOther.getReportid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRoleid() == null ? 0 : this.getRoleid().hashCode());
		result = 37 * result + (getReportid() == null ? 0 : this.getReportid().hashCode());
		return result;
	}

}
