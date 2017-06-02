package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * SfOperviewId generated by hbm2java
 */
public class SfOperviewId implements java.io.Serializable {

	private String uuid;
	private String opuid;
	private String consumedpart;
	private String viewname;

	public SfOperviewId() {
	}

	public SfOperviewId(String uuid) {
		this.uuid = uuid;
	}

	public SfOperviewId(String uuid, String opuid, String consumedpart, String viewname) {
		this.uuid = uuid;
		this.opuid = opuid;
		this.consumedpart = consumedpart;
		this.viewname = viewname;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getOpuid() {
		return this.opuid;
	}

	public void setOpuid(String opuid) {
		this.opuid = opuid;
	}

	public String getConsumedpart() {
		return this.consumedpart;
	}

	public void setConsumedpart(String consumedpart) {
		this.consumedpart = consumedpart;
	}

	public String getViewname() {
		return this.viewname;
	}

	public void setViewname(String viewname) {
		this.viewname = viewname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SfOperviewId))
			return false;
		SfOperviewId castOther = (SfOperviewId) other;

		return ((this.getUuid() == castOther.getUuid()) || (this.getUuid() != null && castOther.getUuid() != null
				&& this.getUuid().equals(castOther.getUuid())))
				&& ((this.getOpuid() == castOther.getOpuid()) || (this.getOpuid() != null
						&& castOther.getOpuid() != null && this.getOpuid().equals(castOther.getOpuid())))
				&& ((this.getConsumedpart() == castOther.getConsumedpart())
						|| (this.getConsumedpart() != null && castOther.getConsumedpart() != null
								&& this.getConsumedpart().equals(castOther.getConsumedpart())))
				&& ((this.getViewname() == castOther.getViewname()) || (this.getViewname() != null
						&& castOther.getViewname() != null && this.getViewname().equals(castOther.getViewname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUuid() == null ? 0 : this.getUuid().hashCode());
		result = 37 * result + (getOpuid() == null ? 0 : this.getOpuid().hashCode());
		result = 37 * result + (getConsumedpart() == null ? 0 : this.getConsumedpart().hashCode());
		result = 37 * result + (getViewname() == null ? 0 : this.getViewname().hashCode());
		return result;
	}

}
