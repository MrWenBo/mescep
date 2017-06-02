package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * SRoleMenuId generated by hbm2java
 */
public class SRoleMenuId implements java.io.Serializable {

	private String roleid;
	private String company;

	public SRoleMenuId() {
	}

	public SRoleMenuId(String roleid, String company) {
		this.roleid = roleid;
		this.company = company;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SRoleMenuId))
			return false;
		SRoleMenuId castOther = (SRoleMenuId) other;

		return ((this.getRoleid() == castOther.getRoleid()) || (this.getRoleid() != null
				&& castOther.getRoleid() != null && this.getRoleid().equals(castOther.getRoleid())))
				&& ((this.getCompany() == castOther.getCompany()) || (this.getCompany() != null
						&& castOther.getCompany() != null && this.getCompany().equals(castOther.getCompany())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRoleid() == null ? 0 : this.getRoleid().hashCode());
		result = 37 * result + (getCompany() == null ? 0 : this.getCompany().hashCode());
		return result;
	}

}