package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JbpmToken generated by hbm2java
 */
public class JbpmToken implements java.io.Serializable {

	private BigDecimal id;
	private JbpmNode jbpmNode;
	private JbpmProcessinstance jbpmProcessinstanceBySubprocessinstance;
	private JbpmProcessinstance jbpmProcessinstanceByProcessinstance;
	private JbpmToken jbpmToken;
	private long version;
	private String name;
	private Date start;
	private Date end;
	private Date nodeenter;
	private Long nextlogindex;
	private Boolean isabletoreactivateparent;
	private Boolean isterminationimplicit;
	private Boolean issuspended;
	private Set jbpmProcessinstancesForSuperprocesstoken = new HashSet(0);
	private Set jbpmProcessinstancesForRoottoken = new HashSet(0);
	private Set jbpmTimers = new HashSet(0);
	private Set jbpmMessages = new HashSet(0);
	private Set jbpmTaskinstances = new HashSet(0);
	private Set jbpmVariableinstances = new HashSet(0);
	private Set jbpmLogsForChild = new HashSet(0);
	private Set jbpmLogsForToken = new HashSet(0);
	private Set jbpmTokenvariablemaps = new HashSet(0);
	private Set jbpmComments = new HashSet(0);
	private Set jbpmTokens = new HashSet(0);

	public JbpmToken() {
	}

	public JbpmToken(BigDecimal id, long version) {
		this.id = id;
		this.version = version;
	}

