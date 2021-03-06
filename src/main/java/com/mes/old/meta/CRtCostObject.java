package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * CRtCostObject generated by hbm2java
 */
public class CRtCostObject implements java.io.Serializable {

	private String uniqueid;
	private CAccountantPeriod CAccountantPeriod;
	private CCostCenter CCostCenter;
	private String batchnum;
	private String costObjectId;
	private Long costObjectType;
	private BigDecimal costObjectQuantity;
	private String leaderid;
	private Date completeDate;
	private BigDecimal actualCost;
	private BigDecimal operationAddUpCost;
	private String notes;
	private String costObjectName;
	private BigDecimal allocateCost;
	private BigDecimal unallocateCost;
	private BigDecimal planCost;
	private String partNumber;
	private String deptid;
	private String costObjectAccountId4;
	private String model;
	private String parentuid;
	private Long wasterQty;
	private Long wasterCost;
	private Long relationResourceType;
	private String relationResourceId;
	private Long isAllocated;
	private String costDriverId;
	private Long operationId;

	public CRtCostObject() {
	}

	public CRtCostObject(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public CRtCostObject(String uniqueid, CAccountantPeriod CAccountantPeriod, CCostCenter CCostCenter, String batchnum,
			String costObjectId, Long costObjectType, BigDecimal costObjectQuantity, String leaderid, Date completeDate,
			BigDecimal actualCost, BigDecimal operationAddUpCost, String notes, String costObjectName,
			BigDecimal allocateCost, BigDecimal unallocateCost, BigDecimal planCost, String partNumber, String deptid,
			String costObjectAccountId4, String model, String parentuid, Long wasterQty, Long wasterCost,
			Long relationResourceType, String relationResourceId, Long isAllocated, String costDriverId,
			Long operationId) {
		this.uniqueid = uniqueid;
		this.CAccountantPeriod = CAccountantPeriod;
		this.CCostCenter = CCostCenter;
		this.batchnum = batchnum;
		this.costObjectId = costObjectId;
		this.costObjectType = costObjectType;
		this.costObjectQuantity = costObjectQuantity;
		this.leaderid = leaderid;
		this.completeDate = completeDate;
		this.actualCost = actualCost;
		this.operationAddUpCost = operationAddUpCost;
		this.notes = notes;
		this.costObjectName = costObjectName;
		this.allocateCost = allocateCost;
		this.unallocateCost = unallocateCost;
		this.planCost = planCost;
		this.partNumber = partNumber;
		this.deptid = deptid;
		this.costObjectAccountId4 = costObjectAccountId4;
		this.model = model;
		this.parentuid = parentuid;
		this.wasterQty = wasterQty;
		this.wasterCost = wasterCost;
		this.relationResourceType = relationResourceType;
		this.relationResourceId = relationResourceId;
		this.isAllocated = isAllocated;
		this.costDriverId = costDriverId;
		this.operationId = operationId;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public CAccountantPeriod getCAccountantPeriod() {
		return this.CAccountantPeriod;
	}

	public void setCAccountantPeriod(CAccountantPeriod CAccountantPeriod) {
		this.CAccountantPeriod = CAccountantPeriod;
	}

	public CCostCenter getCCostCenter() {
		return this.CCostCenter;
	}

	public void setCCostCenter(CCostCenter CCostCenter) {
		this.CCostCenter = CCostCenter;
	}

	public String getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
	}

	public String getCostObjectId() {
		return this.costObjectId;
	}

	public void setCostObjectId(String costObjectId) {
		this.costObjectId = costObjectId;
	}

	public Long getCostObjectType() {
		return this.costObjectType;
	}

	public void setCostObjectType(Long costObjectType) {
		this.costObjectType = costObjectType;
	}

	public BigDecimal getCostObjectQuantity() {
		return this.costObjectQuantity;
	}

	public void setCostObjectQuantity(BigDecimal costObjectQuantity) {
		this.costObjectQuantity = costObjectQuantity;
	}

	public String getLeaderid() {
		return this.leaderid;
	}

	public void setLeaderid(String leaderid) {
		this.leaderid = leaderid;
	}

	public Date getCompleteDate() {
		return this.completeDate;
	}

	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}

	public BigDecimal getActualCost() {
		return this.actualCost;
	}

	public void setActualCost(BigDecimal actualCost) {
		this.actualCost = actualCost;
	}

	public BigDecimal getOperationAddUpCost() {
		return this.operationAddUpCost;
	}

	public void setOperationAddUpCost(BigDecimal operationAddUpCost) {
		this.operationAddUpCost = operationAddUpCost;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCostObjectName() {
		return this.costObjectName;
	}

	public void setCostObjectName(String costObjectName) {
		this.costObjectName = costObjectName;
	}

	public BigDecimal getAllocateCost() {
		return this.allocateCost;
	}

	public void setAllocateCost(BigDecimal allocateCost) {
		this.allocateCost = allocateCost;
	}

	public BigDecimal getUnallocateCost() {
		return this.unallocateCost;
	}

	public void setUnallocateCost(BigDecimal unallocateCost) {
		this.unallocateCost = unallocateCost;
	}

	public BigDecimal getPlanCost() {
		return this.planCost;
	}

	public void setPlanCost(BigDecimal planCost) {
		this.planCost = planCost;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getCostObjectAccountId4() {
		return this.costObjectAccountId4;
	}

	public void setCostObjectAccountId4(String costObjectAccountId4) {
		this.costObjectAccountId4 = costObjectAccountId4;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getParentuid() {
		return this.parentuid;
	}

	public void setParentuid(String parentuid) {
		this.parentuid = parentuid;
	}

	public Long getWasterQty() {
		return this.wasterQty;
	}

	public void setWasterQty(Long wasterQty) {
		this.wasterQty = wasterQty;
	}

	public Long getWasterCost() {
		return this.wasterCost;
	}

	public void setWasterCost(Long wasterCost) {
		this.wasterCost = wasterCost;
	}

	public Long getRelationResourceType() {
		return this.relationResourceType;
	}

	public void setRelationResourceType(Long relationResourceType) {
		this.relationResourceType = relationResourceType;
	}

	public String getRelationResourceId() {
		return this.relationResourceId;
	}

	public void setRelationResourceId(String relationResourceId) {
		this.relationResourceId = relationResourceId;
	}

	public Long getIsAllocated() {
		return this.isAllocated;
	}

	public void setIsAllocated(Long isAllocated) {
		this.isAllocated = isAllocated;
	}

	public String getCostDriverId() {
		return this.costDriverId;
	}

	public void setCostDriverId(String costDriverId) {
		this.costDriverId = costDriverId;
	}

	public Long getOperationId() {
		return this.operationId;
	}

	public void setOperationId(Long operationId) {
		this.operationId = operationId;
	}

}
