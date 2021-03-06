package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * J4WorkflowBillId generated by hbm2java
 */
public class J4WorkflowBillId implements java.io.Serializable {

	private String uniqueid;
	private String billuid;
	private String processname;
	private String creator;
	private Date createtime;
	private String processcnname;
	private String processPriority;
	private String billsort;

	public J4WorkflowBillId() {
	}

	public J4WorkflowBillId(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public J4WorkflowBillId(String uniqueid, String billuid, String processname, String creator, Date createtime,
			String processcnname, String processPriority, String billsort) {
		this.uniqueid = uniqueid;
		this.billuid = billuid;
		this.processname = processname;
		this.creator = creator;
		this.createtime = createtime;
		this.processcnname = processcnname;
		this.processPriority = processPriority;
		this.billsort = billsort;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getBilluid() {
		return this.billuid;
	}

	public void setBilluid(String billuid) {
		this.billuid = billuid;
	}

	public String getProcessname() {
		return this.processname;
	}

	public void setProcessname(String processname) {
		this.processname = processname;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getProcesscnname() {
		return this.processcnname;
	}

	public void setProcesscnname(String processcnname) {
		this.processcnname = processcnname;
	}

	public String getProcessPriority() {
		return this.processPriority;
	}

	public void setProcessPriority(String processPriority) {
		this.processPriority = processPriority;
	}

	public String getBillsort() {
		return this.billsort;
	}

	public void setBillsort(String billsort) {
		this.billsort = billsort;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof J4WorkflowBillId))
			return false;
		J4WorkflowBillId castOther = (J4WorkflowBillId) other;

		return ((this.getUniqueid() == castOther.getUniqueid()) || (this.getUniqueid() != null
				&& castOther.getUniqueid() != null && this.getUniqueid().equals(castOther.getUniqueid())))
				&& ((this.getBilluid() == castOther.getBilluid()) || (this.getBilluid() != null
						&& castOther.getBilluid() != null && this.getBilluid().equals(castOther.getBilluid())))
				&& ((this.getProcessname() == castOther.getProcessname())
						|| (this.getProcessname() != null && castOther.getProcessname() != null
								&& this.getProcessname().equals(castOther.getProcessname())))
				&& ((this.getCreator() == castOther.getCreator()) || (this.getCreator() != null
						&& castOther.getCreator() != null && this.getCreator().equals(castOther.getCreator())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getProcesscnname() == castOther.getProcesscnname())
						|| (this.getProcesscnname() != null && castOther.getProcesscnname() != null
								&& this.getProcesscnname().equals(castOther.getProcesscnname())))
				&& ((this.getProcessPriority() == castOther.getProcessPriority())
						|| (this.getProcessPriority() != null && castOther.getProcessPriority() != null
								&& this.getProcessPriority().equals(castOther.getProcessPriority())))
				&& ((this.getBillsort() == castOther.getBillsort()) || (this.getBillsort() != null
						&& castOther.getBillsort() != null && this.getBillsort().equals(castOther.getBillsort())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUniqueid() == null ? 0 : this.getUniqueid().hashCode());
		result = 37 * result + (getBilluid() == null ? 0 : this.getBilluid().hashCode());
		result = 37 * result + (getProcessname() == null ? 0 : this.getProcessname().hashCode());
		result = 37 * result + (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getProcesscnname() == null ? 0 : this.getProcesscnname().hashCode());
		result = 37 * result + (getProcessPriority() == null ? 0 : this.getProcessPriority().hashCode());
		result = 37 * result + (getBillsort() == null ? 0 : this.getBillsort().hashCode());
		return result;
	}

}
