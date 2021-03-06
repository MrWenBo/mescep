package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;

/**
 * KCommandDemandId generated by hbm2java
 */
public class KCommandDemandId implements java.io.Serializable {

	private String commandid;
	private String commandname;
	private String commandtype;
	private String commandstate;
	private String creator;
	private Date createtime;
	private Date invalidtime;
	private Blob notes;
	private String demanduid;
	private Date latefinish;
	private BigDecimal dueqty;

	public KCommandDemandId() {
	}

	public KCommandDemandId(String commandid, String commandname, String commandtype, String commandstate,
			String creator, Date createtime, Date invalidtime, Blob notes, String demanduid, Date latefinish,
			BigDecimal dueqty) {
		this.commandid = commandid;
		this.commandname = commandname;
		this.commandtype = commandtype;
		this.commandstate = commandstate;
		this.creator = creator;
		this.createtime = createtime;
		this.invalidtime = invalidtime;
		this.notes = notes;
		this.demanduid = demanduid;
		this.latefinish = latefinish;
		this.dueqty = dueqty;
	}

	public String getCommandid() {
		return this.commandid;
	}

	public void setCommandid(String commandid) {
		this.commandid = commandid;
	}

	public String getCommandname() {
		return this.commandname;
	}

	public void setCommandname(String commandname) {
		this.commandname = commandname;
	}

	public String getCommandtype() {
		return this.commandtype;
	}

	public void setCommandtype(String commandtype) {
		this.commandtype = commandtype;
	}

	public String getCommandstate() {
		return this.commandstate;
	}

	public void setCommandstate(String commandstate) {
		this.commandstate = commandstate;
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

	public Date getInvalidtime() {
		return this.invalidtime;
	}

	public void setInvalidtime(Date invalidtime) {
		this.invalidtime = invalidtime;
	}

	public Blob getNotes() {
		return this.notes;
	}

	public void setNotes(Blob notes) {
		this.notes = notes;
	}

	public String getDemanduid() {
		return this.demanduid;
	}

	public void setDemanduid(String demanduid) {
		this.demanduid = demanduid;
	}

	public Date getLatefinish() {
		return this.latefinish;
	}

	public void setLatefinish(Date latefinish) {
		this.latefinish = latefinish;
	}

	public BigDecimal getDueqty() {
		return this.dueqty;
	}

	public void setDueqty(BigDecimal dueqty) {
		this.dueqty = dueqty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KCommandDemandId))
			return false;
		KCommandDemandId castOther = (KCommandDemandId) other;

		return ((this.getCommandid() == castOther.getCommandid()) || (this.getCommandid() != null
				&& castOther.getCommandid() != null && this.getCommandid().equals(castOther.getCommandid())))
				&& ((this.getCommandname() == castOther.getCommandname())
						|| (this.getCommandname() != null && castOther.getCommandname() != null
								&& this.getCommandname().equals(castOther.getCommandname())))
				&& ((this.getCommandtype() == castOther.getCommandtype())
						|| (this.getCommandtype() != null && castOther.getCommandtype() != null
								&& this.getCommandtype().equals(castOther.getCommandtype())))
				&& ((this.getCommandstate() == castOther.getCommandstate())
						|| (this.getCommandstate() != null && castOther.getCommandstate() != null
								&& this.getCommandstate().equals(castOther.getCommandstate())))
				&& ((this.getCreator() == castOther.getCreator()) || (this.getCreator() != null
						&& castOther.getCreator() != null && this.getCreator().equals(castOther.getCreator())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getInvalidtime() == castOther.getInvalidtime())
						|| (this.getInvalidtime() != null && castOther.getInvalidtime() != null
								&& this.getInvalidtime().equals(castOther.getInvalidtime())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getDemanduid() == castOther.getDemanduid()) || (this.getDemanduid() != null
						&& castOther.getDemanduid() != null && this.getDemanduid().equals(castOther.getDemanduid())))
				&& ((this.getLatefinish() == castOther.getLatefinish()) || (this.getLatefinish() != null
						&& castOther.getLatefinish() != null && this.getLatefinish().equals(castOther.getLatefinish())))
				&& ((this.getDueqty() == castOther.getDueqty()) || (this.getDueqty() != null
						&& castOther.getDueqty() != null && this.getDueqty().equals(castOther.getDueqty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCommandid() == null ? 0 : this.getCommandid().hashCode());
		result = 37 * result + (getCommandname() == null ? 0 : this.getCommandname().hashCode());
		result = 37 * result + (getCommandtype() == null ? 0 : this.getCommandtype().hashCode());
		result = 37 * result + (getCommandstate() == null ? 0 : this.getCommandstate().hashCode());
		result = 37 * result + (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getInvalidtime() == null ? 0 : this.getInvalidtime().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getDemanduid() == null ? 0 : this.getDemanduid().hashCode());
		result = 37 * result + (getLatefinish() == null ? 0 : this.getLatefinish().hashCode());
		result = 37 * result + (getDueqty() == null ? 0 : this.getDueqty().hashCode());
		return result;
	}

}
