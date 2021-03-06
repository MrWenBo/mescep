package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * MChecktaskassnsId generated by hbm2java
 */
public class MChecktaskassnsId implements java.io.Serializable {

	private String uniqueid;
	private String checktaskuid;
	private String checker;
	private String creator;
	private Date createtime;
	private Byte checkassnstate;
	private Date assnstart;
	private Date assnfinish;
	private BigDecimal assnqty;
	private String notes;
	private BigDecimal completeqty;
	private Boolean ncProgramed;

	public MChecktaskassnsId() {
	}

	public MChecktaskassnsId(String uniqueid, String checktaskuid, String checker) {
		this.uniqueid = uniqueid;
		this.checktaskuid = checktaskuid;
		this.checker = checker;
	}

	public MChecktaskassnsId(String uniqueid, String checktaskuid, String checker, String creator, Date createtime,
			Byte checkassnstate, Date assnstart, Date assnfinish, BigDecimal assnqty, String notes,
			BigDecimal completeqty, Boolean ncProgramed) {
		this.uniqueid = uniqueid;
		this.checktaskuid = checktaskuid;
		this.checker = checker;
		this.creator = creator;
		this.createtime = createtime;
		this.checkassnstate = checkassnstate;
		this.assnstart = assnstart;
		this.assnfinish = assnfinish;
		this.assnqty = assnqty;
		this.notes = notes;
		this.completeqty = completeqty;
		this.ncProgramed = ncProgramed;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getChecktaskuid() {
		return this.checktaskuid;
	}

	public void setChecktaskuid(String checktaskuid) {
		this.checktaskuid = checktaskuid;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
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

	public Byte getCheckassnstate() {
		return this.checkassnstate;
	}

	public void setCheckassnstate(Byte checkassnstate) {
		this.checkassnstate = checkassnstate;
	}

	public Date getAssnstart() {
		return this.assnstart;
	}

	public void setAssnstart(Date assnstart) {
		this.assnstart = assnstart;
	}

	public Date getAssnfinish() {
		return this.assnfinish;
	}

	public void setAssnfinish(Date assnfinish) {
		this.assnfinish = assnfinish;
	}

	public BigDecimal getAssnqty() {
		return this.assnqty;
	}

	public void setAssnqty(BigDecimal assnqty) {
		this.assnqty = assnqty;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BigDecimal getCompleteqty() {
		return this.completeqty;
	}

	public void setCompleteqty(BigDecimal completeqty) {
		this.completeqty = completeqty;
	}

	public Boolean getNcProgramed() {
		return this.ncProgramed;
	}

	public void setNcProgramed(Boolean ncProgramed) {
		this.ncProgramed = ncProgramed;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MChecktaskassnsId))
			return false;
		MChecktaskassnsId castOther = (MChecktaskassnsId) other;

		return ((this.getUniqueid() == castOther.getUniqueid()) || (this.getUniqueid() != null
				&& castOther.getUniqueid() != null && this.getUniqueid().equals(castOther.getUniqueid())))
				&& ((this.getChecktaskuid() == castOther.getChecktaskuid())
						|| (this.getChecktaskuid() != null && castOther.getChecktaskuid() != null
								&& this.getChecktaskuid().equals(castOther.getChecktaskuid())))
				&& ((this.getChecker() == castOther.getChecker()) || (this.getChecker() != null
						&& castOther.getChecker() != null && this.getChecker().equals(castOther.getChecker())))
				&& ((this.getCreator() == castOther.getCreator()) || (this.getCreator() != null
						&& castOther.getCreator() != null && this.getCreator().equals(castOther.getCreator())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getCheckassnstate() == castOther.getCheckassnstate())
						|| (this.getCheckassnstate() != null && castOther.getCheckassnstate() != null
								&& this.getCheckassnstate().equals(castOther.getCheckassnstate())))
				&& ((this.getAssnstart() == castOther.getAssnstart()) || (this.getAssnstart() != null
						&& castOther.getAssnstart() != null && this.getAssnstart().equals(castOther.getAssnstart())))
				&& ((this.getAssnfinish() == castOther.getAssnfinish()) || (this.getAssnfinish() != null
						&& castOther.getAssnfinish() != null && this.getAssnfinish().equals(castOther.getAssnfinish())))
				&& ((this.getAssnqty() == castOther.getAssnqty()) || (this.getAssnqty() != null
						&& castOther.getAssnqty() != null && this.getAssnqty().equals(castOther.getAssnqty())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getCompleteqty() == castOther.getCompleteqty())
						|| (this.getCompleteqty() != null && castOther.getCompleteqty() != null
								&& this.getCompleteqty().equals(castOther.getCompleteqty())))
				&& ((this.getNcProgramed() == castOther.getNcProgramed())
						|| (this.getNcProgramed() != null && castOther.getNcProgramed() != null
								&& this.getNcProgramed().equals(castOther.getNcProgramed())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUniqueid() == null ? 0 : this.getUniqueid().hashCode());
		result = 37 * result + (getChecktaskuid() == null ? 0 : this.getChecktaskuid().hashCode());
		result = 37 * result + (getChecker() == null ? 0 : this.getChecker().hashCode());
		result = 37 * result + (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getCheckassnstate() == null ? 0 : this.getCheckassnstate().hashCode());
		result = 37 * result + (getAssnstart() == null ? 0 : this.getAssnstart().hashCode());
		result = 37 * result + (getAssnfinish() == null ? 0 : this.getAssnfinish().hashCode());
		result = 37 * result + (getAssnqty() == null ? 0 : this.getAssnqty().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getCompleteqty() == null ? 0 : this.getCompleteqty().hashCode());
		result = 37 * result + (getNcProgramed() == null ? 0 : this.getNcProgramed().hashCode());
		return result;
	}

}
