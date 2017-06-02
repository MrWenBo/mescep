package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * JbpmVariableaccess generated by hbm2java
 */
public class JbpmVariableaccess implements java.io.Serializable {

	private BigDecimal id;
	private JbpmAction jbpmAction;
	private JbpmNode jbpmNode;
	private JbpmTaskcontroller jbpmTaskcontroller;
	private String variablename;
	private String access;
	private String mappedname;
	private Long index;

	public JbpmVariableaccess() {
	}

	public JbpmVariableaccess(BigDecimal id) {
		this.id = id;
	}

	public JbpmVariableaccess(BigDecimal id, JbpmAction jbpmAction, JbpmNode jbpmNode,
			JbpmTaskcontroller jbpmTaskcontroller, String variablename, String access, String mappedname, Long index) {
		this.id = id;
		this.jbpmAction = jbpmAction;
		this.jbpmNode = jbpmNode;
		this.jbpmTaskcontroller = jbpmTaskcontroller;
		this.variablename = variablename;
		this.access = access;
		this.mappedname = mappedname;
		this.index = index;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JbpmAction getJbpmAction() {
		return this.jbpmAction;
	}

	public void setJbpmAction(JbpmAction jbpmAction) {
		this.jbpmAction = jbpmAction;
	}

	public JbpmNode getJbpmNode() {
		return this.jbpmNode;
	}

	public void setJbpmNode(JbpmNode jbpmNode) {
		this.jbpmNode = jbpmNode;
	}

	public JbpmTaskcontroller getJbpmTaskcontroller() {
		return this.jbpmTaskcontroller;
	}

	public void setJbpmTaskcontroller(JbpmTaskcontroller jbpmTaskcontroller) {
		this.jbpmTaskcontroller = jbpmTaskcontroller;
	}

	public String getVariablename() {
		return this.variablename;
	}

	public void setVariablename(String variablename) {
		this.variablename = variablename;
	}

	public String getAccess() {
		return this.access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getMappedname() {
		return this.mappedname;
	}

	public void setMappedname(String mappedname) {
		this.mappedname = mappedname;
	}

	public Long getIndex() {
		return this.index;
	}

	public void setIndex(Long index) {
		this.index = index;
	}

}
