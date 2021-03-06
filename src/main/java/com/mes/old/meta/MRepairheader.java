package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MRepairheader generated by hbm2java
 */
public class MRepairheader implements java.io.Serializable {

	private String repairuid;
	private String version;
	private MDefectjudgeheader MDefectjudgeheader;
	private String repairid;
	private String taskuid;
	private String deptid;
	private BigDecimal repairqty;
	private String certificateuid;
	private Long repairstate;
	private String dutier;
	private String checkmanager;
	private String dutydeptmanager;
	private String designmind;
	private String auditordept;
	private String techmind;
	private String metalmind;
	private String customermind;
	private Long defectlevel;
	private String segementmanager;
	private Long isinbulk;
	private String creator;
	private Date createtime;
	private String notes;
	private BigDecimal repairhour;
	private BigDecimal repairmoney;
	private String attatchref;
	private String checkmind;
	private String checker;
	private Date checktime;
	private String checkerprint;
	private String customerbillid;
	private Long isineffect;
	private Long approvestate;
	private String approveperson;
	private String billnumber;
	private String materialusn;
	private String judgecommitteemind;
	private String defectreason;
	private String dutydeptid;
	private BigDecimal qtyappearance;
	private BigDecimal qtydimension;
	private BigDecimal qtyneedtorepair;
	private String standingOrgMind;
	private Set MRepairdetails = new HashSet(0);

	public MRepairheader() {
	}

	public MRepairheader(String repairuid, String repairid) {
		this.repairuid = repairuid;
		this.repairid = repairid;
	}

	public MRepairheader(String repairuid, MDefectjudgeheader MDefectjudgeheader, String repairid, String taskuid,
			String deptid, BigDecimal repairqty, String certificateuid, Long repairstate, String dutier,
			String checkmanager, String dutydeptmanager, String designmind, String auditordept, String techmind,
			String metalmind, String customermind, Long defectlevel, String segementmanager, Long isinbulk,
			String creator, Date createtime, String notes, BigDecimal repairhour, BigDecimal repairmoney,
			String attatchref, String checkmind, String checker, Date checktime, String checkerprint,
			String customerbillid, Long isineffect, Long approvestate, String approveperson, String billnumber,
			String materialusn, String judgecommitteemind, String defectreason, String dutydeptid,
			BigDecimal qtyappearance, BigDecimal qtydimension, BigDecimal qtyneedtorepair, String standingOrgMind,
			Set MRepairdetails) {
		this.repairuid = repairuid;
		this.MDefectjudgeheader = MDefectjudgeheader;
		this.repairid = repairid;
		this.taskuid = taskuid;
		this.deptid = deptid;
		this.repairqty = repairqty;
		this.certificateuid = certificateuid;
		this.repairstate = repairstate;
		this.dutier = dutier;
		this.checkmanager = checkmanager;
		this.dutydeptmanager = dutydeptmanager;
		this.designmind = designmind;
		this.auditordept = auditordept;
		this.techmind = techmind;
		this.metalmind = metalmind;
		this.customermind = customermind;
		this.defectlevel = defectlevel;
		this.segementmanager = segementmanager;
		this.isinbulk = isinbulk;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
		this.repairhour = repairhour;
		this.repairmoney = repairmoney;
		this.attatchref = attatchref;
		this.checkmind = checkmind;
		this.checker = checker;
		this.checktime = checktime;
		this.checkerprint = checkerprint;
		this.customerbillid = customerbillid;
		this.isineffect = isineffect;
		this.approvestate = approvestate;
		this.approveperson = approveperson;
		this.billnumber = billnumber;
		this.materialusn = materialusn;
		this.judgecommitteemind = judgecommitteemind;
		this.defectreason = defectreason;
		this.dutydeptid = dutydeptid;
		this.qtyappearance = qtyappearance;
		this.qtydimension = qtydimension;
		this.qtyneedtorepair = qtyneedtorepair;
		this.standingOrgMind = standingOrgMind;
		this.MRepairdetails = MRepairdetails;
	}

	public String getRepairuid() {
		return this.repairuid;
	}

