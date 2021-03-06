package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.io.Serializable;

/**
 * MesCurrentopViewId generated by hbm2java
 */
public class MesCurrentopViewId implements java.io.Serializable {

	private Serializable drawingid;
	private Serializable batchnum;
	private Serializable deptname;
	private Serializable parentdept;
	private Serializable currentop;
	private Serializable currentopIddesc;
	private Serializable currentopId;
	private Serializable currentopName;
	private Serializable iddesc;
	private Serializable planqty;
	private Serializable lastop;
	private Serializable lastopId;
	private Serializable lastopName;
	private Serializable versionid;
	private Serializable operationIddesc;
	private Serializable taskname;
	private Serializable operationId;
	private Serializable taskstate;
	private Serializable actualfinish;

	public MesCurrentopViewId() {
	}

	public MesCurrentopViewId(Serializable drawingid, Serializable batchnum, Serializable deptname,
			Serializable parentdept, Serializable currentop, Serializable currentopIddesc, Serializable currentopId,
			Serializable currentopName, Serializable iddesc, Serializable planqty, Serializable lastop,
			Serializable lastopId, Serializable lastopName, Serializable versionid, Serializable operationIddesc,
			Serializable taskname, Serializable operationId, Serializable taskstate, Serializable actualfinish) {
		this.drawingid = drawingid;
		this.batchnum = batchnum;
		this.deptname = deptname;
		this.parentdept = parentdept;
		this.currentop = currentop;
		this.currentopIddesc = currentopIddesc;
		this.currentopId = currentopId;
		this.currentopName = currentopName;
		this.iddesc = iddesc;
		this.planqty = planqty;
		this.lastop = lastop;
		this.lastopId = lastopId;
		this.lastopName = lastopName;
		this.versionid = versionid;
		this.operationIddesc = operationIddesc;
		this.taskname = taskname;
		this.operationId = operationId;
		this.taskstate = taskstate;
		this.actualfinish = actualfinish;
	}

	public Serializable getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(Serializable drawingid) {
		this.drawingid = drawingid;
	}

	public Serializable getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(Serializable batchnum) {
		this.batchnum = batchnum;
	}

	public Serializable getDeptname() {
		return this.deptname;
	}

	public void setDeptname(Serializable deptname) {
		this.deptname = deptname;
	}

	public Serializable getParentdept() {
		return this.parentdept;
	}

	public void setParentdept(Serializable parentdept) {
		this.parentdept = parentdept;
	}

	public Serializable getCurrentop() {
		return this.currentop;
	}

	public void setCurrentop(Serializable currentop) {
		this.currentop = currentop;
	}

	public Serializable getCurrentopIddesc() {
		return this.currentopIddesc;
	}

	public void setCurrentopIddesc(Serializable currentopIddesc) {
		this.currentopIddesc = currentopIddesc;
	}

	public Serializable getCurrentopId() {
		return this.currentopId;
	}

	public void setCurrentopId(Serializable currentopId) {
		this.currentopId = currentopId;
	}

	public Serializable getCurrentopName() {
		return this.currentopName;
	}

	public void setCurrentopName(Serializable currentopName) {
		this.currentopName = currentopName;
	}

	public Serializable getIddesc() {
		return this.iddesc;
	}

	public void setIddesc(Serializable iddesc) {
		this.iddesc = iddesc;
	}

	public Serializable getPlanqty() {
		return this.planqty;
	}

	public void setPlanqty(Serializable planqty) {
		this.planqty = planqty;
	}

	public Serializable getLastop() {
		return this.lastop;
	}

	public void setLastop(Serializable lastop) {
		this.lastop = lastop;
	}

	public Serializable getLastopId() {
		return this.lastopId;
	}

	public void setLastopId(Serializable lastopId) {
		this.lastopId = lastopId;
	}

	public Serializable getLastopName() {
		return this.lastopName;
	}

	public void setLastopName(Serializable lastopName) {
		this.lastopName = lastopName;
	}

	public Serializable getVersionid() {
		return this.versionid;
	}

	public void setVersionid(Serializable versionid) {
		this.versionid = versionid;
	}

	public Serializable getOperationIddesc() {
		return this.operationIddesc;
	}

	public void setOperationIddesc(Serializable operationIddesc) {
		this.operationIddesc = operationIddesc;
	}

	public Serializable getTaskname() {
		return this.taskname;
	}

	public void setTaskname(Serializable taskname) {
		this.taskname = taskname;
	}

	public Serializable getOperationId() {
		return this.operationId;
	}

	public void setOperationId(Serializable operationId) {
		this.operationId = operationId;
	}

	public Serializable getTaskstate() {
		return this.taskstate;
	}

	public void setTaskstate(Serializable taskstate) {
		this.taskstate = taskstate;
	}

	public Serializable getActualfinish() {
		return this.actualfinish;
	}

