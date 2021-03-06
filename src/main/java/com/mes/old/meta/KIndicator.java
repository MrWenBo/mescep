package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * KIndicator generated by hbm2java
 */
public class KIndicator implements java.io.Serializable {

	private String indicatorid;
	private String indicatorname;
	private BigDecimal defaultvalue;
	private String indicatortype;
	private String hql;
	private String creator;
	private Date createtime;
	private Set KIndicatorUsers = new HashSet(0);

	public KIndicator() {
	}

	public KIndicator(String indicatorid) {
		this.indicatorid = indicatorid;
	}

	public KIndicator(String indicatorid, String indicatorname, BigDecimal defaultvalue, String indicatortype,
			String hql, String creator, Date createtime, Set KIndicatorUsers) {
		this.indicatorid = indicatorid;
		this.indicatorname = indicatorname;
		this.defaultvalue = defaultvalue;
		this.indicatortype = indicatortype;
		this.hql = hql;
		this.creator = creator;
		this.createtime = createtime;
		this.KIndicatorUsers = KIndicatorUsers;
	}

	public String getIndicatorid() {
		return this.indicatorid;
	}

	public void setIndicatorid(String indicatorid) {
		this.indicatorid = indicatorid;
	}

	public String getIndicatorname() {
		return this.indicatorname;
	}

	public void setIndicatorname(String indicatorname) {
		this.indicatorname = indicatorname;
	}

	public BigDecimal getDefaultvalue() {
		return this.defaultvalue;
	}

	public void setDefaultvalue(BigDecimal defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	public String getIndicatortype() {
		return this.indicatortype;
	}

	public void setIndicatortype(String indicatortype) {
		this.indicatortype = indicatortype;
	}

	public String getHql() {
		return this.hql;
	}

	public void setHql(String hql) {
		this.hql = hql;
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

	public Set getKIndicatorUsers() {
		return this.KIndicatorUsers;
	}

	public void setKIndicatorUsers(Set KIndicatorUsers) {
		this.KIndicatorUsers = KIndicatorUsers;
	}

}
