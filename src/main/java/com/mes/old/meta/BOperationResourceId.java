package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * BOperationResourceId generated by hbm2java
 */
public class BOperationResourceId implements java.io.Serializable {

	private BigDecimal opuid;
	private String machineNumber;

	public BOperationResourceId() {
	}

	public BOperationResourceId(BigDecimal opuid, String machineNumber) {
		this.opuid = opuid;
		this.machineNumber = machineNumber;
	}

	public BigDecimal getOpuid() {
		return this.opuid;
	}

	public void setOpuid(BigDecimal opuid) {
		this.opuid = opuid;
	}

	public String getMachineNumber() {
		return this.machineNumber;
	}

	public void setMachineNumber(String machineNumber) {
		this.machineNumber = machineNumber;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BOperationResourceId))
			return false;
		BOperationResourceId castOther = (BOperationResourceId) other;

		return ((this.getOpuid() == castOther.getOpuid()) || (this.getOpuid() != null && castOther.getOpuid() != null
				&& this.getOpuid().equals(castOther.getOpuid())))
				&& ((this.getMachineNumber() == castOther.getMachineNumber())
						|| (this.getMachineNumber() != null && castOther.getMachineNumber() != null
								&& this.getMachineNumber().equals(castOther.getMachineNumber())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getOpuid() == null ? 0 : this.getOpuid().hashCode());
		result = 37 * result + (getMachineNumber() == null ? 0 : this.getMachineNumber().hashCode());
		return result;
	}

}