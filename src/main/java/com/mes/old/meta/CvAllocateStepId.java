package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * CvAllocateStepId generated by hbm2java
 */
public class CvAllocateStepId implements java.io.Serializable {

	private String uniqueid;
	private String allocateFrom;
	private String accountantPeriodId;
	private Long allocateFromType;
	private String allocateTo;
	private Long allocateToType;
	private BigDecimal costDriverQuantity;
	private BigDecimal allocateProportion;
	private BigDecimal allocateQuantity;
	private BigDecimal allocateAllCost;
	private BigDecimal unallocateCost;
	private String notes;
	private String dtUniqueid;
	private String costDriverId;
	private String costCenterId;
	private Long isAllocated;
	private Long groupnum;
	private Long isFixAllocate;
	private String creatorname;
	private String accountantPeriodName;
	private String fromTypedesc;
	private String toTypedesc;
	private String allocateFromdesc;
	private String allocateTodesc;

	public CvAllocateStepId() {
	}

	public CvAllocateStepId(String uniqueid, String fromTypedesc, String toTypedesc) {
		this.uniqueid = uniqueid;
		this.fromTypedesc = fromTypedesc;
		this.toTypedesc = toTypedesc;
	}

	public CvAllocateStepId(String uniqueid, String allocateFrom, String accountantPeriodId, Long allocateFromType,
			String allocateTo, Long allocateToType, BigDecimal costDriverQuantity, BigDecimal allocateProportion,
			BigDecimal allocateQuantity, BigDecimal allocateAllCost, BigDecimal unallocateCost, String notes,
			String dtUniqueid, String costDriverId, String costCenterId, Long isAllocated, Long groupnum,
			Long isFixAllocate, String creatorname, String accountantPeriodName, String fromTypedesc, String toTypedesc,
			String allocateFromdesc, String allocateTodesc) {
		this.uniqueid = uniqueid;
		this.allocateFrom = allocateFrom;
		this.accountantPeriodId = accountantPeriodId;
		this.allocateFromType = allocateFromType;
		this.allocateTo = allocateTo;
		this.allocateToType = allocateToType;
		this.costDriverQuantity = costDriverQuantity;
		this.allocateProportion = allocateProportion;
		this.allocateQuantity = allocateQuantity;
		this.allocateAllCost = allocateAllCost;
		this.unallocateCost = unallocateCost;
		this.notes = notes;
		this.dtUniqueid = dtUniqueid;
		this.costDriverId = costDriverId;
		this.costCenterId = costCenterId;
		this.isAllocated = isAllocated;
		this.groupnum = groupnum;
		this.isFixAllocate = isFixAllocate;
		this.creatorname = creatorname;
		this.accountantPeriodName = accountantPeriodName;
		this.fromTypedesc = fromTypedesc;
		this.toTypedesc = toTypedesc;
		this.allocateFromdesc = allocateFromdesc;
		this.allocateTodesc = allocateTodesc;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getAllocateFrom() {
		return this.allocateFrom;
	}

	public void setAllocateFrom(String allocateFrom) {
		this.allocateFrom = allocateFrom;
	}

	public String getAccountantPeriodId() {
		return this.accountantPeriodId;
	}

	public void setAccountantPeriodId(String accountantPeriodId) {
		this.accountantPeriodId = accountantPeriodId;
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

	public String getDtUniqueid() {
		return this.dtUniqueid;
	}

	public void setDtUniqueid(String dtUniqueid) {
		this.dtUniqueid = dtUniqueid;
	}

	public String getCostDriverId() {
		return this.costDriverId;
	}

	public void setCostDriverId(String costDriverId) {
		this.costDriverId = costDriverId;
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

	public Long getIsFixAllocate() {
		return this.isFixAllocate;
	}

	public void setIsFixAllocate(Long isFixAllocate) {
		this.isFixAllocate = isFixAllocate;
	}

	public String getCreatorname() {
		return this.creatorname;
	}

	public void setCreatorname(String creatorname) {
		this.creatorname = creatorname;
	}

	public String getAccountantPeriodName() {
		return this.accountantPeriodName;
	}

	public void setAccountantPeriodName(String accountantPeriodName) {
		this.accountantPeriodName = accountantPeriodName;
	}

	public String getFromTypedesc() {
		return this.fromTypedesc;
	}

	public void setFromTypedesc(String fromTypedesc) {
		this.fromTypedesc = fromTypedesc;
	}

	public String getToTypedesc() {
		return this.toTypedesc;
	}

	public void setToTypedesc(String toTypedesc) {
		this.toTypedesc = toTypedesc;
	}

	public String getAllocateFromdesc() {
		return this.allocateFromdesc;
	}

	public void setAllocateFromdesc(String allocateFromdesc) {
		this.allocateFromdesc = allocateFromdesc;
	}

	public String getAllocateTodesc() {
		return this.allocateTodesc;
	}

	public void setAllocateTodesc(String allocateTodesc) {
		this.allocateTodesc = allocateTodesc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CvAllocateStepId))
			return false;
		CvAllocateStepId castOther = (CvAllocateStepId) other;

		return ((this.getUniqueid() == castOther.getUniqueid()) || (this.getUniqueid() != null
				&& castOther.getUniqueid() != null && this.getUniqueid().equals(castOther.getUniqueid())))
				&& ((this.getAllocateFrom() == castOther.getAllocateFrom())
						|| (this.getAllocateFrom() != null && castOther.getAllocateFrom() != null
								&& this.getAllocateFrom().equals(castOther.getAllocateFrom())))
				&& ((this.getAccountantPeriodId() == castOther.getAccountantPeriodId())
						|| (this.getAccountantPeriodId() != null && castOther.getAccountantPeriodId() != null
								&& this.getAccountantPeriodId().equals(castOther.getAccountantPeriodId())))
				&& ((this.getAllocateFromType() == castOther.getAllocateFromType())
						|| (this.getAllocateFromType() != null && castOther.getAllocateFromType() != null
								&& this.getAllocateFromType().equals(castOther.getAllocateFromType())))
				&& ((this.getAllocateTo() == castOther.getAllocateTo()) || (this.getAllocateTo() != null
						&& castOther.getAllocateTo() != null && this.getAllocateTo().equals(castOther.getAllocateTo())))
				&& ((this.getAllocateToType() == castOther.getAllocateToType())
						|| (this.getAllocateToType() != null && castOther.getAllocateToType() != null
								&& this.getAllocateToType().equals(castOther.getAllocateToType())))
				&& ((this.getCostDriverQuantity() == castOther.getCostDriverQuantity())
						|| (this.getCostDriverQuantity() != null && castOther.getCostDriverQuantity() != null
								&& this.getCostDriverQuantity().equals(castOther.getCostDriverQuantity())))
				&& ((this.getAllocateProportion() == castOther.getAllocateProportion())
						|| (this.getAllocateProportion() != null && castOther.getAllocateProportion() != null
								&& this.getAllocateProportion().equals(castOther.getAllocateProportion())))
				&& ((this.getAllocateQuantity() == castOther.getAllocateQuantity())
						|| (this.getAllocateQuantity() != null && castOther.getAllocateQuantity() != null
								&& this.getAllocateQuantity().equals(castOther.getAllocateQuantity())))
				&& ((this.getAllocateAllCost() == castOther.getAllocateAllCost())
						|| (this.getAllocateAllCost() != null && castOther.getAllocateAllCost() != null
								&& this.getAllocateAllCost().equals(castOther.getAllocateAllCost())))
				&& ((this.getUnallocateCost() == castOther.getUnallocateCost())
						|| (this.getUnallocateCost() != null && castOther.getUnallocateCost() != null
								&& this.getUnallocateCost().equals(castOther.getUnallocateCost())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getDtUniqueid() == castOther.getDtUniqueid()) || (this.getDtUniqueid() != null
						&& castOther.getDtUniqueid() != null && this.getDtUniqueid().equals(castOther.getDtUniqueid())))
				&& ((this.getCostDriverId() == castOther.getCostDriverId())
						|| (this.getCostDriverId() != null && castOther.getCostDriverId() != null
								&& this.getCostDriverId().equals(castOther.getCostDriverId())))
				&& ((this.getCostCenterId() == castOther.getCostCenterId())
						|| (this.getCostCenterId() != null && castOther.getCostCenterId() != null
								&& this.getCostCenterId().equals(castOther.getCostCenterId())))
				&& ((this.getIsAllocated() == castOther.getIsAllocated())
						|| (this.getIsAllocated() != null && castOther.getIsAllocated() != null
								&& this.getIsAllocated().equals(castOther.getIsAllocated())))
				&& ((this.getGroupnum() == castOther.getGroupnum()) || (this.getGroupnum() != null
						&& castOther.getGroupnum() != null && this.getGroupnum().equals(castOther.getGroupnum())))
				&& ((this.getIsFixAllocate() == castOther.getIsFixAllocate())
						|| (this.getIsFixAllocate() != null && castOther.getIsFixAllocate() != null
								&& this.getIsFixAllocate().equals(castOther.getIsFixAllocate())))
				&& ((this.getCreatorname() == castOther.getCreatorname())
						|| (this.getCreatorname() != null && castOther.getCreatorname() != null
								&& this.getCreatorname().equals(castOther.getCreatorname())))
				&& ((this.getAccountantPeriodName() == castOther.getAccountantPeriodName())
						|| (this.getAccountantPeriodName() != null && castOther.getAccountantPeriodName() != null
								&& this.getAccountantPeriodName().equals(castOther.getAccountantPeriodName())))
				&& ((this.getFromTypedesc() == castOther.getFromTypedesc())
						|| (this.getFromTypedesc() != null && castOther.getFromTypedesc() != null
								&& this.getFromTypedesc().equals(castOther.getFromTypedesc())))
				&& ((this.getToTypedesc() == castOther.getToTypedesc()) || (this.getToTypedesc() != null
						&& castOther.getToTypedesc() != null && this.getToTypedesc().equals(castOther.getToTypedesc())))
				&& ((this.getAllocateFromdesc() == castOther.getAllocateFromdesc())
						|| (this.getAllocateFromdesc() != null && castOther.getAllocateFromdesc() != null
								&& this.getAllocateFromdesc().equals(castOther.getAllocateFromdesc())))
				&& ((this.getAllocateTodesc() == castOther.getAllocateTodesc())
						|| (this.getAllocateTodesc() != null && castOther.getAllocateTodesc() != null
								&& this.getAllocateTodesc().equals(castOther.getAllocateTodesc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUniqueid() == null ? 0 : this.getUniqueid().hashCode());
		result = 37 * result + (getAllocateFrom() == null ? 0 : this.getAllocateFrom().hashCode());
		result = 37 * result + (getAccountantPeriodId() == null ? 0 : this.getAccountantPeriodId().hashCode());
		result = 37 * result + (getAllocateFromType() == null ? 0 : this.getAllocateFromType().hashCode());
		result = 37 * result + (getAllocateTo() == null ? 0 : this.getAllocateTo().hashCode());
		result = 37 * result + (getAllocateToType() == null ? 0 : this.getAllocateToType().hashCode());
		result = 37 * result + (getCostDriverQuantity() == null ? 0 : this.getCostDriverQuantity().hashCode());
		result = 37 * result + (getAllocateProportion() == null ? 0 : this.getAllocateProportion().hashCode());
		result = 37 * result + (getAllocateQuantity() == null ? 0 : this.getAllocateQuantity().hashCode());
		result = 37 * result + (getAllocateAllCost() == null ? 0 : this.getAllocateAllCost().hashCode());
		result = 37 * result + (getUnallocateCost() == null ? 0 : this.getUnallocateCost().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getDtUniqueid() == null ? 0 : this.getDtUniqueid().hashCode());
		result = 37 * result + (getCostDriverId() == null ? 0 : this.getCostDriverId().hashCode());
		result = 37 * result + (getCostCenterId() == null ? 0 : this.getCostCenterId().hashCode());
		result = 37 * result + (getIsAllocated() == null ? 0 : this.getIsAllocated().hashCode());
		result = 37 * result + (getGroupnum() == null ? 0 : this.getGroupnum().hashCode());
		result = 37 * result + (getIsFixAllocate() == null ? 0 : this.getIsFixAllocate().hashCode());
		result = 37 * result + (getCreatorname() == null ? 0 : this.getCreatorname().hashCode());
		result = 37 * result + (getAccountantPeriodName() == null ? 0 : this.getAccountantPeriodName().hashCode());
		result = 37 * result + (getFromTypedesc() == null ? 0 : this.getFromTypedesc().hashCode());
		result = 37 * result + (getToTypedesc() == null ? 0 : this.getToTypedesc().hashCode());
		result = 37 * result + (getAllocateFromdesc() == null ? 0 : this.getAllocateFromdesc().hashCode());
		result = 37 * result + (getAllocateTodesc() == null ? 0 : this.getAllocateTodesc().hashCode());
		return result;
	}

}