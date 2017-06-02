package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * BvOperationResourceId generated by hbm2java
 */
public class BvOperationResourceId implements java.io.Serializable {

	private String routing;
	private BigDecimal operationId;
	private String simultaneousUsage;
	private Long numOperators;
	private String considerAltsDuring;
	private Long cooldownTimeFactor;
	private Long minOperationTimeFactor;
	private Long offloadLevel;
	private BigDecimal partQtyPerResource;
	private String partQtyPerResourceUom;
	private String machineNumber;
	private Byte primaryP;
	private String ramupCalendarName;
	private Byte runtimeFactor;
	private Long preopTimeFactor;
	private BigDecimal usagePercent;
	private Byte useForSetup;
	private String resourceGroup;
	private String uniqueid;
	private BigDecimal consumeLife;
	private Byte effective;
	private String changer;
	private Byte changestate;
	private String changereason;
	private Date changetime;
	private String creator;
	private Date createtime;
	private BigDecimal opuid;
	private String TCode;
	private String BOperationResourceOutUid;
	private String useType;
	private String machinenumberdesc;
	private String drawingid;
	private String classname;
	private String partDescription;
	private String classid;

	public BvOperationResourceId() {
	}

	public BvOperationResourceId(String machineNumber, String uniqueid, BigDecimal opuid) {
		this.machineNumber = machineNumber;
		this.uniqueid = uniqueid;
		this.opuid = opuid;
	}

	public BvOperationResourceId(String routing, BigDecimal operationId, String simultaneousUsage, Long numOperators,
			String considerAltsDuring, Long cooldownTimeFactor, Long minOperationTimeFactor, Long offloadLevel,
			BigDecimal partQtyPerResource, String partQtyPerResourceUom, String machineNumber, Byte primaryP,
			String ramupCalendarName, Byte runtimeFactor, Long preopTimeFactor, BigDecimal usagePercent,
			Byte useForSetup, String resourceGroup, String uniqueid, BigDecimal consumeLife, Byte effective,
			String changer, Byte changestate, String changereason, Date changetime, String creator, Date createtime,
			BigDecimal opuid, String TCode, String BOperationResourceOutUid, String useType, String machinenumberdesc,
			String drawingid, String classname, String partDescription, String classid) {
		this.routing = routing;
		this.operationId = operationId;
		this.simultaneousUsage = simultaneousUsage;
		this.numOperators = numOperators;
		this.considerAltsDuring = considerAltsDuring;
		this.cooldownTimeFactor = cooldownTimeFactor;
		this.minOperationTimeFactor = minOperationTimeFactor;
		this.offloadLevel = offloadLevel;
		this.partQtyPerResource = partQtyPerResource;
		this.partQtyPerResourceUom = partQtyPerResourceUom;
		this.machineNumber = machineNumber;
		this.primaryP = primaryP;
		this.ramupCalendarName = ramupCalendarName;
		this.runtimeFactor = runtimeFactor;
		this.preopTimeFactor = preopTimeFactor;
		this.usagePercent = usagePercent;
		this.useForSetup = useForSetup;
		this.resourceGroup = resourceGroup;
		this.uniqueid = uniqueid;
		this.consumeLife = consumeLife;
		this.effective = effective;
		this.changer = changer;
		this.changestate = changestate;
		this.changereason = changereason;
		this.changetime = changetime;
		this.creator = creator;
		this.createtime = createtime;
		this.opuid = opuid;
		this.TCode = TCode;
		this.BOperationResourceOutUid = BOperationResourceOutUid;
		this.useType = useType;
		this.machinenumberdesc = machinenumberdesc;
		this.drawingid = drawingid;
		this.classname = classname;
		this.partDescription = partDescription;
		this.classid = classid;
	}

