package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * BOperationcheck generated by hbm2java
 */
public class BOperationcheck implements java.io.Serializable {

	private BOperationcheckId id;
	private String routing;
	private BigDecimal operationId;
	private Byte flaginput;
	private Long checkinfotype;
	private Long fieldorder;
	private String uom;
	private String notes;
	private BigDecimal ubound;
	private BigDecimal lbound;
	private String fieldtype;
	private Byte issubmitcheck;
	private Byte iskeyfield;
	private String measurebase;
	private String standardvalue;
	private String bounduom;
	private String cutteruid;
	private String measureuid;
	private BigDecimal a;
	private BigDecimal spcstandardvalue;
	private String BOperationcheckOutUid;
	private String fitPartNumber;
	private BigDecimal fitOpuid;
	private String fitFieldid;
	private String fitFormula;
	private String uniqueid;
	private String precision;
	private String sfpmiuid;
	private String sfmarkupxml;
	private String sfcheckview;
	private String checkPic;
	private String checkContent;
	private Boolean isneedcollect;
	private String tool;
	private String feature;
	private String dmistollabel;
	private String dmisfeatlabel;
	private BigDecimal manufactureopuid;
	private String tolerancerule;
	private String dmisfileversion;
	private Long operationcheckorder;
	private String sfannotationplaneuid;
	private String sfannotationplanename;
	private String genre;
	private String sfmarkupxmlreplace;
	private String sfmarkupxmlactual;
	private String measurebase1;
	private String measurebase2;
	private String toolid;
	private BigDecimal tolerid;
	private String tolerview;
	private String toolbarcode;
	private String tolername;

	public BOperationcheck() {
	}

	public BOperationcheck(BOperationcheckId id) {
		this.id = id;
	}

	public BOperationcheck(BOperationcheckId id, String routing, BigDecimal operationId, Byte flaginput,
			Long checkinfotype, Long fieldorder, String uom, String notes, BigDecimal ubound, BigDecimal lbound,
			String fieldtype, Byte issubmitcheck, Byte iskeyfield, String measurebase, String standardvalue,
			String bounduom, String cutteruid, String measureuid, BigDecimal a, BigDecimal spcstandardvalue,
			String BOperationcheckOutUid, String fitPartNumber, BigDecimal fitOpuid, String fitFieldid,
			String fitFormula, String uniqueid, String precision, String sfpmiuid, String sfmarkupxml,
			String sfcheckview, String checkPic, String checkContent, Boolean isneedcollect, String tool,
			String feature, String dmistollabel, String dmisfeatlabel, BigDecimal manufactureopuid,
			String tolerancerule, String dmisfileversion, Long operationcheckorder, String sfannotationplaneuid,
			String sfannotationplanename, String genre, String sfmarkupxmlreplace, String sfmarkupxmlactual,
			String measurebase1, String measurebase2, String toolid, BigDecimal tolerid, String tolerview,
			String toolbarcode, String tolername) {
		this.id = id;
		this.routing = routing;
		this.operationId = operationId;
		this.flaginput = flaginput;
		this.checkinfotype = checkinfotype;
		this.fieldorder = fieldorder;
		this.uom = uom;
		this.notes = notes;
		this.ubound = ubound;
		this.lbound = lbound;
		this.fieldtype = fieldtype;
		this.issubmitcheck = issubmitcheck;
		this.iskeyfield = iskeyfield;
		this.measurebase = measurebase;
		this.standardvalue = standardvalue;
		this.bounduom = bounduom;
		this.cutteruid = cutteruid;
		this.measureuid = measureuid;
		this.a = a;
		this.spcstandardvalue = spcstandardvalue;
		this.BOperationcheckOutUid = BOperationcheckOutUid;
		this.fitPartNumber = fitPartNumber;
		this.fitOpuid = fitOpuid;
		this.fitFieldid = fitFieldid;
		this.fitFormula = fitFormula;
		this.uniqueid = uniqueid;
		this.precision = precision;
		this.sfpmiuid = sfpmiuid;
		this.sfmarkupxml = sfmarkupxml;
		this.sfcheckview = sfcheckview;
		this.checkPic = checkPic;
		this.checkContent = checkContent;
		this.isneedcollect = isneedcollect;
		this.tool = tool;
		this.feature = feature;
		this.dmistollabel = dmistollabel;
		this.dmisfeatlabel = dmisfeatlabel;
		this.manufactureopuid = manufactureopuid;
		this.tolerancerule = tolerancerule;
		this.dmisfileversion = dmisfileversion;
		this.operationcheckorder = operationcheckorder;
		this.sfannotationplaneuid = sfannotationplaneuid;
		this.sfannotationplanename = sfannotationplanename;
		this.genre = genre;
		this.sfmarkupxmlreplace = sfmarkupxmlreplace;
		this.sfmarkupxmlactual = sfmarkupxmlactual;
		this.measurebase1 = measurebase1;
		this.measurebase2 = measurebase2;
		this.toolid = toolid;
		this.tolerid = tolerid;
		this.tolerview = tolerview;
		this.toolbarcode = toolbarcode;
		this.tolername = tolername;
	}

