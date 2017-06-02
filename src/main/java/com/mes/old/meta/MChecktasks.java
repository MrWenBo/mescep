package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MChecktasks generated by hbm2java
 */
public class MChecktasks implements java.io.Serializable {

	private String uniqueid;
	private String taskuid;
	private Long checktasktype;
	private String checker;
	private Long checktaskstate;
	private String creator;
	private Date createtime;
	private String notes;
	private String deptid;
	private Date planstart;
	private Date planfinish;
	private BigDecimal planqty;
	private BigDecimal comitqty;
	private Long dispatchgrade;
	private Long suspended;
	private BigDecimal checkqty1;
	private BigDecimal defectqty1;
	private BigDecimal checkqty2;
	private BigDecimal defectqty2;
	private BigDecimal checkqty3;
	private BigDecimal defectqty3;
	private BigDecimal checkqty4;
	private BigDecimal defectqty4;
	private BigDecimal checkqty5;
	private BigDecimal defectqty5;
	private BigDecimal actualcheckqty;
	private Date actualstart;
	private Date actualfinish;
	private String mastershop;
	private Long keycount;
	private String checkWorkcenterUid;
	private Date actualsend;
	private Date plansend;
	private String sender;
	private Date earlystart;
	private Date latefinish;
	private BigDecimal completeqty;
	private Boolean devicePause;
	private String reworkBilluid;
	private String checktaskid;
	private Set MChecktaskassnses = new HashSet(0);

	public MChecktasks() {
	}

	public MChecktasks(String uniqueid, String taskuid) {
		this.uniqueid = uniqueid;
		this.taskuid = taskuid;
	}

