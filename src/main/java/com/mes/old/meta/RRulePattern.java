package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * RRulePattern generated by hbm2java
 */
public class RRulePattern implements java.io.Serializable {

	private RRulePatternId id;
	private RRule RRule;
	private String objecttype;
	private String objectid;
	private String objectalias;
	private String objectname;
	private String uniqueid;

	public RRulePattern() {
	}

	public RRulePattern(RRulePatternId id, RRule RRule) {
		this.id = id;
		this.RRule = RRule;
	}

	public RRulePattern(RRulePatternId id, RRule RRule, String objecttype, String objectid, String objectalias,
			String objectname, String uniqueid) {
		this.id = id;
		this.RRule = RRule;
		this.objecttype = objecttype;
		this.objectid = objectid;
		this.objectalias = objectalias;
		this.objectname = objectname;
		this.uniqueid = uniqueid;
	}

	public RRulePatternId getId() {
		return this.id;
	}

	public void setId(RRulePatternId id) {
		this.id = id;
	}

	public RRule getRRule() {
		return this.RRule;
	}

	public void setRRule(RRule RRule) {
		this.RRule = RRule;
	}

	public String getObjecttype() {
		return this.objecttype;
	}

	public void setObjecttype(String objecttype) {
		this.objecttype = objecttype;
	}

	public String getObjectid() {
		return this.objectid;
	}

	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}

	public String getObjectalias() {
		return this.objectalias;
	}

	public void setObjectalias(String objectalias) {
		this.objectalias = objectalias;
	}

	public String getObjectname() {
		return this.objectname;
	}

	public void setObjectname(String objectname) {
		this.objectname = objectname;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

}
