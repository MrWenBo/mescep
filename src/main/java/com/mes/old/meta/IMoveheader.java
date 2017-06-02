package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * IMoveheader generated by hbm2java
 */
public class IMoveheader implements java.io.Serializable {

	private String invmoveid;
	private Long invmovetype;
	private Long invmovestate;
	private String reasoncode;
	private BigDecimal totalamount;
	private String fromwarehouse;
	private String towarehouse;
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
	private String frominvioid;
	private String toinvioid;
	private String lastModificator;
	private Date lastModifyTime;
	private String billchecker;
	private String transactor;
	private Date invmovedate;
	private String fromemp;
	private String toemp;

	public IMoveheader() {
	}

	public IMoveheader(String invmoveid) {
		this.invmoveid = invmoveid;
	}

	public IMoveheader(String invmoveid, Long invmovetype, Long invmovestate, String reasoncode, BigDecimal totalamount,
			String fromwarehouse, String towarehouse, String creator, Date createtime, String notes, String text1,
			String text2, String text3, String text4, String text5, String text6, String text7, String text8,
			String text9, String text10, String frominvioid, String toinvioid, String lastModificator,
			Date lastModifyTime, String billchecker, String transactor, Date invmovedate, String fromemp,
			String toemp) {
		this.invmoveid = invmoveid;
		this.invmovetype = invmovetype;
		this.invmovestate = invmovestate;
		this.reasoncode = reasoncode;
		this.totalamount = totalamount;
		this.fromwarehouse = fromwarehouse;
		this.towarehouse = towarehouse;
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
		this.frominvioid = frominvioid;
		this.toinvioid = toinvioid;
		this.lastModificator = lastModificator;
		this.lastModifyTime = lastModifyTime;
		this.billchecker = billchecker;
		this.transactor = transactor;
		this.invmovedate = invmovedate;
		this.fromemp = fromemp;
		this.toemp = toemp;
	}

	public String getInvmoveid() {
		return this.invmoveid;
	}

	public void setInvmoveid(String invmoveid) {
		this.invmoveid = invmoveid;
	}

	public Long getInvmovetype() {
		return this.invmovetype;
	}

	public void setInvmovetype(Long invmovetype) {
		this.invmovetype = invmovetype;
	}

	public Long getInvmovestate() {
		return this.invmovestate;
	}

	public void setInvmovestate(Long invmovestate) {
		this.invmovestate = invmovestate;
	}

	public String getReasoncode() {
		return this.reasoncode;
	}

	public void setReasoncode(String reasoncode) {
		this.reasoncode = reasoncode;
	}

	public BigDecimal getTotalamount() {
		return this.totalamount;
	}

	public void setTotalamount(BigDecimal totalamount) {
		this.totalamount = totalamount;
	}

	public String getFromwarehouse() {
		return this.fromwarehouse;
	}

	public void setFromwarehouse(String fromwarehouse) {
		this.fromwarehouse = fromwarehouse;
	}

	public String getTowarehouse() {
		return this.towarehouse;
	}

	public void setTowarehouse(String towarehouse) {
		this.towarehouse = towarehouse;
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

	public String getFrominvioid() {
		return this.frominvioid;
	}

	public void setFrominvioid(String frominvioid) {
		this.frominvioid = frominvioid;
	}

	public String getToinvioid() {
		return this.toinvioid;
	}

	public void setToinvioid(String toinvioid) {
		this.toinvioid = toinvioid;
	}

	public String getLastModificator() {
		return this.lastModificator;
	}

	public void setLastModificator(String lastModificator) {
		this.lastModificator = lastModificator;
	}

	public Date getLastModifyTime() {
		return this.lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public String getBillchecker() {
		return this.billchecker;
	}

	public void setBillchecker(String billchecker) {
		this.billchecker = billchecker;
	}

	public String getTransactor() {
		return this.transactor;
	}

	public void setTransactor(String transactor) {
		this.transactor = transactor;
	}

	public Date getInvmovedate() {
		return this.invmovedate;
	}

	public void setInvmovedate(Date invmovedate) {
		this.invmovedate = invmovedate;
	}

	public String getFromemp() {
		return this.fromemp;
	}

	public void setFromemp(String fromemp) {
		this.fromemp = fromemp;
	}

	public String getToemp() {
		return this.toemp;
	}

	public void setToemp(String toemp) {
		this.toemp = toemp;
	}

}