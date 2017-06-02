package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * SfPmiId generated by hbm2java
 */
public class SfPmiId implements java.io.Serializable {

	private String uuid;
	private String sfPmiId;
	private String sfPmiVisible;
	private String sfPmiType;
	private String opcheckFieldid;
	private String opcheckOpuid;
	private String sfPositionx;
	private String sfPositiony;
	private String sfPositionz;
	private String sfFileUid;
	private Date createtime;
	private Date changetime;
	private String standardvalue;
	private BigDecimal ubound;
	private BigDecimal lbound;
	private String measurebase;
	private String partNumber;
	private String drawingid;
	private String sfPmiDetailtype;

	public SfPmiId() {
	}

	public SfPmiId(String uuid) {
		this.uuid = uuid;
	}

	public SfPmiId(String uuid, String sfPmiId, String sfPmiVisible, String sfPmiType, String opcheckFieldid,
			String opcheckOpuid, String sfPositionx, String sfPositiony, String sfPositionz, String sfFileUid,
			Date createtime, Date changetime, String standardvalue, BigDecimal ubound, BigDecimal lbound,
			String measurebase, String partNumber, String drawingid, String sfPmiDetailtype) {
		this.uuid = uuid;
		this.sfPmiId = sfPmiId;
		this.sfPmiVisible = sfPmiVisible;
		this.sfPmiType = sfPmiType;
		this.opcheckFieldid = opcheckFieldid;
		this.opcheckOpuid = opcheckOpuid;
		this.sfPositionx = sfPositionx;
		this.sfPositiony = sfPositiony;
		this.sfPositionz = sfPositionz;
		this.sfFileUid = sfFileUid;
		this.createtime = createtime;
		this.changetime = changetime;
		this.standardvalue = standardvalue;
		this.ubound = ubound;
		this.lbound = lbound;
		this.measurebase = measurebase;
		this.partNumber = partNumber;
		this.drawingid = drawingid;
		this.sfPmiDetailtype = sfPmiDetailtype;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSfPmiId() {
		return this.sfPmiId;
	}

	public void setSfPmiId(String sfPmiId) {
		this.sfPmiId = sfPmiId;
	}

	public String getSfPmiVisible() {
		return this.sfPmiVisible;
	}

	public void setSfPmiVisible(String sfPmiVisible) {
		this.sfPmiVisible = sfPmiVisible;
	}

	public String getSfPmiType() {
		return this.sfPmiType;
	}

	public void setSfPmiType(String sfPmiType) {
		this.sfPmiType = sfPmiType;
	}

	public String getOpcheckFieldid() {
		return this.opcheckFieldid;
	}

	public void setOpcheckFieldid(String opcheckFieldid) {
		this.opcheckFieldid = opcheckFieldid;
	}

	public String getOpcheckOpuid() {
		return this.opcheckOpuid;
	}

	public void setOpcheckOpuid(String opcheckOpuid) {
		this.opcheckOpuid = opcheckOpuid;
	}

	public String getSfPositionx() {
		return this.sfPositionx;
	}

	public void setSfPositionx(String sfPositionx) {
		this.sfPositionx = sfPositionx;
	}

	public String getSfPositiony() {
		return this.sfPositiony;
	}

	public void setSfPositiony(String sfPositiony) {
		this.sfPositiony = sfPositiony;
	}

	public String getSfPositionz() {
		return this.sfPositionz;
	}

	public void setSfPositionz(String sfPositionz) {
		this.sfPositionz = sfPositionz;
	}

	public String getSfFileUid() {
		return this.sfFileUid;
	}

	public void setSfFileUid(String sfFileUid) {
		this.sfFileUid = sfFileUid;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getChangetime() {
		return this.changetime;
	}

	public void setChangetime(Date changetime) {
		this.changetime = changetime;
	}

	public String getStandardvalue() {
		return this.standardvalue;
	}

	public void setStandardvalue(String standardvalue) {
		this.standardvalue = standardvalue;
	}

	public BigDecimal getUbound() {
		return this.ubound;
	}

	public void setUbound(BigDecimal ubound) {
		this.ubound = ubound;
	}

	public BigDecimal getLbound() {
		return this.lbound;
	}

	public void setLbound(BigDecimal lbound) {
		this.lbound = lbound;
	}

	public String getMeasurebase() {
		return this.measurebase;
	}

	public void setMeasurebase(String measurebase) {
		this.measurebase = measurebase;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public String getSfPmiDetailtype() {
		return this.sfPmiDetailtype;
	}

	public void setSfPmiDetailtype(String sfPmiDetailtype) {
		this.sfPmiDetailtype = sfPmiDetailtype;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SfPmiId))
			return false;
		SfPmiId castOther = (SfPmiId) other;

		return ((this.getUuid() == castOther.getUuid()) || (this.getUuid() != null && castOther.getUuid() != null
				&& this.getUuid().equals(castOther.getUuid())))
				&& ((this.getSfPmiId() == castOther.getSfPmiId()) || (this.getSfPmiId() != null
						&& castOther.getSfPmiId() != null && this.getSfPmiId().equals(castOther.getSfPmiId())))
				&& ((this.getSfPmiVisible() == castOther.getSfPmiVisible())
						|| (this.getSfPmiVisible() != null && castOther.getSfPmiVisible() != null
								&& this.getSfPmiVisible().equals(castOther.getSfPmiVisible())))
				&& ((this.getSfPmiType() == castOther.getSfPmiType()) || (this.getSfPmiType() != null
						&& castOther.getSfPmiType() != null && this.getSfPmiType().equals(castOther.getSfPmiType())))
				&& ((this.getOpcheckFieldid() == castOther.getOpcheckFieldid())
						|| (this.getOpcheckFieldid() != null && castOther.getOpcheckFieldid() != null
								&& this.getOpcheckFieldid().equals(castOther.getOpcheckFieldid())))
				&& ((this.getOpcheckOpuid() == castOther.getOpcheckOpuid())
						|| (this.getOpcheckOpuid() != null && castOther.getOpcheckOpuid() != null
								&& this.getOpcheckOpuid().equals(castOther.getOpcheckOpuid())))
				&& ((this.getSfPositionx() == castOther.getSfPositionx())
						|| (this.getSfPositionx() != null && castOther.getSfPositionx() != null
								&& this.getSfPositionx().equals(castOther.getSfPositionx())))
				&& ((this.getSfPositiony() == castOther.getSfPositiony())
						|| (this.getSfPositiony() != null && castOther.getSfPositiony() != null
								&& this.getSfPositiony().equals(castOther.getSfPositiony())))
				&& ((this.getSfPositionz() == castOther.getSfPositionz())
						|| (this.getSfPositionz() != null && castOther.getSfPositionz() != null
								&& this.getSfPositionz().equals(castOther.getSfPositionz())))
				&& ((this.getSfFileUid() == castOther.getSfFileUid()) || (this.getSfFileUid() != null
						&& castOther.getSfFileUid() != null && this.getSfFileUid().equals(castOther.getSfFileUid())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getChangetime() == castOther.getChangetime()) || (this.getChangetime() != null
						&& castOther.getChangetime() != null && this.getChangetime().equals(castOther.getChangetime())))
				&& ((this.getStandardvalue() == castOther.getStandardvalue())
						|| (this.getStandardvalue() != null && castOther.getStandardvalue() != null
								&& this.getStandardvalue().equals(castOther.getStandardvalue())))
				&& ((this.getUbound() == castOther.getUbound()) || (this.getUbound() != null
						&& castOther.getUbound() != null && this.getUbound().equals(castOther.getUbound())))
				&& ((this.getLbound() == castOther.getLbound()) || (this.getLbound() != null
						&& castOther.getLbound() != null && this.getLbound().equals(castOther.getLbound())))
				&& ((this.getMeasurebase() == castOther.getMeasurebase())
						|| (this.getMeasurebase() != null && castOther.getMeasurebase() != null
								&& this.getMeasurebase().equals(castOther.getMeasurebase())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getSfPmiDetailtype() == castOther.getSfPmiDetailtype())
						|| (this.getSfPmiDetailtype() != null && castOther.getSfPmiDetailtype() != null
								&& this.getSfPmiDetailtype().equals(castOther.getSfPmiDetailtype())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUuid() == null ? 0 : this.getUuid().hashCode());
		result = 37 * result + (getSfPmiId() == null ? 0 : this.getSfPmiId().hashCode());
		result = 37 * result + (getSfPmiVisible() == null ? 0 : this.getSfPmiVisible().hashCode());
		result = 37 * result + (getSfPmiType() == null ? 0 : this.getSfPmiType().hashCode());
		result = 37 * result + (getOpcheckFieldid() == null ? 0 : this.getOpcheckFieldid().hashCode());
		result = 37 * result + (getOpcheckOpuid() == null ? 0 : this.getOpcheckOpuid().hashCode());
		result = 37 * result + (getSfPositionx() == null ? 0 : this.getSfPositionx().hashCode());
		result = 37 * result + (getSfPositiony() == null ? 0 : this.getSfPositiony().hashCode());
		result = 37 * result + (getSfPositionz() == null ? 0 : this.getSfPositionz().hashCode());
		result = 37 * result + (getSfFileUid() == null ? 0 : this.getSfFileUid().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getChangetime() == null ? 0 : this.getChangetime().hashCode());
		result = 37 * result + (getStandardvalue() == null ? 0 : this.getStandardvalue().hashCode());
		result = 37 * result + (getUbound() == null ? 0 : this.getUbound().hashCode());
		result = 37 * result + (getLbound() == null ? 0 : this.getLbound().hashCode());
		result = 37 * result + (getMeasurebase() == null ? 0 : this.getMeasurebase().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getSfPmiDetailtype() == null ? 0 : this.getSfPmiDetailtype().hashCode());
		return result;
	}

}
