package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * SfOperstepmoveincr generated by hbm2java
 */
public class SfOperstepmoveincr implements java.io.Serializable {

	private String uuid;
	private String operuid;
	private String stepuid;
	private String translationincruid;
	private String rotationincruid;
	private Long moveid;
	private String movename;
	private String routing;

	public SfOperstepmoveincr() {
	}

	public SfOperstepmoveincr(String uuid) {
		this.uuid = uuid;
	}

	public SfOperstepmoveincr(String uuid, String operuid, String stepuid, String translationincruid,
			String rotationincruid, Long moveid, String movename, String routing) {
		this.uuid = uuid;
		this.operuid = operuid;
		this.stepuid = stepuid;
		this.translationincruid = translationincruid;
		this.rotationincruid = rotationincruid;
		this.moveid = moveid;
		this.movename = movename;
		this.routing = routing;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getOperuid() {
		return this.operuid;
	}

	public void setOperuid(String operuid) {
		this.operuid = operuid;
	}

	public String getStepuid() {
		return this.stepuid;
	}

	public void setStepuid(String stepuid) {
		this.stepuid = stepuid;
	}

	public String getTranslationincruid() {
		return this.translationincruid;
	}

	public void setTranslationincruid(String translationincruid) {
		this.translationincruid = translationincruid;
	}

	public String getRotationincruid() {
		return this.rotationincruid;
	}

	public void setRotationincruid(String rotationincruid) {
		this.rotationincruid = rotationincruid;
	}

	public Long getMoveid() {
		return this.moveid;
	}

	public void setMoveid(Long moveid) {
		this.moveid = moveid;
	}

	public String getMovename() {
		return this.movename;
	}

	public void setMovename(String movename) {
		this.movename = movename;
	}

	public String getRouting() {
		return this.routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

}