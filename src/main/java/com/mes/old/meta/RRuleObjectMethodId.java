package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * RRuleObjectMethodId generated by hbm2java
 */
public class RRuleObjectMethodId implements java.io.Serializable {

	private String objectuid;
	private String methoduid;

	public RRuleObjectMethodId() {
	}

	public RRuleObjectMethodId(String objectuid, String methoduid) {
		this.objectuid = objectuid;
		this.methoduid = methoduid;
	}

	public String getObjectuid() {
		return this.objectuid;
	}

	public void setObjectuid(String objectuid) {
		this.objectuid = objectuid;
	}

	public String getMethoduid() {
		return this.methoduid;
	}

	public void setMethoduid(String methoduid) {
		this.methoduid = methoduid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RRuleObjectMethodId))
			return false;
		RRuleObjectMethodId castOther = (RRuleObjectMethodId) other;

		return ((this.getObjectuid() == castOther.getObjectuid()) || (this.getObjectuid() != null
				&& castOther.getObjectuid() != null && this.getObjectuid().equals(castOther.getObjectuid())))
				&& ((this.getMethoduid() == castOther.getMethoduid()) || (this.getMethoduid() != null
						&& castOther.getMethoduid() != null && this.getMethoduid().equals(castOther.getMethoduid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getObjectuid() == null ? 0 : this.getObjectuid().hashCode());
		result = 37 * result + (getMethoduid() == null ? 0 : this.getMethoduid().hashCode());
		return result;
	}

}