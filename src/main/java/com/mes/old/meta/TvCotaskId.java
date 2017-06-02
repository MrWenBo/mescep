package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * TvCotaskId generated by hbm2java
 */
public class TvCotaskId implements java.io.Serializable {

	private String cotaskuid;
	private String taskuid;
	private BigDecimal taskstate;
	private Long cotaskstate;
	private String cofeedback;
	private Date planstart;
	private String notes;
	private String deptid;
	private Date planfinish;
	private BigDecimal planqty;
	private Date actualstart;
	private Date actualfinish;
	private Date actualreceive;
	private BigDecimal completeqty;
	private String mastershop;
	private Date schedulestart;
	private Date schedulefinish;
	private String model;
	private String partNumber;
	private String drawingid;
	private String partName;
	private String batchnum;
	private BigDecimal operationId;
	private String operationIddesc;
	private String taskname;
	private String deptname;
	private String mastershopname;
	private Character optypename;
	private String taskstatedesc;
	private Boolean suspended;
	private String opuid;
	private BigDecimal optype;
	private Long agreestate;
	private String agreestateiddesc;
	private Long priority;
	private String sender;
	private BigDecimal sendqty;
	private String sendwarehouseid;
	private String sendername;
	private Date actualsend;
	private String receiver;
	private BigDecimal outqty;
	private BigDecimal receiveqty;
	private String receivewarehouseid;
	private String receivername;
	private Date outtime;
	private String fetcher;
	private BigDecimal fetchqty;
	private String fetchername;
	private Date actualfetch;
	private String accepter;
	private BigDecimal acceptqty;
	private String acceptername;
	private Date actualaccept;
	private String parentuid;
	private Long expirenum;
	private Long lostnum;
	private String sendwarehousename;
	private String receivewarehousename;
	private String fetchwarehousename;
	private String acceptwarehousename;
	private BigDecimal lagdays;
	private Date partlatefinish;

	public TvCotaskId() {
	}

	public TvCotaskId(String cotaskuid, String taskuid) {
		this.cotaskuid = cotaskuid;
		this.taskuid = taskuid;
	}

	public TvCotaskId(String cotaskuid, String taskuid, BigDecimal taskstate, Long cotaskstate, String cofeedback,
			Date planstart, String notes, String deptid, Date planfinish, BigDecimal planqty, Date actualstart,
			Date actualfinish, Date actualreceive, BigDecimal completeqty, String mastershop, Date schedulestart,
			Date schedulefinish, String model, String partNumber, String drawingid, String partName, String batchnum,
			BigDecimal operationId, String operationIddesc, String taskname, String deptname, String mastershopname,
			Character optypename, String taskstatedesc, Boolean suspended, String opuid, BigDecimal optype,
			Long agreestate, String agreestateiddesc, Long priority, String sender, BigDecimal sendqty,
			String sendwarehouseid, String sendername, Date actualsend, String receiver, BigDecimal outqty,
			BigDecimal receiveqty, String receivewarehouseid, String receivername, Date outtime, String fetcher,
			BigDecimal fetchqty, String fetchername, Date actualfetch, String accepter, BigDecimal acceptqty,
			String acceptername, Date actualaccept, String parentuid, Long expirenum, Long lostnum,
			String sendwarehousename, String receivewarehousename, String fetchwarehousename,
			String acceptwarehousename, BigDecimal lagdays, Date partlatefinish) {
		this.cotaskuid = cotaskuid;
		this.taskuid = taskuid;
		this.taskstate = taskstate;
		this.cotaskstate = cotaskstate;
		this.cofeedback = cofeedback;
		this.planstart = planstart;
		this.notes = notes;
		this.deptid = deptid;
		this.planfinish = planfinish;
		this.planqty = planqty;
		this.actualstart = actualstart;
		this.actualfinish = actualfinish;
		this.actualreceive = actualreceive;
		this.completeqty = completeqty;
		this.mastershop = mastershop;
		this.schedulestart = schedulestart;
		this.schedulefinish = schedulefinish;
		this.model = model;
		this.partNumber = partNumber;
		this.drawingid = drawingid;
		this.partName = partName;
		this.batchnum = batchnum;
		this.operationId = operationId;
		this.operationIddesc = operationIddesc;
		this.taskname = taskname;
		this.deptname = deptname;
		this.mastershopname = mastershopname;
		this.optypename = optypename;
		this.taskstatedesc = taskstatedesc;
		this.suspended = suspended;
		this.opuid = opuid;
		this.optype = optype;
		this.agreestate = agreestate;
		this.agreestateiddesc = agreestateiddesc;
		this.priority = priority;
		this.sender = sender;
		this.sendqty = sendqty;
		this.sendwarehouseid = sendwarehouseid;
		this.sendername = sendername;
		this.actualsend = actualsend;
		this.receiver = receiver;
		this.outqty = outqty;
		this.receiveqty = receiveqty;
		this.receivewarehouseid = receivewarehouseid;
		this.receivername = receivername;
		this.outtime = outtime;
		this.fetcher = fetcher;
		this.fetchqty = fetchqty;
		this.fetchername = fetchername;
		this.actualfetch = actualfetch;
		this.accepter = accepter;
		this.acceptqty = acceptqty;
		this.acceptername = acceptername;
		this.actualaccept = actualaccept;
		this.parentuid = parentuid;
		this.expirenum = expirenum;
		this.lostnum = lostnum;
		this.sendwarehousename = sendwarehousename;
		this.receivewarehousename = receivewarehousename;
		this.fetchwarehousename = fetchwarehousename;
		this.acceptwarehousename = acceptwarehousename;
		this.lagdays = lagdays;
		this.partlatefinish = partlatefinish;
	}

