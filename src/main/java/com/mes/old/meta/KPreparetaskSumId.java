package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * KPreparetaskSumId generated by hbm2java
 */
public class KPreparetaskSumId implements java.io.Serializable {

	private String deptid;
	private Date day;
	private String prepareTaskType;
	private BigDecimal sendPrepareCount;
	private BigDecimal waitPrepareCount;
	private BigDecimal finishPrepareCount;
	private BigDecimal waitPrepareDelay;
	private Date createtime;

	public KPreparetaskSumId() {
	}

	public KPreparetaskSumId(String deptid, Date day, String prepareTaskType, BigDecimal sendPrepareCount,
			BigDecimal waitPrepareCount, BigDecimal finishPrepareCount, BigDecimal waitPrepareDelay, Date createtime) {
		this.deptid = deptid;
		this.day = day;
		this.prepareTaskType = prepareTaskType;
		this.sendPrepareCount = sendPrepareCount;
		this.waitPrepareCount = waitPrepareCount;
		this.finishPrepareCount = finishPrepareCount;
		this.waitPrepareDelay = waitPrepareDelay;
		this.createtime = createtime;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public Date getDay() {
		return this.day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public String getPrepareTaskType() {
		return this.prepareTaskType;
	}

	public void setPrepareTaskType(String prepareTaskType) {
		this.prepareTaskType = prepareTaskType;
	}

	public BigDecimal getSendPrepareCount() {
		return this.sendPrepareCount;
	}

	public void setSendPrepareCount(BigDecimal sendPrepareCount) {
		this.sendPrepareCount = sendPrepareCount;
	}

	public BigDecimal getWaitPrepareCount() {
		return this.waitPrepareCount;
	}

	public void setWaitPrepareCount(BigDecimal waitPrepareCount) {
		this.waitPrepareCount = waitPrepareCount;
	}

	public BigDecimal getFinishPrepareCount() {
		return this.finishPrepareCount;
	}

	public void setFinishPrepareCount(BigDecimal finishPrepareCount) {
		this.finishPrepareCount = finishPrepareCount;
	}

	public BigDecimal getWaitPrepareDelay() {
		return this.waitPrepareDelay;
	}

	public void setWaitPrepareDelay(BigDecimal waitPrepareDelay) {
		this.waitPrepareDelay = waitPrepareDelay;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KPreparetaskSumId))
			return false;
		KPreparetaskSumId castOther = (KPreparetaskSumId) other;

		return ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
				&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getDay() == castOther.getDay()) || (this.getDay() != null && castOther.getDay() != null
						&& this.getDay().equals(castOther.getDay())))
				&& ((this.getPrepareTaskType() == castOther.getPrepareTaskType())
						|| (this.getPrepareTaskType() != null && castOther.getPrepareTaskType() != null
								&& this.getPrepareTaskType().equals(castOther.getPrepareTaskType())))
				&& ((this.getSendPrepareCount() == castOther.getSendPrepareCount())
						|| (this.getSendPrepareCount() != null && castOther.getSendPrepareCount() != null
								&& this.getSendPrepareCount().equals(castOther.getSendPrepareCount())))
				&& ((this.getWaitPrepareCount() == castOther.getWaitPrepareCount())
						|| (this.getWaitPrepareCount() != null && castOther.getWaitPrepareCount() != null
								&& this.getWaitPrepareCount().equals(castOther.getWaitPrepareCount())))
				&& ((this.getFinishPrepareCount() == castOther.getFinishPrepareCount())
						|| (this.getFinishPrepareCount() != null && castOther.getFinishPrepareCount() != null
								&& this.getFinishPrepareCount().equals(castOther.getFinishPrepareCount())))
				&& ((this.getWaitPrepareDelay() == castOther.getWaitPrepareDelay())
						|| (this.getWaitPrepareDelay() != null && castOther.getWaitPrepareDelay() != null
								&& this.getWaitPrepareDelay().equals(castOther.getWaitPrepareDelay())))
				&& ((this.getCreatetime() == castOther.getCreatetime())
						|| (this.getCreatetime() != null && castOther.getCreatetime() != null
								&& this.getCreatetime().equals(castOther.getCreatetime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getDay() == null ? 0 : this.getDay().hashCode());
		result = 37 * result + (getPrepareTaskType() == null ? 0 : this.getPrepareTaskType().hashCode());
		result = 37 * result + (getSendPrepareCount() == null ? 0 : this.getSendPrepareCount().hashCode());
		result = 37 * result + (getWaitPrepareCount() == null ? 0 : this.getWaitPrepareCount().hashCode());
		result = 37 * result + (getFinishPrepareCount() == null ? 0 : this.getFinishPrepareCount().hashCode());
		result = 37 * result + (getWaitPrepareDelay() == null ? 0 : this.getWaitPrepareDelay().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		return result;
	}

}
