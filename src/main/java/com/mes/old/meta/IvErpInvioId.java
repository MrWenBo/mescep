package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * IvErpInvioId generated by hbm2java
 */
public class IvErpInvioId implements java.io.Serializable {

	private String taskuid;
	private String wo;
	private String invioid;
	private Long iotype;
	private Long iostate;
	private String warehouseid;
	private String warehousemanager;
	private String deptemp;
	private String deptid;
	private Date createtime;
	private Date iodate;
	private String notes;
	private BigDecimal applyqty;
	private BigDecimal ioqty;
	private String partNumber;
	private long seq;
	private BigDecimal materialqty;
	private String qualitynum;
	private String batchnum;
	private BigDecimal satisfyqty;
	private BigDecimal actualqty;

	public IvErpInvioId() {
	}

	public IvErpInvioId(long seq) {
		this.seq = seq;
	}

	public IvErpInvioId(String taskuid, String wo, String invioid, Long iotype, Long iostate, String warehouseid,
			String warehousemanager, String deptemp, String deptid, Date createtime, Date iodate, String notes,
			BigDecimal applyqty, BigDecimal ioqty, String partNumber, long seq, BigDecimal materialqty,
			String qualitynum, String batchnum, BigDecimal satisfyqty, BigDecimal actualqty) {
		this.taskuid = taskuid;
		this.wo = wo;
		this.invioid = invioid;
		this.iotype = iotype;
		this.iostate = iostate;
		this.warehouseid = warehouseid;
		this.warehousemanager = warehousemanager;
		this.deptemp = deptemp;
		this.deptid = deptid;
		this.createtime = createtime;
		this.iodate = iodate;
		this.notes = notes;
		this.applyqty = applyqty;
		this.ioqty = ioqty;
		this.partNumber = partNumber;
		this.seq = seq;
		this.materialqty = materialqty;
		this.qualitynum = qualitynum;
		this.batchnum = batchnum;
		this.satisfyqty = satisfyqty;
		this.actualqty = actualqty;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public String getWo() {
		return this.wo;
	}

	public void setWo(String wo) {
		this.wo = wo;
	}

	public String getInvioid() {
		return this.invioid;
	}

	public void setInvioid(String invioid) {
		this.invioid = invioid;
	}

	public Long getIotype() {
		return this.iotype;
	}

	public void setIotype(Long iotype) {
		this.iotype = iotype;
	}

	public Long getIostate() {
		return this.iostate;
	}

	public void setIostate(Long iostate) {
		this.iostate = iostate;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public String getWarehousemanager() {
		return this.warehousemanager;
	}

	public void setWarehousemanager(String warehousemanager) {
		this.warehousemanager = warehousemanager;
	}

	public String getDeptemp() {
		return this.deptemp;
	}

	public void setDeptemp(String deptemp) {
		this.deptemp = deptemp;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getIodate() {
		return this.iodate;
	}

	public void setIodate(Date iodate) {
		this.iodate = iodate;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BigDecimal getApplyqty() {
		return this.applyqty;
	}

	public void setApplyqty(BigDecimal applyqty) {
		this.applyqty = applyqty;
	}

	public BigDecimal getIoqty() {
		return this.ioqty;
	}

	public void setIoqty(BigDecimal ioqty) {
		this.ioqty = ioqty;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public long getSeq() {
		return this.seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public BigDecimal getMaterialqty() {
		return this.materialqty;
	}

	public void setMaterialqty(BigDecimal materialqty) {
		this.materialqty = materialqty;
	}

	public String getQualitynum() {
		return this.qualitynum;
	}

	public void setQualitynum(String qualitynum) {
		this.qualitynum = qualitynum;
	}

	public String getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
	}

	public BigDecimal getSatisfyqty() {
		return this.satisfyqty;
	}

	public void setSatisfyqty(BigDecimal satisfyqty) {
		this.satisfyqty = satisfyqty;
	}

	public BigDecimal getActualqty() {
		return this.actualqty;
	}

	public void setActualqty(BigDecimal actualqty) {
		this.actualqty = actualqty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IvErpInvioId))
			return false;
		IvErpInvioId castOther = (IvErpInvioId) other;

		return ((this.getTaskuid() == castOther.getTaskuid()) || (this.getTaskuid() != null
				&& castOther.getTaskuid() != null && this.getTaskuid().equals(castOther.getTaskuid())))
				&& ((this.getWo() == castOther.getWo()) || (this.getWo() != null && castOther.getWo() != null
						&& this.getWo().equals(castOther.getWo())))
				&& ((this.getInvioid() == castOther.getInvioid()) || (this.getInvioid() != null
						&& castOther.getInvioid() != null && this.getInvioid().equals(castOther.getInvioid())))
				&& ((this.getIotype() == castOther.getIotype()) || (this.getIotype() != null
						&& castOther.getIotype() != null && this.getIotype().equals(castOther.getIotype())))
				&& ((this.getIostate() == castOther.getIostate()) || (this.getIostate() != null
						&& castOther.getIostate() != null && this.getIostate().equals(castOther.getIostate())))
				&& ((this.getWarehouseid() == castOther.getWarehouseid())
						|| (this.getWarehouseid() != null && castOther.getWarehouseid() != null
								&& this.getWarehouseid().equals(castOther.getWarehouseid())))
				&& ((this.getWarehousemanager() == castOther.getWarehousemanager())
						|| (this.getWarehousemanager() != null && castOther.getWarehousemanager() != null
								&& this.getWarehousemanager().equals(castOther.getWarehousemanager())))
				&& ((this.getDeptemp() == castOther.getDeptemp()) || (this.getDeptemp() != null
						&& castOther.getDeptemp() != null && this.getDeptemp().equals(castOther.getDeptemp())))
				&& ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
						&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getIodate() == castOther.getIodate()) || (this.getIodate() != null
						&& castOther.getIodate() != null && this.getIodate().equals(castOther.getIodate())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getApplyqty() == castOther.getApplyqty()) || (this.getApplyqty() != null
						&& castOther.getApplyqty() != null && this.getApplyqty().equals(castOther.getApplyqty())))
				&& ((this.getIoqty() == castOther.getIoqty()) || (this.getIoqty() != null
						&& castOther.getIoqty() != null && this.getIoqty().equals(castOther.getIoqty())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& (this.getSeq() == castOther.getSeq())
				&& ((this.getMaterialqty() == castOther.getMaterialqty())
						|| (this.getMaterialqty() != null && castOther.getMaterialqty() != null
								&& this.getMaterialqty().equals(castOther.getMaterialqty())))
				&& ((this.getQualitynum() == castOther.getQualitynum()) || (this.getQualitynum() != null
						&& castOther.getQualitynum() != null && this.getQualitynum().equals(castOther.getQualitynum())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getSatisfyqty() == castOther.getSatisfyqty()) || (this.getSatisfyqty() != null
						&& castOther.getSatisfyqty() != null && this.getSatisfyqty().equals(castOther.getSatisfyqty())))
				&& ((this.getActualqty() == castOther.getActualqty()) || (this.getActualqty() != null
						&& castOther.getActualqty() != null && this.getActualqty().equals(castOther.getActualqty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaskuid() == null ? 0 : this.getTaskuid().hashCode());
		result = 37 * result + (getWo() == null ? 0 : this.getWo().hashCode());
		result = 37 * result + (getInvioid() == null ? 0 : this.getInvioid().hashCode());
		result = 37 * result + (getIotype() == null ? 0 : this.getIotype().hashCode());
		result = 37 * result + (getIostate() == null ? 0 : this.getIostate().hashCode());
		result = 37 * result + (getWarehouseid() == null ? 0 : this.getWarehouseid().hashCode());
		result = 37 * result + (getWarehousemanager() == null ? 0 : this.getWarehousemanager().hashCode());
		result = 37 * result + (getDeptemp() == null ? 0 : this.getDeptemp().hashCode());
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getIodate() == null ? 0 : this.getIodate().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getApplyqty() == null ? 0 : this.getApplyqty().hashCode());
		result = 37 * result + (getIoqty() == null ? 0 : this.getIoqty().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (int) this.getSeq();
		result = 37 * result + (getMaterialqty() == null ? 0 : this.getMaterialqty().hashCode());
		result = 37 * result + (getQualitynum() == null ? 0 : this.getQualitynum().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getSatisfyqty() == null ? 0 : this.getSatisfyqty().hashCode());
		result = 37 * result + (getActualqty() == null ? 0 : this.getActualqty().hashCode());
		return result;
	}

}
