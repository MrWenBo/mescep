package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * TTaskPartId generated by hbm2java
 */
public class TTaskPartId implements java.io.Serializable {

	private String taskuid;
	private String partNumber;

	public TTaskPartId() {
	}

	public TTaskPartId(String taskuid, String partNumber) {
		this.taskuid = taskuid;
		this.partNumber = partNumber;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TTaskPartId))
			return false;
		TTaskPartId castOther = (TTaskPartId) other;

		return ((this.getTaskuid() == castOther.getTaskuid()) || (this.getTaskuid() != null
				&& castOther.getTaskuid() != null && this.getTaskuid().equals(castOther.getTaskuid())))
				&& ((this.getPartNumber() == castOther.getPartNumber())
						|| (this.getPartNumber() != null && castOther.getPartNumber() != null
								&& this.getPartNumber().equals(castOther.getPartNumber())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaskuid() == null ? 0 : this.getTaskuid().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		return result;
	}

}
