package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TPrepareTask generated by hbm2java
 */
public class TPrepareTask implements java.io.Serializable {

	private String prepareTaskuid;
	private String prepareTaskname;
	private String prepareTasktype;
	private String prepareTaskstate;
	private Long priority;
	private String creator;
	private Date createtime;
	private String employeeid;
	private String relationid;
	private String partNumber;
	private String orderid;
	private String taskuid;
	private String deptid;
	private String taskPartNumber;
	private String taskPartName;
	private String taskDrawingid;
	private String taskVersionid;
	private String taskBatchnum;
	private Date taskPlanstart;
	private String routing;
	private String routingVer;
	private String opuid;
	private BigDecimal operationId;
	private String operationIddesc;
	private String taskTaskid;
	private String taskTaskname;
	private String taskTasktype;
	private BigDecimal taskTaskstate;
	private String resuid;
	private String relationOrder;
	private Date startTime;
	private Date endTime;
	private Date finalTime;
	private Date nextTime;
	private Date actualstart;
	private Date estimatefinish;
	private Date actualfinish;
	private String notes;
	private String scheduleTaskuid;
	private BigDecimal completepercent;
	private String taskdescription;
	private String dispatcher;
	private Date dispatchTime;
	private Set TPrepareRelations = new HashSet(0);

	public TPrepareTask() {
	}

	public TPrepareTask(String prepareTaskuid) {
		this.prepareTaskuid = prepareTaskuid;
	}

	public TPrepareTask(String prepareTaskuid, String prepareTaskname, String prepareTasktype, String prepareTaskstate,
			Long priority, String creator, Date createtime, String employeeid, String relationid, String partNumber,
			String orderid, String taskuid, String deptid, String taskPartNumber, String taskPartName,
			String taskDrawingid, String taskVersionid, String taskBatchnum, Date taskPlanstart, String routing,
			String routingVer, String opuid, BigDecimal operationId, String operationIddesc, String taskTaskid,
			String taskTaskname, String taskTasktype, BigDecimal taskTaskstate, String resuid, String relationOrder,
			Date startTime, Date endTime, Date finalTime, Date nextTime, Date actualstart, Date estimatefinish,
			Date actualfinish, String notes, String scheduleTaskuid, BigDecimal completepercent, String taskdescription,
			String dispatcher, Date dispatchTime, Set TPrepareRelations) {
		this.prepareTaskuid = prepareTaskuid;
		this.prepareTaskname = prepareTaskname;
		this.prepareTasktype = prepareTasktype;
		this.prepareTaskstate = prepareTaskstate;
		this.priority = priority;
		this.creator = creator;
		this.createtime = createtime;
		this.employeeid = employeeid;
		this.relationid = relationid;
		this.partNumber = partNumber;
		this.orderid = orderid;
		this.taskuid = taskuid;
		this.deptid = deptid;
		this.taskPartNumber = taskPartNumber;
		this.taskPartName = taskPartName;
		this.taskDrawingid = taskDrawingid;
		this.taskVersionid = taskVersionid;
		this.taskBatchnum = taskBatchnum;
		this.taskPlanstart = taskPlanstart;
		this.routing = routing;
		this.routingVer = routingVer;
		this.opuid = opuid;
		this.operationId = operationId;
		this.operationIddesc = operationIddesc;
		this.taskTaskid = taskTaskid;
		this.taskTaskname = taskTaskname;
		this.taskTasktype = taskTasktype;
		this.taskTaskstate = taskTaskstate;
		this.resuid = resuid;
		this.relationOrder = relationOrder;
		this.startTime = startTime;
		this.endTime = endTime;
		this.finalTime = finalTime;
		this.nextTime = nextTime;
		this.actualstart = actualstart;
		this.estimatefinish = estimatefinish;
		this.actualfinish = actualfinish;
		this.notes = notes;
		this.scheduleTaskuid = scheduleTaskuid;
		this.completepercent = completepercent;
		this.taskdescription = taskdescription;
		this.dispatcher = dispatcher;
		this.dispatchTime = dispatchTime;
		this.TPrepareRelations = TPrepareRelations;
	}

	public String getPrepareTaskuid() {
		return this.prepareTaskuid;
	}

	public void setPrepareTaskuid(String prepareTaskuid) {
		this.prepareTaskuid = prepareTaskuid;
	}

	public String getPrepareTaskname() {
		return this.prepareTaskname;
	}

	public void setPrepareTaskname(String prepareTaskname) {
		this.prepareTaskname = prepareTaskname;
	}

	public String getPrepareTasktype() {
		return this.prepareTasktype;
	}

	public void setPrepareTasktype(String prepareTasktype) {
		this.prepareTasktype = prepareTasktype;
	}

