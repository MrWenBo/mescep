package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CCoderule generated by hbm2java
 */
public class CCoderule implements java.io.Serializable {

	private String cruid;
	private BAttribute BAttribute;
	private BClassinfo BClassinfo;
	private String crname;
	private String codetype;
	private String sequence;
	private String codelength;
	private String codereplacer;
	private String codestring;
	private String codeformat;
	private String snuid;
	private String creator;
	private Date creattime;
	private String notes;
	private Set CSncodes = new HashSet(0);
	private Set CSnfeatures = new HashSet(0);

	public CCoderule() {
	}

	public CCoderule(String cruid) {
		this.cruid = cruid;
	}

	public CCoderule(String cruid, BAttribute BAttribute, BClassinfo BClassinfo, String crname, String codetype,
			String sequence, String codelength, String codereplacer, String codestring, String codeformat, String snuid,
			String creator, Date creattime, String notes, Set CSncodes, Set CSnfeatures) {
		this.cruid = cruid;
		this.BAttribute = BAttribute;
		this.BClassinfo = BClassinfo;
		this.crname = crname;
		this.codetype = codetype;
		this.sequence = sequence;
		this.codelength = codelength;
		this.codereplacer = codereplacer;
		this.codestring = codestring;
		this.codeformat = codeformat;
		this.snuid = snuid;
		this.creator = creator;
		this.creattime = creattime;
		this.notes = notes;
		this.CSncodes = CSncodes;
		this.CSnfeatures = CSnfeatures;
	}

	public String getCruid() {
		return this.cruid;
	}

	public void setCruid(String cruid) {
		this.cruid = cruid;
	}

	public BAttribute getBAttribute() {
		return this.BAttribute;
	}

	public void setBAttribute(BAttribute BAttribute) {
		this.BAttribute = BAttribute;
	}

	public BClassinfo getBClassinfo() {
		return this.BClassinfo;
	}

	public void setBClassinfo(BClassinfo BClassinfo) {
		this.BClassinfo = BClassinfo;
	}

	public String getCrname() {
		return this.crname;
	}

	public void setCrname(String crname) {
		this.crname = crname;
	}

	public String getCodetype() {
		return this.codetype;
	}

	public void setCodetype(String codetype) {
		this.codetype = codetype;
	}

	public String getSequence() {
		return this.sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getCodelength() {
		return this.codelength;
	}

	public void setCodelength(String codelength) {
		this.codelength = codelength;
	}

	public String getCodereplacer() {
		return this.codereplacer;
	}

	public void setCodereplacer(String codereplacer) {
		this.codereplacer = codereplacer;
	}

	public String getCodestring() {
		return this.codestring;
	}

	public void setCodestring(String codestring) {
		this.codestring = codestring;
	}

	public String getCodeformat() {
		return this.codeformat;
	}

	public void setCodeformat(String codeformat) {
		this.codeformat = codeformat;
	}

	public String getSnuid() {
		return this.snuid;
	}

	public void setSnuid(String snuid) {
		this.snuid = snuid;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreattime() {
		return this.creattime;
	}

	public void setCreattime(Date creattime) {
		this.creattime = creattime;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Set getCSncodes() {
		return this.CSncodes;
	}

	public void setCSncodes(Set CSncodes) {
		this.CSncodes = CSncodes;
	}

	public Set getCSnfeatures() {
		return this.CSnfeatures;
	}

	public void setCSnfeatures(Set CSnfeatures) {
		this.CSnfeatures = CSnfeatures;
	}

}
