package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * JbpmMessage generated by hbm2java
 */
public class JbpmMessage implements java.io.Serializable {

	private String id;
	private JbpmAction jbpmAction;
	private JbpmNode jbpmNode;
	private JbpmTaskinstance jbpmTaskinstance;
	private JbpmToken jbpmToken;
	private char class_;
	private String destination;
	private String exception;
	private Boolean issuspended;
	private String text;
	private String transitionname;
	private Date createtime;

	public JbpmMessage() {
	}

	public JbpmMessage(String id, char class_) {
		this.id = id;
		this.class_ = class_;
	}

	public JbpmMessage(String id, JbpmAction jbpmAction, JbpmNode jbpmNode, JbpmTaskinstance jbpmTaskinstance,
			JbpmToken jbpmToken, char class_, String destination, String exception, Boolean issuspended, String text,
			String transitionname, Date createtime) {
		this.id = id;
		this.jbpmAction = jbpmAction;
		this.jbpmNode = jbpmNode;
		this.jbpmTaskinstance = jbpmTaskinstance;
		this.jbpmToken = jbpmToken;
		this.class_ = class_;
		this.destination = destination;
		this.exception = exception;
		this.issuspended = issuspended;
		this.text = text;
		this.transitionname = transitionname;
		this.createtime = createtime;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public JbpmAction getJbpmAction() {
		return this.jbpmAction;
	}

	public void setJbpmAction(JbpmAction jbpmAction) {
		this.jbpmAction = jbpmAction;
	}

	public JbpmNode getJbpmNode() {
		return this.jbpmNode;
	}

	public void setJbpmNode(JbpmNode jbpmNode) {
		this.jbpmNode = jbpmNode;
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

	public char getClass_() {
		return this.class_;
	}

	public void setClass_(char class_) {
		this.class_ = class_;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
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

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTransitionname() {
		return this.transitionname;
	}

	public void setTransitionname(String transitionname) {
		this.transitionname = transitionname;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}