	public MChecktasks(String uniqueid, String taskuid, Long checktasktype, String checker, Long checktaskstate,
			String creator, Date createtime, String notes, String deptid, Date planstart, Date planfinish,
			BigDecimal planqty, BigDecimal comitqty, Long dispatchgrade, Long suspended, BigDecimal checkqty1,
			BigDecimal defectqty1, BigDecimal checkqty2, BigDecimal defectqty2, BigDecimal checkqty3,
			BigDecimal defectqty3, BigDecimal checkqty4, BigDecimal defectqty4, BigDecimal checkqty5,
			BigDecimal defectqty5, BigDecimal actualcheckqty, Date actualstart, Date actualfinish, String mastershop,
			Long keycount, String checkWorkcenterUid, Date actualsend, Date plansend, String sender, Date earlystart,
			Date latefinish, BigDecimal completeqty, Boolean devicePause, String reworkBilluid, String checktaskid,
			Set MChecktaskassnses) {
		this.uniqueid = uniqueid;
		this.taskuid = taskuid;
		this.checktasktype = checktasktype;
		this.checker = checker;
		this.checktaskstate = checktaskstate;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
		this.deptid = deptid;
		this.planstart = planstart;
		this.planfinish = planfinish;
		this.planqty = planqty;
		this.comitqty = comitqty;
		this.dispatchgrade = dispatchgrade;
		this.suspended = suspended;
		this.checkqty1 = checkqty1;
		this.defectqty1 = defectqty1;
		this.checkqty2 = checkqty2;
		this.defectqty2 = defectqty2;
		this.checkqty3 = checkqty3;
		this.defectqty3 = defectqty3;
		this.checkqty4 = checkqty4;
		this.defectqty4 = defectqty4;
		this.checkqty5 = checkqty5;
		this.defectqty5 = defectqty5;
		this.actualcheckqty = actualcheckqty;
		this.actualstart = actualstart;
		this.actualfinish = actualfinish;
		this.mastershop = mastershop;
		this.keycount = keycount;
		this.checkWorkcenterUid = checkWorkcenterUid;
		this.actualsend = actualsend;
		this.plansend = plansend;
		this.sender = sender;
		this.earlystart = earlystart;
		this.latefinish = latefinish;
		this.completeqty = completeqty;
		this.devicePause = devicePause;
		this.reworkBilluid = reworkBilluid;
		this.checktaskid = checktaskid;
		this.MChecktaskassnses = MChecktaskassnses;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public Long getChecktasktype() {
		return this.checktasktype;
	}

	public void setChecktasktype(Long checktasktype) {
		this.checktasktype = checktasktype;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Long getChecktaskstate() {
		return this.checktaskstate;
	}

	public void setChecktaskstate(Long checktaskstate) {
		this.checktaskstate = checktaskstate;
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

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public Date getPlanstart() {
		return this.planstart;
	}

	public void setPlanstart(Date planstart) {
		this.planstart = planstart;
	}

	public Date getPlanfinish() {
		return this.planfinish;
	}

	public void setPlanfinish(Date planfinish) {
		this.planfinish = planfinish;
	}

	public BigDecimal getPlanqty() {
		return this.planqty;
	}

	public void setPlanqty(BigDecimal planqty) {
		this.planqty = planqty;
	}

	public BigDecimal getComitqty() {
		return this.comitqty;
	}

	public void setComitqty(BigDecimal comitqty) {
		this.comitqty = comitqty;
	}

	public Long getDispatchgrade() {
		return this.dispatchgrade;
	}

	public void setDispatchgrade(Long dispatchgrade) {
		this.dispatchgrade = dispatchgrade;
	}

	public Long getSuspended() {
		return this.suspended;
	}

	public void setSuspended(Long suspended) {
		this.suspended = suspended;
	}

	public BigDecimal getCheckqty1() {
		return this.checkqty1;
	}

	public void setCheckqty1(BigDecimal checkqty1) {
		this.checkqty1 = checkqty1;
	}

	public BigDecimal getDefectqty1() {
		return this.defectqty1;
	}

	public void setDefectqty1(BigDecimal defectqty1) {
		this.defectqty1 = defectqty1;
	}

	public BigDecimal getCheckqty2() {
		return this.checkqty2;
	}

	public void setCheckqty2(BigDecimal checkqty2) {
		this.checkqty2 = checkqty2;
	}

	public BigDecimal getDefectqty2() {
		return this.defectqty2;
	}

	public void setDefectqty2(BigDecimal defectqty2) {
		this.defectqty2 = defectqty2;
	}

	public BigDecimal getCheckqty3() {
		return this.checkqty3;
	}

	public void setCheckqty3(BigDecimal checkqty3) {
		this.checkqty3 = checkqty3;
	}

	public BigDecimal getDefectqty3() {
		return this.defectqty3;
	}

	public void setDefectqty3(BigDecimal defectqty3) {
		this.defectqty3 = defectqty3;
	}

	public BigDecimal getCheckqty4() {
		return this.checkqty4;
	}

	public void setCheckqty4(BigDecimal checkqty4) {
		this.checkqty4 = checkqty4;
	}

	public BigDecimal getDefectqty4() {
		return this.defectqty4;
	}

	public void setDefectqty4(BigDecimal defectqty4) {
		this.defectqty4 = defectqty4;
	}

	public BigDecimal getCheckqty5() {
		return this.checkqty5;
	}

	public void setCheckqty5(BigDecimal checkqty5) {
		this.checkqty5 = checkqty5;
	}

	public BigDecimal getDefectqty5() {
		return this.defectqty5;
	}

	public void setDefectqty5(BigDecimal defectqty5) {
		this.defectqty5 = defectqty5;
	}

	public BigDecimal getActualcheckqty() {
		return this.actualcheckqty;
	}

	public void setActualcheckqty(BigDecimal actualcheckqty) {
		this.actualcheckqty = actualcheckqty;
	}

	public Date getActualstart() {
		return this.actualstart;
	}

	public void setActualstart(Date actualstart) {
		this.actualstart = actualstart;
	}

	public Date getActualfinish() {
		return this.actualfinish;
	}

	public void setActualfinish(Date actualfinish) {
		this.actualfinish = actualfinish;
	}

	public String getMastershop() {
		return this.mastershop;
	}

	public void setMastershop(String mastershop) {
		this.mastershop = mastershop;
	}

	public Long getKeycount() {
		return this.keycount;
	}

	public void setKeycount(Long keycount) {
		this.keycount = keycount;
	}

	public String getCheckWorkcenterUid() {
		return this.checkWorkcenterUid;
	}

	public void setCheckWorkcenterUid(String checkWorkcenterUid) {
		this.checkWorkcenterUid = checkWorkcenterUid;
	}

	public Date getActualsend() {
		return this.actualsend;
	}

	public void setActualsend(Date actualsend) {
		this.actualsend = actualsend;
	}

	public Date getPlansend() {
		return this.plansend;
	}

	public void setPlansend(Date plansend) {
		this.plansend = plansend;
	}

	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Date getEarlystart() {
		return this.earlystart;
	}

	public void setEarlystart(Date earlystart) {
		this.earlystart = earlystart;
	}

	public Date getLatefinish() {
		return this.latefinish;
	}

	public void setLatefinish(Date latefinish) {
		this.latefinish = latefinish;
	}

	public BigDecimal getCompleteqty() {
		return this.completeqty;
	}

	public void setCompleteqty(BigDecimal completeqty) {
		this.completeqty = completeqty;
	}

	public Boolean getDevicePause() {
		return this.devicePause;
	}

	public void setDevicePause(Boolean devicePause) {
		this.devicePause = devicePause;
	}

	public String getReworkBilluid() {
		return this.reworkBilluid;
	}

	public void setReworkBilluid(String reworkBilluid) {
		this.reworkBilluid = reworkBilluid;
	}

	public String getChecktaskid() {
		return this.checktaskid;
	}

	public void setChecktaskid(String checktaskid) {
		this.checktaskid = checktaskid;
	}

	public Set getMChecktaskassnses() {
		return this.MChecktaskassnses;
	}

	public void setMChecktaskassnses(Set MChecktaskassnses) {
		this.MChecktaskassnses = MChecktaskassnses;
	}

}
