package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * IvIoheaderId generated by hbm2java
 */
public class IvIoheaderId implements java.io.Serializable {

	private String invioid;
	private Long iotype;
	private Long iostate;
	private String reasoncode;
	private String warehouseid;
	private String warehousemanager;
	private Date iodate;
	private String deptid;
	private String deptemp;
	private BigDecimal totalamount;
	private String invoiceid;
	private String creator;
	private Date createtime;
	private String partnerid;
	private String vouno;
	private String billchecker;
	private String notes;
	private String text1;
	private String text2;
	private String text3;
	private String text4;
	private String text5;
	private String text6;
	private String text7;
	private String text8;
	private String text9;
	private String text10;
	private String loader;
	private String relationid;
	private String lastModificator;
	private Date lastModifyTime;
	private String routing;
	private String partNumber;
	private BigDecimal producedQuantity;
	private String batchnum;
	private String sn;
	private String turnBoxId;
	private String currentBoxId;
	private String dutyemp;
	private String warning;
	private String tobinid;
	private String towarehouse;
	private String signer;
	private Date signdate;
	private String iotypedesc;
	private String iostatedesc;
	private String warehousename;
	private String deptname;
	private String deptempname;
	private String creatorname;
	private String warehousemanagername;
	private String billcheckername;
	private String abstract_;

	public IvIoheaderId() {
	}

	public IvIoheaderId(String invioid) {
		this.invioid = invioid;
	}

