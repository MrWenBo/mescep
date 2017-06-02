package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * JbpmDelegation generated by hbm2java
 */
public class JbpmDelegation implements java.io.Serializable {

	private BigDecimal id;
	private JbpmProcessdefinition jbpmProcessdefinition;
	private String classname;
	private String configuration;
	private String configtype;
	private Set jbpmSwimlanes = new HashSet(0);
	private Set jbpmActions = new HashSet(0);
	private Set jbpmNodes = new HashSet(0);
	private Set jbpmTasks = new HashSet(0);
	private Set jbpmTaskcontrollers = new HashSet(0);

	public JbpmDelegation() {
	}

	public JbpmDelegation(BigDecimal id) {
		this.id = id;
	}

	public JbpmDelegation(BigDecimal id, JbpmProcessdefinition jbpmProcessdefinition, String classname,
			String configuration, String configtype, Set jbpmSwimlanes, Set jbpmActions, Set jbpmNodes, Set jbpmTasks,
			Set jbpmTaskcontrollers) {
		this.id = id;
		this.jbpmProcessdefinition = jbpmProcessdefinition;
		this.classname = classname;
		this.configuration = configuration;
		this.configtype = configtype;
		this.jbpmSwimlanes = jbpmSwimlanes;
		this.jbpmActions = jbpmActions;
		this.jbpmNodes = jbpmNodes;
		this.jbpmTasks = jbpmTasks;
		this.jbpmTaskcontrollers = jbpmTaskcontrollers;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JbpmProcessdefinition getJbpmProcessdefinition() {
		return this.jbpmProcessdefinition;
	}

	public void setJbpmProcessdefinition(JbpmProcessdefinition jbpmProcessdefinition) {
		this.jbpmProcessdefinition = jbpmProcessdefinition;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getConfigtype() {
		return this.configtype;
	}

	public void setConfigtype(String configtype) {
		this.configtype = configtype;
	}

	public Set getJbpmSwimlanes() {
		return this.jbpmSwimlanes;
	}

	public void setJbpmSwimlanes(Set jbpmSwimlanes) {
		this.jbpmSwimlanes = jbpmSwimlanes;
	}

	public Set getJbpmActions() {
		return this.jbpmActions;
	}

	public void setJbpmActions(Set jbpmActions) {
		this.jbpmActions = jbpmActions;
	}

	public Set getJbpmNodes() {
		return this.jbpmNodes;
	}

	public void setJbpmNodes(Set jbpmNodes) {
		this.jbpmNodes = jbpmNodes;
	}

	public Set getJbpmTasks() {
		return this.jbpmTasks;
	}

	public void setJbpmTasks(Set jbpmTasks) {
		this.jbpmTasks = jbpmTasks;
	}

	public Set getJbpmTaskcontrollers() {
		return this.jbpmTaskcontrollers;
	}

	public void setJbpmTaskcontrollers(Set jbpmTaskcontrollers) {
		this.jbpmTaskcontrollers = jbpmTaskcontrollers;
	}

}
