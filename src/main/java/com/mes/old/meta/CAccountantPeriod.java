package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CAccountantPeriod generated by hbm2java
 */
public class CAccountantPeriod implements java.io.Serializable {

	private String accountantPeriodId;
	private String accountantPeriodName;
	private Long isBasicAccountantPeriod;
	private String superAccountantPeriodId;
	private Date startDate;
	private Date endDate;
	private Long isCalculate;
	private String notes;
	private Date createTime;
	private String creator;
	private Long accountantPeriodType;
	private Set CRtActivities = new HashSet(0);
	private Set CRtAllocateSteps = new HashSet(0);
	private Set CRtCostDrivers = new HashSet(0);
	private Set CRtResources = new HashSet(0);
	private Set CRtResourceAccounts = new HashSet(0);
	private Set CRtCostObjects = new HashSet(0);

	public CAccountantPeriod() {
	}

	public CAccountantPeriod(String accountantPeriodId) {
		this.accountantPeriodId = accountantPeriodId;
	}

	public CAccountantPeriod(String accountantPeriodId, String accountantPeriodName, Long isBasicAccountantPeriod,
			String superAccountantPeriodId, Date startDate, Date endDate, Long isCalculate, String notes,
			Date createTime, String creator, Long accountantPeriodType, Set CRtActivities, Set CRtAllocateSteps,
			Set CRtCostDrivers, Set CRtResources, Set CRtResourceAccounts, Set CRtCostObjects) {
		this.accountantPeriodId = accountantPeriodId;
		this.accountantPeriodName = accountantPeriodName;
		this.isBasicAccountantPeriod = isBasicAccountantPeriod;
		this.superAccountantPeriodId = superAccountantPeriodId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isCalculate = isCalculate;
		this.notes = notes;
		this.createTime = createTime;
		this.creator = creator;
		this.accountantPeriodType = accountantPeriodType;
		this.CRtActivities = CRtActivities;
		this.CRtAllocateSteps = CRtAllocateSteps;
		this.CRtCostDrivers = CRtCostDrivers;
		this.CRtResources = CRtResources;
		this.CRtResourceAccounts = CRtResourceAccounts;
		this.CRtCostObjects = CRtCostObjects;
	}

	public String getAccountantPeriodId() {
		return this.accountantPeriodId;
	}

	public void setAccountantPeriodId(String accountantPeriodId) {
		this.accountantPeriodId = accountantPeriodId;
	}

	public String getAccountantPeriodName() {
		return this.accountantPeriodName;
	}

	public void setAccountantPeriodName(String accountantPeriodName) {
		this.accountantPeriodName = accountantPeriodName;
	}

	public Long getIsBasicAccountantPeriod() {
		return this.isBasicAccountantPeriod;
	}

	public void setIsBasicAccountantPeriod(Long isBasicAccountantPeriod) {
		this.isBasicAccountantPeriod = isBasicAccountantPeriod;
	}

	public String getSuperAccountantPeriodId() {
		return this.superAccountantPeriodId;
	}

	public void setSuperAccountantPeriodId(String superAccountantPeriodId) {
		this.superAccountantPeriodId = superAccountantPeriodId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getIsCalculate() {
		return this.isCalculate;
	}

	public void setIsCalculate(Long isCalculate) {
		this.isCalculate = isCalculate;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public Long getAccountantPeriodType() {
		return this.accountantPeriodType;
	}

	public void setAccountantPeriodType(Long accountantPeriodType) {
		this.accountantPeriodType = accountantPeriodType;
	}

	public Set getCRtActivities() {
		return this.CRtActivities;
	}

	public void setCRtActivities(Set CRtActivities) {
		this.CRtActivities = CRtActivities;
	}

	public Set getCRtAllocateSteps() {
		return this.CRtAllocateSteps;
	}

	public void setCRtAllocateSteps(Set CRtAllocateSteps) {
		this.CRtAllocateSteps = CRtAllocateSteps;
	}

	public Set getCRtCostDrivers() {
		return this.CRtCostDrivers;
	}

	public void setCRtCostDrivers(Set CRtCostDrivers) {
		this.CRtCostDrivers = CRtCostDrivers;
	}

	public Set getCRtResources() {
		return this.CRtResources;
	}

	public void setCRtResources(Set CRtResources) {
		this.CRtResources = CRtResources;
	}

	public Set getCRtResourceAccounts() {
		return this.CRtResourceAccounts;
	}

	public void setCRtResourceAccounts(Set CRtResourceAccounts) {
		this.CRtResourceAccounts = CRtResourceAccounts;
	}

	public Set getCRtCostObjects() {
		return this.CRtCostObjects;
	}

	public void setCRtCostObjects(Set CRtCostObjects) {
		this.CRtCostObjects = CRtCostObjects;
	}

}
