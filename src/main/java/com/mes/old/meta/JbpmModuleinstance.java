package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * JbpmModuleinstance generated by hbm2java
 */
public class JbpmModuleinstance implements java.io.Serializable {

	private BigDecimal id;
	private JbpmModuledefinition jbpmModuledefinition;
	private JbpmProcessinstance jbpmProcessinstance;
	private char class_;
	private String name;
	private Set jbpmSwimlaneinstances = new HashSet(0);
	private Set jbpmTokenvariablemaps = new HashSet(0);
	private Set jbpmTaskinstances = new HashSet(0);

	public JbpmModuleinstance() {
	}

	public JbpmModuleinstance(BigDecimal id, char class_) {
		this.id = id;
		this.class_ = class_;
	}

	public JbpmModuleinstance(BigDecimal id, JbpmModuledefinition jbpmModuledefinition,
			JbpmProcessinstance jbpmProcessinstance, char class_, String name, Set jbpmSwimlaneinstances,
			Set jbpmTokenvariablemaps, Set jbpmTaskinstances) {
		this.id = id;
		this.jbpmModuledefinition = jbpmModuledefinition;
		this.jbpmProcessinstance = jbpmProcessinstance;
		this.class_ = class_;
		this.name = name;
		this.jbpmSwimlaneinstances = jbpmSwimlaneinstances;
		this.jbpmTokenvariablemaps = jbpmTokenvariablemaps;
		this.jbpmTaskinstances = jbpmTaskinstances;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JbpmModuledefinition getJbpmModuledefinition() {
		return this.jbpmModuledefinition;
	}

	public void setJbpmModuledefinition(JbpmModuledefinition jbpmModuledefinition) {
		this.jbpmModuledefinition = jbpmModuledefinition;
	}

	public JbpmProcessinstance getJbpmProcessinstance() {
		return this.jbpmProcessinstance;
	}

	public void setJbpmProcessinstance(JbpmProcessinstance jbpmProcessinstance) {
		this.jbpmProcessinstance = jbpmProcessinstance;
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

	public Set getJbpmSwimlaneinstances() {
		return this.jbpmSwimlaneinstances;
	}

	public void setJbpmSwimlaneinstances(Set jbpmSwimlaneinstances) {
		this.jbpmSwimlaneinstances = jbpmSwimlaneinstances;
	}

	public Set getJbpmTokenvariablemaps() {
		return this.jbpmTokenvariablemaps;
	}

	public void setJbpmTokenvariablemaps(Set jbpmTokenvariablemaps) {
		this.jbpmTokenvariablemaps = jbpmTokenvariablemaps;
	}

	public Set getJbpmTaskinstances() {
		return this.jbpmTaskinstances;
	}

	public void setJbpmTaskinstances(Set jbpmTaskinstances) {
		this.jbpmTaskinstances = jbpmTaskinstances;
	}

}
