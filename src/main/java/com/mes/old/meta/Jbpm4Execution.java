package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Jbpm4Execution generated by hbm2java
 */
public class Jbpm4Execution implements java.io.Serializable {

	private BigDecimal dbid;
	private Jbpm4Execution jbpm4ExecutionByInstance;
	private Jbpm4Execution jbpm4ExecutionBySubprocinst;
	private Jbpm4Execution jbpm4ExecutionByParent;
	private Jbpm4Execution jbpm4ExecutionBySuperexec;
	private String class_;
	private long dbversion;
	private String activityname;
	private String procdefid;
	private Boolean hasvars;
	private String name;
	private String key;
	private String id;
	private String state;
	private String susphiststate;
	private Long priority;
	private BigDecimal hisactinst;
	private Long parentIdx;
	private Set jbpm4ExecutionsForInstance = new HashSet(0);
	private Set jbpm4ExecutionsForSubprocinst = new HashSet(0);
	private Set jbpm4ExecutionsForParent = new HashSet(0);
	private Set jbpm4ExecutionsForSuperexec = new HashSet(0);
	private Set jbpm4Swimlanes = new HashSet(0);
	private Set jbpm4VariablesForExesys = new HashSet(0);
	private Set jbpm4VariablesForExecution = new HashSet(0);

	public Jbpm4Execution() {
	}

