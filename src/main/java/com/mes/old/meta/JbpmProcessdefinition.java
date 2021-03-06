package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * JbpmProcessdefinition generated by hbm2java
 */
public class JbpmProcessdefinition implements java.io.Serializable {

	private BigDecimal id;
	private JbpmNode jbpmNode;
	private String name;
	private Long version;
	private Boolean isterminationimplicit;
	private Set jbpmActions = new HashSet(0);
	private Set jbpmDelegations = new HashSet(0);
	private Set jbpmModuledefinitions = new HashSet(0);
	private Set jbpmNodesForProcessdefinition = new HashSet(0);
	private Set jbpmProcessinstances = new HashSet(0);
	private Set jbpmTasks = new HashSet(0);
	private Set jbpmEvents = new HashSet(0);
	private Set jbpmTransitions = new HashSet(0);
	private Set jbpmNodesForSubprocessdefinition = new HashSet(0);

	public JbpmProcessdefinition() {
	}

	public JbpmProcessdefinition(BigDecimal id) {
		this.id = id;
	}

	public JbpmProcessdefinition(BigDecimal id, JbpmNode jbpmNode, String name, Long version,
			Boolean isterminationimplicit, Set jbpmActions, Set jbpmDelegations, Set jbpmModuledefinitions,
			Set jbpmNodesForProcessdefinition, Set jbpmProcessinstances, Set jbpmTasks, Set jbpmEvents,
			Set jbpmTransitions, Set jbpmNodesForSubprocessdefinition) {
		this.id = id;
		this.jbpmNode = jbpmNode;
		this.name = name;
		this.version = version;
		this.isterminationimplicit = isterminationimplicit;
		this.jbpmActions = jbpmActions;
		this.jbpmDelegations = jbpmDelegations;
		this.jbpmModuledefinitions = jbpmModuledefinitions;
		this.jbpmNodesForProcessdefinition = jbpmNodesForProcessdefinition;
		this.jbpmProcessinstances = jbpmProcessinstances;
		this.jbpmTasks = jbpmTasks;
		this.jbpmEvents = jbpmEvents;
		this.jbpmTransitions = jbpmTransitions;
		this.jbpmNodesForSubprocessdefinition = jbpmNodesForSubprocessdefinition;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JbpmNode getJbpmNode() {
		return this.jbpmNode;
	}

	public void setJbpmNode(JbpmNode jbpmNode) {
		this.jbpmNode = jbpmNode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Boolean getIsterminationimplicit() {
		return this.isterminationimplicit;
	}

	public void setIsterminationimplicit(Boolean isterminationimplicit) {
		this.isterminationimplicit = isterminationimplicit;
	}

	public Set getJbpmActions() {
		return this.jbpmActions;
	}

	public void setJbpmActions(Set jbpmActions) {
		this.jbpmActions = jbpmActions;
	}

	public Set getJbpmDelegations() {
		return this.jbpmDelegations;
	}

	public void setJbpmDelegations(Set jbpmDelegations) {
		this.jbpmDelegations = jbpmDelegations;
	}

	public Set getJbpmModuledefinitions() {
		return this.jbpmModuledefinitions;
	}

	public void setJbpmModuledefinitions(Set jbpmModuledefinitions) {
		this.jbpmModuledefinitions = jbpmModuledefinitions;
	}

	public Set getJbpmNodesForProcessdefinition() {
		return this.jbpmNodesForProcessdefinition;
	}

	public void setJbpmNodesForProcessdefinition(Set jbpmNodesForProcessdefinition) {
		this.jbpmNodesForProcessdefinition = jbpmNodesForProcessdefinition;
	}

	public Set getJbpmProcessinstances() {
		return this.jbpmProcessinstances;
	}

	public void setJbpmProcessinstances(Set jbpmProcessinstances) {
		this.jbpmProcessinstances = jbpmProcessinstances;
	}

	public Set getJbpmTasks() {
		return this.jbpmTasks;
	}

	public void setJbpmTasks(Set jbpmTasks) {
		this.jbpmTasks = jbpmTasks;
	}

	public Set getJbpmEvents() {
		return this.jbpmEvents;
	}

	public void setJbpmEvents(Set jbpmEvents) {
		this.jbpmEvents = jbpmEvents;
	}

	public Set getJbpmTransitions() {
		return this.jbpmTransitions;
	}

	public void setJbpmTransitions(Set jbpmTransitions) {
		this.jbpmTransitions = jbpmTransitions;
	}

	public Set getJbpmNodesForSubprocessdefinition() {
		return this.jbpmNodesForSubprocessdefinition;
	}

	public void setJbpmNodesForSubprocessdefinition(Set jbpmNodesForSubprocessdefinition) {
		this.jbpmNodesForSubprocessdefinition = jbpmNodesForSubprocessdefinition;
	}

}
