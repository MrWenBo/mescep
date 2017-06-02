package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * JobshopZaishenliId generated by hbm2java
 */
public class JobshopZaishenliId implements java.io.Serializable {

	private String mastershop;
	private String model;
	private String batchnum;
	private String drawingid;
	private String operationIddesc;
	private String barcode;
	private String checkdeptid;
	private BigDecimal submitqty;
	private BigDecimal defectqty;
	private String judger;
	private Date createtime;
	private BigDecimal delaytime;

	public JobshopZaishenliId() {
	}

	public JobshopZaishenliId(String barcode) {
		this.barcode = barcode;
	}

	public JobshopZaishenliId(String mastershop, String model, String batchnum, String drawingid,
			String operationIddesc, String barcode, String checkdeptid, BigDecimal submitqty, BigDecimal defectqty,
			String judger, Date createtime, BigDecimal delaytime) {
		this.mastershop = mastershop;
		this.model = model;
		this.batchnum = batchnum;
		this.drawingid = drawingid;
		this.operationIddesc = operationIddesc;
		this.barcode = barcode;
		this.checkdeptid = checkdeptid;
		this.submitqty = submitqty;
		this.defectqty = defectqty;
		this.judger = judger;
		this.createtime = createtime;
		this.delaytime = delaytime;
	}

	public String getMastershop() {
		return this.mastershop;
	}

	public void setMastershop(String mastershop) {
		this.mastershop = mastershop;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public String getOperationIddesc() {
		return this.operationIddesc;
	}

	public void setOperationIddesc(String operationIddesc) {
		this.operationIddesc = operationIddesc;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getCheckdeptid() {
		return this.checkdeptid;
	}

	public void setCheckdeptid(String checkdeptid) {
		this.checkdeptid = checkdeptid;
	}

	public BigDecimal getSubmitqty() {
		return this.submitqty;
	}

	public void setSubmitqty(BigDecimal submitqty) {
		this.submitqty = submitqty;
	}

	public BigDecimal getDefectqty() {
		return this.defectqty;
	}

	public void setDefectqty(BigDecimal defectqty) {
		this.defectqty = defectqty;
	}

	public String getJudger() {
		return this.judger;
	}

	public void setJudger(String judger) {
		this.judger = judger;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public BigDecimal getDelaytime() {
		return this.delaytime;
	}

	public void setDelaytime(BigDecimal delaytime) {
		this.delaytime = delaytime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof JobshopZaishenliId))
			return false;
		JobshopZaishenliId castOther = (JobshopZaishenliId) other;

		return ((this.getMastershop() == castOther.getMastershop()) || (this.getMastershop() != null
				&& castOther.getMastershop() != null && this.getMastershop().equals(castOther.getMastershop())))
				&& ((this.getModel() == castOther.getModel()) || (this.getModel() != null
						&& castOther.getModel() != null && this.getModel().equals(castOther.getModel())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getOperationIddesc() == castOther.getOperationIddesc())
						|| (this.getOperationIddesc() != null && castOther.getOperationIddesc() != null
								&& this.getOperationIddesc().equals(castOther.getOperationIddesc())))
				&& ((this.getBarcode() == castOther.getBarcode()) || (this.getBarcode() != null
						&& castOther.getBarcode() != null && this.getBarcode().equals(castOther.getBarcode())))
				&& ((this.getCheckdeptid() == castOther.getCheckdeptid())
						|| (this.getCheckdeptid() != null && castOther.getCheckdeptid() != null
								&& this.getCheckdeptid().equals(castOther.getCheckdeptid())))
				&& ((this.getSubmitqty() == castOther.getSubmitqty()) || (this.getSubmitqty() != null
						&& castOther.getSubmitqty() != null && this.getSubmitqty().equals(castOther.getSubmitqty())))
				&& ((this.getDefectqty() == castOther.getDefectqty()) || (this.getDefectqty() != null
						&& castOther.getDefectqty() != null && this.getDefectqty().equals(castOther.getDefectqty())))
				&& ((this.getJudger() == castOther.getJudger()) || (this.getJudger() != null
						&& castOther.getJudger() != null && this.getJudger().equals(castOther.getJudger())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getDelaytime() == castOther.getDelaytime()) || (this.getDelaytime() != null
						&& castOther.getDelaytime() != null && this.getDelaytime().equals(castOther.getDelaytime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMastershop() == null ? 0 : this.getMastershop().hashCode());
		result = 37 * result + (getModel() == null ? 0 : this.getModel().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getOperationIddesc() == null ? 0 : this.getOperationIddesc().hashCode());
		result = 37 * result + (getBarcode() == null ? 0 : this.getBarcode().hashCode());
		result = 37 * result + (getCheckdeptid() == null ? 0 : this.getCheckdeptid().hashCode());
		result = 37 * result + (getSubmitqty() == null ? 0 : this.getSubmitqty().hashCode());
		result = 37 * result + (getDefectqty() == null ? 0 : this.getDefectqty().hashCode());
		result = 37 * result + (getJudger() == null ? 0 : this.getJudger().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getDelaytime() == null ? 0 : this.getDelaytime().hashCode());
		return result;
	}

}
