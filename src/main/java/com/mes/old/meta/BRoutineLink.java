package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * BRoutineLink generated by hbm2java
 */
public class BRoutineLink implements java.io.Serializable {

	private String uniqueid;
	private String routing1;
	private BigDecimal operationId1;
	private String routing2;
	private BigDecimal operationId2;
	private String linktype;
	private String notes;

	public BRoutineLink() {
	}

	public BRoutineLink(String uniqueid, String routing1, BigDecimal operationId1, String routing2,
			BigDecimal operationId2, String linktype, String notes) {
		this.uniqueid = uniqueid;
		this.routing1 = routing1;
		this.operationId1 = operationId1;
		this.routing2 = routing2;
		this.operationId2 = operationId2;
		this.linktype = linktype;
		this.notes = notes;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getRouting1() {
		return this.routing1;
	}

	public void setRouting1(String routing1) {
		this.routing1 = routing1;
	}

	public BigDecimal getOperationId1() {
		return this.operationId1;
	}

	public void setOperationId1(BigDecimal operationId1) {
		this.operationId1 = operationId1;
	}

	public String getRouting2() {
		return this.routing2;
	}

	public void setRouting2(String routing2) {
		this.routing2 = routing2;
	}

	public BigDecimal getOperationId2() {
		return this.operationId2;
	}

	public void setOperationId2(BigDecimal operationId2) {
		this.operationId2 = operationId2;
	}

	public String getLinktype() {
		return this.linktype;
	}

	public void setLinktype(String linktype) {
		this.linktype = linktype;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
