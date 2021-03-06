package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * CvTaskTimeId generated by hbm2java
 */
public class CvTaskTimeId implements java.io.Serializable {

	private String taskuid;
	private Date actualfinish;
	private BigDecimal taskTime;

	public CvTaskTimeId() {
	}

	public CvTaskTimeId(String taskuid, Date actualfinish, BigDecimal taskTime) {
		this.taskuid = taskuid;
		this.actualfinish = actualfinish;
		this.taskTime = taskTime;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
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
		if (!(other instanceof CvTaskTimeId))
			return false;
		CvTaskTimeId castOther = (CvTaskTimeId) other;

		return ((this.getTaskuid() == castOther.getTaskuid()) || (this.getTaskuid() != null
				&& castOther.getTaskuid() != null && this.getTaskuid().equals(castOther.getTaskuid())))
				&& ((this.getActualfinish() == castOther.getActualfinish())
						|| (this.getActualfinish() != null && castOther.getActualfinish() != null
								&& this.getActualfinish().equals(castOther.getActualfinish())))
				&& ((this.getTaskTime() == castOther.getTaskTime()) || (this.getTaskTime() != null
						&& castOther.getTaskTime() != null && this.getTaskTime().equals(castOther.getTaskTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaskuid() == null ? 0 : this.getTaskuid().hashCode());
		result = 37 * result + (getActualfinish() == null ? 0 : this.getActualfinish().hashCode());
		result = 37 * result + (getTaskTime() == null ? 0 : this.getTaskTime().hashCode());
		return result;
	}

}
