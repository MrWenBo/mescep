package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * IIodemandDetail generated by hbm2java
 */
public class IIodemandDetail implements java.io.Serializable {

	private IIodemandDetailId id;
	private IIodemandHeader IIodemandHeader;
	private String partNumber;
	private String drawingid;
	private String partDescription;
	private BigDecimal routingqty;
	private BigDecimal dispatchedqty;
	private String warehouseid;
	private String binid;
	private BigDecimal needqty;
	private BigDecimal sortqty;
	private String useType;
	private String isSendLtk;
	private String isFinishSort;
	private String uniqueid;
	private String employeeid;
	private Date finishtime;

	public IIodemandDetail() {
	}

	public IIodemandDetail(IIodemandDetailId id, IIodemandHeader IIodemandHeader) {
		this.id = id;
		this.IIodemandHeader = IIodemandHeader;
	}

	public IIodemandDetail(IIodemandDetailId id, IIodemandHeader IIodemandHeader, String partNumber, String drawingid,
			String partDescription, BigDecimal routingqty, BigDecimal dispatchedqty, String warehouseid, String binid,
			BigDecimal needqty, BigDecimal sortqty, String useType, String isSendLtk, String isFinishSort,
			String uniqueid, String employeeid, Date finishtime) {
		this.id = id;
		this.IIodemandHeader = IIodemandHeader;
		this.partNumber = partNumber;
		this.drawingid = drawingid;
		this.partDescription = partDescription;
		this.routingqty = routingqty;
		this.dispatchedqty = dispatchedqty;
		this.warehouseid = warehouseid;
		this.binid = binid;
		this.needqty = needqty;
		this.sortqty = sortqty;
		this.useType = useType;
		this.isSendLtk = isSendLtk;
		this.isFinishSort = isFinishSort;
		this.uniqueid = uniqueid;
		this.employeeid = employeeid;
		this.finishtime = finishtime;
	}

	public IIodemandDetailId getId() {
		return this.id;
	}

	public void setId(IIodemandDetailId id) {
		this.id = id;
	}

	public IIodemandHeader getIIodemandHeader() {
		return this.IIodemandHeader;
	}

	public void setIIodemandHeader(IIodemandHeader IIodemandHeader) {
		this.IIodemandHeader = IIodemandHeader;
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

	public String getPartDescription() {
		return this.partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public BigDecimal getRoutingqty() {
		return this.routingqty;
	}

	public void setRoutingqty(BigDecimal routingqty) {
		this.routingqty = routingqty;
	}

	public BigDecimal getDispatchedqty() {
		return this.dispatchedqty;
	}

	public void setDispatchedqty(BigDecimal dispatchedqty) {
		this.dispatchedqty = dispatchedqty;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public String getBinid() {
		return this.binid;
	}

	public void setBinid(String binid) {
		this.binid = binid;
	}

	public BigDecimal getNeedqty() {
		return this.needqty;
	}

	public void setNeedqty(BigDecimal needqty) {
		this.needqty = needqty;
	}

	public BigDecimal getSortqty() {
		return this.sortqty;
	}

	public void setSortqty(BigDecimal sortqty) {
		this.sortqty = sortqty;
	}

	public String getUseType() {
		return this.useType;
	}

	public void setUseType(String useType) {
		this.useType = useType;
	}

	public String getIsSendLtk() {
		return this.isSendLtk;
	}

	public void setIsSendLtk(String isSendLtk) {
		this.isSendLtk = isSendLtk;
	}

	public String getIsFinishSort() {
		return this.isFinishSort;
	}

	public void setIsFinishSort(String isFinishSort) {
		this.isFinishSort = isFinishSort;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public Date getFinishtime() {
		return this.finishtime;
	}

	public void setFinishtime(Date finishtime) {
		this.finishtime = finishtime;
	}

}