	public String getRouting() {
		return this.routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public BigDecimal getOperationId() {
		return this.operationId;
	}

	public void setOperationId(BigDecimal operationId) {
		this.operationId = operationId;
	}

	public String getSimultaneousUsage() {
		return this.simultaneousUsage;
	}

	public void setSimultaneousUsage(String simultaneousUsage) {
		this.simultaneousUsage = simultaneousUsage;
	}

	public Long getNumOperators() {
		return this.numOperators;
	}

	public void setNumOperators(Long numOperators) {
		this.numOperators = numOperators;
	}

	public String getConsiderAltsDuring() {
		return this.considerAltsDuring;
	}

	public void setConsiderAltsDuring(String considerAltsDuring) {
		this.considerAltsDuring = considerAltsDuring;
	}

	public Long getCooldownTimeFactor() {
		return this.cooldownTimeFactor;
	}

	public void setCooldownTimeFactor(Long cooldownTimeFactor) {
		this.cooldownTimeFactor = cooldownTimeFactor;
	}

	public Long getMinOperationTimeFactor() {
		return this.minOperationTimeFactor;
	}

	public void setMinOperationTimeFactor(Long minOperationTimeFactor) {
		this.minOperationTimeFactor = minOperationTimeFactor;
	}

	public Long getOffloadLevel() {
		return this.offloadLevel;
	}

	public void setOffloadLevel(Long offloadLevel) {
		this.offloadLevel = offloadLevel;
	}

	public BigDecimal getPartQtyPerResource() {
		return this.partQtyPerResource;
	}

	public void setPartQtyPerResource(BigDecimal partQtyPerResource) {
		this.partQtyPerResource = partQtyPerResource;
	}

	public String getPartQtyPerResourceUom() {
		return this.partQtyPerResourceUom;
	}

	public void setPartQtyPerResourceUom(String partQtyPerResourceUom) {
		this.partQtyPerResourceUom = partQtyPerResourceUom;
	}

	public String getMachineNumber() {
		return this.machineNumber;
	}

	public void setMachineNumber(String machineNumber) {
		this.machineNumber = machineNumber;
	}

	public Byte getPrimaryP() {
		return this.primaryP;
	}

	public void setPrimaryP(Byte primaryP) {
		this.primaryP = primaryP;
	}

	public String getRamupCalendarName() {
		return this.ramupCalendarName;
	}

	public void setRamupCalendarName(String ramupCalendarName) {
		this.ramupCalendarName = ramupCalendarName;
	}

	public Byte getRuntimeFactor() {
		return this.runtimeFactor;
	}

	public void setRuntimeFactor(Byte runtimeFactor) {
		this.runtimeFactor = runtimeFactor;
	}

	public Long getPreopTimeFactor() {
		return this.preopTimeFactor;
	}

	public void setPreopTimeFactor(Long preopTimeFactor) {
		this.preopTimeFactor = preopTimeFactor;
	}

	public BigDecimal getUsagePercent() {
		return this.usagePercent;
	}

	public void setUsagePercent(BigDecimal usagePercent) {
		this.usagePercent = usagePercent;
	}

	public Byte getUseForSetup() {
		return this.useForSetup;
	}

	public void setUseForSetup(Byte useForSetup) {
		this.useForSetup = useForSetup;
	}

	public String getResourceGroup() {
		return this.resourceGroup;
	}

	public void setResourceGroup(String resourceGroup) {
		this.resourceGroup = resourceGroup;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public BigDecimal getConsumeLife() {
		return this.consumeLife;
	}

	public void setConsumeLife(BigDecimal consumeLife) {
		this.consumeLife = consumeLife;
	}

	public Byte getEffective() {
		return this.effective;
	}

	public void setEffective(Byte effective) {
		this.effective = effective;
	}

	public String getChanger() {
		return this.changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public Byte getChangestate() {
		return this.changestate;
	}

	public void setChangestate(Byte changestate) {
		this.changestate = changestate;
	}

	public String getChangereason() {
		return this.changereason;
	}

	public void setChangereason(String changereason) {
		this.changereason = changereason;
	}

	public Date getChangetime() {
		return this.changetime;
	}

	public void setChangetime(Date changetime) {
		this.changetime = changetime;
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

	public BigDecimal getOpuid() {
		return this.opuid;
	}

	public void setOpuid(BigDecimal opuid) {
		this.opuid = opuid;
	}

	public String getTCode() {
		return this.TCode;
	}

	public void setTCode(String TCode) {
		this.TCode = TCode;
	}

	public String getBOperationResourceOutUid() {
		return this.BOperationResourceOutUid;
	}

	public void setBOperationResourceOutUid(String BOperationResourceOutUid) {
		this.BOperationResourceOutUid = BOperationResourceOutUid;
	}

	public String getUseType() {
		return this.useType;
	}

	public void setUseType(String useType) {
		this.useType = useType;
	}

	public String getMachinenumberdesc() {
		return this.machinenumberdesc;
	}

	public void setMachinenumberdesc(String machinenumberdesc) {
		this.machinenumberdesc = machinenumberdesc;
	}

	public String getDrawingid() {
		return this.drawingid;
	}

	public void setDrawingid(String drawingid) {
		this.drawingid = drawingid;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getPartDescription() {
		return this.partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public String getClassid() {
		return this.classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BvOperationResourceId))
			return false;
		BvOperationResourceId castOther = (BvOperationResourceId) other;

		return ((this.getRouting() == castOther.getRouting()) || (this.getRouting() != null
				&& castOther.getRouting() != null && this.getRouting().equals(castOther.getRouting())))
				&& ((this.getOperationId() == castOther.getOperationId())
						|| (this.getOperationId() != null && castOther.getOperationId() != null
								&& this.getOperationId().equals(castOther.getOperationId())))
				&& ((this.getSimultaneousUsage() == castOther.getSimultaneousUsage())
						|| (this.getSimultaneousUsage() != null && castOther.getSimultaneousUsage() != null
								&& this.getSimultaneousUsage().equals(castOther.getSimultaneousUsage())))
				&& ((this.getNumOperators() == castOther.getNumOperators())
						|| (this.getNumOperators() != null && castOther.getNumOperators() != null
								&& this.getNumOperators().equals(castOther.getNumOperators())))
				&& ((this.getConsiderAltsDuring() == castOther.getConsiderAltsDuring())
						|| (this.getConsiderAltsDuring() != null && castOther.getConsiderAltsDuring() != null
								&& this.getConsiderAltsDuring().equals(castOther.getConsiderAltsDuring())))
				&& ((this.getCooldownTimeFactor() == castOther.getCooldownTimeFactor())
						|| (this.getCooldownTimeFactor() != null && castOther.getCooldownTimeFactor() != null
								&& this.getCooldownTimeFactor().equals(castOther.getCooldownTimeFactor())))
				&& ((this.getMinOperationTimeFactor() == castOther.getMinOperationTimeFactor())
						|| (this.getMinOperationTimeFactor() != null && castOther.getMinOperationTimeFactor() != null
								&& this.getMinOperationTimeFactor().equals(castOther.getMinOperationTimeFactor())))
				&& ((this.getOffloadLevel() == castOther.getOffloadLevel())
						|| (this.getOffloadLevel() != null && castOther.getOffloadLevel() != null
								&& this.getOffloadLevel().equals(castOther.getOffloadLevel())))
				&& ((this.getPartQtyPerResource() == castOther.getPartQtyPerResource())
						|| (this.getPartQtyPerResource() != null && castOther.getPartQtyPerResource() != null
								&& this.getPartQtyPerResource().equals(castOther.getPartQtyPerResource())))
				&& ((this.getPartQtyPerResourceUom() == castOther.getPartQtyPerResourceUom())
						|| (this.getPartQtyPerResourceUom() != null && castOther.getPartQtyPerResourceUom() != null
								&& this.getPartQtyPerResourceUom().equals(castOther.getPartQtyPerResourceUom())))
				&& ((this.getMachineNumber() == castOther.getMachineNumber())
						|| (this.getMachineNumber() != null && castOther.getMachineNumber() != null
								&& this.getMachineNumber().equals(castOther.getMachineNumber())))
				&& ((this.getPrimaryP() == castOther.getPrimaryP()) || (this.getPrimaryP() != null
						&& castOther.getPrimaryP() != null && this.getPrimaryP().equals(castOther.getPrimaryP())))
				&& ((this.getRamupCalendarName() == castOther.getRamupCalendarName())
						|| (this.getRamupCalendarName() != null && castOther.getRamupCalendarName() != null
								&& this.getRamupCalendarName().equals(castOther.getRamupCalendarName())))
				&& ((this.getRuntimeFactor() == castOther.getRuntimeFactor())
						|| (this.getRuntimeFactor() != null && castOther.getRuntimeFactor() != null
								&& this.getRuntimeFactor().equals(castOther.getRuntimeFactor())))
				&& ((this.getPreopTimeFactor() == castOther.getPreopTimeFactor())
						|| (this.getPreopTimeFactor() != null && castOther.getPreopTimeFactor() != null
								&& this.getPreopTimeFactor().equals(castOther.getPreopTimeFactor())))
				&& ((this.getUsagePercent() == castOther.getUsagePercent())
						|| (this.getUsagePercent() != null && castOther.getUsagePercent() != null
								&& this.getUsagePercent().equals(castOther.getUsagePercent())))
				&& ((this.getUseForSetup() == castOther.getUseForSetup())
						|| (this.getUseForSetup() != null && castOther.getUseForSetup() != null
								&& this.getUseForSetup().equals(castOther.getUseForSetup())))
				&& ((this.getResourceGroup() == castOther.getResourceGroup())
						|| (this.getResourceGroup() != null && castOther.getResourceGroup() != null
								&& this.getResourceGroup().equals(castOther.getResourceGroup())))
				&& ((this.getUniqueid() == castOther.getUniqueid()) || (this.getUniqueid() != null
						&& castOther.getUniqueid() != null && this.getUniqueid().equals(castOther.getUniqueid())))
				&& ((this.getConsumeLife() == castOther.getConsumeLife())
						|| (this.getConsumeLife() != null && castOther.getConsumeLife() != null
								&& this.getConsumeLife().equals(castOther.getConsumeLife())))
				&& ((this.getEffective() == castOther.getEffective()) || (this.getEffective() != null
						&& castOther.getEffective() != null && this.getEffective().equals(castOther.getEffective())))
				&& ((this.getChanger() == castOther.getChanger()) || (this.getChanger() != null
						&& castOther.getChanger() != null && this.getChanger().equals(castOther.getChanger())))
				&& ((this.getChangestate() == castOther.getChangestate())
						|| (this.getChangestate() != null && castOther.getChangestate() != null
								&& this.getChangestate().equals(castOther.getChangestate())))
				&& ((this.getChangereason() == castOther.getChangereason())
						|| (this.getChangereason() != null && castOther.getChangereason() != null
								&& this.getChangereason().equals(castOther.getChangereason())))
				&& ((this.getChangetime() == castOther.getChangetime()) || (this.getChangetime() != null
						&& castOther.getChangetime() != null && this.getChangetime().equals(castOther.getChangetime())))
				&& ((this.getCreator() == castOther.getCreator()) || (this.getCreator() != null
						&& castOther.getCreator() != null && this.getCreator().equals(castOther.getCreator())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getOpuid() == castOther.getOpuid()) || (this.getOpuid() != null
						&& castOther.getOpuid() != null && this.getOpuid().equals(castOther.getOpuid())))
				&& ((this.getTCode() == castOther.getTCode()) || (this.getTCode() != null
						&& castOther.getTCode() != null && this.getTCode().equals(castOther.getTCode())))
				&& ((this.getBOperationResourceOutUid() == castOther.getBOperationResourceOutUid())
						|| (this.getBOperationResourceOutUid() != null
								&& castOther.getBOperationResourceOutUid() != null
								&& this.getBOperationResourceOutUid().equals(castOther.getBOperationResourceOutUid())))
				&& ((this.getUseType() == castOther.getUseType()) || (this.getUseType() != null
						&& castOther.getUseType() != null && this.getUseType().equals(castOther.getUseType())))
				&& ((this.getMachinenumberdesc() == castOther.getMachinenumberdesc())
						|| (this.getMachinenumberdesc() != null && castOther.getMachinenumberdesc() != null
								&& this.getMachinenumberdesc().equals(castOther.getMachinenumberdesc())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getClassname() == castOther.getClassname()) || (this.getClassname() != null
						&& castOther.getClassname() != null && this.getClassname().equals(castOther.getClassname())))
				&& ((this.getPartDescription() == castOther.getPartDescription())
						|| (this.getPartDescription() != null && castOther.getPartDescription() != null
								&& this.getPartDescription().equals(castOther.getPartDescription())))
				&& ((this.getClassid() == castOther.getClassid()) || (this.getClassid() != null
						&& castOther.getClassid() != null && this.getClassid().equals(castOther.getClassid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRouting() == null ? 0 : this.getRouting().hashCode());
		result = 37 * result + (getOperationId() == null ? 0 : this.getOperationId().hashCode());
		result = 37 * result + (getSimultaneousUsage() == null ? 0 : this.getSimultaneousUsage().hashCode());
		result = 37 * result + (getNumOperators() == null ? 0 : this.getNumOperators().hashCode());
		result = 37 * result + (getConsiderAltsDuring() == null ? 0 : this.getConsiderAltsDuring().hashCode());
		result = 37 * result + (getCooldownTimeFactor() == null ? 0 : this.getCooldownTimeFactor().hashCode());
		result = 37 * result + (getMinOperationTimeFactor() == null ? 0 : this.getMinOperationTimeFactor().hashCode());
		result = 37 * result + (getOffloadLevel() == null ? 0 : this.getOffloadLevel().hashCode());
		result = 37 * result + (getPartQtyPerResource() == null ? 0 : this.getPartQtyPerResource().hashCode());
		result = 37 * result + (getPartQtyPerResourceUom() == null ? 0 : this.getPartQtyPerResourceUom().hashCode());
		result = 37 * result + (getMachineNumber() == null ? 0 : this.getMachineNumber().hashCode());
		result = 37 * result + (getPrimaryP() == null ? 0 : this.getPrimaryP().hashCode());
		result = 37 * result + (getRamupCalendarName() == null ? 0 : this.getRamupCalendarName().hashCode());
		result = 37 * result + (getRuntimeFactor() == null ? 0 : this.getRuntimeFactor().hashCode());
		result = 37 * result + (getPreopTimeFactor() == null ? 0 : this.getPreopTimeFactor().hashCode());
		result = 37 * result + (getUsagePercent() == null ? 0 : this.getUsagePercent().hashCode());
		result = 37 * result + (getUseForSetup() == null ? 0 : this.getUseForSetup().hashCode());
		result = 37 * result + (getResourceGroup() == null ? 0 : this.getResourceGroup().hashCode());
		result = 37 * result + (getUniqueid() == null ? 0 : this.getUniqueid().hashCode());
		result = 37 * result + (getConsumeLife() == null ? 0 : this.getConsumeLife().hashCode());
		result = 37 * result + (getEffective() == null ? 0 : this.getEffective().hashCode());
		result = 37 * result + (getChanger() == null ? 0 : this.getChanger().hashCode());
		result = 37 * result + (getChangestate() == null ? 0 : this.getChangestate().hashCode());
		result = 37 * result + (getChangereason() == null ? 0 : this.getChangereason().hashCode());
		result = 37 * result + (getChangetime() == null ? 0 : this.getChangetime().hashCode());
		result = 37 * result + (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getOpuid() == null ? 0 : this.getOpuid().hashCode());
		result = 37 * result + (getTCode() == null ? 0 : this.getTCode().hashCode());
		result = 37 * result
				+ (getBOperationResourceOutUid() == null ? 0 : this.getBOperationResourceOutUid().hashCode());
		result = 37 * result + (getUseType() == null ? 0 : this.getUseType().hashCode());
		result = 37 * result + (getMachinenumberdesc() == null ? 0 : this.getMachinenumberdesc().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getClassname() == null ? 0 : this.getClassname().hashCode());
		result = 37 * result + (getPartDescription() == null ? 0 : this.getPartDescription().hashCode());
		result = 37 * result + (getClassid() == null ? 0 : this.getClassid().hashCode());
		return result;
	}

}