	public BOperationcheckId getId() {
		return this.id;
	}

	public void setId(BOperationcheckId id) {
		this.id = id;
	}

	public String getRouting() {
		return this.routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public BigDecimal getOperationId() {
		return this.operationId;
	}

	public void setOperationId(BigDecimal operationId) {
		this.operationId = operationId;
	}

	public Byte getFlaginput() {
		return this.flaginput;
	}

	public void setFlaginput(Byte flaginput) {
		this.flaginput = flaginput;
	}

	public Long getCheckinfotype() {
		return this.checkinfotype;
	}

	public void setCheckinfotype(Long checkinfotype) {
		this.checkinfotype = checkinfotype;
	}

	public Long getFieldorder() {
		return this.fieldorder;
	}

	public void setFieldorder(Long fieldorder) {
		this.fieldorder = fieldorder;
	}

	public String getUom() {
		return this.uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BigDecimal getUbound() {
		return this.ubound;
	}

	public void setUbound(BigDecimal ubound) {
		this.ubound = ubound;
	}

	public BigDecimal getLbound() {
		return this.lbound;
	}

	public void setLbound(BigDecimal lbound) {
		this.lbound = lbound;
	}

	public String getFieldtype() {
		return this.fieldtype;
	}

	public void setFieldtype(String fieldtype) {
		this.fieldtype = fieldtype;
	}

	public Byte getIssubmitcheck() {
		return this.issubmitcheck;
	}

	public void setIssubmitcheck(Byte issubmitcheck) {
		this.issubmitcheck = issubmitcheck;
	}

	public Byte getIskeyfield() {
		return this.iskeyfield;
	}

	public void setIskeyfield(Byte iskeyfield) {
		this.iskeyfield = iskeyfield;
	}

	public String getMeasurebase() {
		return this.measurebase;
	}

	public void setMeasurebase(String measurebase) {
		this.measurebase = measurebase;
	}

	public String getStandardvalue() {
		return this.standardvalue;
	}

	public void setStandardvalue(String standardvalue) {
		this.standardvalue = standardvalue;
	}

	public String getBounduom() {
		return this.bounduom;
	}

	public void setBounduom(String bounduom) {
		this.bounduom = bounduom;
	}

	public String getCutteruid() {
		return this.cutteruid;
	}

	public void setCutteruid(String cutteruid) {
		this.cutteruid = cutteruid;
	}

	public String getMeasureuid() {
		return this.measureuid;
	}

	public void setMeasureuid(String measureuid) {
		this.measureuid = measureuid;
	}

	public BigDecimal getA() {
		return this.a;
	}

	public void setA(BigDecimal a) {
		this.a = a;
	}

	public BigDecimal getSpcstandardvalue() {
		return this.spcstandardvalue;
	}

	public void setSpcstandardvalue(BigDecimal spcstandardvalue) {
		this.spcstandardvalue = spcstandardvalue;
	}

	public String getBOperationcheckOutUid() {
		return this.BOperationcheckOutUid;
	}

	public void setBOperationcheckOutUid(String BOperationcheckOutUid) {
		this.BOperationcheckOutUid = BOperationcheckOutUid;
	}

	public String getFitPartNumber() {
		return this.fitPartNumber;
	}

	public void setFitPartNumber(String fitPartNumber) {
		this.fitPartNumber = fitPartNumber;
	}

	public BigDecimal getFitOpuid() {
		return this.fitOpuid;
	}

	public void setFitOpuid(BigDecimal fitOpuid) {
		this.fitOpuid = fitOpuid;
	}

	public String getFitFieldid() {
		return this.fitFieldid;
	}

	public void setFitFieldid(String fitFieldid) {
		this.fitFieldid = fitFieldid;
	}

	public String getFitFormula() {
		return this.fitFormula;
	}

	public void setFitFormula(String fitFormula) {
		this.fitFormula = fitFormula;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getPrecision() {
		return this.precision;
	}

	public void setPrecision(String precision) {
		this.precision = precision;
	}

	public String getSfpmiuid() {
		return this.sfpmiuid;
	}

	public void setSfpmiuid(String sfpmiuid) {
		this.sfpmiuid = sfpmiuid;
	}

	public String getSfmarkupxml() {
		return this.sfmarkupxml;
	}

	public void setSfmarkupxml(String sfmarkupxml) {
		this.sfmarkupxml = sfmarkupxml;
	}

	public String getSfcheckview() {
		return this.sfcheckview;
	}

	public void setSfcheckview(String sfcheckview) {
		this.sfcheckview = sfcheckview;
	}

	public String getCheckPic() {
		return this.checkPic;
	}

	public void setCheckPic(String checkPic) {
		this.checkPic = checkPic;
	}

	public String getCheckContent() {
		return this.checkContent;
	}

	public void setCheckContent(String checkContent) {
		this.checkContent = checkContent;
	}

	public Boolean getIsneedcollect() {
		return this.isneedcollect;
	}

	public void setIsneedcollect(Boolean isneedcollect) {
		this.isneedcollect = isneedcollect;
	}

	public String getTool() {
		return this.tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getDmistollabel() {
		return this.dmistollabel;
	}

	public void setDmistollabel(String dmistollabel) {
		this.dmistollabel = dmistollabel;
	}

	public String getDmisfeatlabel() {
		return this.dmisfeatlabel;
	}

	public void setDmisfeatlabel(String dmisfeatlabel) {
		this.dmisfeatlabel = dmisfeatlabel;
	}

	public BigDecimal getManufactureopuid() {
		return this.manufactureopuid;
	}

	public void setManufactureopuid(BigDecimal manufactureopuid) {
		this.manufactureopuid = manufactureopuid;
	}

	public String getTolerancerule() {
		return this.tolerancerule;
	}

	public void setTolerancerule(String tolerancerule) {
		this.tolerancerule = tolerancerule;
	}

	public String getDmisfileversion() {
		return this.dmisfileversion;
	}

	public void setDmisfileversion(String dmisfileversion) {
		this.dmisfileversion = dmisfileversion;
	}

	public Long getOperationcheckorder() {
		return this.operationcheckorder;
	}

	public void setOperationcheckorder(Long operationcheckorder) {
		this.operationcheckorder = operationcheckorder;
	}

	public String getSfannotationplaneuid() {
		return this.sfannotationplaneuid;
	}

	public void setSfannotationplaneuid(String sfannotationplaneuid) {
		this.sfannotationplaneuid = sfannotationplaneuid;
	}

	public String getSfannotationplanename() {
		return this.sfannotationplanename;
	}

	public void setSfannotationplanename(String sfannotationplanename) {
		this.sfannotationplanename = sfannotationplanename;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSfmarkupxmlreplace() {
		return this.sfmarkupxmlreplace;
	}

	public void setSfmarkupxmlreplace(String sfmarkupxmlreplace) {
		this.sfmarkupxmlreplace = sfmarkupxmlreplace;
	}

	public String getSfmarkupxmlactual() {
		return this.sfmarkupxmlactual;
	}

	public void setSfmarkupxmlactual(String sfmarkupxmlactual) {
		this.sfmarkupxmlactual = sfmarkupxmlactual;
	}

	public String getMeasurebase1() {
		return this.measurebase1;
	}

	public void setMeasurebase1(String measurebase1) {
		this.measurebase1 = measurebase1;
	}

	public String getMeasurebase2() {
		return this.measurebase2;
	}

	public void setMeasurebase2(String measurebase2) {
		this.measurebase2 = measurebase2;
	}

	public String getToolid() {
		return this.toolid;
	}

	public void setToolid(String toolid) {
		this.toolid = toolid;
	}

	public BigDecimal getTolerid() {
		return this.tolerid;
	}

	public void setTolerid(BigDecimal tolerid) {
		this.tolerid = tolerid;
	}

	public String getTolerview() {
		return this.tolerview;
	}

	public void setTolerview(String tolerview) {
		this.tolerview = tolerview;
	}

	public String getToolbarcode() {
		return this.toolbarcode;
	}

	public void setToolbarcode(String toolbarcode) {
		this.toolbarcode = toolbarcode;
	}

	public String getTolername() {
		return this.tolername;
	}

	public void setTolername(String tolername) {
		this.tolername = tolername;
	}

}
