package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * CRtCostDriver generated by hbm2java
 */
public class CRtCostDriver implements java.io.Serializable {

	private String uniqueid;
	private CAccountantPeriod CAccountantPeriod;
	private CCostCenter CCostCenter;
	private CDtCostDriver CDtCostDriver;
	private BigDecimal costDriverQuantity;
	private String notes;

	public CRtCostDriver() {
	}

	public CRtCostDriver(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public CRtCostDriver(String uniqueid, CAccountantPeriod CAccountantPeriod, CCostCenter CCostCenter,
			CDtCostDriver CDtCostDriver, BigDecimal costDriverQuantity, String notes) {
		this.uniqueid = uniqueid;
		this.CAccountantPeriod = CAccountantPeriod;
		this.CCostCenter = CCostCenter;
		this.CDtCostDriver = CDtCostDriver;
		this.costDriverQuantity = costDriverQuantity;
		this.notes = notes;
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

	public CDtCostDriver getCDtCostDriver() {
		return this.CDtCostDriver;
	}

	public void setCDtCostDriver(CDtCostDriver CDtCostDriver) {
		this.CDtCostDriver = CDtCostDriver;
	}

	public BigDecimal getCostDriverQuantity() {
		return this.costDriverQuantity;
	}

	public void setCostDriverQuantity(BigDecimal costDriverQuantity) {
		this.costDriverQuantity = costDriverQuantity;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}