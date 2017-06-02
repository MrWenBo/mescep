package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * KVelocitySwhId generated by hbm2java
 */
public class KVelocitySwhId implements java.io.Serializable {

	private String warehouseid;
	private String drawingid;
	private String partNumberType;
	private String statisticType;
	private BigDecimal velocityWh;
	private String day;

	public KVelocitySwhId() {
	}

	public KVelocitySwhId(String statisticType, BigDecimal velocityWh) {
		this.statisticType = statisticType;
		this.velocityWh = velocityWh;
	}

	public KVelocitySwhId(String warehouseid, String drawingid, String partNumberType, String statisticType,
			BigDecimal velocityWh, String day) {
		this.warehouseid = warehouseid;
		this.drawingid = drawingid;
		this.partNumberType = partNumberType;
		this.statisticType = statisticType;
		this.velocityWh = velocityWh;
		this.day = day;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public String getPartNumberType() {
		return this.partNumberType;
	}

	public void setPartNumberType(String partNumberType) {
		this.partNumberType = partNumberType;
	}

	public String getStatisticType() {
		return this.statisticType;
	}

	public void setStatisticType(String statisticType) {
		this.statisticType = statisticType;
	}

	public BigDecimal getVelocityWh() {
		return this.velocityWh;
	}

	public void setVelocityWh(BigDecimal velocityWh) {
		this.velocityWh = velocityWh;
	}

	public String getDay() {
		return this.day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KVelocitySwhId))
			return false;
		KVelocitySwhId castOther = (KVelocitySwhId) other;

		return ((this.getWarehouseid() == castOther.getWarehouseid()) || (this.getWarehouseid() != null
				&& castOther.getWarehouseid() != null && this.getWarehouseid().equals(castOther.getWarehouseid())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getPartNumberType() == castOther.getPartNumberType())
						|| (this.getPartNumberType() != null && castOther.getPartNumberType() != null
								&& this.getPartNumberType().equals(castOther.getPartNumberType())))
				&& ((this.getStatisticType() == castOther.getStatisticType())
						|| (this.getStatisticType() != null && castOther.getStatisticType() != null
								&& this.getStatisticType().equals(castOther.getStatisticType())))
				&& ((this.getVelocityWh() == castOther.getVelocityWh()) || (this.getVelocityWh() != null
						&& castOther.getVelocityWh() != null && this.getVelocityWh().equals(castOther.getVelocityWh())))
				&& ((this.getDay() == castOther.getDay()) || (this.getDay() != null && castOther.getDay() != null
						&& this.getDay().equals(castOther.getDay())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getWarehouseid() == null ? 0 : this.getWarehouseid().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getPartNumberType() == null ? 0 : this.getPartNumberType().hashCode());
		result = 37 * result + (getStatisticType() == null ? 0 : this.getStatisticType().hashCode());
		result = 37 * result + (getVelocityWh() == null ? 0 : this.getVelocityWh().hashCode());
		result = 37 * result + (getDay() == null ? 0 : this.getDay().hashCode());
		return result;
	}

}
