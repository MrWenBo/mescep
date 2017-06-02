package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TRule generated by hbm2java
 */
public class TRule implements java.io.Serializable {

	private String uniqueid;
	private TRule TRuleByCompositeruleuid;
	private TRule TRuleByBaseruleuid;
	private String rulename;
	private String ruleabbr;
	private String ruledesc;
	private String ruletype;
	private BigDecimal resolution;
	private String priority;
	private String limittype;
	private BigDecimal limitvalue;
	private String baserulebean;
	private String unitdesc;
	private Integer sortreverse;
	private String creator;
	private Date createtime;
	private String deptid;
	private Set TRulesForCompositeruleuid = new HashSet(0);
	private Set TRuleResources = new HashSet(0);
	private Set TRulesForBaseruleuid = new HashSet(0);

	public TRule() {
	}

	public TRule(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public TRule(String uniqueid, TRule TRuleByCompositeruleuid, TRule TRuleByBaseruleuid, String rulename,
			String ruleabbr, String ruledesc, String ruletype, BigDecimal resolution, String priority, String limittype,
			BigDecimal limitvalue, String baserulebean, String unitdesc, Integer sortreverse, String creator,
			Date createtime, String deptid, Set TRulesForCompositeruleuid, Set TRuleResources,
			Set TRulesForBaseruleuid) {
		this.uniqueid = uniqueid;
		this.TRuleByCompositeruleuid = TRuleByCompositeruleuid;
		this.TRuleByBaseruleuid = TRuleByBaseruleuid;
		this.rulename = rulename;
		this.ruleabbr = ruleabbr;
		this.ruledesc = ruledesc;
		this.ruletype = ruletype;
		this.resolution = resolution;
		this.priority = priority;
		this.limittype = limittype;
		this.limitvalue = limitvalue;
		this.baserulebean = baserulebean;
		this.unitdesc = unitdesc;
		this.sortreverse = sortreverse;
		this.creator = creator;
		this.createtime = createtime;
		this.deptid = deptid;
		this.TRulesForCompositeruleuid = TRulesForCompositeruleuid;
		this.TRuleResources = TRuleResources;
		this.TRulesForBaseruleuid = TRulesForBaseruleuid;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public TRule getTRuleByCompositeruleuid() {
		return this.TRuleByCompositeruleuid;
	}

	public void setTRuleByCompositeruleuid(TRule TRuleByCompositeruleuid) {
		this.TRuleByCompositeruleuid = TRuleByCompositeruleuid;
	}

	public TRule getTRuleByBaseruleuid() {
		return this.TRuleByBaseruleuid;
	}

	public void setTRuleByBaseruleuid(TRule TRuleByBaseruleuid) {
		this.TRuleByBaseruleuid = TRuleByBaseruleuid;
	}

	public String getRulename() {
		return this.rulename;
	}

	public void setRulename(String rulename) {
		this.rulename = rulename;
	}

	public String getRuleabbr() {
		return this.ruleabbr;
	}

	public void setRuleabbr(String ruleabbr) {
		this.ruleabbr = ruleabbr;
	}

	public String getRuledesc() {
		return this.ruledesc;
	}

	public void setRuledesc(String ruledesc) {
		this.ruledesc = ruledesc;
	}

	public String getRuletype() {
		return this.ruletype;
	}

	public void setRuletype(String ruletype) {
		this.ruletype = ruletype;
	}

	public BigDecimal getResolution() {
		return this.resolution;
	}

	public void setResolution(BigDecimal resolution) {
		this.resolution = resolution;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getLimittype() {
		return this.limittype;
	}

	public void setLimittype(String limittype) {
		this.limittype = limittype;
	}

	public BigDecimal getLimitvalue() {
		return this.limitvalue;
	}

	public void setLimitvalue(BigDecimal limitvalue) {
		this.limitvalue = limitvalue;
	}

	public String getBaserulebean() {
		return this.baserulebean;
	}

	public void setBaserulebean(String baserulebean) {
		this.baserulebean = baserulebean;
	}

	public String getUnitdesc() {
		return this.unitdesc;
	}

	public void setUnitdesc(String unitdesc) {
		this.unitdesc = unitdesc;
	}

	public Integer getSortreverse() {
		return this.sortreverse;
	}

	public void setSortreverse(Integer sortreverse) {
		this.sortreverse = sortreverse;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public Set getTRulesForCompositeruleuid() {
		return this.TRulesForCompositeruleuid;
	}

	public void setTRulesForCompositeruleuid(Set TRulesForCompositeruleuid) {
		this.TRulesForCompositeruleuid = TRulesForCompositeruleuid;
	}

	public Set getTRuleResources() {
		return this.TRuleResources;
	}

	public void setTRuleResources(Set TRuleResources) {
		this.TRuleResources = TRuleResources;
	}

	public Set getTRulesForBaseruleuid() {
		return this.TRulesForBaseruleuid;
	}

	public void setTRulesForBaseruleuid(Set TRulesForBaseruleuid) {
		this.TRulesForBaseruleuid = TRulesForBaseruleuid;
	}

}
