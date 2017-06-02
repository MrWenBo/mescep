package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * TvTasktimeId generated by hbm2java
 */
public class TvTasktimeId implements java.io.Serializable {

	private String partNumber;
	private String batchnum;
	private String operationIddesc;
	private String taskname;
	private String opdesc;
	private BigDecimal opqty;
	private Date opdate;
	private String opdeptname;
	private String opemployeename;

	public TvTasktimeId() {
	}

	public TvTasktimeId(String partNumber, String batchnum, String operationIddesc, String taskname, String opdesc,
			BigDecimal opqty, Date opdate, String opdeptname, String opemployeename) {
		this.partNumber = partNumber;
		this.batchnum = batchnum;
		this.operationIddesc = operationIddesc;
		this.taskname = taskname;
		this.opdesc = opdesc;
		this.opqty = opqty;
		this.opdate = opdate;
		this.opdeptname = opdeptname;
		this.opemployeename = opemployeename;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
	}

	public String getOperationIddesc() {
		return this.operationIddesc;
	}

	public void setOperationIddesc(String operationIddesc) {
		this.operationIddesc = operationIddesc;
	}

	public String getTaskname() {
		return this.taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getOpdesc() {
		return this.opdesc;
	}

	public void setOpdesc(String opdesc) {
		this.opdesc = opdesc;
	}

	public BigDecimal getOpqty() {
		return this.opqty;
	}

	public void setOpqty(BigDecimal opqty) {
		this.opqty = opqty;
	}

	public Date getOpdate() {
		return this.opdate;
	}

	public void setOpdate(Date opdate) {
		this.opdate = opdate;
	}

	public String getOpdeptname() {
		return this.opdeptname;
	}

	public void setOpdeptname(String opdeptname) {
		this.opdeptname = opdeptname;
	}

	public String getOpemployeename() {
		return this.opemployeename;
	}

	public void setOpemployeename(String opemployeename) {
		this.opemployeename = opemployeename;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TvTasktimeId))
			return false;
		TvTasktimeId castOther = (TvTasktimeId) other;

		return ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
				&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getOperationIddesc() == castOther.getOperationIddesc())
						|| (this.getOperationIddesc() != null && castOther.getOperationIddesc() != null
								&& this.getOperationIddesc().equals(castOther.getOperationIddesc())))
				&& ((this.getTaskname() == castOther.getTaskname()) || (this.getTaskname() != null
						&& castOther.getTaskname() != null && this.getTaskname().equals(castOther.getTaskname())))
				&& ((this.getOpdesc() == castOther.getOpdesc()) || (this.getOpdesc() != null
						&& castOther.getOpdesc() != null && this.getOpdesc().equals(castOther.getOpdesc())))
				&& ((this.getOpqty() == castOther.getOpqty()) || (this.getOpqty() != null
						&& castOther.getOpqty() != null && this.getOpqty().equals(castOther.getOpqty())))
				&& ((this.getOpdate() == castOther.getOpdate()) || (this.getOpdate() != null
						&& castOther.getOpdate() != null && this.getOpdate().equals(castOther.getOpdate())))
				&& ((this.getOpdeptname() == castOther.getOpdeptname()) || (this.getOpdeptname() != null
						&& castOther.getOpdeptname() != null && this.getOpdeptname().equals(castOther.getOpdeptname())))
				&& ((this.getOpemployeename() == castOther.getOpemployeename())
						|| (this.getOpemployeename() != null && castOther.getOpemployeename() != null
								&& this.getOpemployeename().equals(castOther.getOpemployeename())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getOperationIddesc() == null ? 0 : this.getOperationIddesc().hashCode());
		result = 37 * result + (getTaskname() == null ? 0 : this.getTaskname().hashCode());
		result = 37 * result + (getOpdesc() == null ? 0 : this.getOpdesc().hashCode());
		result = 37 * result + (getOpqty() == null ? 0 : this.getOpqty().hashCode());
		result = 37 * result + (getOpdate() == null ? 0 : this.getOpdate().hashCode());
		result = 37 * result + (getOpdeptname() == null ? 0 : this.getOpdeptname().hashCode());
		result = 37 * result + (getOpemployeename() == null ? 0 : this.getOpemployeename().hashCode());
		return result;
	}

}