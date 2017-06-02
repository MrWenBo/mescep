package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * CRtAllocateStep generated by hbm2java
 */
public class CRtAllocateStep implements java.io.Serializable {

	private String uniqueid;
	private CAccountantPeriod CAccountantPeriod;
	private CDtAllocateStep CDtAllocateStep;
	private CDtCostDriver CDtCostDriver;
	private String allocateFrom;
	private Long allocateFromType;
	private String allocateTo;
	private Long allocateToType;
	private BigDecimal costDriverQuantity;
	private BigDecimal allocateProportion;
	private BigDecimal allocateQuantity;
	private BigDecimal allocateAllCost;
	private BigDecimal unallocateCost;
	private String notes;
	private String costCenterId;
	private Long isAllocated;
	private Long groupnum;

	public CRtAllocateStep() {
	}

	public CRtAllocateStep(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public CRtAllocateStep(String uniqueid, CAccountantPeriod CAccountantPeriod, CDtAllocateStep CDtAllocateStep,
			CDtCostDriver CDtCostDriver, String allocateFrom, Long allocateFromType, String allocateTo,
			Long allocateToType, BigDecimal costDriverQuantity, BigDecimal allocateProportion,
			BigDecimal allocateQuantity, BigDecimal allocateAllCost, BigDecimal unallocateCost, String notes,
			String costCenterId, Long isAllocated, Long groupnum) {
		this.uniqueid = uniqueid;
		this.CAccountantPeriod = CAccountantPeriod;
		this.CDtAllocateStep = CDtAllocateStep;
		this.CDtCostDriver = CDtCostDriver;
		this.allocateFrom = allocateFrom;
		this.allocateFromType = allocateFromType;
		this.allocateTo = allocateTo;
		this.allocateToType = allocateToType;
		this.costDriverQuantity = costDriverQuantity;
		this.allocateProportion = allocateProportion;
		this.allocateQuantity = allocateQuantity;
		this.allocateAllCost = allocateAllCost;
		this.unallocateCost = unallocateCost;
		this.notes = notes;
		this.costCenterId = costCenterId;
		this.isAllocated = isAllocated;
		this.groupnum = groupnum;
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

	public CDtAllocateStep getCDtAllocateStep() {
		return this.CDtAllocateStep;
	}

	public void setCDtAllocateStep(CDtAllocateStep CDtAllocateStep) {
		this.CDtAllocateStep = CDtAllocateStep;
	}

	public CDtCostDriver getCDtCostDriver() {
		return this.CDtCostDriver;
	}

	public void setCDtCostDriver(CDtCostDriver CDtCostDriver) {
		this.CDtCostDriver = CDtCostDriver;
	}

	public String getAllocateFrom() {
		return this.allocateFrom;
	}

	public void setAllocateFrom(String allocateFrom) {
		this.allocateFrom = allocateFrom;
	}

	public Long getAllocateFromType() {
		return this.allocateFromType;
	}

	public void setAllocateFromType(Long allocateFromType) {
		this.allocateFromType = allocateFromType;
	}

	public String getAllocateTo() {
		return this.allocateTo;
	}

	public void setAllocateTo(String allocateTo) {
		this.allocateTo = allocateTo;
	}

	public Long getAllocateToType() {
		return this.allocateToType;
	}

	public void setAllocateToType(Long allocateToType) {
		this.allocateToType = allocateToType;
	}

	public BigDecimal getCostDriverQuantity() {
		return this.costDriverQuantity;
	}

	public void setCostDriverQuantity(BigDecimal costDriverQuantity) {
		this.costDriverQuantity = costDriverQuantity;
	}

	public BigDecimal getAllocateProportion() {
		return this.allocateProportion;
	}

	public void setAllocateProportion(BigDecimal allocateProportion) {
		this.allocateProportion = allocateProportion;
	}

	public BigDecimal getAllocateQuantity() {
		return this.allocateQuantity;
	}

	public void setAllocateQuantity(BigDecimal allocateQuantity) {
		this.allocateQuantity = allocateQuantity;
	}

	public BigDecimal getAllocateAllCost() {
		return this.allocateAllCost;
	}

	public void setAllocateAllCost(BigDecimal allocateAllCost) {
		this.allocateAllCost = allocateAllCost;
	}

	public BigDecimal getUnallocateCost() {
		return this.unallocateCost;
	}

	public void setUnallocateCost(BigDecimal unallocateCost) {
		this.unallocateCost = unallocateCost;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCostCenterId() {
		return this.costCenterId;
	}

	public void setCostCenterId(String costCenterId) {
		this.costCenterId = costCenterId;
	}

	public Long getIsAllocated() {
		return this.isAllocated;
	}

	public void setIsAllocated(Long isAllocated) {
		this.isAllocated = isAllocated;
	}

	public Long getGroupnum() {
		return this.groupnum;
	}

	public void setGroupnum(Long groupnum) {
		this.groupnum = groupnum;
	}

}
