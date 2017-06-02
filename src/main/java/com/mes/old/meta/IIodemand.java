package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * IIodemand generated by hbm2java
 */
public class IIodemand implements java.io.Serializable {

	private String invdemandid;
	private String taskuid;
	private String taskname;
	private String prepareTaskuid;
	private String operationIddesc;
	private String routing;
	private String opuid;
	private String barcode;
	private String materialusn;
	private String partNumber;
	private String drawingid;
	private String partDescription;
	private BigDecimal routingqty;
	private BigDecimal dispatchedqty;
	private String needwarehouseid;
	private String needbinid;
	private String warehouseid;
	private String binid;
	private BigDecimal needqty;
	private BigDecimal sortqty;
	private Integer sortstate;
	private String isfinishsort;
	private BigDecimal deliveryqty;
	private Integer deliverystate;
	private String isfinishdelivery;
	private String isdeploy;
	private String useType;
	private String isSendLtk;
	private String relationid;

	public IIodemand() {
	}

	public IIodemand(String invdemandid, String taskuid, String partNumber) {
		this.invdemandid = invdemandid;
		this.taskuid = taskuid;
		this.partNumber = partNumber;
	}

	public IIodemand(String invdemandid, String taskuid, String taskname, String prepareTaskuid, String operationIddesc,
			String routing, String opuid, String barcode, String materialusn, String partNumber, String drawingid,
			String partDescription, BigDecimal routingqty, BigDecimal dispatchedqty, String needwarehouseid,
			String needbinid, String warehouseid, String binid, BigDecimal needqty, BigDecimal sortqty,
			Integer sortstate, String isfinishsort, BigDecimal deliveryqty, Integer deliverystate,
			String isfinishdelivery, String isdeploy, String useType, String isSendLtk, String relationid) {
		this.invdemandid = invdemandid;
		this.taskuid = taskuid;
		this.taskname = taskname;
		this.prepareTaskuid = prepareTaskuid;
		this.operationIddesc = operationIddesc;
		this.routing = routing;
		this.opuid = opuid;
		this.barcode = barcode;
		this.materialusn = materialusn;
		this.partNumber = partNumber;
		this.drawingid = drawingid;
		this.partDescription = partDescription;
		this.routingqty = routingqty;
		this.dispatchedqty = dispatchedqty;
		this.needwarehouseid = needwarehouseid;
		this.needbinid = needbinid;
		this.warehouseid = warehouseid;
		this.binid = binid;
		this.needqty = needqty;
		this.sortqty = sortqty;
		this.sortstate = sortstate;
		this.isfinishsort = isfinishsort;
		this.deliveryqty = deliveryqty;
		this.deliverystate = deliverystate;
		this.isfinishdelivery = isfinishdelivery;
		this.isdeploy = isdeploy;
		this.useType = useType;
		this.isSendLtk = isSendLtk;
		this.relationid = relationid;
	}

	public String getInvdemandid() {
		return this.invdemandid;
	}

	public void setInvdemandid(String invdemandid) {
		this.invdemandid = invdemandid;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public String getTaskname() {
		return this.taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getPrepareTaskuid() {
		return this.prepareTaskuid;
	}

	public void setPrepareTaskuid(String prepareTaskuid) {
		this.prepareTaskuid = prepareTaskuid;
	}

	public String getOperationIddesc() {
		return this.operationIddesc;
	}

	public void setOperationIddesc(String operationIddesc) {
		this.operationIddesc = operationIddesc;
	}

	public String getRouting() {
		return this.routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public String getOpuid() {
		return this.opuid;
	}

	public void setOpuid(String opuid) {
		this.opuid = opuid;
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

	public String getNeedwarehouseid() {
		return this.needwarehouseid;
	}

	public void setNeedwarehouseid(String needwarehouseid) {
		this.needwarehouseid = needwarehouseid;
	}

	public String getNeedbinid() {
		return this.needbinid;
	}

	public void setNeedbinid(String needbinid) {
		this.needbinid = needbinid;
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

	public Integer getSortstate() {
		return this.sortstate;
	}

	public void setSortstate(Integer sortstate) {
		this.sortstate = sortstate;
	}

	public String getIsfinishsort() {
		return this.isfinishsort;
	}

	public void setIsfinishsort(String isfinishsort) {
		this.isfinishsort = isfinishsort;
	}

	public BigDecimal getDeliveryqty() {
		return this.deliveryqty;
	}

	public void setDeliveryqty(BigDecimal deliveryqty) {
		this.deliveryqty = deliveryqty;
	}

	public Integer getDeliverystate() {
		return this.deliverystate;
	}

	public void setDeliverystate(Integer deliverystate) {
		this.deliverystate = deliverystate;
	}

	public String getIsfinishdelivery() {
		return this.isfinishdelivery;
	}

	public void setIsfinishdelivery(String isfinishdelivery) {
		this.isfinishdelivery = isfinishdelivery;
	}

	public String getIsdeploy() {
		return this.isdeploy;
	}

	public void setIsdeploy(String isdeploy) {
		this.isdeploy = isdeploy;
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

	public String getRelationid() {
		return this.relationid;
	}

	public void setRelationid(String relationid) {
		this.relationid = relationid;
	}

}
