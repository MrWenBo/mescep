package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * IMonthcheckheader generated by hbm2java
 */
public class IMonthcheckheader implements java.io.Serializable {

	private String invmonthcheckid;
	private Long monthchecktype;
	private String warehouseid;
	private Date startdate;
	private Date enddate;
	private String billchecker;
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
	private Short accountantYear;
	private Byte accountantMonth;
	private String invmonthcheckname;

	public IMonthcheckheader() {
	}

	public IMonthcheckheader(String invmonthcheckid, String warehouseid) {
		this.invmonthcheckid = invmonthcheckid;
		this.warehouseid = warehouseid;
	}

	public IMonthcheckheader(String invmonthcheckid, Long monthchecktype, String warehouseid, Date startdate,
			Date enddate, String billchecker, String creator, Date createtime, String notes, String text1, String text2,
			String text3, String text4, String text5, String text6, String text7, String text8, String text9,
			String text10, Short accountantYear, Byte accountantMonth, String invmonthcheckname) {
		this.invmonthcheckid = invmonthcheckid;
		this.monthchecktype = monthchecktype;
		this.warehouseid = warehouseid;
		this.startdate = startdate;
		this.enddate = enddate;
		this.billchecker = billchecker;
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
		this.accountantYear = accountantYear;
		this.accountantMonth = accountantMonth;
		this.invmonthcheckname = invmonthcheckname;
	}

	public String getInvmonthcheckid() {
		return this.invmonthcheckid;
	}

	public void setInvmonthcheckid(String invmonthcheckid) {
		this.invmonthcheckid = invmonthcheckid;
	}

	public Long getMonthchecktype() {
		return this.monthchecktype;
	}

	public void setMonthchecktype(Long monthchecktype) {
		this.monthchecktype = monthchecktype;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getBillchecker() {
		return this.billchecker;
	}

	public void setBillchecker(String billchecker) {
		this.billchecker = billchecker;
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

	public Short getAccountantYear() {
		return this.accountantYear;
	}

	public void setAccountantYear(Short accountantYear) {
		this.accountantYear = accountantYear;
	}

	public Byte getAccountantMonth() {
		return this.accountantMonth;
	}

	public void setAccountantMonth(Byte accountantMonth) {
		this.accountantMonth = accountantMonth;
	}

	public String getInvmonthcheckname() {
		return this.invmonthcheckname;
	}

	public void setInvmonthcheckname(String invmonthcheckname) {
		this.invmonthcheckname = invmonthcheckname;
	}

}
