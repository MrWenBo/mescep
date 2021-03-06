package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * KEmployeeDefinitionId generated by hbm2java
 */
public class KEmployeeDefinitionId implements java.io.Serializable {

	private String employeeid;
	private String kvalue;
	private String ktype;

	public KEmployeeDefinitionId() {
	}

	public KEmployeeDefinitionId(String employeeid, String kvalue, String ktype) {
		this.employeeid = employeeid;
		this.kvalue = kvalue;
		this.ktype = ktype;
	}

	public String getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getKvalue() {
		return this.kvalue;
	}

	public void setKvalue(String kvalue) {
		this.kvalue = kvalue;
	}

	public String getKtype() {
		return this.ktype;
	}

	public void setKtype(String ktype) {
		this.ktype = ktype;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KEmployeeDefinitionId))
			return false;
		KEmployeeDefinitionId castOther = (KEmployeeDefinitionId) other;

		return ((this.getEmployeeid() == castOther.getEmployeeid()) || (this.getEmployeeid() != null
				&& castOther.getEmployeeid() != null && this.getEmployeeid().equals(castOther.getEmployeeid())))
				&& ((this.getKvalue() == castOther.getKvalue()) || (this.getKvalue() != null
						&& castOther.getKvalue() != null && this.getKvalue().equals(castOther.getKvalue())))
				&& ((this.getKtype() == castOther.getKtype()) || (this.getKtype() != null
						&& castOther.getKtype() != null && this.getKtype().equals(castOther.getKtype())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEmployeeid() == null ? 0 : this.getEmployeeid().hashCode());
		result = 37 * result + (getKvalue() == null ? 0 : this.getKvalue().hashCode());
		result = 37 * result + (getKtype() == null ? 0 : this.getKtype().hashCode());
		return result;
	}

}