	public String getCotaskuid() {
		return this.cotaskuid;
	}

	public void setCotaskuid(String cotaskuid) {
		this.cotaskuid = cotaskuid;
	}

	public String getTaskuid() {
		return this.taskuid;
	}

	public void setTaskuid(String taskuid) {
		this.taskuid = taskuid;
	}

	public BigDecimal getTaskstate() {
		return this.taskstate;
	}

	public void setTaskstate(BigDecimal taskstate) {
		this.taskstate = taskstate;
	}

	public Long getCotaskstate() {
		return this.cotaskstate;
	}

	public void setCotaskstate(Long cotaskstate) {
		this.cotaskstate = cotaskstate;
	}

	public String getCofeedback() {
		return this.cofeedback;
	}

	public void setCofeedback(String cofeedback) {
		this.cofeedback = cofeedback;
	}

	public Date getPlanstart() {
		return this.planstart;
	}

	public void setPlanstart(Date planstart) {
		this.planstart = planstart;
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

	public Date getActualreceive() {
		return this.actualreceive;
	}

	public void setActualreceive(Date actualreceive) {
		this.actualreceive = actualreceive;
	}

	public BigDecimal getCompleteqty() {
		return this.completeqty;
	}

	public void setCompleteqty(BigDecimal completeqty) {
		this.completeqty = completeqty;
	}

	public String getMastershop() {
		return this.mastershop;
	}

	public void setMastershop(String mastershop) {
		this.mastershop = mastershop;
	}

	public Date getSchedulestart() {
		return this.schedulestart;
	}

	public void setSchedulestart(Date schedulestart) {
		this.schedulestart = schedulestart;
	}

	public Date getSchedulefinish() {
		return this.schedulefinish;
	}

	public void setSchedulefinish(Date schedulefinish) {
		this.schedulefinish = schedulefinish;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
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

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
	}

	public BigDecimal getOperationId() {
		return this.operationId;
	}

	public void setOperationId(BigDecimal operationId) {
		this.operationId = operationId;
	}

	public String getOperationIddesc() {
		return this.operationIddesc;
	}

	public void setOperationIddesc(String operationIddesc) {
		this.operationIddesc = operationIddesc;
	}

	public String getTaskname() {
		return this.taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getMastershopname() {
		return this.mastershopname;
	}

	public void setMastershopname(String mastershopname) {
		this.mastershopname = mastershopname;
	}

	public Character getOptypename() {
		return this.optypename;
	}

	public void setOptypename(Character optypename) {
		this.optypename = optypename;
	}

	public String getTaskstatedesc() {
		return this.taskstatedesc;
	}

	public void setTaskstatedesc(String taskstatedesc) {
		this.taskstatedesc = taskstatedesc;
	}

	public Boolean getSuspended() {
		return this.suspended;
	}

	public void setSuspended(Boolean suspended) {
		this.suspended = suspended;
	}

	public String getOpuid() {
		return this.opuid;
	}

	public void setOpuid(String opuid) {
		this.opuid = opuid;
	}

	public BigDecimal getOptype() {
		return this.optype;
	}

	public void setOptype(BigDecimal optype) {
		this.optype = optype;
	}

	public Long getAgreestate() {
		return this.agreestate;
	}

	public void setAgreestate(Long agreestate) {
		this.agreestate = agreestate;
	}

	public String getAgreestateiddesc() {
		return this.agreestateiddesc;
	}

	public void setAgreestateiddesc(String agreestateiddesc) {
		this.agreestateiddesc = agreestateiddesc;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public BigDecimal getSendqty() {
		return this.sendqty;
	}

	public void setSendqty(BigDecimal sendqty) {
		this.sendqty = sendqty;
	}

	public String getSendwarehouseid() {
		return this.sendwarehouseid;
	}

	public void setSendwarehouseid(String sendwarehouseid) {
		this.sendwarehouseid = sendwarehouseid;
	}

	public String getSendername() {
		return this.sendername;
	}

	public void setSendername(String sendername) {
		this.sendername = sendername;
	}

	public Date getActualsend() {
		return this.actualsend;
	}

	public void setActualsend(Date actualsend) {
		this.actualsend = actualsend;
	}

	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public BigDecimal getOutqty() {
		return this.outqty;
	}

	public void setOutqty(BigDecimal outqty) {
		this.outqty = outqty;
	}

	public BigDecimal getReceiveqty() {
		return this.receiveqty;
	}

	public void setReceiveqty(BigDecimal receiveqty) {
		this.receiveqty = receiveqty;
	}

	public String getReceivewarehouseid() {
		return this.receivewarehouseid;
	}

	public void setReceivewarehouseid(String receivewarehouseid) {
		this.receivewarehouseid = receivewarehouseid;
	}

	public String getReceivername() {
		return this.receivername;
	}

	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}

	public Date getOuttime() {
		return this.outtime;
	}

	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}

	public String getFetcher() {
		return this.fetcher;
	}

	public void setFetcher(String fetcher) {
		this.fetcher = fetcher;
	}

	public BigDecimal getFetchqty() {
		return this.fetchqty;
	}

	public void setFetchqty(BigDecimal fetchqty) {
		this.fetchqty = fetchqty;
	}

	public String getFetchername() {
		return this.fetchername;
	}

	public void setFetchername(String fetchername) {
		this.fetchername = fetchername;
	}

	public Date getActualfetch() {
		return this.actualfetch;
	}

	public void setActualfetch(Date actualfetch) {
		this.actualfetch = actualfetch;
	}

	public String getAccepter() {
		return this.accepter;
	}

	public void setAccepter(String accepter) {
		this.accepter = accepter;
	}

	public BigDecimal getAcceptqty() {
		return this.acceptqty;
	}

	public void setAcceptqty(BigDecimal acceptqty) {
		this.acceptqty = acceptqty;
	}

	public String getAcceptername() {
		return this.acceptername;
	}

	public void setAcceptername(String acceptername) {
		this.acceptername = acceptername;
	}

	public Date getActualaccept() {
		return this.actualaccept;
	}

	public void setActualaccept(Date actualaccept) {
		this.actualaccept = actualaccept;
	}

	public String getParentuid() {
		return this.parentuid;
	}

	public void setParentuid(String parentuid) {
		this.parentuid = parentuid;
	}

	public Long getExpirenum() {
		return this.expirenum;
	}

	public void setExpirenum(Long expirenum) {
		this.expirenum = expirenum;
	}

	public Long getLostnum() {
		return this.lostnum;
	}

	public void setLostnum(Long lostnum) {
		this.lostnum = lostnum;
	}

	public String getSendwarehousename() {
		return this.sendwarehousename;
	}

	public void setSendwarehousename(String sendwarehousename) {
		this.sendwarehousename = sendwarehousename;
	}

	public String getReceivewarehousename() {
		return this.receivewarehousename;
	}

	public void setReceivewarehousename(String receivewarehousename) {
		this.receivewarehousename = receivewarehousename;
	}

	public String getFetchwarehousename() {
		return this.fetchwarehousename;
	}

	public void setFetchwarehousename(String fetchwarehousename) {
		this.fetchwarehousename = fetchwarehousename;
	}

	public String getAcceptwarehousename() {
		return this.acceptwarehousename;
	}

	public void setAcceptwarehousename(String acceptwarehousename) {
		this.acceptwarehousename = acceptwarehousename;
	}

	public BigDecimal getLagdays() {
		return this.lagdays;
	}

	public void setLagdays(BigDecimal lagdays) {
		this.lagdays = lagdays;
	}

	public Date getPartlatefinish() {
		return this.partlatefinish;
	}

	public void setPartlatefinish(Date partlatefinish) {
		this.partlatefinish = partlatefinish;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TvCotaskId))
			return false;
		TvCotaskId castOther = (TvCotaskId) other;

