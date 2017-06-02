package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * IvWarehouseDeptId generated by hbm2java
 */
public class IvWarehouseDeptId implements java.io.Serializable {

	private String uniqueid;
	private String warehouseid;
	private String deptid;
	private String businessType;
	private String warehousename;
	private String deptname;
	private String businessTypedesc;

	public IvWarehouseDeptId() {
	}

	public IvWarehouseDeptId(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public IvWarehouseDeptId(String uniqueid, String warehouseid, String deptid, String businessType,
			String warehousename, String deptname, String businessTypedesc) {
		this.uniqueid = uniqueid;
		this.warehouseid = warehouseid;
		this.deptid = deptid;
		this.businessType = businessType;
		this.warehousename = warehousename;
		this.deptname = deptname;
		this.businessTypedesc = businessTypedesc;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getWarehousename() {
		return this.warehousename;
	}

	public void setWarehousename(String warehousename) {
		this.warehousename = warehousename;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getBusinessTypedesc() {
		return this.businessTypedesc;
	}

	public void setBusinessTypedesc(String businessTypedesc) {
		this.businessTypedesc = businessTypedesc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IvWarehouseDeptId))
			return false;
		IvWarehouseDeptId castOther = (IvWarehouseDeptId) other;

		return ((this.getUniqueid() == castOther.getUniqueid()) || (this.getUniqueid() != null
				&& castOther.getUniqueid() != null && this.getUniqueid().equals(castOther.getUniqueid())))
				&& ((this.getWarehouseid() == castOther.getWarehouseid())
						|| (this.getWarehouseid() != null && castOther.getWarehouseid() != null
								&& this.getWarehouseid().equals(castOther.getWarehouseid())))
				&& ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
						&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getBusinessType() == castOther.getBusinessType())
						|| (this.getBusinessType() != null && castOther.getBusinessType() != null
								&& this.getBusinessType().equals(castOther.getBusinessType())))
				&& ((this.getWarehousename() == castOther.getWarehousename())
						|| (this.getWarehousename() != null && castOther.getWarehousename() != null
								&& this.getWarehousename().equals(castOther.getWarehousename())))
				&& ((this.getDeptname() == castOther.getDeptname()) || (this.getDeptname() != null
						&& castOther.getDeptname() != null && this.getDeptname().equals(castOther.getDeptname())))
				&& ((this.getBusinessTypedesc() == castOther.getBusinessTypedesc())
						|| (this.getBusinessTypedesc() != null && castOther.getBusinessTypedesc() != null
								&& this.getBusinessTypedesc().equals(castOther.getBusinessTypedesc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUniqueid() == null ? 0 : this.getUniqueid().hashCode());
		result = 37 * result + (getWarehouseid() == null ? 0 : this.getWarehouseid().hashCode());
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getBusinessType() == null ? 0 : this.getBusinessType().hashCode());
		result = 37 * result + (getWarehousename() == null ? 0 : this.getWarehousename().hashCode());
		result = 37 * result + (getDeptname() == null ? 0 : this.getDeptname().hashCode());
		result = 37 * result + (getBusinessTypedesc() == null ? 0 : this.getBusinessTypedesc().hashCode());
		return result;
	}

}