	public void setRepairuid(String repairuid) {
		this.repairuid = repairuid;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public MDefectjudgeheader getMDefectjudgeheader() {
		return this.MDefectjudgeheader;
	}

	public void setMDefectjudgeheader(MDefectjudgeheader MDefectjudgeheader) {
		this.MDefectjudgeheader = MDefectjudgeheader;
	}

	public String getRepairid() {
		return this.repairid;
	}

	public void setRepairid(String repairid) {
		this.repairid = repairid;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public BigDecimal getRepairqty() {
		return this.repairqty;
	}

	public void setRepairqty(BigDecimal repairqty) {
		this.repairqty = repairqty;
	}

	public String getCertificateuid() {
		return this.certificateuid;
	}

	public void setCertificateuid(String certificateuid) {
		this.certificateuid = certificateuid;
	}

	public Long getRepairstate() {
		return this.repairstate;
	}

	public void setRepairstate(Long repairstate) {
		this.repairstate = repairstate;
	}

	public String getDutier() {
		return this.dutier;
	}

	public void setDutier(String dutier) {
		this.dutier = dutier;
	}

	public String getCheckmanager() {
		return this.checkmanager;
	}

	public void setCheckmanager(String checkmanager) {
		this.checkmanager = checkmanager;
	}

	public String getDutydeptmanager() {
		return this.dutydeptmanager;
	}

	public void setDutydeptmanager(String dutydeptmanager) {
		this.dutydeptmanager = dutydeptmanager;
	}

	public String getDesignmind() {
		return this.designmind;
	}

	public void setDesignmind(String designmind) {
		this.designmind = designmind;
	}

	public String getAuditordept() {
		return this.auditordept;
	}

	public void setAuditordept(String auditordept) {
		this.auditordept = auditordept;
	}

	public String getTechmind() {
		return this.techmind;
	}

	public void setTechmind(String techmind) {
		this.techmind = techmind;
	}

	public String getMetalmind() {
		return this.metalmind;
	}

	public void setMetalmind(String metalmind) {
		this.metalmind = metalmind;
	}

	public String getCustomermind() {
		return this.customermind;
	}

	public void setCustomermind(String customermind) {
		this.customermind = customermind;
	}

	public Long getDefectlevel() {
		return this.defectlevel;
	}

	public void setDefectlevel(Long defectlevel) {
		this.defectlevel = defectlevel;
	}

	public String getSegementmanager() {
		return this.segementmanager;
	}

	public void setSegementmanager(String segementmanager) {
		this.segementmanager = segementmanager;
	}

	public Long getIsinbulk() {
		return this.isinbulk;
	}

	public void setIsinbulk(Long isinbulk) {
		this.isinbulk = isinbulk;
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

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BigDecimal getRepairhour() {
		return this.repairhour;
	}

	public void setRepairhour(BigDecimal repairhour) {
		this.repairhour = repairhour;
	}

	public BigDecimal getRepairmoney() {
		return this.repairmoney;
	}

	public void setRepairmoney(BigDecimal repairmoney) {
		this.repairmoney = repairmoney;
	}

	public String getAttatchref() {
		return this.attatchref;
	}

	public void setAttatchref(String attatchref) {
		this.attatchref = attatchref;
	}

	public String getCheckmind() {
		return this.checkmind;
	}

	public void setCheckmind(String checkmind) {
		this.checkmind = checkmind;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Date getChecktime() {
		return this.checktime;
	}

	public void setChecktime(Date checktime) {
		this.checktime = checktime;
	}

	public String getCheckerprint() {
		return this.checkerprint;
	}

	public void setCheckerprint(String checkerprint) {
		this.checkerprint = checkerprint;
	}

	public String getCustomerbillid() {
		return this.customerbillid;
	}

	public void setCustomerbillid(String customerbillid) {
		this.customerbillid = customerbillid;
	}

	public Long getIsineffect() {
		return this.isineffect;
	}

	public void setIsineffect(Long isineffect) {
		this.isineffect = isineffect;
	}

	public Long getApprovestate() {
		return this.approvestate;
	}

	public void setApprovestate(Long approvestate) {
		this.approvestate = approvestate;
	}

	public String getApproveperson() {
		return this.approveperson;
	}

	public void setApproveperson(String approveperson) {
		this.approveperson = approveperson;
	}

	public String getBillnumber() {
		return this.billnumber;
	}

	public void setBillnumber(String billnumber) {
		this.billnumber = billnumber;
	}

	public String getMaterialusn() {
		return this.materialusn;
	}

	public void setMaterialusn(String materialusn) {
		this.materialusn = materialusn;
	}

	public String getJudgecommitteemind() {
		return this.judgecommitteemind;
	}

	public void setJudgecommitteemind(String judgecommitteemind) {
		this.judgecommitteemind = judgecommitteemind;
	}

	public String getDefectreason() {
		return this.defectreason;
	}

	public void setDefectreason(String defectreason) {
		this.defectreason = defectreason;
	}

	public String getDutydeptid() {
		return this.dutydeptid;
	}

	public void setDutydeptid(String dutydeptid) {
		this.dutydeptid = dutydeptid;
	}

	public BigDecimal getQtyappearance() {
		return this.qtyappearance;
	}

	public void setQtyappearance(BigDecimal qtyappearance) {
		this.qtyappearance = qtyappearance;
	}

	public BigDecimal getQtydimension() {
		return this.qtydimension;
	}

	public void setQtydimension(BigDecimal qtydimension) {
		this.qtydimension = qtydimension;
	}

	public BigDecimal getQtyneedtorepair() {
		return this.qtyneedtorepair;
	}

	public void setQtyneedtorepair(BigDecimal qtyneedtorepair) {
		this.qtyneedtorepair = qtyneedtorepair;
	}

	public String getStandingOrgMind() {
		return this.standingOrgMind;
	}

	public void setStandingOrgMind(String standingOrgMind) {
		this.standingOrgMind = standingOrgMind;
	}

	public Set getMRepairdetails() {
		return this.MRepairdetails;
	}

	public void setMRepairdetails(Set MRepairdetails) {
		this.MRepairdetails = MRepairdetails;
	}

}
