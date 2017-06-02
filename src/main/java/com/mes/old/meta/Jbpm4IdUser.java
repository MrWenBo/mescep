package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Jbpm4IdUser generated by hbm2java
 */
public class Jbpm4IdUser implements java.io.Serializable {

	private BigDecimal dbid;
	private long dbversion;
	private String id;
	private String password;
	private String givenname;
	private String familyname;
	private String businessemail;
	private Set jbpm4IdMemberships = new HashSet(0);

	public Jbpm4IdUser() {
	}

	public Jbpm4IdUser(BigDecimal dbid, long dbversion) {
		this.dbid = dbid;
		this.dbversion = dbversion;
	}

	public Jbpm4IdUser(BigDecimal dbid, long dbversion, String id, String password, String givenname, String familyname,
			String businessemail, Set jbpm4IdMemberships) {
		this.dbid = dbid;
		this.dbversion = dbversion;
		this.id = id;
		this.password = password;
		this.givenname = givenname;
		this.familyname = familyname;
		this.businessemail = businessemail;
		this.jbpm4IdMemberships = jbpm4IdMemberships;
	}

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public long getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(long dbversion) {
		this.dbversion = dbversion;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGivenname() {
		return this.givenname;
	}

	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}

	public String getFamilyname() {
		return this.familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

	public String getBusinessemail() {
		return this.businessemail;
	}

	public void setBusinessemail(String businessemail) {
		this.businessemail = businessemail;
	}

	public Set getJbpm4IdMemberships() {
		return this.jbpm4IdMemberships;
	}

	public void setJbpm4IdMemberships(Set jbpm4IdMemberships) {
		this.jbpm4IdMemberships = jbpm4IdMemberships;
	}

}