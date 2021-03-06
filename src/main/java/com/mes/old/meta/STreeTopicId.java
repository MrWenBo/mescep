package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * STreeTopicId generated by hbm2java
 */
public class STreeTopicId implements java.io.Serializable {

	private BigDecimal treeid;
	private String menuitemname;
	private BigDecimal menuid;
	private String roleid;
	private String tag;
	private Long topicid;
	private String company;

	public STreeTopicId() {
	}

	public STreeTopicId(BigDecimal treeid, String menuitemname, BigDecimal menuid, String roleid, String tag) {
		this.treeid = treeid;
		this.menuitemname = menuitemname;
		this.menuid = menuid;
		this.roleid = roleid;
		this.tag = tag;
	}

	public STreeTopicId(BigDecimal treeid, String menuitemname, BigDecimal menuid, String roleid, String tag,
			Long topicid, String company) {
		this.treeid = treeid;
		this.menuitemname = menuitemname;
		this.menuid = menuid;
		this.roleid = roleid;
		this.tag = tag;
		this.topicid = topicid;
		this.company = company;
	}

	public BigDecimal getTreeid() {
		return this.treeid;
	}

	public void setTreeid(BigDecimal treeid) {
		this.treeid = treeid;
	}

	public String getMenuitemname() {
		return this.menuitemname;
	}

	public void setMenuitemname(String menuitemname) {
		this.menuitemname = menuitemname;
	}

	public BigDecimal getMenuid() {
		return this.menuid;
	}

	public void setMenuid(BigDecimal menuid) {
		this.menuid = menuid;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Long getTopicid() {
		return this.topicid;
	}

	public void setTopicid(Long topicid) {
		this.topicid = topicid;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof STreeTopicId))
			return false;
		STreeTopicId castOther = (STreeTopicId) other;

		return ((this.getTreeid() == castOther.getTreeid()) || (this.getTreeid() != null
				&& castOther.getTreeid() != null && this.getTreeid().equals(castOther.getTreeid())))
				&& ((this.getMenuitemname() == castOther.getMenuitemname())
						|| (this.getMenuitemname() != null && castOther.getMenuitemname() != null
								&& this.getMenuitemname().equals(castOther.getMenuitemname())))
				&& ((this.getMenuid() == castOther.getMenuid()) || (this.getMenuid() != null
						&& castOther.getMenuid() != null && this.getMenuid().equals(castOther.getMenuid())))
				&& ((this.getRoleid() == castOther.getRoleid()) || (this.getRoleid() != null
						&& castOther.getRoleid() != null && this.getRoleid().equals(castOther.getRoleid())))
				&& ((this.getTag() == castOther.getTag()) || (this.getTag() != null && castOther.getTag() != null
						&& this.getTag().equals(castOther.getTag())))
				&& ((this.getTopicid() == castOther.getTopicid()) || (this.getTopicid() != null
						&& castOther.getTopicid() != null && this.getTopicid().equals(castOther.getTopicid())))
				&& ((this.getCompany() == castOther.getCompany()) || (this.getCompany() != null
						&& castOther.getCompany() != null && this.getCompany().equals(castOther.getCompany())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTreeid() == null ? 0 : this.getTreeid().hashCode());
		result = 37 * result + (getMenuitemname() == null ? 0 : this.getMenuitemname().hashCode());
		result = 37 * result + (getMenuid() == null ? 0 : this.getMenuid().hashCode());
		result = 37 * result + (getRoleid() == null ? 0 : this.getRoleid().hashCode());
		result = 37 * result + (getTag() == null ? 0 : this.getTag().hashCode());
		result = 37 * result + (getTopicid() == null ? 0 : this.getTopicid().hashCode());
		result = 37 * result + (getCompany() == null ? 0 : this.getCompany().hashCode());
		return result;
	}

}
