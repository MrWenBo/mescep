package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * BBillOfMaterials generated by hbm2java
 */
public class BBillOfMaterials implements java.io.Serializable {

	private long uniqueid;
	private BPartNumber BPartNumberByConsumedPartNumber;
	private BPartNumber BPartNumberByProducedPartNumber;
	private BRoutine BRoutine;
	private BigDecimal operationId;
	private String routing;
	private BigDecimal minFixedShrinkage;
	private BigDecimal minPercentShrinkage;
	private Byte phantom;
	private Date ecnDate;
	private String ecnDescription;
	private Date ecnDateFormat;
	private String ecnCode;
	private Long ecnLevel;
	private Long ecnNumber;
	private Byte usableByNewMfgOrder;
	private BigDecimal normPercentShrinkage;
	private BigDecimal normFixedShrinkage;
	private BigDecimal minQuantity;
	private String producedQuantityUom;
	private String process;
	private String quantityConstraintType;
	private String consumedQuantityUom;
	private Byte flexibleMinQuantityP;
	private BigDecimal maxQuantity;
	private BigDecimal multipleQuantity;
	private String attributeConsumed;
	private String attributeProduced;
	private String changer;
	private Date changetime;
	private Byte changestate;
	private String creator;
	private Date createtime;
	private Byte effective;
	private Byte roundType;
	private Long consumeType;
	private BigDecimal producedQuantity;
	private BigDecimal consumedQuantity;
	private String BBomOutUid;
	private Date PBeginday;
	private Date PEndday;
	private Date EBeginday;
	private Date EEndday;
	private String PBomnumber;
	private String EBomnumber;
	private String sfPath;
	private String notes;
	private Byte isCritical;
	private Long readypoint;

	public BBillOfMaterials() {
	}

	public BBillOfMaterials(long uniqueid, BPartNumber BPartNumberByConsumedPartNumber,
			BPartNumber BPartNumberByProducedPartNumber, BRoutine BRoutine) {
		this.uniqueid = uniqueid;
		this.BPartNumberByConsumedPartNumber = BPartNumberByConsumedPartNumber;
		this.BPartNumberByProducedPartNumber = BPartNumberByProducedPartNumber;
		this.BRoutine = BRoutine;
	}

	public BBillOfMaterials(long uniqueid, BPartNumber BPartNumberByConsumedPartNumber,
			BPartNumber BPartNumberByProducedPartNumber, BRoutine BRoutine, BigDecimal operationId, String routing,
			BigDecimal minFixedShrinkage, BigDecimal minPercentShrinkage, Byte phantom, Date ecnDate,
			String ecnDescription, Date ecnDateFormat, String ecnCode, Long ecnLevel, Long ecnNumber,
			Byte usableByNewMfgOrder, BigDecimal normPercentShrinkage, BigDecimal normFixedShrinkage,
			BigDecimal minQuantity, String producedQuantityUom, String process, String quantityConstraintType,
			String consumedQuantityUom, Byte flexibleMinQuantityP, BigDecimal maxQuantity, BigDecimal multipleQuantity,
			String attributeConsumed, String attributeProduced, String changer, Date changetime, Byte changestate,
			String creator, Date createtime, Byte effective, Byte roundType, Long consumeType,
			BigDecimal producedQuantity, BigDecimal consumedQuantity, String BBomOutUid, Date PBeginday, Date PEndday,
			Date EBeginday, Date EEndday, String PBomnumber, String EBomnumber, String sfPath, String notes,
			Byte isCritical, Long readypoint) {
		this.uniqueid = uniqueid;
		this.BPartNumberByConsumedPartNumber = BPartNumberByConsumedPartNumber;
		this.BPartNumberByProducedPartNumber = BPartNumberByProducedPartNumber;
		this.BRoutine = BRoutine;
		this.operationId = operationId;
		this.routing = routing;
		this.minFixedShrinkage = minFixedShrinkage;
		this.minPercentShrinkage = minPercentShrinkage;
		this.phantom = phantom;
		this.ecnDate = ecnDate;
		this.ecnDescription = ecnDescription;
		this.ecnDateFormat = ecnDateFormat;
		this.ecnCode = ecnCode;
		this.ecnLevel = ecnLevel;
		this.ecnNumber = ecnNumber;
		this.usableByNewMfgOrder = usableByNewMfgOrder;
		this.normPercentShrinkage = normPercentShrinkage;
		this.normFixedShrinkage = normFixedShrinkage;
		this.minQuantity = minQuantity;
		this.producedQuantityUom = producedQuantityUom;
		this.process = process;
		this.quantityConstraintType = quantityConstraintType;
		this.consumedQuantityUom = consumedQuantityUom;
		this.flexibleMinQuantityP = flexibleMinQuantityP;
		this.maxQuantity = maxQuantity;
		this.multipleQuantity = multipleQuantity;
		this.attributeConsumed = attributeConsumed;
		this.attributeProduced = attributeProduced;
		this.changer = changer;
		this.changetime = changetime;
		this.changestate = changestate;
		this.creator = creator;
		this.createtime = createtime;
		this.effective = effective;
		this.roundType = roundType;
		this.consumeType = consumeType;
		this.producedQuantity = producedQuantity;
		this.consumedQuantity = consumedQuantity;
		this.BBomOutUid = BBomOutUid;
		this.PBeginday = PBeginday;
		this.PEndday = PEndday;
		this.EBeginday = EBeginday;
		this.EEndday = EEndday;
		this.PBomnumber = PBomnumber;
		this.EBomnumber = EBomnumber;
		this.sfPath = sfPath;
		this.notes = notes;
		this.isCritical = isCritical;
		this.readypoint = readypoint;
	}

