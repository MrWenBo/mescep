package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * KCompleteOntimeId generated by hbm2java
 */
public class KCompleteOntimeId implements java.io.Serializable {

	private String deptid;
	private String drawingid;
	private String partNumberType;
	private String model;
	private String actualfinish;
	private String statisticType;
	private BigDecimal completeOntime;

	public KCompleteOntimeId() {
	}

	public KCompleteOntimeId(String actualfinish, String statisticType, BigDecimal completeOntime) {
		this.actualfinish = actualfinish;
		this.statisticType = statisticType;
		this.completeOntime = completeOntime;
	}

	public KCompleteOntimeId(String deptid, String drawingid, String partNumberType, String model, String actualfinish,
			String statisticType, BigDecimal completeOntime) {
		this.deptid = deptid;
		this.drawingid = drawingid;
		this.partNumberType = partNumberType;
		this.model = model;
		this.actualfinish = actualfinish;
		this.statisticType = statisticType;
		this.completeOntime = completeOntime;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
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

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getActualfinish() {
		return this.actualfinish;
	}

	public void setActualfinish(String actualfinish) {
		this.actualfinish = actualfinish;
	}

	public String getStatisticType() {
		return this.statisticType;
	}

	public void setStatisticType(String statisticType) {
		this.statisticType = statisticType;
	}

	public BigDecimal getCompleteOntime() {
		return this.completeOntime;
	}

	public void setCompleteOntime(BigDecimal completeOntime) {
		this.completeOntime = completeOntime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KCompleteOntimeId))
			return false;
		KCompleteOntimeId castOther = (KCompleteOntimeId) other;

		return ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
				&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getPartNumberType() == castOther.getPartNumberType())
						|| (this.getPartNumberType() != null && castOther.getPartNumberType() != null
								&& this.getPartNumberType().equals(castOther.getPartNumberType())))
				&& ((this.getModel() == castOther.getModel()) || (this.getModel() != null
						&& castOther.getModel() != null && this.getModel().equals(castOther.getModel())))
				&& ((this.getActualfinish() == castOther.getActualfinish())
						|| (this.getActualfinish() != null && castOther.getActualfinish() != null
								&& this.getActualfinish().equals(castOther.getActualfinish())))
				&& ((this.getStatisticType() == castOther.getStatisticType())
						|| (this.getStatisticType() != null && castOther.getStatisticType() != null
								&& this.getStatisticType().equals(castOther.getStatisticType())))
				&& ((this.getCompleteOntime() == castOther.getCompleteOntime())
						|| (this.getCompleteOntime() != null && castOther.getCompleteOntime() != null
								&& this.getCompleteOntime().equals(castOther.getCompleteOntime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getPartNumberType() == null ? 0 : this.getPartNumberType().hashCode());
		result = 37 * result + (getModel() == null ? 0 : this.getModel().hashCode());
		result = 37 * result + (getActualfinish() == null ? 0 : this.getActualfinish().hashCode());
		result = 37 * result + (getStatisticType() == null ? 0 : this.getStatisticType().hashCode());
		result = 37 * result + (getCompleteOntime() == null ? 0 : this.getCompleteOntime().hashCode());
		return result;
	}

}
