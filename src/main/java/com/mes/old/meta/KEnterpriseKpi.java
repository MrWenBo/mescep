package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * KEnterpriseKpi generated by hbm2java
 */
public class KEnterpriseKpi implements java.io.Serializable {

	private KEnterpriseKpiId id;
	private String kpivalue;
	private String kpiclasstype;

	public KEnterpriseKpi() {
	}

	public KEnterpriseKpi(KEnterpriseKpiId id, String kpivalue) {
		this.id = id;
		this.kpivalue = kpivalue;
	}

	public KEnterpriseKpi(KEnterpriseKpiId id, String kpivalue, String kpiclasstype) {
		this.id = id;
		this.kpivalue = kpivalue;
		this.kpiclasstype = kpiclasstype;
	}

	public KEnterpriseKpiId getId() {
		return this.id;
	}

	public void setId(KEnterpriseKpiId id) {
		this.id = id;
	}

	public String getKpivalue() {
		return this.kpivalue;
	}

	public void setKpivalue(String kpivalue) {
		this.kpivalue = kpivalue;
	}

	public String getKpiclasstype() {
		return this.kpiclasstype;
	}

	public void setKpiclasstype(String kpiclasstype) {
		this.kpiclasstype = kpiclasstype;
	}

}
