package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * KVelocityInvId generated by hbm2java
 */
public class KVelocityInvId implements java.io.Serializable {

	private String invid;
	private Date day;

	public KVelocityInvId() {
	}

	public KVelocityInvId(String invid, Date day) {
		this.invid = invid;
		this.day = day;
	}

	public String getInvid() {
		return this.invid;
	}

	public void setInvid(String invid) {
		this.invid = invid;
	}

	public Date getDay() {
		return this.day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KVelocityInvId))
			return false;
		KVelocityInvId castOther = (KVelocityInvId) other;

		return ((this.getInvid() == castOther.getInvid()) || (this.getInvid() != null && castOther.getInvid() != null
				&& this.getInvid().equals(castOther.getInvid())))
				&& ((this.getDay() == castOther.getDay()) || (this.getDay() != null && castOther.getDay() != null
						&& this.getDay().equals(castOther.getDay())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getInvid() == null ? 0 : this.getInvid().hashCode());
		result = 37 * result + (getDay() == null ? 0 : this.getDay().hashCode());
		return result;
	}

}