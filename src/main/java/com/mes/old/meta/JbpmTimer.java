package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * JbpmTimer generated by hbm2java
 */
public class JbpmTimer implements java.io.Serializable {

	private BigDecimal id;
	private JbpmAction jbpmAction;
	private JbpmProcessinstance jbpmProcessinstance;
	private JbpmTaskinstance jbpmTaskinstance;
	private JbpmToken jbpmToken;
	private String name;
	private Date duedate;
	private String repeat;
	private String transitionname;
	private String exception;
	private Boolean issuspended;
	private String graphelementtype;
	private BigDecimal graphelement;

	public JbpmTimer() {
	}

	public JbpmTimer(BigDecimal id) {
		this.id = id;
	}

	public JbpmTimer(BigDecimal id, JbpmAction jbpmAction, JbpmProcessinstance jbpmProcessinstance,
			JbpmTaskinstance jbpmTaskinstance, JbpmToken jbpmToken, String name, Date duedate, String repeat,
			String transitionname, String exception, Boolean issuspended, String graphelementtype,
			BigDecimal graphelement) {
		this.id = id;
		this.jbpmAction = jbpmAction;
		this.jbpmProcessinstance = jbpmProcessinstance;
		this.jbpmTaskinstance = jbpmTaskinstance;
		this.jbpmToken = jbpmToken;
		this.name = name;
		this.duedate = duedate;
		this.repeat = repeat;
		this.transitionname = transitionname;
		this.exception = exception;
		this.issuspended = issuspended;
		this.graphelementtype = graphelementtype;
		this.graphelement = graphelement;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDuedate() {
		return this.duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public String getRepeat() {
		return this.repeat;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

	public String getTransitionname() {
		return this.transitionname;
	}

	public void setTransitionname(String transitionname) {
		this.transitionname = transitionname;
	}

	public String getException() {
		return this.exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public Boolean getIssuspended() {
		return this.issuspended;
	}

	public void setIssuspended(Boolean issuspended) {
		this.issuspended = issuspended;
	}

	public String getGraphelementtype() {
		return this.graphelementtype;
	}

	public void setGraphelementtype(String graphelementtype) {
		this.graphelementtype = graphelementtype;
	}

	public BigDecimal getGraphelement() {
		return this.graphelement;
	}

	public void setGraphelement(BigDecimal graphelement) {
		this.graphelement = graphelement;
	}

}