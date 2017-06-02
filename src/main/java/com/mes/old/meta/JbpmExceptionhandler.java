package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * JbpmExceptionhandler generated by hbm2java
 */
public class JbpmExceptionhandler implements java.io.Serializable {

	private BigDecimal id;
	private String exceptionclassname;
	private Character type;
	private BigDecimal graphelement;
	private BigDecimal processdefinition;
	private Long graphelementindex;
	private BigDecimal node;
	private BigDecimal transition;
	private BigDecimal task;
	private Set jbpmActions = new HashSet(0);

	public JbpmExceptionhandler() {
	}

	public JbpmExceptionhandler(BigDecimal id) {
		this.id = id;
	}

	public JbpmExceptionhandler(BigDecimal id, String exceptionclassname, Character type, BigDecimal graphelement,
			BigDecimal processdefinition, Long graphelementindex, BigDecimal node, BigDecimal transition,
			BigDecimal task, Set jbpmActions) {
		this.id = id;
		this.exceptionclassname = exceptionclassname;
		this.type = type;
		this.graphelement = graphelement;
		this.processdefinition = processdefinition;
		this.graphelementindex = graphelementindex;
		this.node = node;
		this.transition = transition;
		this.task = task;
		this.jbpmActions = jbpmActions;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getExceptionclassname() {
		return this.exceptionclassname;
	}

	public void setExceptionclassname(String exceptionclassname) {
		this.exceptionclassname = exceptionclassname;
	}

	public Character getType() {
		return this.type;
	}

	public void setType(Character type) {
		this.type = type;
	}

	public BigDecimal getGraphelement() {
		return this.graphelement;
	}

	public void setGraphelement(BigDecimal graphelement) {
		this.graphelement = graphelement;
	}

	public BigDecimal getProcessdefinition() {
		return this.processdefinition;
	}

	public void setProcessdefinition(BigDecimal processdefinition) {
		this.processdefinition = processdefinition;
	}

	public Long getGraphelementindex() {
		return this.graphelementindex;
	}

	public void setGraphelementindex(Long graphelementindex) {
		this.graphelementindex = graphelementindex;
	}

	public BigDecimal getNode() {
		return this.node;
	}

	public void setNode(BigDecimal node) {
		this.node = node;
	}

	public BigDecimal getTransition() {
		return this.transition;
	}

	public void setTransition(BigDecimal transition) {
		this.transition = transition;
	}

	public BigDecimal getTask() {
		return this.task;
	}

	public void setTask(BigDecimal task) {
		this.task = task;
	}

	public Set getJbpmActions() {
		return this.jbpmActions;
	}

	public void setJbpmActions(Set jbpmActions) {
		this.jbpmActions = jbpmActions;
	}

}
