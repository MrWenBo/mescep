package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * TTaskEcoId generated by hbm2java
 */
public class TTaskEcoId implements java.io.Serializable {

	private String taskuid;
	private String changeuid;

	public TTaskEcoId() {
	}

	public TTaskEcoId(String taskuid, String changeuid) {
		this.taskuid = taskuid;
		this.changeuid = changeuid;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public String getChangeuid() {
		return this.changeuid;
	}

	public void setChangeuid(String changeuid) {
		this.changeuid = changeuid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TTaskEcoId))
			return false;
		TTaskEcoId castOther = (TTaskEcoId) other;

		return ((this.getTaskuid() == castOther.getTaskuid()) || (this.getTaskuid() != null
				&& castOther.getTaskuid() != null && this.getTaskuid().equals(castOther.getTaskuid())))
				&& ((this.getChangeuid() == castOther.getChangeuid()) || (this.getChangeuid() != null
						&& castOther.getChangeuid() != null && this.getChangeuid().equals(castOther.getChangeuid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaskuid() == null ? 0 : this.getTaskuid().hashCode());
		result = 37 * result + (getChangeuid() == null ? 0 : this.getChangeuid().hashCode());
		return result;
	}

}