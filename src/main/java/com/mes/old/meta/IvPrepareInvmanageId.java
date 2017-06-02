package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * IvPrepareInvmanageId generated by hbm2java
 */
public class IvPrepareInvmanageId implements java.io.Serializable {

	private String warehouseid;
	private String warehousename;
	private String deptid;
	private String binid;
	private String binname;
	private String barcode;
	private String materialusn;
	private String batchnum;
	private String sn;
	private Long materialstate;
	private Long qualitystate;
	private String partNumber;
	private String partName;
	private String drawingid;
	private String versionid;
	private BigDecimal invqty;
	private Integer invtype;
	private Date invdate;
	private Date latestInDate;
	private Date latestOutDate;

	public IvPrepareInvmanageId() {
	}

	public IvPrepareInvmanageId(String warehouseid, String binid, String materialusn, String partNumber) {
		this.warehouseid = warehouseid;
		this.binid = binid;
		this.materialusn = materialusn;
		this.partNumber = partNumber;
	}

	public IvPrepareInvmanageId(String warehouseid, String warehousename, String deptid, String binid, String binname,
			String barcode, String materialusn, String batchnum, String sn, Long materialstate, Long qualitystate,
			String partNumber, String partName, String drawingid, String versionid, BigDecimal invqty, Integer invtype,
			Date invdate, Date latestInDate, Date latestOutDate) {
		this.warehouseid = warehouseid;
		this.warehousename = warehousename;
		this.deptid = deptid;
		this.binid = binid;
		this.binname = binname;
		this.barcode = barcode;
		this.materialusn = materialusn;
		this.batchnum = batchnum;
		this.sn = sn;
		this.materialstate = materialstate;
		this.qualitystate = qualitystate;
		this.partNumber = partNumber;
		this.partName = partName;
		this.drawingid = drawingid;
		this.versionid = versionid;
		this.invqty = invqty;
		this.invtype = invtype;
		this.invdate = invdate;
		this.latestInDate = latestInDate;
		this.latestOutDate = latestOutDate;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public String getWarehousename() {
		return this.warehousename;
	}

	public void setWarehousename(String warehousename) {
		this.warehousename = warehousename;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getBinid() {
		return this.binid;
	}

	public void setBinid(String binid) {
		this.binid = binid;
	}

	public String getBinname() {
		return this.binname;
	}

	public void setBinname(String binname) {
		this.binname = binname;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getMaterialusn() {
		return this.materialusn;
	}

	public void setMaterialusn(String materialusn) {
		this.materialusn = materialusn;
	}

	public String getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
	}

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Long getMaterialstate() {
		return this.materialstate;
	}

	public void setMaterialstate(Long materialstate) {
		this.materialstate = materialstate;
	}

	public Long getQualitystate() {
		return this.qualitystate;
	}

	public void setQualitystate(Long qualitystate) {
		this.qualitystate = qualitystate;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public String getVersionid() {
		return this.versionid;
	}

	public void setVersionid(String versionid) {
		this.versionid = versionid;
	}

	public BigDecimal getInvqty() {
		return this.invqty;
	}

	public void setInvqty(BigDecimal invqty) {
		this.invqty = invqty;
	}

	public Integer getInvtype() {
		return this.invtype;
	}

	public void setInvtype(Integer invtype) {
		this.invtype = invtype;
	}

	public Date getInvdate() {
		return this.invdate;
	}

	public void setInvdate(Date invdate) {
		this.invdate = invdate;
	}

	public Date getLatestInDate() {
		return this.latestInDate;
	}

	public void setLatestInDate(Date latestInDate) {
		this.latestInDate = latestInDate;
	}

	public Date getLatestOutDate() {
		return this.latestOutDate;
	}

	public void setLatestOutDate(Date latestOutDate) {
		this.latestOutDate = latestOutDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IvPrepareInvmanageId))
			return false;
		IvPrepareInvmanageId castOther = (IvPrepareInvmanageId) other;

		return ((this.getWarehouseid() == castOther.getWarehouseid()) || (this.getWarehouseid() != null
				&& castOther.getWarehouseid() != null && this.getWarehouseid().equals(castOther.getWarehouseid())))
				&& ((this.getWarehousename() == castOther.getWarehousename())
						|| (this.getWarehousename() != null && castOther.getWarehousename() != null
								&& this.getWarehousename().equals(castOther.getWarehousename())))
				&& ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
						&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getBinid() == castOther.getBinid()) || (this.getBinid() != null
						&& castOther.getBinid() != null && this.getBinid().equals(castOther.getBinid())))
				&& ((this.getBinname() == castOther.getBinname()) || (this.getBinname() != null
						&& castOther.getBinname() != null && this.getBinname().equals(castOther.getBinname())))
				&& ((this.getBarcode() == castOther.getBarcode()) || (this.getBarcode() != null
						&& castOther.getBarcode() != null && this.getBarcode().equals(castOther.getBarcode())))
				&& ((this.getMaterialusn() == castOther.getMaterialusn())
						|| (this.getMaterialusn() != null && castOther.getMaterialusn() != null
								&& this.getMaterialusn().equals(castOther.getMaterialusn())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getSn() == castOther.getSn()) || (this.getSn() != null && castOther.getSn() != null
						&& this.getSn().equals(castOther.getSn())))
				&& ((this.getMaterialstate() == castOther.getMaterialstate())
						|| (this.getMaterialstate() != null && castOther.getMaterialstate() != null
								&& this.getMaterialstate().equals(castOther.getMaterialstate())))
				&& ((this.getQualitystate() == castOther.getQualitystate())
						|| (this.getQualitystate() != null && castOther.getQualitystate() != null
								&& this.getQualitystate().equals(castOther.getQualitystate())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& ((this.getPartName() == castOther.getPartName()) || (this.getPartName() != null
						&& castOther.getPartName() != null && this.getPartName().equals(castOther.getPartName())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getVersionid() == castOther.getVersionid()) || (this.getVersionid() != null
						&& castOther.getVersionid() != null && this.getVersionid().equals(castOther.getVersionid())))
				&& ((this.getInvqty() == castOther.getInvqty()) || (this.getInvqty() != null
						&& castOther.getInvqty() != null && this.getInvqty().equals(castOther.getInvqty())))
				&& ((this.getInvtype() == castOther.getInvtype()) || (this.getInvtype() != null
						&& castOther.getInvtype() != null && this.getInvtype().equals(castOther.getInvtype())))
				&& ((this.getInvdate() == castOther.getInvdate()) || (this.getInvdate() != null
						&& castOther.getInvdate() != null && this.getInvdate().equals(castOther.getInvdate())))
				&& ((this.getLatestInDate() == castOther.getLatestInDate())
						|| (this.getLatestInDate() != null && castOther.getLatestInDate() != null
								&& this.getLatestInDate().equals(castOther.getLatestInDate())))
				&& ((this.getLatestOutDate() == castOther.getLatestOutDate())
						|| (this.getLatestOutDate() != null && castOther.getLatestOutDate() != null
								&& this.getLatestOutDate().equals(castOther.getLatestOutDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getWarehouseid() == null ? 0 : this.getWarehouseid().hashCode());
		result = 37 * result + (getWarehousename() == null ? 0 : this.getWarehousename().hashCode());
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getBinid() == null ? 0 : this.getBinid().hashCode());
		result = 37 * result + (getBinname() == null ? 0 : this.getBinname().hashCode());
		result = 37 * result + (getBarcode() == null ? 0 : this.getBarcode().hashCode());
		result = 37 * result + (getMaterialusn() == null ? 0 : this.getMaterialusn().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getSn() == null ? 0 : this.getSn().hashCode());
		result = 37 * result + (getMaterialstate() == null ? 0 : this.getMaterialstate().hashCode());
		result = 37 * result + (getQualitystate() == null ? 0 : this.getQualitystate().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getPartName() == null ? 0 : this.getPartName().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getVersionid() == null ? 0 : this.getVersionid().hashCode());
		result = 37 * result + (getInvqty() == null ? 0 : this.getInvqty().hashCode());
		result = 37 * result + (getInvtype() == null ? 0 : this.getInvtype().hashCode());
		result = 37 * result + (getInvdate() == null ? 0 : this.getInvdate().hashCode());
		result = 37 * result + (getLatestInDate() == null ? 0 : this.getLatestInDate().hashCode());
		result = 37 * result + (getLatestOutDate() == null ? 0 : this.getLatestOutDate().hashCode());
		return result;
	}

}