	public IvIoheaderId(String invioid, Long iotype, Long iostate, String reasoncode, String warehouseid,
			String warehousemanager, Date iodate, String deptid, String deptemp, BigDecimal totalamount,
			String invoiceid, String creator, Date createtime, String partnerid, String vouno, String billchecker,
			String notes, String text1, String text2, String text3, String text4, String text5, String text6,
			String text7, String text8, String text9, String text10, String loader, String relationid,
			String lastModificator, Date lastModifyTime, String routing, String partNumber, BigDecimal producedQuantity,
			String batchnum, String sn, String turnBoxId, String currentBoxId, String dutyemp, String warning,
			String tobinid, String towarehouse, String signer, Date signdate, String iotypedesc, String iostatedesc,
			String warehousename, String deptname, String deptempname, String creatorname, String warehousemanagername,
			String billcheckername, String abstract_) {
		this.invioid = invioid;
		this.iotype = iotype;
		this.iostate = iostate;
		this.reasoncode = reasoncode;
		this.warehouseid = warehouseid;
		this.warehousemanager = warehousemanager;
		this.iodate = iodate;
		this.deptid = deptid;
		this.deptemp = deptemp;
		this.totalamount = totalamount;
		this.invoiceid = invoiceid;
		this.creator = creator;
		this.createtime = createtime;
		this.partnerid = partnerid;
		this.vouno = vouno;
		this.billchecker = billchecker;
		this.notes = notes;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.text4 = text4;
		this.text5 = text5;
		this.text6 = text6;
		this.text7 = text7;
		this.text8 = text8;
		this.text9 = text9;
		this.text10 = text10;
		this.loader = loader;
		this.relationid = relationid;
		this.lastModificator = lastModificator;
		this.lastModifyTime = lastModifyTime;
		this.routing = routing;
		this.partNumber = partNumber;
		this.producedQuantity = producedQuantity;
		this.batchnum = batchnum;
		this.sn = sn;
		this.turnBoxId = turnBoxId;
		this.currentBoxId = currentBoxId;
		this.dutyemp = dutyemp;
		this.warning = warning;
		this.tobinid = tobinid;
		this.towarehouse = towarehouse;
		this.signer = signer;
		this.signdate = signdate;
		this.iotypedesc = iotypedesc;
		this.iostatedesc = iostatedesc;
		this.warehousename = warehousename;
		this.deptname = deptname;
		this.deptempname = deptempname;
		this.creatorname = creatorname;
		this.warehousemanagername = warehousemanagername;
		this.billcheckername = billcheckername;
		this.abstract_ = abstract_;
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

	public String getReasoncode() {
		return this.reasoncode;
	}

	public void setReasoncode(String reasoncode) {
		this.reasoncode = reasoncode;
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

	public Date getIodate() {
		return this.iodate;
	}

	public void setIodate(Date iodate) {
		this.iodate = iodate;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDeptemp() {
		return this.deptemp;
	}

	public void setDeptemp(String deptemp) {
		this.deptemp = deptemp;
	}

	public BigDecimal getTotalamount() {
		return this.totalamount;
	}

	public void setTotalamount(BigDecimal totalamount) {
		this.totalamount = totalamount;
	}

	public String getInvoiceid() {
		return this.invoiceid;
	}

	public void setInvoiceid(String invoiceid) {
		this.invoiceid = invoiceid;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getPartnerid() {
		return this.partnerid;
	}

	public void setPartnerid(String partnerid) {
		this.partnerid = partnerid;
	}

	public String getVouno() {
		return this.vouno;
	}

	public void setVouno(String vouno) {
		this.vouno = vouno;
	}

	public String getBillchecker() {
		return this.billchecker;
	}

	public void setBillchecker(String billchecker) {
		this.billchecker = billchecker;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getText1() {
		return this.text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getText2() {
		return this.text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public String getText3() {
		return this.text3;
	}

	public void setText3(String text3) {
		this.text3 = text3;
	}

	public String getText4() {
		return this.text4;
	}

	public void setText4(String text4) {
		this.text4 = text4;
	}

	public String getText5() {
		return this.text5;
	}

	public void setText5(String text5) {
		this.text5 = text5;
	}

	public String getText6() {
		return this.text6;
	}

	public void setText6(String text6) {
		this.text6 = text6;
	}

	public String getText7() {
		return this.text7;
	}

	public void setText7(String text7) {
		this.text7 = text7;
	}

	public String getText8() {
		return this.text8;
	}

	public void setText8(String text8) {
		this.text8 = text8;
	}

	public String getText9() {
		return this.text9;
	}

	public void setText9(String text9) {
		this.text9 = text9;
	}

	public String getText10() {
		return this.text10;
	}

	public void setText10(String text10) {
		this.text10 = text10;
	}

	public String getLoader() {
		return this.loader;
	}

	public void setLoader(String loader) {
		this.loader = loader;
	}

	public String getRelationid() {
		return this.relationid;
	}

	public void setRelationid(String relationid) {
		this.relationid = relationid;
	}

	public String getLastModificator() {
		return this.lastModificator;
	}

	public void setLastModificator(String lastModificator) {
		this.lastModificator = lastModificator;
	}

	public Date getLastModifyTime() {
		return this.lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public String getRouting() {
		return this.routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public BigDecimal getProducedQuantity() {
		return this.producedQuantity;
	}

	public void setProducedQuantity(BigDecimal producedQuantity) {
		this.producedQuantity = producedQuantity;
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

	public String getTurnBoxId() {
		return this.turnBoxId;
	}

	public void setTurnBoxId(String turnBoxId) {
		this.turnBoxId = turnBoxId;
	}

	public String getCurrentBoxId() {
		return this.currentBoxId;
	}

	public void setCurrentBoxId(String currentBoxId) {
		this.currentBoxId = currentBoxId;
	}

	public String getDutyemp() {
		return this.dutyemp;
	}

	public void setDutyemp(String dutyemp) {
		this.dutyemp = dutyemp;
	}

	public String getWarning() {
		return this.warning;
	}

	public void setWarning(String warning) {
		this.warning = warning;
	}

	public String getTobinid() {
		return this.tobinid;
	}

	public void setTobinid(String tobinid) {
		this.tobinid = tobinid;
	}

	public String getTowarehouse() {
		return this.towarehouse;
	}

	public void setTowarehouse(String towarehouse) {
		this.towarehouse = towarehouse;
	}

	public String getSigner() {
		return this.signer;
	}

	public void setSigner(String signer) {
		this.signer = signer;
	}

	public Date getSigndate() {
		return this.signdate;
	}

	public void setSigndate(Date signdate) {
		this.signdate = signdate;
	}

	public String getIotypedesc() {
		return this.iotypedesc;
	}

	public void setIotypedesc(String iotypedesc) {
		this.iotypedesc = iotypedesc;
	}

	public String getIostatedesc() {
		return this.iostatedesc;
	}

	public void setIostatedesc(String iostatedesc) {
		this.iostatedesc = iostatedesc;
	}

	public String getWarehousename() {
		return this.warehousename;
	}

	public void setWarehousename(String warehousename) {
		this.warehousename = warehousename;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptempname() {
		return this.deptempname;
	}

	public void setDeptempname(String deptempname) {
		this.deptempname = deptempname;
	}

	public String getCreatorname() {
		return this.creatorname;
	}

	public void setCreatorname(String creatorname) {
		this.creatorname = creatorname;
	}

	public String getWarehousemanagername() {
		return this.warehousemanagername;
	}

	public void setWarehousemanagername(String warehousemanagername) {
		this.warehousemanagername = warehousemanagername;
	}

	public String getBillcheckername() {
		return this.billcheckername;
	}

	public void setBillcheckername(String billcheckername) {
		this.billcheckername = billcheckername;
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IvIoheaderId))
			return false;
		IvIoheaderId castOther = (IvIoheaderId) other;

		return ((this.getInvioid() == castOther.getInvioid()) || (this.getInvioid() != null
				&& castOther.getInvioid() != null && this.getInvioid().equals(castOther.getInvioid())))
				&& ((this.getIotype() == castOther.getIotype()) || (this.getIotype() != null
						&& castOther.getIotype() != null && this.getIotype().equals(castOther.getIotype())))
				&& ((this.getIostate() == castOther.getIostate()) || (this.getIostate() != null
						&& castOther.getIostate() != null && this.getIostate().equals(castOther.getIostate())))
				&& ((this.getReasoncode() == castOther.getReasoncode()) || (this.getReasoncode() != null
						&& castOther.getReasoncode() != null && this.getReasoncode().equals(castOther.getReasoncode())))
				&& ((this.getWarehouseid() == castOther.getWarehouseid())
						|| (this.getWarehouseid() != null && castOther.getWarehouseid() != null
								&& this.getWarehouseid().equals(castOther.getWarehouseid())))
				&& ((this.getWarehousemanager() == castOther.getWarehousemanager())
						|| (this.getWarehousemanager() != null && castOther.getWarehousemanager() != null
								&& this.getWarehousemanager().equals(castOther.getWarehousemanager())))
				&& ((this.getIodate() == castOther.getIodate()) || (this.getIodate() != null
						&& castOther.getIodate() != null && this.getIodate().equals(castOther.getIodate())))
				&& ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
						&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getDeptemp() == castOther.getDeptemp()) || (this.getDeptemp() != null
						&& castOther.getDeptemp() != null && this.getDeptemp().equals(castOther.getDeptemp())))
				&& ((this.getTotalamount() == castOther.getTotalamount())
						|| (this.getTotalamount() != null && castOther.getTotalamount() != null
								&& this.getTotalamount().equals(castOther.getTotalamount())))
				&& ((this.getInvoiceid() == castOther.getInvoiceid()) || (this.getInvoiceid() != null
						&& castOther.getInvoiceid() != null && this.getInvoiceid().equals(castOther.getInvoiceid())))
				&& ((this.getCreator() == castOther.getCreator()) || (this.getCreator() != null
						&& castOther.getCreator() != null && this.getCreator().equals(castOther.getCreator())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getPartnerid() == castOther.getPartnerid()) || (this.getPartnerid() != null
						&& castOther.getPartnerid() != null && this.getPartnerid().equals(castOther.getPartnerid())))
				&& ((this.getVouno() == castOther.getVouno()) || (this.getVouno() != null
						&& castOther.getVouno() != null && this.getVouno().equals(castOther.getVouno())))
				&& ((this.getBillchecker() == castOther.getBillchecker())
						|| (this.getBillchecker() != null && castOther.getBillchecker() != null
								&& this.getBillchecker().equals(castOther.getBillchecker())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getText1() == castOther.getText1()) || (this.getText1() != null
						&& castOther.getText1() != null && this.getText1().equals(castOther.getText1())))
				&& ((this.getText2() == castOther.getText2()) || (this.getText2() != null
						&& castOther.getText2() != null && this.getText2().equals(castOther.getText2())))
				&& ((this.getText3() == castOther.getText3()) || (this.getText3() != null
						&& castOther.getText3() != null && this.getText3().equals(castOther.getText3())))
				&& ((this.getText4() == castOther.getText4()) || (this.getText4() != null
						&& castOther.getText4() != null && this.getText4().equals(castOther.getText4())))
				&& ((this.getText5() == castOther.getText5()) || (this.getText5() != null
						&& castOther.getText5() != null && this.getText5().equals(castOther.getText5())))
				&& ((this.getText6() == castOther.getText6()) || (this.getText6() != null
						&& castOther.getText6() != null && this.getText6().equals(castOther.getText6())))
				&& ((this.getText7() == castOther.getText7()) || (this.getText7() != null
						&& castOther.getText7() != null && this.getText7().equals(castOther.getText7())))
				&& ((this.getText8() == castOther.getText8()) || (this.getText8() != null
						&& castOther.getText8() != null && this.getText8().equals(castOther.getText8())))
				&& ((this.getText9() == castOther.getText9()) || (this.getText9() != null
						&& castOther.getText9() != null && this.getText9().equals(castOther.getText9())))
				&& ((this.getText10() == castOther.getText10()) || (this.getText10() != null
						&& castOther.getText10() != null && this.getText10().equals(castOther.getText10())))
				&& ((this.getLoader() == castOther.getLoader()) || (this.getLoader() != null
						&& castOther.getLoader() != null && this.getLoader().equals(castOther.getLoader())))
				&& ((this.getRelationid() == castOther.getRelationid()) || (this.getRelationid() != null
						&& castOther.getRelationid() != null && this.getRelationid().equals(castOther.getRelationid())))
				&& ((this.getLastModificator() == castOther.getLastModificator())
						|| (this.getLastModificator() != null && castOther.getLastModificator() != null
								&& this.getLastModificator().equals(castOther.getLastModificator())))
				&& ((this.getLastModifyTime() == castOther.getLastModifyTime())
						|| (this.getLastModifyTime() != null && castOther.getLastModifyTime() != null
								&& this.getLastModifyTime().equals(castOther.getLastModifyTime())))
				&& ((this.getRouting() == castOther.getRouting()) || (this.getRouting() != null
						&& castOther.getRouting() != null && this.getRouting().equals(castOther.getRouting())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& ((this.getProducedQuantity() == castOther.getProducedQuantity())
						|| (this.getProducedQuantity() != null && castOther.getProducedQuantity() != null
								&& this.getProducedQuantity().equals(castOther.getProducedQuantity())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getSn() == castOther.getSn()) || (this.getSn() != null && castOther.getSn() != null
						&& this.getSn().equals(castOther.getSn())))
				&& ((this.getTurnBoxId() == castOther.getTurnBoxId()) || (this.getTurnBoxId() != null
						&& castOther.getTurnBoxId() != null && this.getTurnBoxId().equals(castOther.getTurnBoxId())))
				&& ((this.getCurrentBoxId() == castOther.getCurrentBoxId())
						|| (this.getCurrentBoxId() != null && castOther.getCurrentBoxId() != null
								&& this.getCurrentBoxId().equals(castOther.getCurrentBoxId())))
				&& ((this.getDutyemp() == castOther.getDutyemp()) || (this.getDutyemp() != null
						&& castOther.getDutyemp() != null && this.getDutyemp().equals(castOther.getDutyemp())))
				&& ((this.getWarning() == castOther.getWarning()) || (this.getWarning() != null
						&& castOther.getWarning() != null && this.getWarning().equals(castOther.getWarning())))
				&& ((this.getTobinid() == castOther.getTobinid()) || (this.getTobinid() != null
						&& castOther.getTobinid() != null && this.getTobinid().equals(castOther.getTobinid())))
				&& ((this.getTowarehouse() == castOther.getTowarehouse())
						|| (this.getTowarehouse() != null && castOther.getTowarehouse() != null
								&& this.getTowarehouse().equals(castOther.getTowarehouse())))
				&& ((this.getSigner() == castOther.getSigner()) || (this.getSigner() != null
						&& castOther.getSigner() != null && this.getSigner().equals(castOther.getSigner())))
				&& ((this.getSigndate() == castOther.getSigndate()) || (this.getSigndate() != null
						&& castOther.getSigndate() != null && this.getSigndate().equals(castOther.getSigndate())))
				&& ((this.getIotypedesc() == castOther.getIotypedesc()) || (this.getIotypedesc() != null
						&& castOther.getIotypedesc() != null && this.getIotypedesc().equals(castOther.getIotypedesc())))
				&& ((this.getIostatedesc() == castOther.getIostatedesc())
						|| (this.getIostatedesc() != null && castOther.getIostatedesc() != null
								&& this.getIostatedesc().equals(castOther.getIostatedesc())))
				&& ((this.getWarehousename() == castOther.getWarehousename())
						|| (this.getWarehousename() != null && castOther.getWarehousename() != null
								&& this.getWarehousename().equals(castOther.getWarehousename())))
				&& ((this.getDeptname() == castOther.getDeptname()) || (this.getDeptname() != null
						&& castOther.getDeptname() != null && this.getDeptname().equals(castOther.getDeptname())))
				&& ((this.getDeptempname() == castOther.getDeptempname())
						|| (this.getDeptempname() != null && castOther.getDeptempname() != null
								&& this.getDeptempname().equals(castOther.getDeptempname())))
				&& ((this.getCreatorname() == castOther.getCreatorname())
						|| (this.getCreatorname() != null && castOther.getCreatorname() != null
								&& this.getCreatorname().equals(castOther.getCreatorname())))
				&& ((this.getWarehousemanagername() == castOther.getWarehousemanagername())
						|| (this.getWarehousemanagername() != null && castOther.getWarehousemanagername() != null
								&& this.getWarehousemanagername().equals(castOther.getWarehousemanagername())))
				&& ((this.getBillcheckername() == castOther.getBillcheckername())
						|| (this.getBillcheckername() != null && castOther.getBillcheckername() != null
								&& this.getBillcheckername().equals(castOther.getBillcheckername())))
				&& ((this.getAbstract_() == castOther.getAbstract_()) || (this.getAbstract_() != null
						&& castOther.getAbstract_() != null && this.getAbstract_().equals(castOther.getAbstract_())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getInvioid() == null ? 0 : this.getInvioid().hashCode());
		result = 37 * result + (getIotype() == null ? 0 : this.getIotype().hashCode());
		result = 37 * result + (getIostate() == null ? 0 : this.getIostate().hashCode());
		result = 37 * result + (getReasoncode() == null ? 0 : this.getReasoncode().hashCode());
		result = 37 * result + (getWarehouseid() == null ? 0 : this.getWarehouseid().hashCode());
		result = 37 * result + (getWarehousemanager() == null ? 0 : this.getWarehousemanager().hashCode());
		result = 37 * result + (getIodate() == null ? 0 : this.getIodate().hashCode());
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getDeptemp() == null ? 0 : this.getDeptemp().hashCode());
		result = 37 * result + (getTotalamount() == null ? 0 : this.getTotalamount().hashCode());
		result = 37 * result + (getInvoiceid() == null ? 0 : this.getInvoiceid().hashCode());
		result = 37 * result + (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getPartnerid() == null ? 0 : this.getPartnerid().hashCode());
		result = 37 * result + (getVouno() == null ? 0 : this.getVouno().hashCode());
		result = 37 * result + (getBillchecker() == null ? 0 : this.getBillchecker().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getText1() == null ? 0 : this.getText1().hashCode());
		result = 37 * result + (getText2() == null ? 0 : this.getText2().hashCode());
		result = 37 * result + (getText3() == null ? 0 : this.getText3().hashCode());
		result = 37 * result + (getText4() == null ? 0 : this.getText4().hashCode());
		result = 37 * result + (getText5() == null ? 0 : this.getText5().hashCode());
		result = 37 * result + (getText6() == null ? 0 : this.getText6().hashCode());
		result = 37 * result + (getText7() == null ? 0 : this.getText7().hashCode());
		result = 37 * result + (getText8() == null ? 0 : this.getText8().hashCode());
		result = 37 * result + (getText9() == null ? 0 : this.getText9().hashCode());
		result = 37 * result + (getText10() == null ? 0 : this.getText10().hashCode());
		result = 37 * result + (getLoader() == null ? 0 : this.getLoader().hashCode());
		result = 37 * result + (getRelationid() == null ? 0 : this.getRelationid().hashCode());
		result = 37 * result + (getLastModificator() == null ? 0 : this.getLastModificator().hashCode());
		result = 37 * result + (getLastModifyTime() == null ? 0 : this.getLastModifyTime().hashCode());
		result = 37 * result + (getRouting() == null ? 0 : this.getRouting().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getProducedQuantity() == null ? 0 : this.getProducedQuantity().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getSn() == null ? 0 : this.getSn().hashCode());
		result = 37 * result + (getTurnBoxId() == null ? 0 : this.getTurnBoxId().hashCode());
		result = 37 * result + (getCurrentBoxId() == null ? 0 : this.getCurrentBoxId().hashCode());
		result = 37 * result + (getDutyemp() == null ? 0 : this.getDutyemp().hashCode());
		result = 37 * result + (getWarning() == null ? 0 : this.getWarning().hashCode());
		result = 37 * result + (getTobinid() == null ? 0 : this.getTobinid().hashCode());
		result = 37 * result + (getTowarehouse() == null ? 0 : this.getTowarehouse().hashCode());
		result = 37 * result + (getSigner() == null ? 0 : this.getSigner().hashCode());
		result = 37 * result + (getSigndate() == null ? 0 : this.getSigndate().hashCode());
		result = 37 * result + (getIotypedesc() == null ? 0 : this.getIotypedesc().hashCode());
		result = 37 * result + (getIostatedesc() == null ? 0 : this.getIostatedesc().hashCode());
		result = 37 * result + (getWarehousename() == null ? 0 : this.getWarehousename().hashCode());
		result = 37 * result + (getDeptname() == null ? 0 : this.getDeptname().hashCode());
		result = 37 * result + (getDeptempname() == null ? 0 : this.getDeptempname().hashCode());
		result = 37 * result + (getCreatorname() == null ? 0 : this.getCreatorname().hashCode());
		result = 37 * result + (getWarehousemanagername() == null ? 0 : this.getWarehousemanagername().hashCode());
		result = 37 * result + (getBillcheckername() == null ? 0 : this.getBillcheckername().hashCode());
		result = 37 * result + (getAbstract_() == null ? 0 : this.getAbstract_().hashCode());
		return result;
	}

}
