package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * BRoutineLinks generated by hbm2java
 */
public class BRoutineLinks implements java.io.Serializable {

	private BRoutineLinksId id;
	private BigDecimal linkqty;
	private Long linktype;
	private Long linklag;
	private BigDecimal uniqueid;
	private String routing;
	private String BRoutineLinksOutUid;

	public BRoutineLinks() {
	}

	public BRoutineLinks(BRoutineLinksId id, BigDecimal uniqueid, String routing) {
		this.id = id;
		this.uniqueid = uniqueid;
		this.routing = routing;
	}

	public BRoutineLinks(BRoutineLinksId id, BigDecimal linkqty, Long linktype, Long linklag, BigDecimal uniqueid,
			String routing, String BRoutineLinksOutUid) {
		this.id = id;
		this.linkqty = linkqty;
		this.linktype = linktype;
		this.linklag = linklag;
		this.uniqueid = uniqueid;
		this.routing = routing;
		this.BRoutineLinksOutUid = BRoutineLinksOutUid;
	}

	public BRoutineLinksId getId() {
		return this.id;
	}

	public void setId(BRoutineLinksId id) {
		this.id = id;
	}

	public BigDecimal getLinkqty() {
		return this.linkqty;
	}

	public void setLinkqty(BigDecimal linkqty) {
		this.linkqty = linkqty;
	}

	public Long getLinktype() {
		return this.linktype;
	}

	public void setLinktype(Long linktype) {
		this.linktype = linktype;
	}

	public Long getLinklag() {
		return this.linklag;
	}

	public void setLinklag(Long linklag) {
		this.linklag = linklag;
	}

	public BigDecimal getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(BigDecimal uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getRouting() {
		return this.routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public String getBRoutineLinksOutUid() {
		return this.BRoutineLinksOutUid;
	}

	public void setBRoutineLinksOutUid(String BRoutineLinksOutUid) {
		this.BRoutineLinksOutUid = BRoutineLinksOutUid;
	}

}
