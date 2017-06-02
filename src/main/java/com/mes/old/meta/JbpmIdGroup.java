package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * JbpmIdGroup generated by hbm2java
 */
public class JbpmIdGroup implements java.io.Serializable {

	private BigDecimal id;
	private JbpmIdGroup jbpmIdGroup;
	private char class_;
	private String name;
	private String type;
	private Set jbpmIdGroups = new HashSet(0);
	private Set jbpmIdMemberships = new HashSet(0);

	public JbpmIdGroup() {
	}

	public JbpmIdGroup(BigDecimal id, char class_) {
		this.id = id;
		this.class_ = class_;
	}

	public JbpmIdGroup(BigDecimal id, JbpmIdGroup jbpmIdGroup, char class_, String name, String type, Set jbpmIdGroups,
			Set jbpmIdMemberships) {
		this.id = id;
		this.jbpmIdGroup = jbpmIdGroup;
		this.class_ = class_;
		this.name = name;
		this.type = type;
		this.jbpmIdGroups = jbpmIdGroups;
		this.jbpmIdMemberships = jbpmIdMemberships;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JbpmIdGroup getJbpmIdGroup() {
		return this.jbpmIdGroup;
	}

	public void setJbpmIdGroup(JbpmIdGroup jbpmIdGroup) {
		this.jbpmIdGroup = jbpmIdGroup;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set getJbpmIdGroups() {
		return this.jbpmIdGroups;
	}

	public void setJbpmIdGroups(Set jbpmIdGroups) {
		this.jbpmIdGroups = jbpmIdGroups;
	}

	public Set getJbpmIdMemberships() {
		return this.jbpmIdMemberships;
	}

	public void setJbpmIdMemberships(Set jbpmIdMemberships) {
		this.jbpmIdMemberships = jbpmIdMemberships;
	}

}