	public String getPrepareTaskstate() {
		return this.prepareTaskstate;
	}

	public void setPrepareTaskstate(String prepareTaskstate) {
		this.prepareTaskstate = prepareTaskstate;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
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

	public String getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getRelationid() {
		return this.relationid;
	}

	public void setRelationid(String relationid) {
		this.relationid = relationid;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
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

	public String getTaskPartNumber() {
		return this.taskPartNumber;
	}

	public void setTaskPartNumber(String taskPartNumber) {
		this.taskPartNumber = taskPartNumber;
	}

	public String getTaskPartName() {
		return this.taskPartName;
	}

	public void setTaskPartName(String taskPartName) {
		this.taskPartName = taskPartName;
	}

	public String getTaskDrawingid() {
		return this.taskDrawingid;
	}

	public void setTaskDrawingid(String taskDrawingid) {
		this.taskDrawingid = taskDrawingid;
	}

	public String getTaskVersionid() {
		return this.taskVersionid;
	}

	public void setTaskVersionid(String taskVersionid) {
		this.taskVersionid = taskVersionid;
	}

	public String getTaskBatchnum() {
		return this.taskBatchnum;
	}

	public void setTaskBatchnum(String taskBatchnum) {
		this.taskBatchnum = taskBatchnum;
	}

	public Date getTaskPlanstart() {
		return this.taskPlanstart;
	}

	public void setTaskPlanstart(Date taskPlanstart) {
		this.taskPlanstart = taskPlanstart;
	}

	public String getRouting() {
		return this.routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public String getRoutingVer() {
		return this.routingVer;
	}

	public void setRoutingVer(String routingVer) {
		this.routingVer = routingVer;
	}

	public String getOpuid() {
		return this.opuid;
	}

	public void setOpuid(String opuid) {
		this.opuid = opuid;
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

	public String getTaskTaskid() {
		return this.taskTaskid;
	}

	public void setTaskTaskid(String taskTaskid) {
		this.taskTaskid = taskTaskid;
	}

	public String getTaskTaskname() {
		return this.taskTaskname;
	}

	public void setTaskTaskname(String taskTaskname) {
		this.taskTaskname = taskTaskname;
	}

	public String getTaskTasktype() {
		return this.taskTasktype;
	}

	public void setTaskTasktype(String taskTasktype) {
		this.taskTasktype = taskTasktype;
	}

	public BigDecimal getTaskTaskstate() {
		return this.taskTaskstate;
	}

	public void setTaskTaskstate(BigDecimal taskTaskstate) {
		this.taskTaskstate = taskTaskstate;
	}

	public String getResuid() {
		return this.resuid;
	}

	public void setResuid(String resuid) {
		this.resuid = resuid;
	}

	public String getRelationOrder() {
		return this.relationOrder;
	}

	public void setRelationOrder(String relationOrder) {
		this.relationOrder = relationOrder;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getFinalTime() {
		return this.finalTime;
	}

	public void setFinalTime(Date finalTime) {
		this.finalTime = finalTime;
	}

	public Date getNextTime() {
		return this.nextTime;
	}

	public void setNextTime(Date nextTime) {
		this.nextTime = nextTime;
	}

	public Date getActualstart() {
		return this.actualstart;
	}

	public void setActualstart(Date actualstart) {
		this.actualstart = actualstart;
	}

	public Date getEstimatefinish() {
		return this.estimatefinish;
	}

	public void setEstimatefinish(Date estimatefinish) {
		this.estimatefinish = estimatefinish;
	}

	public Date getActualfinish() {
		return this.actualfinish;
	}

	public void setActualfinish(Date actualfinish) {
		this.actualfinish = actualfinish;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getScheduleTaskuid() {
		return this.scheduleTaskuid;
	}

	public void setScheduleTaskuid(String scheduleTaskuid) {
		this.scheduleTaskuid = scheduleTaskuid;
	}

	public BigDecimal getCompletepercent() {
		return this.completepercent;
	}

	public void setCompletepercent(BigDecimal completepercent) {
		this.completepercent = completepercent;
	}

	public String getTaskdescription() {
		return this.taskdescription;
	}

	public void setTaskdescription(String taskdescription) {
		this.taskdescription = taskdescription;
	}

	public String getDispatcher() {
		return this.dispatcher;
	}

	public void setDispatcher(String dispatcher) {
		this.dispatcher = dispatcher;
	}

	public Date getDispatchTime() {
		return this.dispatchTime;
	}

	public void setDispatchTime(Date dispatchTime) {
		this.dispatchTime = dispatchTime;
	}

	public Set getTPrepareRelations() {
		return this.TPrepareRelations;
	}

	public void setTPrepareRelations(Set TPrepareRelations) {
		this.TPrepareRelations = TPrepareRelations;
	}

}