	public void setActualfinish(Serializable actualfinish) {
		this.actualfinish = actualfinish;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MesCurrentopViewId))
			return false;
		MesCurrentopViewId castOther = (MesCurrentopViewId) other;

		return ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
				&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getDeptname() == castOther.getDeptname()) || (this.getDeptname() != null
						&& castOther.getDeptname() != null && this.getDeptname().equals(castOther.getDeptname())))
				&& ((this.getParentdept() == castOther.getParentdept()) || (this.getParentdept() != null
						&& castOther.getParentdept() != null && this.getParentdept().equals(castOther.getParentdept())))
				&& ((this.getCurrentop() == castOther.getCurrentop()) || (this.getCurrentop() != null
						&& castOther.getCurrentop() != null && this.getCurrentop().equals(castOther.getCurrentop())))
				&& ((this.getCurrentopIddesc() == castOther.getCurrentopIddesc())
						|| (this.getCurrentopIddesc() != null && castOther.getCurrentopIddesc() != null
								&& this.getCurrentopIddesc().equals(castOther.getCurrentopIddesc())))
				&& ((this.getCurrentopId() == castOther.getCurrentopId())
						|| (this.getCurrentopId() != null && castOther.getCurrentopId() != null
								&& this.getCurrentopId().equals(castOther.getCurrentopId())))
				&& ((this.getCurrentopName() == castOther.getCurrentopName())
						|| (this.getCurrentopName() != null && castOther.getCurrentopName() != null
								&& this.getCurrentopName().equals(castOther.getCurrentopName())))
				&& ((this.getIddesc() == castOther.getIddesc()) || (this.getIddesc() != null
						&& castOther.getIddesc() != null && this.getIddesc().equals(castOther.getIddesc())))
				&& ((this.getPlanqty() == castOther.getPlanqty()) || (this.getPlanqty() != null
						&& castOther.getPlanqty() != null && this.getPlanqty().equals(castOther.getPlanqty())))
				&& ((this.getLastop() == castOther.getLastop()) || (this.getLastop() != null
						&& castOther.getLastop() != null && this.getLastop().equals(castOther.getLastop())))
				&& ((this.getLastopId() == castOther.getLastopId()) || (this.getLastopId() != null
						&& castOther.getLastopId() != null && this.getLastopId().equals(castOther.getLastopId())))
				&& ((this.getLastopName() == castOther.getLastopName()) || (this.getLastopName() != null
						&& castOther.getLastopName() != null && this.getLastopName().equals(castOther.getLastopName())))
				&& ((this.getVersionid() == castOther.getVersionid()) || (this.getVersionid() != null
						&& castOther.getVersionid() != null && this.getVersionid().equals(castOther.getVersionid())))
				&& ((this.getOperationIddesc() == castOther.getOperationIddesc())
						|| (this.getOperationIddesc() != null && castOther.getOperationIddesc() != null
								&& this.getOperationIddesc().equals(castOther.getOperationIddesc())))
				&& ((this.getTaskname() == castOther.getTaskname()) || (this.getTaskname() != null
						&& castOther.getTaskname() != null && this.getTaskname().equals(castOther.getTaskname())))
				&& ((this.getOperationId() == castOther.getOperationId())
						|| (this.getOperationId() != null && castOther.getOperationId() != null
								&& this.getOperationId().equals(castOther.getOperationId())))
				&& ((this.getTaskstate() == castOther.getTaskstate()) || (this.getTaskstate() != null
						&& castOther.getTaskstate() != null && this.getTaskstate().equals(castOther.getTaskstate())))
				&& ((this.getActualfinish() == castOther.getActualfinish())
						|| (this.getActualfinish() != null && castOther.getActualfinish() != null
								&& this.getActualfinish().equals(castOther.getActualfinish())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getDeptname() == null ? 0 : this.getDeptname().hashCode());
		result = 37 * result + (getParentdept() == null ? 0 : this.getParentdept().hashCode());
		result = 37 * result + (getCurrentop() == null ? 0 : this.getCurrentop().hashCode());
		result = 37 * result + (getCurrentopIddesc() == null ? 0 : this.getCurrentopIddesc().hashCode());
		result = 37 * result + (getCurrentopId() == null ? 0 : this.getCurrentopId().hashCode());
		result = 37 * result + (getCurrentopName() == null ? 0 : this.getCurrentopName().hashCode());
		result = 37 * result + (getIddesc() == null ? 0 : this.getIddesc().hashCode());
		result = 37 * result + (getPlanqty() == null ? 0 : this.getPlanqty().hashCode());
		result = 37 * result + (getLastop() == null ? 0 : this.getLastop().hashCode());
		result = 37 * result + (getLastopId() == null ? 0 : this.getLastopId().hashCode());
		result = 37 * result + (getLastopName() == null ? 0 : this.getLastopName().hashCode());
		result = 37 * result + (getVersionid() == null ? 0 : this.getVersionid().hashCode());
		result = 37 * result + (getOperationIddesc() == null ? 0 : this.getOperationIddesc().hashCode());
		result = 37 * result + (getTaskname() == null ? 0 : this.getTaskname().hashCode());
		result = 37 * result + (getOperationId() == null ? 0 : this.getOperationId().hashCode());
		result = 37 * result + (getTaskstate() == null ? 0 : this.getTaskstate().hashCode());
		result = 37 * result + (getActualfinish() == null ? 0 : this.getActualfinish().hashCode());
		return result;
	}

}