		return ((this.getCotaskuid() == castOther.getCotaskuid()) || (this.getCotaskuid() != null
				&& castOther.getCotaskuid() != null && this.getCotaskuid().equals(castOther.getCotaskuid())))
				&& ((this.getTaskuid() == castOther.getTaskuid()) || (this.getTaskuid() != null
						&& castOther.getTaskuid() != null && this.getTaskuid().equals(castOther.getTaskuid())))
				&& ((this.getTaskstate() == castOther.getTaskstate()) || (this.getTaskstate() != null
						&& castOther.getTaskstate() != null && this.getTaskstate().equals(castOther.getTaskstate())))
				&& ((this.getCotaskstate() == castOther.getCotaskstate())
						|| (this.getCotaskstate() != null && castOther.getCotaskstate() != null
								&& this.getCotaskstate().equals(castOther.getCotaskstate())))
				&& ((this.getCofeedback() == castOther.getCofeedback()) || (this.getCofeedback() != null
						&& castOther.getCofeedback() != null && this.getCofeedback().equals(castOther.getCofeedback())))
				&& ((this.getPlanstart() == castOther.getPlanstart()) || (this.getPlanstart() != null
						&& castOther.getPlanstart() != null && this.getPlanstart().equals(castOther.getPlanstart())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
						&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getPlanfinish() == castOther.getPlanfinish()) || (this.getPlanfinish() != null
						&& castOther.getPlanfinish() != null && this.getPlanfinish().equals(castOther.getPlanfinish())))
				&& ((this.getPlanqty() == castOther.getPlanqty()) || (this.getPlanqty() != null
						&& castOther.getPlanqty() != null && this.getPlanqty().equals(castOther.getPlanqty())))
				&& ((this.getActualstart() == castOther.getActualstart())
						|| (this.getActualstart() != null && castOther.getActualstart() != null
								&& this.getActualstart().equals(castOther.getActualstart())))
				&& ((this.getActualfinish() == castOther.getActualfinish())
						|| (this.getActualfinish() != null && castOther.getActualfinish() != null
								&& this.getActualfinish().equals(castOther.getActualfinish())))
				&& ((this.getActualreceive() == castOther.getActualreceive())
						|| (this.getActualreceive() != null && castOther.getActualreceive() != null
								&& this.getActualreceive().equals(castOther.getActualreceive())))
				&& ((this.getCompleteqty() == castOther.getCompleteqty())
						|| (this.getCompleteqty() != null && castOther.getCompleteqty() != null
								&& this.getCompleteqty().equals(castOther.getCompleteqty())))
				&& ((this.getMastershop() == castOther.getMastershop()) || (this.getMastershop() != null
						&& castOther.getMastershop() != null && this.getMastershop().equals(castOther.getMastershop())))
				&& ((this.getSchedulestart() == castOther.getSchedulestart())
						|| (this.getSchedulestart() != null && castOther.getSchedulestart() != null
								&& this.getSchedulestart().equals(castOther.getSchedulestart())))
				&& ((this.getSchedulefinish() == castOther.getSchedulefinish())
						|| (this.getSchedulefinish() != null && castOther.getSchedulefinish() != null
								&& this.getSchedulefinish().equals(castOther.getSchedulefinish())))
				&& ((this.getModel() == castOther.getModel()) || (this.getModel() != null
						&& castOther.getModel() != null && this.getModel().equals(castOther.getModel())))
				&& ((this.getPartNumber() == castOther.getPartNumber()) || (this.getPartNumber() != null
						&& castOther.getPartNumber() != null && this.getPartNumber().equals(castOther.getPartNumber())))
				&& ((this.getDrawingid() == castOther.getDrawingid()) || (this.getDrawingid() != null
						&& castOther.getDrawingid() != null && this.getDrawingid().equals(castOther.getDrawingid())))
				&& ((this.getPartName() == castOther.getPartName()) || (this.getPartName() != null
						&& castOther.getPartName() != null && this.getPartName().equals(castOther.getPartName())))
				&& ((this.getBatchnum() == castOther.getBatchnum()) || (this.getBatchnum() != null
						&& castOther.getBatchnum() != null && this.getBatchnum().equals(castOther.getBatchnum())))
				&& ((this.getOperationId() == castOther.getOperationId())
						|| (this.getOperationId() != null && castOther.getOperationId() != null
								&& this.getOperationId().equals(castOther.getOperationId())))
				&& ((this.getOperationIddesc() == castOther.getOperationIddesc())
						|| (this.getOperationIddesc() != null && castOther.getOperationIddesc() != null
								&& this.getOperationIddesc().equals(castOther.getOperationIddesc())))
				&& ((this.getTaskname() == castOther.getTaskname()) || (this.getTaskname() != null
						&& castOther.getTaskname() != null && this.getTaskname().equals(castOther.getTaskname())))
				&& ((this.getDeptname() == castOther.getDeptname()) || (this.getDeptname() != null
						&& castOther.getDeptname() != null && this.getDeptname().equals(castOther.getDeptname())))
				&& ((this.getMastershopname() == castOther.getMastershopname())
						|| (this.getMastershopname() != null && castOther.getMastershopname() != null
								&& this.getMastershopname().equals(castOther.getMastershopname())))
				&& ((this.getOptypename() == castOther.getOptypename()) || (this.getOptypename() != null
						&& castOther.getOptypename() != null && this.getOptypename().equals(castOther.getOptypename())))
				&& ((this.getTaskstatedesc() == castOther.getTaskstatedesc())
						|| (this.getTaskstatedesc() != null && castOther.getTaskstatedesc() != null
								&& this.getTaskstatedesc().equals(castOther.getTaskstatedesc())))
				&& ((this.getSuspended() == castOther.getSuspended()) || (this.getSuspended() != null
						&& castOther.getSuspended() != null && this.getSuspended().equals(castOther.getSuspended())))
				&& ((this.getOpuid() == castOther.getOpuid()) || (this.getOpuid() != null
						&& castOther.getOpuid() != null && this.getOpuid().equals(castOther.getOpuid())))
				&& ((this.getOptype() == castOther.getOptype()) || (this.getOptype() != null
						&& castOther.getOptype() != null && this.getOptype().equals(castOther.getOptype())))
				&& ((this.getAgreestate() == castOther.getAgreestate()) || (this.getAgreestate() != null
						&& castOther.getAgreestate() != null && this.getAgreestate().equals(castOther.getAgreestate())))
				&& ((this.getAgreestateiddesc() == castOther.getAgreestateiddesc())
						|| (this.getAgreestateiddesc() != null && castOther.getAgreestateiddesc() != null
								&& this.getAgreestateiddesc().equals(castOther.getAgreestateiddesc())))
				&& ((this.getPriority() == castOther.getPriority()) || (this.getPriority() != null
						&& castOther.getPriority() != null && this.getPriority().equals(castOther.getPriority())))
				&& ((this.getSender() == castOther.getSender()) || (this.getSender() != null
						&& castOther.getSender() != null && this.getSender().equals(castOther.getSender())))
				&& ((this.getSendqty() == castOther.getSendqty()) || (this.getSendqty() != null
						&& castOther.getSendqty() != null && this.getSendqty().equals(castOther.getSendqty())))
				&& ((this.getSendwarehouseid() == castOther.getSendwarehouseid())
						|| (this.getSendwarehouseid() != null && castOther.getSendwarehouseid() != null
								&& this.getSendwarehouseid().equals(castOther.getSendwarehouseid())))
				&& ((this.getSendername() == castOther.getSendername()) || (this.getSendername() != null
						&& castOther.getSendername() != null && this.getSendername().equals(castOther.getSendername())))
				&& ((this.getActualsend() == castOther.getActualsend()) || (this.getActualsend() != null
						&& castOther.getActualsend() != null && this.getActualsend().equals(castOther.getActualsend())))
				&& ((this.getReceiver() == castOther.getReceiver()) || (this.getReceiver() != null
						&& castOther.getReceiver() != null && this.getReceiver().equals(castOther.getReceiver())))
				&& ((this.getOutqty() == castOther.getOutqty()) || (this.getOutqty() != null
						&& castOther.getOutqty() != null && this.getOutqty().equals(castOther.getOutqty())))
				&& ((this.getReceiveqty() == castOther.getReceiveqty()) || (this.getReceiveqty() != null
						&& castOther.getReceiveqty() != null && this.getReceiveqty().equals(castOther.getReceiveqty())))
				&& ((this.getReceivewarehouseid() == castOther.getReceivewarehouseid())
						|| (this.getReceivewarehouseid() != null && castOther.getReceivewarehouseid() != null
								&& this.getReceivewarehouseid().equals(castOther.getReceivewarehouseid())))
				&& ((this.getReceivername() == castOther.getReceivername())
						|| (this.getReceivername() != null && castOther.getReceivername() != null
								&& this.getReceivername().equals(castOther.getReceivername())))
				&& ((this.getOuttime() == castOther.getOuttime()) || (this.getOuttime() != null
						&& castOther.getOuttime() != null && this.getOuttime().equals(castOther.getOuttime())))
				&& ((this.getFetcher() == castOther.getFetcher()) || (this.getFetcher() != null
						&& castOther.getFetcher() != null && this.getFetcher().equals(castOther.getFetcher())))
				&& ((this.getFetchqty() == castOther.getFetchqty()) || (this.getFetchqty() != null
						&& castOther.getFetchqty() != null && this.getFetchqty().equals(castOther.getFetchqty())))
				&& ((this.getFetchername() == castOther.getFetchername())
						|| (this.getFetchername() != null && castOther.getFetchername() != null
								&& this.getFetchername().equals(castOther.getFetchername())))
				&& ((this.getActualfetch() == castOther.getActualfetch())
						|| (this.getActualfetch() != null && castOther.getActualfetch() != null
								&& this.getActualfetch().equals(castOther.getActualfetch())))
				&& ((this.getAccepter() == castOther.getAccepter()) || (this.getAccepter() != null
						&& castOther.getAccepter() != null && this.getAccepter().equals(castOther.getAccepter())))
				&& ((this.getAcceptqty() == castOther.getAcceptqty()) || (this.getAcceptqty() != null
						&& castOther.getAcceptqty() != null && this.getAcceptqty().equals(castOther.getAcceptqty())))
				&& ((this.getAcceptername() == castOther.getAcceptername())
						|| (this.getAcceptername() != null && castOther.getAcceptername() != null
								&& this.getAcceptername().equals(castOther.getAcceptername())))
				&& ((this.getActualaccept() == castOther.getActualaccept())
						|| (this.getActualaccept() != null && castOther.getActualaccept() != null
								&& this.getActualaccept().equals(castOther.getActualaccept())))
				&& ((this.getParentuid() == castOther.getParentuid()) || (this.getParentuid() != null
						&& castOther.getParentuid() != null && this.getParentuid().equals(castOther.getParentuid())))
				&& ((this.getExpirenum() == castOther.getExpirenum()) || (this.getExpirenum() != null
						&& castOther.getExpirenum() != null && this.getExpirenum().equals(castOther.getExpirenum())))
				&& ((this.getLostnum() == castOther.getLostnum()) || (this.getLostnum() != null
						&& castOther.getLostnum() != null && this.getLostnum().equals(castOther.getLostnum())))
				&& ((this.getSendwarehousename() == castOther.getSendwarehousename())
						|| (this.getSendwarehousename() != null && castOther.getSendwarehousename() != null
								&& this.getSendwarehousename().equals(castOther.getSendwarehousename())))
				&& ((this.getReceivewarehousename() == castOther.getReceivewarehousename())
						|| (this.getReceivewarehousename() != null && castOther.getReceivewarehousename() != null
								&& this.getReceivewarehousename().equals(castOther.getReceivewarehousename())))
				&& ((this.getFetchwarehousename() == castOther.getFetchwarehousename())
						|| (this.getFetchwarehousename() != null && castOther.getFetchwarehousename() != null
								&& this.getFetchwarehousename().equals(castOther.getFetchwarehousename())))
				&& ((this.getAcceptwarehousename() == castOther.getAcceptwarehousename())
						|| (this.getAcceptwarehousename() != null && castOther.getAcceptwarehousename() != null
								&& this.getAcceptwarehousename().equals(castOther.getAcceptwarehousename())))
				&& ((this.getLagdays() == castOther.getLagdays()) || (this.getLagdays() != null
						&& castOther.getLagdays() != null && this.getLagdays().equals(castOther.getLagdays())))
				&& ((this.getPartlatefinish() == castOther.getPartlatefinish())
						|| (this.getPartlatefinish() != null && castOther.getPartlatefinish() != null
								&& this.getPartlatefinish().equals(castOther.getPartlatefinish())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCotaskuid() == null ? 0 : this.getCotaskuid().hashCode());
		result = 37 * result + (getTaskuid() == null ? 0 : this.getTaskuid().hashCode());
		result = 37 * result + (getTaskstate() == null ? 0 : this.getTaskstate().hashCode());
		result = 37 * result + (getCotaskstate() == null ? 0 : this.getCotaskstate().hashCode());
		result = 37 * result + (getCofeedback() == null ? 0 : this.getCofeedback().hashCode());
		result = 37 * result + (getPlanstart() == null ? 0 : this.getPlanstart().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result + (getPlanfinish() == null ? 0 : this.getPlanfinish().hashCode());
		result = 37 * result + (getPlanqty() == null ? 0 : this.getPlanqty().hashCode());
		result = 37 * result + (getActualstart() == null ? 0 : this.getActualstart().hashCode());
		result = 37 * result + (getActualfinish() == null ? 0 : this.getActualfinish().hashCode());
		result = 37 * result + (getActualreceive() == null ? 0 : this.getActualreceive().hashCode());
		result = 37 * result + (getCompleteqty() == null ? 0 : this.getCompleteqty().hashCode());
		result = 37 * result + (getMastershop() == null ? 0 : this.getMastershop().hashCode());
		result = 37 * result + (getSchedulestart() == null ? 0 : this.getSchedulestart().hashCode());
		result = 37 * result + (getSchedulefinish() == null ? 0 : this.getSchedulefinish().hashCode());
		result = 37 * result + (getModel() == null ? 0 : this.getModel().hashCode());
		result = 37 * result + (getPartNumber() == null ? 0 : this.getPartNumber().hashCode());
		result = 37 * result + (getDrawingid() == null ? 0 : this.getDrawingid().hashCode());
		result = 37 * result + (getPartName() == null ? 0 : this.getPartName().hashCode());
		result = 37 * result + (getBatchnum() == null ? 0 : this.getBatchnum().hashCode());
		result = 37 * result + (getOperationId() == null ? 0 : this.getOperationId().hashCode());
		result = 37 * result + (getOperationIddesc() == null ? 0 : this.getOperationIddesc().hashCode());
		result = 37 * result + (getTaskname() == null ? 0 : this.getTaskname().hashCode());
		result = 37 * result + (getDeptname() == null ? 0 : this.getDeptname().hashCode());
		result = 37 * result + (getMastershopname() == null ? 0 : this.getMastershopname().hashCode());
		result = 37 * result + (getOptypename() == null ? 0 : this.getOptypename().hashCode());
		result = 37 * result + (getTaskstatedesc() == null ? 0 : this.getTaskstatedesc().hashCode());
		result = 37 * result + (getSuspended() == null ? 0 : this.getSuspended().hashCode());
		result = 37 * result + (getOpuid() == null ? 0 : this.getOpuid().hashCode());
		result = 37 * result + (getOptype() == null ? 0 : this.getOptype().hashCode());
		result = 37 * result + (getAgreestate() == null ? 0 : this.getAgreestate().hashCode());
		result = 37 * result + (getAgreestateiddesc() == null ? 0 : this.getAgreestateiddesc().hashCode());
		result = 37 * result + (getPriority() == null ? 0 : this.getPriority().hashCode());
		result = 37 * result + (getSender() == null ? 0 : this.getSender().hashCode());
		result = 37 * result + (getSendqty() == null ? 0 : this.getSendqty().hashCode());
		result = 37 * result + (getSendwarehouseid() == null ? 0 : this.getSendwarehouseid().hashCode());
		result = 37 * result + (getSendername() == null ? 0 : this.getSendername().hashCode());
		result = 37 * result + (getActualsend() == null ? 0 : this.getActualsend().hashCode());
		result = 37 * result + (getReceiver() == null ? 0 : this.getReceiver().hashCode());
		result = 37 * result + (getOutqty() == null ? 0 : this.getOutqty().hashCode());
		result = 37 * result + (getReceiveqty() == null ? 0 : this.getReceiveqty().hashCode());
		result = 37 * result + (getReceivewarehouseid() == null ? 0 : this.getReceivewarehouseid().hashCode());
		result = 37 * result + (getReceivername() == null ? 0 : this.getReceivername().hashCode());
		result = 37 * result + (getOuttime() == null ? 0 : this.getOuttime().hashCode());
		result = 37 * result + (getFetcher() == null ? 0 : this.getFetcher().hashCode());
		result = 37 * result + (getFetchqty() == null ? 0 : this.getFetchqty().hashCode());
		result = 37 * result + (getFetchername() == null ? 0 : this.getFetchername().hashCode());
		result = 37 * result + (getActualfetch() == null ? 0 : this.getActualfetch().hashCode());
		result = 37 * result + (getAccepter() == null ? 0 : this.getAccepter().hashCode());
		result = 37 * result + (getAcceptqty() == null ? 0 : this.getAcceptqty().hashCode());
		result = 37 * result + (getAcceptername() == null ? 0 : this.getAcceptername().hashCode());
		result = 37 * result + (getActualaccept() == null ? 0 : this.getActualaccept().hashCode());
		result = 37 * result + (getParentuid() == null ? 0 : this.getParentuid().hashCode());
		result = 37 * result + (getExpirenum() == null ? 0 : this.getExpirenum().hashCode());
		result = 37 * result + (getLostnum() == null ? 0 : this.getLostnum().hashCode());
		result = 37 * result + (getSendwarehousename() == null ? 0 : this.getSendwarehousename().hashCode());
		result = 37 * result + (getReceivewarehousename() == null ? 0 : this.getReceivewarehousename().hashCode());
		result = 37 * result + (getFetchwarehousename() == null ? 0 : this.getFetchwarehousename().hashCode());
		result = 37 * result + (getAcceptwarehousename() == null ? 0 : this.getAcceptwarehousename().hashCode());
		result = 37 * result + (getLagdays() == null ? 0 : this.getLagdays().hashCode());
		result = 37 * result + (getPartlatefinish() == null ? 0 : this.getPartlatefinish().hashCode());
		return result;
	}

}
