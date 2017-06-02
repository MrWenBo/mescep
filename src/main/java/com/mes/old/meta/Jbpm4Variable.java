package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Clob;

/**
 * Jbpm4Variable generated by hbm2java
 */
public class Jbpm4Variable implements java.io.Serializable {

	private BigDecimal dbid;
	private Jbpm4Execution jbpm4ExecutionByExesys;
	private Jbpm4Execution jbpm4ExecutionByExecution;
	private Jbpm4Lob jbpm4Lob;
	private Jbpm4Task jbpm4Task;
	private String class_;
	private long dbversion;
	private String key;
	private String converter;
	private Boolean hist;
	private Serializable dateValue;
	private Double doubleValue;
	private String classname;
	private BigDecimal longValue;
	private String stringValue;
	private Clob textValue;

	public Jbpm4Variable() {
	}

	public Jbpm4Variable(BigDecimal dbid, String class_, long dbversion) {
		this.dbid = dbid;
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	public Jbpm4Variable(BigDecimal dbid, Jbpm4Execution jbpm4ExecutionByExesys,
			Jbpm4Execution jbpm4ExecutionByExecution, Jbpm4Lob jbpm4Lob, Jbpm4Task jbpm4Task, String class_,
			long dbversion, String key, String converter, Boolean hist, Serializable dateValue, Double doubleValue,
			String classname, BigDecimal longValue, String stringValue, Clob textValue) {
		this.dbid = dbid;
		this.jbpm4ExecutionByExesys = jbpm4ExecutionByExesys;
		this.jbpm4ExecutionByExecution = jbpm4ExecutionByExecution;
		this.jbpm4Lob = jbpm4Lob;
		this.jbpm4Task = jbpm4Task;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.key = key;
		this.converter = converter;
		this.hist = hist;
		this.dateValue = dateValue;
		this.doubleValue = doubleValue;
		this.classname = classname;
		this.longValue = longValue;
		this.stringValue = stringValue;
		this.textValue = textValue;
	}

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public Jbpm4Execution getJbpm4ExecutionByExesys() {
		return this.jbpm4ExecutionByExesys;
	}

	public void setJbpm4ExecutionByExesys(Jbpm4Execution jbpm4ExecutionByExesys) {
		this.jbpm4ExecutionByExesys = jbpm4ExecutionByExesys;
	}

	public Jbpm4Execution getJbpm4ExecutionByExecution() {
		return this.jbpm4ExecutionByExecution;
	}

	public void setJbpm4ExecutionByExecution(Jbpm4Execution jbpm4ExecutionByExecution) {
		this.jbpm4ExecutionByExecution = jbpm4ExecutionByExecution;
	}

	public Jbpm4Lob getJbpm4Lob() {
		return this.jbpm4Lob;
	}

	public void setJbpm4Lob(Jbpm4Lob jbpm4Lob) {
		this.jbpm4Lob = jbpm4Lob;
	}

	public Jbpm4Task getJbpm4Task() {
		return this.jbpm4Task;
	}

	public void setJbpm4Task(Jbpm4Task jbpm4Task) {
		this.jbpm4Task = jbpm4Task;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public long getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(long dbversion) {
		this.dbversion = dbversion;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getConverter() {
		return this.converter;
	}

	public void setConverter(String converter) {
		this.converter = converter;
	}

	public Boolean getHist() {
		return this.hist;
	}

	public void setHist(Boolean hist) {
		this.hist = hist;
	}

	public Serializable getDateValue() {
		return this.dateValue;
	}

	public void setDateValue(Serializable dateValue) {
		this.dateValue = dateValue;
	}

	public Double getDoubleValue() {
		return this.doubleValue;
	}

	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public BigDecimal getLongValue() {
		return this.longValue;
	}

	public void setLongValue(BigDecimal longValue) {
		this.longValue = longValue;
	}

	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public Clob getTextValue() {
		return this.textValue;
	}

	public void setTextValue(Clob textValue) {
		this.textValue = textValue;
	}

}
