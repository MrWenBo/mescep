package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * SfMovementposition generated by hbm2java
 */
public class SfMovementposition implements java.io.Serializable {

	private String uuid;
	private BigDecimal translationx;
	private BigDecimal translationy;
	private BigDecimal translationz;
	private BigDecimal rotationx;
	private BigDecimal rotationy;
	private BigDecimal rotationz;
	private BigDecimal rotationangle;
	private String modelpath;
	private String opstepmoveuid;
	private Date createtime;
	private Date changetime;
	private BigDecimal moveid;
	private String partuid;
	private String drawingid;
	private String partname;

	public SfMovementposition() {
	}

	public SfMovementposition(String uuid) {
		this.uuid = uuid;
	}

	public SfMovementposition(String uuid, BigDecimal translationx, BigDecimal translationy, BigDecimal translationz,
			BigDecimal rotationx, BigDecimal rotationy, BigDecimal rotationz, BigDecimal rotationangle,
			String modelpath, String opstepmoveuid, Date createtime, Date changetime, BigDecimal moveid, String partuid,
			String drawingid, String partname) {
		this.uuid = uuid;
		this.translationx = translationx;
		this.translationy = translationy;
		this.translationz = translationz;
		this.rotationx = rotationx;
		this.rotationy = rotationy;
		this.rotationz = rotationz;
		this.rotationangle = rotationangle;
		this.modelpath = modelpath;
		this.opstepmoveuid = opstepmoveuid;
		this.createtime = createtime;
		this.changetime = changetime;
		this.moveid = moveid;
		this.partuid = partuid;
		this.drawingid = drawingid;
		this.partname = partname;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public BigDecimal getTranslationx() {
		return this.translationx;
	}

	public void setTranslationx(BigDecimal translationx) {
		this.translationx = translationx;
	}

	public BigDecimal getTranslationy() {
		return this.translationy;
	}

	public void setTranslationy(BigDecimal translationy) {
		this.translationy = translationy;
	}

	public BigDecimal getTranslationz() {
		return this.translationz;
	}

	public void setTranslationz(BigDecimal translationz) {
		this.translationz = translationz;
	}

	public BigDecimal getRotationx() {
		return this.rotationx;
	}

	public void setRotationx(BigDecimal rotationx) {
		this.rotationx = rotationx;
	}

	public BigDecimal getRotationy() {
		return this.rotationy;
	}

	public void setRotationy(BigDecimal rotationy) {
		this.rotationy = rotationy;
	}

	public BigDecimal getRotationz() {
		return this.rotationz;
	}

	public void setRotationz(BigDecimal rotationz) {
		this.rotationz = rotationz;
	}

	public BigDecimal getRotationangle() {
		return this.rotationangle;
	}

	public void setRotationangle(BigDecimal rotationangle) {
		this.rotationangle = rotationangle;
	}

	public String getModelpath() {
		return this.modelpath;
	}

	public void setModelpath(String modelpath) {
		this.modelpath = modelpath;
	}

	public String getOpstepmoveuid() {
		return this.opstepmoveuid;
	}

	public void setOpstepmoveuid(String opstepmoveuid) {
		this.opstepmoveuid = opstepmoveuid;
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

	public BigDecimal getMoveid() {
		return this.moveid;
	}

	public void setMoveid(BigDecimal moveid) {
		this.moveid = moveid;
	}

	public String getPartuid() {
		return this.partuid;
	}

	public void setPartuid(String partuid) {
		this.partuid = partuid;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public String getPartname() {
		return this.partname;
	}

	public void setPartname(String partname) {
		this.partname = partname;
	}

}
