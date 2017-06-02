package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * IMovedetail generated by hbm2java
 */
public class IMovedetail implements java.io.Serializable {

	private IMovedetailId id;
	private String materialusn;
	private String sn;
	private BigDecimal moveqty;
	private BigDecimal moveamount;
	private String uom;
	private BigDecimal unitprice;
	private String packagetype;
	private BigDecimal packageweight;
	private Date productdate;
	private Date validdate;
	private String creator;
	private Date createtime;
	private String notes;
	private String frombinid;
	private String tobinid;
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
	private String partNumber;
	private String batchnum;
	private String newmaterialusn;
	private String newsn;
	private String relationid;
	private Long relationseq;

	public IMovedetail() {
	}

	public IMovedetail(IMovedetailId id) {
		this.id = id;
	}

	public IMovedetail(IMovedetailId id, String materialusn, String sn, BigDecimal moveqty, BigDecimal moveamount,
			String uom, BigDecimal unitprice, String packagetype, BigDecimal packageweight, Date productdate,
			Date validdate, String creator, Date createtime, String notes, String frombinid, String tobinid,
			String text1, String text2, String text3, String text4, String text5, String text6, String text7,
			String text8, String text9, String text10, String partNumber, String batchnum, String newmaterialusn,
			String newsn, String relationid, Long relationseq) {
		this.id = id;
		this.materialusn = materialusn;
		this.sn = sn;
		this.moveqty = moveqty;
		this.moveamount = moveamount;
		this.uom = uom;
		this.unitprice = unitprice;
		this.packagetype = packagetype;
		this.packageweight = packageweight;
		this.productdate = productdate;
		this.validdate = validdate;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
		this.frombinid = frombinid;
		this.tobinid = tobinid;
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
		this.partNumber = partNumber;
		this.batchnum = batchnum;
		this.newmaterialusn = newmaterialusn;
		this.newsn = newsn;
		this.relationid = relationid;
		this.relationseq = relationseq;
	}

	public IMovedetailId getId() {
		return this.id;
	}

	public void setId(IMovedetailId id) {
		this.id = id;
	}

	public String getMaterialusn() {
		return this.materialusn;
	}

	public void setMaterialusn(String materialusn) {
		this.materialusn = materialusn;
	}

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public BigDecimal getMoveqty() {
		return this.moveqty;
	}

	public void setMoveqty(BigDecimal moveqty) {
		this.moveqty = moveqty;
	}

	public BigDecimal getMoveamount() {
		return this.moveamount;
	}

	public void setMoveamount(BigDecimal moveamount) {
		this.moveamount = moveamount;
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

	public String getPackagetype() {
		return this.packagetype;
	}

	public void setPackagetype(String packagetype) {
		this.packagetype = packagetype;
	}

	public BigDecimal getPackageweight() {
		return this.packageweight;
	}

	public void setPackageweight(BigDecimal packageweight) {
		this.packageweight = packageweight;
	}

	public Date getProductdate() {
		return this.productdate;
	}

	public void setProductdate(Date productdate) {
		this.productdate = productdate;
	}

	public Date getValiddate() {
		return this.validdate;
	}

	public void setValiddate(Date validdate) {
		this.validdate = validdate;
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

	public String getFrombinid() {
		return this.frombinid;
	}

	public void setFrombinid(String frombinid) {
		this.frombinid = frombinid;
	}

	public String getTobinid() {
		return this.tobinid;
	}

	public void setTobinid(String tobinid) {
		this.tobinid = tobinid;
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

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
	}

	public String getNewmaterialusn() {
		return this.newmaterialusn;
	}

	public void setNewmaterialusn(String newmaterialusn) {
		this.newmaterialusn = newmaterialusn;
	}

	public String getNewsn() {
		return this.newsn;
	}

	public void setNewsn(String newsn) {
		this.newsn = newsn;
	}

	public String getRelationid() {
		return this.relationid;
	}

	public void setRelationid(String relationid) {
		this.relationid = relationid;
	}

	public Long getRelationseq() {
		return this.relationseq;
	}

	public void setRelationseq(Long relationseq) {
		this.relationseq = relationseq;
	}

}