package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * CvResTimeId generated by hbm2java
 */
public class CvResTimeId implements java.io.Serializable {

	private String resuid;
	private Date actualfinish;
	private BigDecimal taskTime;

	public CvResTimeId() {
	}

	public CvResTimeId(String resuid, Date actualfinish, BigDecimal taskTime) {
		this.resuid = resuid;
		this.actualfinish = actualfinish;
		this.taskTime = taskTime;
	}

	public String getResuid() {
		return this.resuid;
	}

	public void setResuid(String resuid) {
		this.resuid = resuid;
	}

	public Date getActualfinish() {
		return this.actualfinish;
	}

	public void setActualfinish(Date actualfinish) {
		this.actualfinish = actualfinish;
	}

	public BigDecimal getTaskTime() {
		return this.taskTime;
	}

	public void setTaskTime(BigDecimal taskTime) {
		this.taskTime = taskTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CvResTimeId))
			return false;
		CvResTimeId castOther = (CvResTimeId) other;

		return ((this.getResuid() == castOther.getResuid()) || (this.getResuid() != null
				&& castOther.getResuid() != null && this.getResuid().equals(castOther.getResuid())))
				&& ((this.getActualfinish() == castOther.getActualfinish())
						|| (this.getActualfinish() != null && castOther.getActualfinish() != null
								&& this.getActualfinish().equals(castOther.getActualfinish())))
				&& ((this.getTaskTime() == castOther.getTaskTime()) || (this.getTaskTime() != null
						&& castOther.getTaskTime() != null && this.getTaskTime().equals(castOther.getTaskTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getResuid() == null ? 0 : this.getResuid().hashCode());
		result = 37 * result + (getActualfinish() == null ? 0 : this.getActualfinish().hashCode());
		result = 37 * result + (getTaskTime() == null ? 0 : this.getTaskTime().hashCode());
		return result;
	}

}
