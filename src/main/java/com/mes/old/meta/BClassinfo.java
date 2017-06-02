package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BClassinfo generated by hbm2java
 */
public class BClassinfo implements java.io.Serializable {

	private String uuid;
	private String classid;
	private String classname;
	private String parentid;
	private String sortid;
	private Byte isineffect;
	private Integer sortindex;
	private String customerClassid;
	private String BClassinfoOutUid;
	private String classtype;
	private String parentuid;
	private Boolean leafnode;
	private String customerFeaturesFormat;
	private Long childseq;
	private String mapkeyuid;
	private String notes;
	private String managerClassName;
	private String iconUid;
	private String codeAttribute;
	private String objectClassName;
	private String creator;
	private Date createtime;
	private String iconpath;
	private Set CCodehistories = new HashSet(0);
	private Set BClassAttributeRelations = new HashSet(0);
	private Set CCoderesultsForRuleClassUid = new HashSet(0);
	private Set CCoderesultsForClassUid = new HashSet(0);
	private Set CCoderules = new HashSet(0);

	public BClassinfo() {
	}

	public BClassinfo(String uuid, String classid, String sortid) {
		this.uuid = uuid;
		this.classid = classid;
		this.sortid = sortid;
	}

	public BClassinfo(String uuid, String classid, String classname, String parentid, String sortid, Byte isineffect,
			Integer sortindex, String customerClassid, String BClassinfoOutUid, String classtype, String parentuid,
			Boolean leafnode, String customerFeaturesFormat, Long childseq, String mapkeyuid, String notes,
			String managerClassName, String iconUid, String codeAttribute, String objectClassName, String creator,
			Date createtime, String iconpath, Set CCodehistories, Set BClassAttributeRelations,
			Set CCoderesultsForRuleClassUid, Set CCoderesultsForClassUid, Set CCoderules) {
		this.uuid = uuid;
		this.classid = classid;
		this.classname = classname;
		this.parentid = parentid;
		this.sortid = sortid;
		this.isineffect = isineffect;
		this.sortindex = sortindex;
		this.customerClassid = customerClassid;
		this.BClassinfoOutUid = BClassinfoOutUid;
		this.classtype = classtype;
		this.parentuid = parentuid;
		this.leafnode = leafnode;
		this.customerFeaturesFormat = customerFeaturesFormat;
		this.childseq = childseq;
		this.mapkeyuid = mapkeyuid;
		this.notes = notes;
		this.managerClassName = managerClassName;
		this.iconUid = iconUid;
		this.codeAttribute = codeAttribute;
		this.objectClassName = objectClassName;
		this.creator = creator;
		this.createtime = createtime;
		this.iconpath = iconpath;
		this.CCodehistories = CCodehistories;
		this.BClassAttributeRelations = BClassAttributeRelations;
		this.CCoderesultsForRuleClassUid = CCoderesultsForRuleClassUid;
		this.CCoderesultsForClassUid = CCoderesultsForClassUid;
		this.CCoderules = CCoderules;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getClassid() {
		return this.classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getParentid() {
		return this.parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getSortid() {
		return this.sortid;
	}

	public void setSortid(String sortid) {
		this.sortid = sortid;
	}

	public Byte getIsineffect() {
		return this.isineffect;
	}

	public void setIsineffect(Byte isineffect) {
		this.isineffect = isineffect;
	}

	public Integer getSortindex() {
		return this.sortindex;
	}

	public void setSortindex(Integer sortindex) {
		this.sortindex = sortindex;
	}

	public String getCustomerClassid() {
		return this.customerClassid;
	}

	public void setCustomerClassid(String customerClassid) {
		this.customerClassid = customerClassid;
	}

	public String getBClassinfoOutUid() {
		return this.BClassinfoOutUid;
	}

	public void setBClassinfoOutUid(String BClassinfoOutUid) {
		this.BClassinfoOutUid = BClassinfoOutUid;
	}

	public String getClasstype() {
		return this.classtype;
	}

	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}

	public String getParentuid() {
		return this.parentuid;
	}

	public void setParentuid(String parentuid) {
		this.parentuid = parentuid;
	}

	public Boolean getLeafnode() {
		return this.leafnode;
	}

	public void setLeafnode(Boolean leafnode) {
		this.leafnode = leafnode;
	}

	public String getCustomerFeaturesFormat() {
		return this.customerFeaturesFormat;
	}

	public void setCustomerFeaturesFormat(String customerFeaturesFormat) {
		this.customerFeaturesFormat = customerFeaturesFormat;
	}

	public Long getChildseq() {
		return this.childseq;
	}

	public void setChildseq(Long childseq) {
		this.childseq = childseq;
	}

	public String getMapkeyuid() {
		return this.mapkeyuid;
	}

	public void setMapkeyuid(String mapkeyuid) {
		this.mapkeyuid = mapkeyuid;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getManagerClassName() {
		return this.managerClassName;
	}

	public void setManagerClassName(String managerClassName) {
		this.managerClassName = managerClassName;
	}

	public String getIconUid() {
		return this.iconUid;
	}

	public void setIconUid(String iconUid) {
		this.iconUid = iconUid;
	}

	public String getCodeAttribute() {
		return this.codeAttribute;
	}

	public void setCodeAttribute(String codeAttribute) {
		this.codeAttribute = codeAttribute;
	}

	public String getObjectClassName() {
		return this.objectClassName;
	}

	public void setObjectClassName(String objectClassName) {
		this.objectClassName = objectClassName;
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

	public String getIconpath() {
		return this.iconpath;
	}

	public void setIconpath(String iconpath) {
		this.iconpath = iconpath;
	}

	public Set getCCodehistories() {
		return this.CCodehistories;
	}

	public void setCCodehistories(Set CCodehistories) {
		this.CCodehistories = CCodehistories;
	}

	public Set getBClassAttributeRelations() {
		return this.BClassAttributeRelations;
	}

	public void setBClassAttributeRelations(Set BClassAttributeRelations) {
		this.BClassAttributeRelations = BClassAttributeRelations;
	}

	public Set getCCoderesultsForRuleClassUid() {
		return this.CCoderesultsForRuleClassUid;
	}

	public void setCCoderesultsForRuleClassUid(Set CCoderesultsForRuleClassUid) {
		this.CCoderesultsForRuleClassUid = CCoderesultsForRuleClassUid;
	}

	public Set getCCoderesultsForClassUid() {
		return this.CCoderesultsForClassUid;
	}

	public void setCCoderesultsForClassUid(Set CCoderesultsForClassUid) {
		this.CCoderesultsForClassUid = CCoderesultsForClassUid;
	}

	public Set getCCoderules() {
		return this.CCoderules;
	}

	public void setCCoderules(Set CCoderules) {
		this.CCoderules = CCoderules;
	}

}