	public Jbpm4Execution(BigDecimal dbid, String class_, long dbversion) {
		this.dbid = dbid;
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	public Jbpm4Execution(BigDecimal dbid, Jbpm4Execution jbpm4ExecutionByInstance,
			Jbpm4Execution jbpm4ExecutionBySubprocinst, Jbpm4Execution jbpm4ExecutionByParent,
			Jbpm4Execution jbpm4ExecutionBySuperexec, String class_, long dbversion, String activityname,
			String procdefid, Boolean hasvars, String name, String key, String id, String state, String susphiststate,
			Long priority, BigDecimal hisactinst, Long parentIdx, Set jbpm4ExecutionsForInstance,
			Set jbpm4ExecutionsForSubprocinst, Set jbpm4ExecutionsForParent, Set jbpm4ExecutionsForSuperexec,
			Set jbpm4Swimlanes, Set jbpm4VariablesForExesys, Set jbpm4VariablesForExecution) {
		this.dbid = dbid;
		this.jbpm4ExecutionByInstance = jbpm4ExecutionByInstance;
		this.jbpm4ExecutionBySubprocinst = jbpm4ExecutionBySubprocinst;
		this.jbpm4ExecutionByParent = jbpm4ExecutionByParent;
		this.jbpm4ExecutionBySuperexec = jbpm4ExecutionBySuperexec;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.activityname = activityname;
		this.procdefid = procdefid;
		this.hasvars = hasvars;
		this.name = name;
		this.key = key;
		this.id = id;
		this.state = state;
		this.susphiststate = susphiststate;
		this.priority = priority;
		this.hisactinst = hisactinst;
		this.parentIdx = parentIdx;
		this.jbpm4ExecutionsForInstance = jbpm4ExecutionsForInstance;
		this.jbpm4ExecutionsForSubprocinst = jbpm4ExecutionsForSubprocinst;
		this.jbpm4ExecutionsForParent = jbpm4ExecutionsForParent;
		this.jbpm4ExecutionsForSuperexec = jbpm4ExecutionsForSuperexec;
		this.jbpm4Swimlanes = jbpm4Swimlanes;
		this.jbpm4VariablesForExesys = jbpm4VariablesForExesys;
		this.jbpm4VariablesForExecution = jbpm4VariablesForExecution;
	}

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public Jbpm4Execution getJbpm4ExecutionByInstance() {
		return this.jbpm4ExecutionByInstance;
	}

	public void setJbpm4ExecutionByInstance(Jbpm4Execution jbpm4ExecutionByInstance) {
		this.jbpm4ExecutionByInstance = jbpm4ExecutionByInstance;
	}

	public Jbpm4Execution getJbpm4ExecutionBySubprocinst() {
		return this.jbpm4ExecutionBySubprocinst;
	}

	public void setJbpm4ExecutionBySubprocinst(Jbpm4Execution jbpm4ExecutionBySubprocinst) {
		this.jbpm4ExecutionBySubprocinst = jbpm4ExecutionBySubprocinst;
	}

	public Jbpm4Execution getJbpm4ExecutionByParent() {
		return this.jbpm4ExecutionByParent;
	}

	public void setJbpm4ExecutionByParent(Jbpm4Execution jbpm4ExecutionByParent) {
		this.jbpm4ExecutionByParent = jbpm4ExecutionByParent;
	}

	public Jbpm4Execution getJbpm4ExecutionBySuperexec() {
		return this.jbpm4ExecutionBySuperexec;
	}

	public void setJbpm4ExecutionBySuperexec(Jbpm4Execution jbpm4ExecutionBySuperexec) {
		this.jbpm4ExecutionBySuperexec = jbpm4ExecutionBySuperexec;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public long getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(long dbversion) {
		this.dbversion = dbversion;
	}

	public String getActivityname() {
		return this.activityname;
	}

	public void setActivityname(String activityname) {
		this.activityname = activityname;
	}

	public String getProcdefid() {
		return this.procdefid;
	}

	public void setProcdefid(String procdefid) {
		this.procdefid = procdefid;
	}

	public Boolean getHasvars() {
		return this.hasvars;
	}

	public void setHasvars(Boolean hasvars) {
		this.hasvars = hasvars;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSusphiststate() {
		return this.susphiststate;
	}

	public void setSusphiststate(String susphiststate) {
		this.susphiststate = susphiststate;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public BigDecimal getHisactinst() {
		return this.hisactinst;
	}

	public void setHisactinst(BigDecimal hisactinst) {
		this.hisactinst = hisactinst;
	}

	public Long getParentIdx() {
		return this.parentIdx;
	}

	public void setParentIdx(Long parentIdx) {
		this.parentIdx = parentIdx;
	}

	public Set getJbpm4ExecutionsForInstance() {
		return this.jbpm4ExecutionsForInstance;
	}

	public void setJbpm4ExecutionsForInstance(Set jbpm4ExecutionsForInstance) {
		this.jbpm4ExecutionsForInstance = jbpm4ExecutionsForInstance;
	}

	public Set getJbpm4ExecutionsForSubprocinst() {
		return this.jbpm4ExecutionsForSubprocinst;
	}

	public void setJbpm4ExecutionsForSubprocinst(Set jbpm4ExecutionsForSubprocinst) {
		this.jbpm4ExecutionsForSubprocinst = jbpm4ExecutionsForSubprocinst;
	}

	public Set getJbpm4ExecutionsForParent() {
		return this.jbpm4ExecutionsForParent;
	}

	public void setJbpm4ExecutionsForParent(Set jbpm4ExecutionsForParent) {
		this.jbpm4ExecutionsForParent = jbpm4ExecutionsForParent;
	}

	public Set getJbpm4ExecutionsForSuperexec() {
		return this.jbpm4ExecutionsForSuperexec;
	}

	public void setJbpm4ExecutionsForSuperexec(Set jbpm4ExecutionsForSuperexec) {
		this.jbpm4ExecutionsForSuperexec = jbpm4ExecutionsForSuperexec;
	}

	public Set getJbpm4Swimlanes() {
		return this.jbpm4Swimlanes;
	}

	public void setJbpm4Swimlanes(Set jbpm4Swimlanes) {
		this.jbpm4Swimlanes = jbpm4Swimlanes;
	}

	public Set getJbpm4VariablesForExesys() {
		return this.jbpm4VariablesForExesys;
	}

	public void setJbpm4VariablesForExesys(Set jbpm4VariablesForExesys) {
		this.jbpm4VariablesForExesys = jbpm4VariablesForExesys;
	}

	public Set getJbpm4VariablesForExecution() {
		return this.jbpm4VariablesForExecution;
	}

	public void setJbpm4VariablesForExecution(Set jbpm4VariablesForExecution) {
		this.jbpm4VariablesForExecution = jbpm4VariablesForExecution;
	}

}