	public long getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(long uniqueid) {
		this.uniqueid = uniqueid;
	}

	public BPartNumber getBPartNumberByConsumedPartNumber() {
		return this.BPartNumberByConsumedPartNumber;
	}

	public void setBPartNumberByConsumedPartNumber(BPartNumber BPartNumberByConsumedPartNumber) {
		this.BPartNumberByConsumedPartNumber = BPartNumberByConsumedPartNumber;
	}

	public BPartNumber getBPartNumberByProducedPartNumber() {
		return this.BPartNumberByProducedPartNumber;
	}

	public void setBPartNumberByProducedPartNumber(BPartNumber BPartNumberByProducedPartNumber) {
		this.BPartNumberByProducedPartNumber = BPartNumberByProducedPartNumber;
	}

	public BRoutine getBRoutine() {
		return this.BRoutine;
	}

	public void setBRoutine(BRoutine BRoutine) {
		this.BRoutine = BRoutine;
	}

	public BigDecimal getOperationId() {
		return this.operationId;
	}

	public void setOperationId(BigDecimal operationId) {
		this.operationId = operationId;
	}

	public String getRouting() {
		return this.routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public BigDecimal getMinFixedShrinkage() {
		return this.minFixedShrinkage;
	}

	public void setMinFixedShrinkage(BigDecimal minFixedShrinkage) {
		this.minFixedShrinkage = minFixedShrinkage;
	}

	public BigDecimal getMinPercentShrinkage() {
		return this.minPercentShrinkage;
	}

	public void setMinPercentShrinkage(BigDecimal minPercentShrinkage) {
		this.minPercentShrinkage = minPercentShrinkage;
	}

	public Byte getPhantom() {
		return this.phantom;
	}

	public void setPhantom(Byte phantom) {
		this.phantom = phantom;
	}

	public Date getEcnDate() {
		return this.ecnDate;
	}

	public void setEcnDate(Date ecnDate) {
		this.ecnDate = ecnDate;
	}

	public String getEcnDescription() {
		return this.ecnDescription;
	}

	public void setEcnDescription(String ecnDescription) {
		this.ecnDescription = ecnDescription;
	}

	public Date getEcnDateFormat() {
		return this.ecnDateFormat;
	}

	public void setEcnDateFormat(Date ecnDateFormat) {
		this.ecnDateFormat = ecnDateFormat;
	}

	public String getEcnCode() {
		return this.ecnCode;
	}

	public void setEcnCode(String ecnCode) {
		this.ecnCode = ecnCode;
	}

	public Long getEcnLevel() {
		return this.ecnLevel;
	}

	public void setEcnLevel(Long ecnLevel) {
		this.ecnLevel = ecnLevel;
	}

	public Long getEcnNumber() {
		return this.ecnNumber;
	}

	public void setEcnNumber(Long ecnNumber) {
		this.ecnNumber = ecnNumber;
	}

	public Byte getUsableByNewMfgOrder() {
		return this.usableByNewMfgOrder;
	}

	public void setUsableByNewMfgOrder(Byte usableByNewMfgOrder) {
		this.usableByNewMfgOrder = usableByNewMfgOrder;
	}

	public BigDecimal getNormPercentShrinkage() {
		return this.normPercentShrinkage;
	}

	public void setNormPercentShrinkage(BigDecimal normPercentShrinkage) {
		this.normPercentShrinkage = normPercentShrinkage;
	}

	public BigDecimal getNormFixedShrinkage() {
		return this.normFixedShrinkage;
	}

	public void setNormFixedShrinkage(BigDecimal normFixedShrinkage) {
		this.normFixedShrinkage = normFixedShrinkage;
	}

	public BigDecimal getMinQuantity() {
		return this.minQuantity;
	}

	public void setMinQuantity(BigDecimal minQuantity) {
		this.minQuantity = minQuantity;
	}

	public String getProducedQuantityUom() {
		return this.producedQuantityUom;
	}

	public void setProducedQuantityUom(String producedQuantityUom) {
		this.producedQuantityUom = producedQuantityUom;
	}

	public String getProcess() {
		return this.process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getQuantityConstraintType() {
		return this.quantityConstraintType;
	}

	public void setQuantityConstraintType(String quantityConstraintType) {
		this.quantityConstraintType = quantityConstraintType;
	}

	public String getConsumedQuantityUom() {
		return this.consumedQuantityUom;
	}

	public void setConsumedQuantityUom(String consumedQuantityUom) {
		this.consumedQuantityUom = consumedQuantityUom;
	}

	public Byte getFlexibleMinQuantityP() {
		return this.flexibleMinQuantityP;
	}

	public void setFlexibleMinQuantityP(Byte flexibleMinQuantityP) {
		this.flexibleMinQuantityP = flexibleMinQuantityP;
	}

	public BigDecimal getMaxQuantity() {
		return this.maxQuantity;
	}

	public void setMaxQuantity(BigDecimal maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public BigDecimal getMultipleQuantity() {
		return this.multipleQuantity;
	}

	public void setMultipleQuantity(BigDecimal multipleQuantity) {
		this.multipleQuantity = multipleQuantity;
	}

	public String getAttributeConsumed() {
		return this.attributeConsumed;
	}

	public void setAttributeConsumed(String attributeConsumed) {
		this.attributeConsumed = attributeConsumed;
	}

	public String getAttributeProduced() {
		return this.attributeProduced;
	}

	public void setAttributeProduced(String attributeProduced) {
		this.attributeProduced = attributeProduced;
	}

	public String getChanger() {
		return this.changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public Date getChangetime() {
		return this.changetime;
	}

	public void setChangetime(Date changetime) {
		this.changetime = changetime;
	}

	public Byte getChangestate() {
		return this.changestate;
	}

	public void setChangestate(Byte changestate) {
		this.changestate = changestate;
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

	public Byte getEffective() {
		return this.effective;
	}

	public void setEffective(Byte effective) {
		this.effective = effective;
	}

	public Byte getRoundType() {
		return this.roundType;
	}

	public void setRoundType(Byte roundType) {
		this.roundType = roundType;
	}

	public Long getConsumeType() {
		return this.consumeType;
	}

	public void setConsumeType(Long consumeType) {
		this.consumeType = consumeType;
	}

	public BigDecimal getProducedQuantity() {
		return this.producedQuantity;
	}

	public void setProducedQuantity(BigDecimal producedQuantity) {
		this.producedQuantity = producedQuantity;
	}

	public BigDecimal getConsumedQuantity() {
		return this.consumedQuantity;
	}

	public void setConsumedQuantity(BigDecimal consumedQuantity) {
		this.consumedQuantity = consumedQuantity;
	}

	public String getBBomOutUid() {
		return this.BBomOutUid;
	}

	public void setBBomOutUid(String BBomOutUid) {
		this.BBomOutUid = BBomOutUid;
	}

	public Date getPBeginday() {
		return this.PBeginday;
	}

	public void setPBeginday(Date PBeginday) {
		this.PBeginday = PBeginday;
	}

	public Date getPEndday() {
		return this.PEndday;
	}

	public void setPEndday(Date PEndday) {
		this.PEndday = PEndday;
	}

	public Date getEBeginday() {
		return this.EBeginday;
	}

	public void setEBeginday(Date EBeginday) {
		this.EBeginday = EBeginday;
	}

	public Date getEEndday() {
		return this.EEndday;
	}

	public void setEEndday(Date EEndday) {
		this.EEndday = EEndday;
	}

	public String getPBomnumber() {
		return this.PBomnumber;
	}

	public void setPBomnumber(String PBomnumber) {
		this.PBomnumber = PBomnumber;
	}

	public String getEBomnumber() {
		return this.EBomnumber;
	}

	public void setEBomnumber(String EBomnumber) {
		this.EBomnumber = EBomnumber;
	}

	public String getSfPath() {
		return this.sfPath;
	}

	public void setSfPath(String sfPath) {
		this.sfPath = sfPath;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Byte getIsCritical() {
		return this.isCritical;
	}

	public void setIsCritical(Byte isCritical) {
		this.isCritical = isCritical;
	}

	public Long getReadypoint() {
		return this.readypoint;
	}

	public void setReadypoint(Long readypoint) {
		this.readypoint = readypoint;
	}

}