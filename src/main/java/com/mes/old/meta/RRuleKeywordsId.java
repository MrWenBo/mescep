package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * RRuleKeywordsId generated by hbm2java
 */
public class RRuleKeywordsId implements java.io.Serializable {

	private String keyworduid;
	private String keywordtype;

	public RRuleKeywordsId() {
	}

	public RRuleKeywordsId(String keyworduid, String keywordtype) {
		this.keyworduid = keyworduid;
		this.keywordtype = keywordtype;
	}

	public String getKeyworduid() {
		return this.keyworduid;
	}

	public void setKeyworduid(String keyworduid) {
		this.keyworduid = keyworduid;
	}

	public String getKeywordtype() {
		return this.keywordtype;
	}

	public void setKeywordtype(String keywordtype) {
		this.keywordtype = keywordtype;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RRuleKeywordsId))
			return false;
		RRuleKeywordsId castOther = (RRuleKeywordsId) other;

		return ((this.getKeyworduid() == castOther.getKeyworduid()) || (this.getKeyworduid() != null
				&& castOther.getKeyworduid() != null && this.getKeyworduid().equals(castOther.getKeyworduid())))
				&& ((this.getKeywordtype() == castOther.getKeywordtype())
						|| (this.getKeywordtype() != null && castOther.getKeywordtype() != null
								&& this.getKeywordtype().equals(castOther.getKeywordtype())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getKeyworduid() == null ? 0 : this.getKeyworduid().hashCode());
		result = 37 * result + (getKeywordtype() == null ? 0 : this.getKeywordtype().hashCode());
		return result;
	}

}
