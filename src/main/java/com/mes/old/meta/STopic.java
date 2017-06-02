package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * STopic generated by hbm2java
 */
public class STopic implements java.io.Serializable {

	private BigDecimal topicid;
	private String topicname;
	private Long groupid;
	private Date createtime;
	private String creater;
	private String notes;

	public STopic() {
	}

	public STopic(BigDecimal topicid) {
		this.topicid = topicid;
	}

	public STopic(BigDecimal topicid, String topicname, Long groupid, Date createtime, String creater, String notes) {
		this.topicid = topicid;
		this.topicname = topicname;
		this.groupid = groupid;
		this.createtime = createtime;
		this.creater = creater;
		this.notes = notes;
	}

	public BigDecimal getTopicid() {
		return this.topicid;
	}

	public void setTopicid(BigDecimal topicid) {
		this.topicid = topicid;
	}

	public String getTopicname() {
		return this.topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	public Long getGroupid() {
		return this.groupid;
	}

	public void setGroupid(Long groupid) {
		this.groupid = groupid;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreater() {
		return this.creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
