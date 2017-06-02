package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * ICheckdetail generated by hbm2java
 */
public class ICheckdetail implements java.io.Serializable {

	private ICheckdetailId id;
	private String materialusn;
	private String binid;
	private String uom;
	private BigDecimal unitprice;
	private BigDecimal accountedqty;
	private BigDecimal accountedamount;
	private BigDecimal actualqty;
	private BigDecimal actualamount;
	private BigDecimal varianceqty;
	private BigDecimal varianceamount;
	private BigDecimal adjustqty;
	private BigDecimal adjustamount;
	private String adjustemp;
	private String creator;
	private Date createtime;
	private String notes;
	private String text1;
	private String text2;
	private String text3;
	private String text4;
	private String text5;
	private String text6;
	private String text7;
	private String text8;
	private String text9;
	private String text10;
	private String checkVarianceReason;
	private BigDecimal checkTolerance;

	public ICheckdetail() {
	}

	public ICheckdetail(ICheckdetailId id) {
		this.id = id;
	}

	public ICheckdetail(ICheckdetailId id, String materialusn, String binid, String uom, BigDecimal unitprice,
			BigDecimal accountedqty, BigDecimal accountedamount, BigDecimal actualqty, BigDecimal actualamount,
			BigDecimal varianceqty, BigDecimal varianceamount, BigDecimal adjustqty, BigDecimal adjustamount,
			String adjustemp, String creator, Date createtime, String notes, String text1, String text2, String text3,
			String text4, String text5, String text6, String text7, String text8, String text9, String text10,
			String checkVarianceReason, BigDecimal checkTolerance) {
		this.id = id;
		this.materialusn = materialusn;
		this.binid = binid;
		this.uom = uom;
		this.unitprice = unitprice;
		this.accountedqty = accountedqty;
		this.accountedamount = accountedamount;
		this.actualqty = actualqty;
		this.actualamount = actualamount;
		this.varianceqty = varianceqty;
		this.varianceamount = varianceamount;
		this.adjustqty = adjustqty;
		this.adjustamount = adjustamount;
		this.adjustemp = adjustemp;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.text4 = text4;
		this.text5 = text5;
		this.text6 = text6;
		this.text7 = text7;
		this.text8 = text8;
		this.text9 = text9;
		this.text10 = text10;
		this.checkVarianceReason = checkVarianceReason;
		this.checkTolerance = checkTolerance;
	}

	public ICheckdetailId getId() {
		return this.id;
	}

	public void setId(ICheckdetailId id) {
		this.id = id;
	}

	public String getMaterialusn() {
		return this.materialusn;
	}

	public void setMaterialusn(String materialusn) {
		this.materialusn = materialusn;
	}

	public String getBinid() {
		return this.binid;
	}

	public void setBinid(String binid) {
		this.binid = binid;
	}

	public String getUom() {
		return this.uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public BigDecimal getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}

	public BigDecimal getAccountedqty() {
		return this.accountedqty;
	}

	public void setAccountedqty(BigDecimal accountedqty) {
		this.accountedqty = accountedqty;
	}

	public BigDecimal getAccountedamount() {
		return this.accountedamount;
	}

	public void setAccountedamount(BigDecimal accountedamount) {
		this.accountedamount = accountedamount;
	}

	public BigDecimal getActualqty() {
		return this.actualqty;
	}

	public void setActualqty(BigDecimal actualqty) {
		this.actualqty = actualqty;
	}

	public BigDecimal getActualamount() {
		return this.actualamount;
	}

	public void setActualamount(BigDecimal actualamount) {
		this.actualamount = actualamount;
	}

	public BigDecimal getVarianceqty() {
		return this.varianceqty;
	}

	public void setVarianceqty(BigDecimal varianceqty) {
		this.varianceqty = varianceqty;
	}

	public BigDecimal getVarianceamount() {
		return this.varianceamount;
	}

	public void setVarianceamount(BigDecimal varianceamount) {
		this.varianceamount = varianceamount;
	}

	public BigDecimal getAdjustqty() {
		return this.adjustqty;
	}

	public void setAdjustqty(BigDecimal adjustqty) {
		this.adjustqty = adjustqty;
	}

	public BigDecimal getAdjustamount() {
		return this.adjustamount;
	}

	public void setAdjustamount(BigDecimal adjustamount) {
		this.adjustamount = adjustamount;
	}

	public String getAdjustemp() {
		return this.adjustemp;
	}

	public void setAdjustemp(String adjustemp) {
		this.adjustemp = adjustemp;
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

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getText1() {
		return this.text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getText2() {
		return this.text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public String getText3() {
		return this.text3;
	}

	public void setText3(String text3) {
		this.text3 = text3;
	}

	public String getText4() {
		return this.text4;
	}

	public void setText4(String text4) {
		this.text4 = text4;
	}

	public String getText5() {
		return this.text5;
	}

	public void setText5(String text5) {
		this.text5 = text5;
	}

	public String getText6() {
		return this.text6;
	}

	public void setText6(String text6) {
		this.text6 = text6;
	}

	public String getText7() {
		return this.text7;
	}

	public void setText7(String text7) {
		this.text7 = text7;
	}

	public String getText8() {
		return this.text8;
	}

	public void setText8(String text8) {
		this.text8 = text8;
	}

	public String getText9() {
		return this.text9;
	}

	public void setText9(String text9) {
		this.text9 = text9;
	}

	public String getText10() {
		return this.text10;
	}

	public void setText10(String text10) {
		this.text10 = text10;
	}

	public String getCheckVarianceReason() {
		return this.checkVarianceReason;
	}

	public void setCheckVarianceReason(String checkVarianceReason) {
		this.checkVarianceReason = checkVarianceReason;
	}

	public BigDecimal getCheckTolerance() {
		return this.checkTolerance;
	}

	public void setCheckTolerance(BigDecimal checkTolerance) {
		this.checkTolerance = checkTolerance;
	}

}