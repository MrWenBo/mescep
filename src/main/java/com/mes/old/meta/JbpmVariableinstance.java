package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JbpmVariableinstance generated by hbm2java
 */
public class JbpmVariableinstance implements java.io.Serializable {

	private BigDecimal id;
	private JbpmBytearray jbpmBytearray;
	private JbpmProcessinstance jbpmProcessinstance;
	private JbpmTaskinstance jbpmTaskinstance;
	private JbpmToken jbpmToken;
	private JbpmTokenvariablemap jbpmTokenvariablemap;
	private char class_;
	private String name;
	private Character converter;
	private Date datevalue;
	private Double doublevalue;
	private String longidclass;
	private BigDecimal longvalue;
	private String stringidclass;
	private String stringvalue;
	private Set jbpmLogs = new HashSet(0);

	public JbpmVariableinstance() {
	}

	public JbpmVariableinstance(BigDecimal id, char class_) {
		this.id = id;
		this.class_ = class_;
	}

	public JbpmVariableinstance(BigDecimal id, JbpmBytearray jbpmBytearray, JbpmProcessinstance jbpmProcessinstance,
			JbpmTaskinstance jbpmTaskinstance, JbpmToken jbpmToken, JbpmTokenvariablemap jbpmTokenvariablemap,
			char class_, String name, Character converter, Date datevalue, Double doublevalue, String longidclass,
			BigDecimal longvalue, String stringidclass, String stringvalue, Set jbpmLogs) {
		this.id = id;
		this.jbpmBytearray = jbpmBytearray;
		this.jbpmProcessinstance = jbpmProcessinstance;
		this.jbpmTaskinstance = jbpmTaskinstance;
		this.jbpmToken = jbpmToken;
		this.jbpmTokenvariablemap = jbpmTokenvariablemap;
		this.class_ = class_;
		this.name = name;
		this.converter = converter;
		this.datevalue = datevalue;
		this.doublevalue = doublevalue;
		this.longidclass = longidclass;
		this.longvalue = longvalue;
		this.stringidclass = stringidclass;
		this.stringvalue = stringvalue;
		this.jbpmLogs = jbpmLogs;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JbpmBytearray getJbpmBytearray() {
		return this.jbpmBytearray;
	}

	public void setJbpmBytearray(JbpmBytearray jbpmBytearray) {
		this.jbpmBytearray = jbpmBytearray;
	}

	public JbpmProcessinstance getJbpmProcessinstance() {
		return this.jbpmProcessinstance;
	}

	public void setJbpmProcessinstance(JbpmProcessinstance jbpmProcessinstance) {
		this.jbpmProcessinstance = jbpmProcessinstance;
	}

	public JbpmTaskinstance getJbpmTaskinstance() {
		return this.jbpmTaskinstance;
	}

	public void setJbpmTaskinstance(JbpmTaskinstance jbpmTaskinstance) {
		this.jbpmTaskinstance = jbpmTaskinstance;
	}

	public JbpmToken getJbpmToken() {
		return this.jbpmToken;
	}

	public void setJbpmToken(JbpmToken jbpmToken) {
		this.jbpmToken = jbpmToken;
	}

	public JbpmTokenvariablemap getJbpmTokenvariablemap() {
		return this.jbpmTokenvariablemap;
	}

	public void setJbpmTokenvariablemap(JbpmTokenvariablemap jbpmTokenvariablemap) {
		this.jbpmTokenvariablemap = jbpmTokenvariablemap;
	}

	public char getClass_() {
		return this.class_;
	}

	public void setClass_(char class_) {
		this.class_ = class_;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getConverter() {
		return this.converter;
	}

	public void setConverter(Character converter) {
		this.converter = converter;
	}

	public Date getDatevalue() {
		return this.datevalue;
	}

	public void setDatevalue(Date datevalue) {
		this.datevalue = datevalue;
	}

	public Double getDoublevalue() {
		return this.doublevalue;
	}

	public void setDoublevalue(Double doublevalue) {
		this.doublevalue = doublevalue;
	}

	public String getLongidclass() {
		return this.longidclass;
	}

	public void setLongidclass(String longidclass) {
		this.longidclass = longidclass;
	}

	public BigDecimal getLongvalue() {
		return this.longvalue;
	}

	public void setLongvalue(BigDecimal longvalue) {
		this.longvalue = longvalue;
	}

	public String getStringidclass() {
		return this.stringidclass;
	}

	public void setStringidclass(String stringidclass) {
		this.stringidclass = stringidclass;
	}

	public String getStringvalue() {
		return this.stringvalue;
	}

	public void setStringvalue(String stringvalue) {
		this.stringvalue = stringvalue;
	}

	public Set getJbpmLogs() {
		return this.jbpmLogs;
	}

	public void setJbpmLogs(Set jbpmLogs) {
		this.jbpmLogs = jbpmLogs;
	}

}
