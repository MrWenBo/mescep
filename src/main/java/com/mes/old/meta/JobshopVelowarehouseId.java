package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * JobshopVelowarehouseId generated by hbm2java
 */
public class JobshopVelowarehouseId implements java.io.Serializable {

	private String warehouseid;
	private String velowarehouse;

	public JobshopVelowarehouseId() {
	}

	public JobshopVelowarehouseId(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public JobshopVelowarehouseId(String warehouseid, String velowarehouse) {
		this.warehouseid = warehouseid;
		this.velowarehouse = velowarehouse;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public String getVelowarehouse() {
		return this.velowarehouse;
	}

	public void setVelowarehouse(String velowarehouse) {
		this.velowarehouse = velowarehouse;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof JobshopVelowarehouseId))
			return false;
		JobshopVelowarehouseId castOther = (JobshopVelowarehouseId) other;

		return ((this.getWarehouseid() == castOther.getWarehouseid()) || (this.getWarehouseid() != null
				&& castOther.getWarehouseid() != null && this.getWarehouseid().equals(castOther.getWarehouseid())))
				&& ((this.getVelowarehouse() == castOther.getVelowarehouse())
						|| (this.getVelowarehouse() != null && castOther.getVelowarehouse() != null
								&& this.getVelowarehouse().equals(castOther.getVelowarehouse())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getWarehouseid() == null ? 0 : this.getWarehouseid().hashCode());
		result = 37 * result + (getVelowarehouse() == null ? 0 : this.getVelowarehouse().hashCode());
		return result;
	}

}
