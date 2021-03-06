package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * IWarehousePrepareId generated by hbm2java
 */
public class IWarehousePrepareId implements java.io.Serializable {

	private String warehouseid;
	private String employeeid;

	public IWarehousePrepareId() {
	}

	public IWarehousePrepareId(String warehouseid, String employeeid) {
		this.warehouseid = warehouseid;
		this.employeeid = employeeid;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public String getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IWarehousePrepareId))
			return false;
		IWarehousePrepareId castOther = (IWarehousePrepareId) other;

		return ((this.getWarehouseid() == castOther.getWarehouseid()) || (this.getWarehouseid() != null
				&& castOther.getWarehouseid() != null && this.getWarehouseid().equals(castOther.getWarehouseid())))
				&& ((this.getEmployeeid() == castOther.getEmployeeid())
						|| (this.getEmployeeid() != null && castOther.getEmployeeid() != null
								&& this.getEmployeeid().equals(castOther.getEmployeeid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getWarehouseid() == null ? 0 : this.getWarehouseid().hashCode());
		result = 37 * result + (getEmployeeid() == null ? 0 : this.getEmployeeid().hashCode());
		return result;
	}

}