	public JbpmToken(BigDecimal id, JbpmNode jbpmNode, JbpmProcessinstance jbpmProcessinstanceBySubprocessinstance,
			JbpmProcessinstance jbpmProcessinstanceByProcessinstance, JbpmToken jbpmToken, long version, String name,
			Date start, Date end, Date nodeenter, Long nextlogindex, Boolean isabletoreactivateparent,
			Boolean isterminationimplicit, Boolean issuspended, Set jbpmProcessinstancesForSuperprocesstoken,
			Set jbpmProcessinstancesForRoottoken, Set jbpmTimers, Set jbpmMessages, Set jbpmTaskinstances,
			Set jbpmVariableinstances, Set jbpmLogsForChild, Set jbpmLogsForToken, Set jbpmTokenvariablemaps,
			Set jbpmComments, Set jbpmTokens) {
		this.id = id;
		this.jbpmNode = jbpmNode;
		this.jbpmProcessinstanceBySubprocessinstance = jbpmProcessinstanceBySubprocessinstance;
		this.jbpmProcessinstanceByProcessinstance = jbpmProcessinstanceByProcessinstance;
		this.jbpmToken = jbpmToken;
		this.version = version;
		this.name = name;
		this.start = start;
		this.end = end;
		this.nodeenter = nodeenter;
		this.nextlogindex = nextlogindex;
		this.isabletoreactivateparent = isabletoreactivateparent;
		this.isterminationimplicit = isterminationimplicit;
		this.issuspended = issuspended;
		this.jbpmProcessinstancesForSuperprocesstoken = jbpmProcessinstancesForSuperprocesstoken;
		this.jbpmProcessinstancesForRoottoken = jbpmProcessinstancesForRoottoken;
		this.jbpmTimers = jbpmTimers;
		this.jbpmMessages = jbpmMessages;
		this.jbpmTaskinstances = jbpmTaskinstances;
		this.jbpmVariableinstances = jbpmVariableinstances;
		this.jbpmLogsForChild = jbpmLogsForChild;
		this.jbpmLogsForToken = jbpmLogsForToken;
		this.jbpmTokenvariablemaps = jbpmTokenvariablemaps;
		this.jbpmComments = jbpmComments;
		this.jbpmTokens = jbpmTokens;
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

	public JbpmProcessinstance getJbpmProcessinstanceBySubprocessinstance() {
		return this.jbpmProcessinstanceBySubprocessinstance;
	}

	public void setJbpmProcessinstanceBySubprocessinstance(
			JbpmProcessinstance jbpmProcessinstanceBySubprocessinstance) {
		this.jbpmProcessinstanceBySubprocessinstance = jbpmProcessinstanceBySubprocessinstance;
	}

	public JbpmProcessinstance getJbpmProcessinstanceByProcessinstance() {
		return this.jbpmProcessinstanceByProcessinstance;
	}

	public void setJbpmProcessinstanceByProcessinstance(JbpmProcessinstance jbpmProcessinstanceByProcessinstance) {
		this.jbpmProcessinstanceByProcessinstance = jbpmProcessinstanceByProcessinstance;
	}

	public JbpmToken getJbpmToken() {
		return this.jbpmToken;
	}

	public void setJbpmToken(JbpmToken jbpmToken) {
		this.jbpmToken = jbpmToken;
	}

	public long getVersion() {
		return this.version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getNodeenter() {
		return this.nodeenter;
	}

	public void setNodeenter(Date nodeenter) {
		this.nodeenter = nodeenter;
	}

	public Long getNextlogindex() {
		return this.nextlogindex;
	}

	public void setNextlogindex(Long nextlogindex) {
		this.nextlogindex = nextlogindex;
	}

	public Boolean getIsabletoreactivateparent() {
		return this.isabletoreactivateparent;
	}

	public void setIsabletoreactivateparent(Boolean isabletoreactivateparent) {
		this.isabletoreactivateparent = isabletoreactivateparent;
	}

	public Boolean getIsterminationimplicit() {
		return this.isterminationimplicit;
	}

	public void setIsterminationimplicit(Boolean isterminationimplicit) {
		this.isterminationimplicit = isterminationimplicit;
	}

	public Boolean getIssuspended() {
		return this.issuspended;
	}

	public void setIssuspended(Boolean issuspended) {
		this.issuspended = issuspended;
	}

	public Set getJbpmProcessinstancesForSuperprocesstoken() {
		return this.jbpmProcessinstancesForSuperprocesstoken;
	}

	public void setJbpmProcessinstancesForSuperprocesstoken(Set jbpmProcessinstancesForSuperprocesstoken) {
		this.jbpmProcessinstancesForSuperprocesstoken = jbpmProcessinstancesForSuperprocesstoken;
	}

	public Set getJbpmProcessinstancesForRoottoken() {
		return this.jbpmProcessinstancesForRoottoken;
	}

	public void setJbpmProcessinstancesForRoottoken(Set jbpmProcessinstancesForRoottoken) {
		this.jbpmProcessinstancesForRoottoken = jbpmProcessinstancesForRoottoken;
	}

	public Set getJbpmTimers() {
		return this.jbpmTimers;
	}

	public void setJbpmTimers(Set jbpmTimers) {
		this.jbpmTimers = jbpmTimers;
	}

	public Set getJbpmMessages() {
		return this.jbpmMessages;
	}

	public void setJbpmMessages(Set jbpmMessages) {
		this.jbpmMessages = jbpmMessages;
	}

	public Set getJbpmTaskinstances() {
		return this.jbpmTaskinstances;
	}

	public void setJbpmTaskinstances(Set jbpmTaskinstances) {
		this.jbpmTaskinstances = jbpmTaskinstances;
	}

	public Set getJbpmVariableinstances() {
		return this.jbpmVariableinstances;
	}

	public void setJbpmVariableinstances(Set jbpmVariableinstances) {
		this.jbpmVariableinstances = jbpmVariableinstances;
	}

	public Set getJbpmLogsForChild() {
		return this.jbpmLogsForChild;
	}

	public void setJbpmLogsForChild(Set jbpmLogsForChild) {
		this.jbpmLogsForChild = jbpmLogsForChild;
	}

	public Set getJbpmLogsForToken() {
		return this.jbpmLogsForToken;
	}

	public void setJbpmLogsForToken(Set jbpmLogsForToken) {
		this.jbpmLogsForToken = jbpmLogsForToken;
	}

	public Set getJbpmTokenvariablemaps() {
		return this.jbpmTokenvariablemaps;
	}

	public void setJbpmTokenvariablemaps(Set jbpmTokenvariablemaps) {
		this.jbpmTokenvariablemaps = jbpmTokenvariablemaps;
	}

	public Set getJbpmComments() {
		return this.jbpmComments;
	}

	public void setJbpmComments(Set jbpmComments) {
		this.jbpmComments = jbpmComments;
	}

	public Set getJbpmTokens() {
		return this.jbpmTokens;
	}

	public void setJbpmTokens(Set jbpmTokens) {
		this.jbpmTokens = jbpmTokens;
	}

}
