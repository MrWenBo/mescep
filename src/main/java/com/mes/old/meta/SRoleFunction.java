package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * SRoleFunction generated by hbm2java
 */
public class SRoleFunction implements java.io.Serializable {

	private String rolfuncid;
	private String roleid;
	private String functionunitid;
	private String notes;
	private Byte isDefault;

	public SRoleFunction() {
	}

	public SRoleFunction(String rolfuncid, String roleid, String functionunitid) {
		this.rolfuncid = rolfuncid;
		this.roleid = roleid;
		this.functionunitid = functionunitid;
	}

	public SRoleFunction(String rolfuncid, String roleid, String functionunitid, String notes, Byte isDefault) {
		this.rolfuncid = rolfuncid;
		this.roleid = roleid;
		this.functionunitid = functionunitid;
		this.notes = notes;
		this.isDefault = isDefault;
	}

	public String getRolfuncid() {
		return this.rolfuncid;
	}

	public void setRolfuncid(String rolfuncid) {
		this.rolfuncid = rolfuncid;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getFunctionunitid() {
		return this.functionunitid;
	}

	public void setFunctionunitid(String functionunitid) {
		this.functionunitid = functionunitid;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Byte getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Byte isDefault) {
		this.isDefault = isDefault;
	}

}
