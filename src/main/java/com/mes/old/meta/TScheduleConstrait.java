package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * TScheduleConstrait generated by hbm2java
 */
public class TScheduleConstrait implements java.io.Serializable {

	private TScheduleConstraitId id;
	private String uniqueid;
	private String taskuid;
	private BigDecimal startOperationid;
	private BigDecimal startOperationiddesc;
	private String endOperationid;
	private String endOperationiddesc;
	private BigDecimal transferCount;
	private Long planqty;
	private Long completeqty;
	private Date latefinish;

	public TScheduleConstrait() {
	}

	public TScheduleConstrait(TScheduleConstraitId id) {
		this.id = id;
	}

	public TScheduleConstrait(TScheduleConstraitId id, String uniqueid, String taskuid, BigDecimal startOperationid,
			BigDecimal startOperationiddesc, String endOperationid, String endOperationiddesc, BigDecimal transferCount,
			Long planqty, Long completeqty, Date latefinish) {
		this.id = id;
		this.uniqueid = uniqueid;
		this.taskuid = taskuid;
		this.startOperationid = startOperationid;
		this.startOperationiddesc = startOperationiddesc;
		this.endOperationid = endOperationid;
		this.endOperationiddesc = endOperationiddesc;
		this.transferCount = transferCount;
		this.planqty = planqty;
		this.completeqty = completeqty;
		this.latefinish = latefinish;
	}

	public TScheduleConstraitId getId() {
		return this.id;
	}

	public void setId(TScheduleConstraitId id) {
		this.id = id;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public BigDecimal getStartOperationid() {
		return this.startOperationid;
	}

	public void setStartOperationid(BigDecimal startOperationid) {
		this.startOperationid = startOperationid;
	}

	public BigDecimal getStartOperationiddesc() {
		return this.startOperationiddesc;
	}

	public void setStartOperationiddesc(BigDecimal startOperationiddesc) {
		this.startOperationiddesc = startOperationiddesc;
	}

	public String getEndOperationid() {
		return this.endOperationid;
	}

	public void setEndOperationid(String endOperationid) {
		this.endOperationid = endOperationid;
	}

	public String getEndOperationiddesc() {
		return this.endOperationiddesc;
	}

	public void setEndOperationiddesc(String endOperationiddesc) {
		this.endOperationiddesc = endOperationiddesc;
	}

	public BigDecimal getTransferCount() {
		return this.transferCount;
	}

	public void setTransferCount(BigDecimal transferCount) {
		this.transferCount = transferCount;
	}

	public Long getPlanqty() {
		return this.planqty;
	}

	public void setPlanqty(Long planqty) {
		this.planqty = planqty;
	}

	public Long getCompleteqty() {
		return this.completeqty;
	}

	public void setCompleteqty(Long completeqty) {
		this.completeqty = completeqty;
	}

	public Date getLatefinish() {
		return this.latefinish;
	}

	public void setLatefinish(Date latefinish) {
		this.latefinish = latefinish;
	}

}