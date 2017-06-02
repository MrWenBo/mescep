package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * SCoderule generated by hbm2java
 */
public class SCoderule implements java.io.Serializable {

	private SCoderuleId id;
	private BigDecimal uniqueid;
	private String codefielddesc;
	private Long fieldorder;
	private String note;
	private String placeholder;
	private Byte isplaceholderbefore;
	private Long fieldlength;
	private String parakey;
	private String paraname;
	private Date createtime;
	private String sntablename;
	private String snfieldname;
	private Byte isautosn;
	private BigDecimal lastuniqueid;

	public SCoderule() {
	}

	public SCoderule(SCoderuleId id, BigDecimal uniqueid) {
		this.id = id;
		this.uniqueid = uniqueid;
	}

	public SCoderule(SCoderuleId id, BigDecimal uniqueid, String codefielddesc, Long fieldorder, String note,
			String placeholder, Byte isplaceholderbefore, Long fieldlength, String parakey, String paraname,
			Date createtime, String sntablename, String snfieldname, Byte isautosn, BigDecimal lastuniqueid) {
		this.id = id;
		this.uniqueid = uniqueid;
		this.codefielddesc = codefielddesc;
		this.fieldorder = fieldorder;
		this.note = note;
		this.placeholder = placeholder;
		this.isplaceholderbefore = isplaceholderbefore;
		this.fieldlength = fieldlength;
		this.parakey = parakey;
		this.paraname = paraname;
		this.createtime = createtime;
		this.sntablename = sntablename;
		this.snfieldname = snfieldname;
		this.isautosn = isautosn;
		this.lastuniqueid = lastuniqueid;
	}

	public SCoderuleId getId() {
		return this.id;
	}

	public void setId(SCoderuleId id) {
		this.id = id;
	}

	public BigDecimal getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(BigDecimal uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getCodefielddesc() {
		return this.codefielddesc;
	}

	public void setCodefielddesc(String codefielddesc) {
		this.codefielddesc = codefielddesc;
	}

	public Long getFieldorder() {
		return this.fieldorder;
	}

	public void setFieldorder(Long fieldorder) {
		this.fieldorder = fieldorder;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPlaceholder() {
		return this.placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public Byte getIsplaceholderbefore() {
		return this.isplaceholderbefore;
	}

	public void setIsplaceholderbefore(Byte isplaceholderbefore) {
		this.isplaceholderbefore = isplaceholderbefore;
	}

	public Long getFieldlength() {
		return this.fieldlength;
	}

	public void setFieldlength(Long fieldlength) {
		this.fieldlength = fieldlength;
	}

	public String getParakey() {
		return this.parakey;
	}

	public void setParakey(String parakey) {
		this.parakey = parakey;
	}

	public String getParaname() {
		return this.paraname;
	}

	public void setParaname(String paraname) {
		this.paraname = paraname;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getSntablename() {
		return this.sntablename;
	}

	public void setSntablename(String sntablename) {
		this.sntablename = sntablename;
	}

	public String getSnfieldname() {
		return this.snfieldname;
	}

	public void setSnfieldname(String snfieldname) {
		this.snfieldname = snfieldname;
	}

	public Byte getIsautosn() {
		return this.isautosn;
	}

	public void setIsautosn(Byte isautosn) {
		this.isautosn = isautosn;
	}

	public BigDecimal getLastuniqueid() {
		return this.lastuniqueid;
	}

	public void setLastuniqueid(BigDecimal lastuniqueid) {
		this.lastuniqueid = lastuniqueid;
	}

}
