package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * CActivityAccount generated by hbm2java
 */
public class CActivityAccount implements java.io.Serializable {

	private String activityAccountId;
	private String superActivityAccountId;
	private String activityAccountName;
	private String costCenterId;
	private Date createTime;
	private String creator;
	private String costDriverId;
	private String notes;
	private Long isBasicActivityAccount;

	public CActivityAccount() {
	}

	public CActivityAccount(String activityAccountId) {
		this.activityAccountId = activityAccountId;
	}

	public CActivityAccount(String activityAccountId, String superActivityAccountId, String activityAccountName,
			String costCenterId, Date createTime, String creator, String costDriverId, String notes,
			Long isBasicActivityAccount) {
		this.activityAccountId = activityAccountId;
		this.superActivityAccountId = superActivityAccountId;
		this.activityAccountName = activityAccountName;
		this.costCenterId = costCenterId;
		this.createTime = createTime;
		this.creator = creator;
		this.costDriverId = costDriverId;
		this.notes = notes;
		this.isBasicActivityAccount = isBasicActivityAccount;
	}

	public String getActivityAccountId() {
		return this.activityAccountId;
	}

	public void setActivityAccountId(String activityAccountId) {
		this.activityAccountId = activityAccountId;
	}

	public String getSuperActivityAccountId() {
		return this.superActivityAccountId;
	}

	public void setSuperActivityAccountId(String superActivityAccountId) {
		this.superActivityAccountId = superActivityAccountId;
	}

	public String getActivityAccountName() {
		return this.activityAccountName;
	}

	public void setActivityAccountName(String activityAccountName) {
		this.activityAccountName = activityAccountName;
	}

	public String getCostCenterId() {
		return this.costCenterId;
	}

	public void setCostCenterId(String costCenterId) {
		this.costCenterId = costCenterId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCostDriverId() {
		return this.costDriverId;
	}

	public void setCostDriverId(String costDriverId) {
		this.costDriverId = costDriverId;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Long getIsBasicActivityAccount() {
		return this.isBasicActivityAccount;
	}

	public void setIsBasicActivityAccount(Long isBasicActivityAccount) {
		this.isBasicActivityAccount = isBasicActivityAccount;
	}

}
