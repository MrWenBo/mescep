package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JbpmProcessinstance generated by hbm2java
 */
public class JbpmProcessinstance implements java.io.Serializable {

	private BigDecimal id;
	private JbpmProcessdefinition jbpmProcessdefinition;
	private JbpmToken jbpmTokenBySuperprocesstoken;
	private JbpmToken jbpmTokenByRoottoken;
	private long version;
	private Date start;
	private Date end;
	private Boolean issuspended;
	private Set jbpmTimers = new HashSet(0);
	private Set jbpmModuleinstances = new HashSet(0);
	private Set jbpmVariableinstances = new HashSet(0);
	private Set jbpmRuntimeactions = new HashSet(0);
	private Set jbpmTokensForSubprocessinstance = new HashSet(0);
	private Set jbpmTokensForProcessinstance = new HashSet(0);

	public JbpmProcessinstance() {
	}

	public JbpmProcessinstance(BigDecimal id, long version) {
		this.id = id;
		this.version = version;
	}

	public JbpmProcessinstance(BigDecimal id, JbpmProcessdefinition jbpmProcessdefinition,
			JbpmToken jbpmTokenBySuperprocesstoken, JbpmToken jbpmTokenByRoottoken, long version, Date start, Date end,
			Boolean issuspended, Set jbpmTimers, Set jbpmModuleinstances, Set jbpmVariableinstances,
			Set jbpmRuntimeactions, Set jbpmTokensForSubprocessinstance, Set jbpmTokensForProcessinstance) {
		this.id = id;
		this.jbpmProcessdefinition = jbpmProcessdefinition;
		this.jbpmTokenBySuperprocesstoken = jbpmTokenBySuperprocesstoken;
		this.jbpmTokenByRoottoken = jbpmTokenByRoottoken;
		this.version = version;
		this.start = start;
		this.end = end;
		this.issuspended = issuspended;
		this.jbpmTimers = jbpmTimers;
		this.jbpmModuleinstances = jbpmModuleinstances;
		this.jbpmVariableinstances = jbpmVariableinstances;
		this.jbpmRuntimeactions = jbpmRuntimeactions;
		this.jbpmTokensForSubprocessinstance = jbpmTokensForSubprocessinstance;
		this.jbpmTokensForProcessinstance = jbpmTokensForProcessinstance;
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

	public JbpmToken getJbpmTokenBySuperprocesstoken() {
		return this.jbpmTokenBySuperprocesstoken;
	}

	public void setJbpmTokenBySuperprocesstoken(JbpmToken jbpmTokenBySuperprocesstoken) {
		this.jbpmTokenBySuperprocesstoken = jbpmTokenBySuperprocesstoken;
	}

	public JbpmToken getJbpmTokenByRoottoken() {
		return this.jbpmTokenByRoottoken;
	}

	public void setJbpmTokenByRoottoken(JbpmToken jbpmTokenByRoottoken) {
		this.jbpmTokenByRoottoken = jbpmTokenByRoottoken;
	}

	public long getVersion() {
		return this.version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public Date getStart() {
		return this.start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Boolean getIssuspended() {
		return this.issuspended;
	}

	public void setIssuspended(Boolean issuspended) {
		this.issuspended = issuspended;
	}

	public Set getJbpmTimers() {
		return this.jbpmTimers;
	}

	public void setJbpmTimers(Set jbpmTimers) {
		this.jbpmTimers = jbpmTimers;
	}

	public Set getJbpmModuleinstances() {
		return this.jbpmModuleinstances;
	}

	public void setJbpmModuleinstances(Set jbpmModuleinstances) {
		this.jbpmModuleinstances = jbpmModuleinstances;
	}

	public Set getJbpmVariableinstances() {
		return this.jbpmVariableinstances;
	}

	public void setJbpmVariableinstances(Set jbpmVariableinstances) {
		this.jbpmVariableinstances = jbpmVariableinstances;
	}

	public Set getJbpmRuntimeactions() {
		return this.jbpmRuntimeactions;
	}

	public void setJbpmRuntimeactions(Set jbpmRuntimeactions) {
		this.jbpmRuntimeactions = jbpmRuntimeactions;
	}

	public Set getJbpmTokensForSubprocessinstance() {
		return this.jbpmTokensForSubprocessinstance;
	}

	public void setJbpmTokensForSubprocessinstance(Set jbpmTokensForSubprocessinstance) {
		this.jbpmTokensForSubprocessinstance = jbpmTokensForSubprocessinstance;
	}

	public Set getJbpmTokensForProcessinstance() {
		return this.jbpmTokensForProcessinstance;
	}

	public void setJbpmTokensForProcessinstance(Set jbpmTokensForProcessinstance) {
		this.jbpmTokensForProcessinstance = jbpmTokensForProcessinstance;
	}

}