package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * SStreamcodeId generated by hbm2java
 */
public class SStreamcodeId implements java.io.Serializable {

	private String codetype;
	private String prestreamcode;

	public SStreamcodeId() {
	}

	public SStreamcodeId(String codetype, String prestreamcode) {
		this.codetype = codetype;
		this.prestreamcode = prestreamcode;
	}

	public String getCodetype() {
		return this.codetype;
	}

	public void setCodetype(String codetype) {
		this.codetype = codetype;
	}

	public String getPrestreamcode() {
		return this.prestreamcode;
	}

	public void setPrestreamcode(String prestreamcode) {
		this.prestreamcode = prestreamcode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SStreamcodeId))
			return false;
		SStreamcodeId castOther = (SStreamcodeId) other;

		return ((this.getCodetype() == castOther.getCodetype()) || (this.getCodetype() != null
				&& castOther.getCodetype() != null && this.getCodetype().equals(castOther.getCodetype())))
				&& ((this.getPrestreamcode() == castOther.getPrestreamcode())
						|| (this.getPrestreamcode() != null && castOther.getPrestreamcode() != null
								&& this.getPrestreamcode().equals(castOther.getPrestreamcode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCodetype() == null ? 0 : this.getCodetype().hashCode());
		result = 37 * result + (getPrestreamcode() == null ? 0 : this.getPrestreamcode().hashCode());
		return result;
	}

}
