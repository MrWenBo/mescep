package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * JbpmSwimlane generated by hbm2java
 */
public class JbpmSwimlane implements java.io.Serializable {

	private BigDecimal id;
	private JbpmDelegation jbpmDelegation;
	private JbpmModuledefinition jbpmModuledefinition;
	private String name;
	private String actoridexpression;
	private String pooledactorsexpression;
	private Set jbpmSwimlaneinstances = new HashSet(0);
	private Set jbpmTasks = new HashSet(0);

	public JbpmSwimlane() {
	}

	public JbpmSwimlane(BigDecimal id) {
		this.id = id;
	}

	public JbpmSwimlane(BigDecimal id, JbpmDelegation jbpmDelegation, JbpmModuledefinition jbpmModuledefinition,
			String name, String actoridexpression, String pooledactorsexpression, Set jbpmSwimlaneinstances,
			Set jbpmTasks) {
		this.id = id;
		this.jbpmDelegation = jbpmDelegation;
		this.jbpmModuledefinition = jbpmModuledefinition;
		this.name = name;
		this.actoridexpression = actoridexpression;
		this.pooledactorsexpression = pooledactorsexpression;
		this.jbpmSwimlaneinstances = jbpmSwimlaneinstances;
		this.jbpmTasks = jbpmTasks;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JbpmDelegation getJbpmDelegation() {
		return this.jbpmDelegation;
	}

	public void setJbpmDelegation(JbpmDelegation jbpmDelegation) {
		this.jbpmDelegation = jbpmDelegation;
	}

	public JbpmModuledefinition getJbpmModuledefinition() {
		return this.jbpmModuledefinition;
	}

	public void setJbpmModuledefinition(JbpmModuledefinition jbpmModuledefinition) {
		this.jbpmModuledefinition = jbpmModuledefinition;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActoridexpression() {
		return this.actoridexpression;
	}

	public void setActoridexpression(String actoridexpression) {
		this.actoridexpression = actoridexpression;
	}

	public String getPooledactorsexpression() {
		return this.pooledactorsexpression;
	}

	public void setPooledactorsexpression(String pooledactorsexpression) {
		this.pooledactorsexpression = pooledactorsexpression;
	}

	public Set getJbpmSwimlaneinstances() {
		return this.jbpmSwimlaneinstances;
	}

	public void setJbpmSwimlaneinstances(Set jbpmSwimlaneinstances) {
		this.jbpmSwimlaneinstances = jbpmSwimlaneinstances;
	}

	public Set getJbpmTasks() {
		return this.jbpmTasks;
	}

	public void setJbpmTasks(Set jbpmTasks) {
		this.jbpmTasks = jbpmTasks;
	}

}