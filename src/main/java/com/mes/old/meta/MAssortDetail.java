package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * MAssortDetail generated by hbm2java
 */
public class MAssortDetail implements java.io.Serializable {

	private String uniqueid;
	private String assortnum;
	private String qualitynum;
	private String drawingid;
	private String partName;
	private String model;
	private String materialqtySum;
	private String materialqty;
	private String partModel;
	private Date reqDate;

	public MAssortDetail() {
	}

	public MAssortDetail(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public MAssortDetail(String uniqueid, String assortnum, String qualitynum, String drawingid, String partName,
			String model, String materialqtySum, String materialqty, String partModel, Date reqDate) {
		this.uniqueid = uniqueid;
		this.assortnum = assortnum;
		this.qualitynum = qualitynum;
		this.drawingid = drawingid;
		this.partName = partName;
		this.model = model;
		this.materialqtySum = materialqtySum;
		this.materialqty = materialqty;
		this.partModel = partModel;
		this.reqDate = reqDate;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getAssortnum() {
		return this.assortnum;
	}

	public void setAssortnum(String assortnum) {
		this.assortnum = assortnum;
	}

	public String getQualitynum() {
		return this.qualitynum;
	}

	public void setQualitynum(String qualitynum) {
		this.qualitynum = qualitynum;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMaterialqtySum() {
		return this.materialqtySum;
	}

	public void setMaterialqtySum(String materialqtySum) {
		this.materialqtySum = materialqtySum;
	}

	public String getMaterialqty() {
		return this.materialqty;
	}

	public void setMaterialqty(String materialqty) {
		this.materialqty = materialqty;
	}

	public String getPartModel() {
		return this.partModel;
	}

	public void setPartModel(String partModel) {
		this.partModel = partModel;
	}

	public Date getReqDate() {
		return this.reqDate;
	}

	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

}