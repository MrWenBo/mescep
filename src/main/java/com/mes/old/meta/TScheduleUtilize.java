package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * TScheduleUtilize generated by hbm2java
 */
public class TScheduleUtilize implements java.io.Serializable {

	private TScheduleUtilizeId id;
	private TScheduleHeader TScheduleHeader;
	private BigDecimal resUtilize;
	private String notes;
	private String deptid;
	private BigDecimal totalcapacitytime;
	private BigDecimal totalfreetime;
	private BigDecimal totalsetuptime;
	private BigDecimal totalruntime;
	private String workcentername;
	private BigDecimal totallinkassignlag;
	private String workcenteruid;
	private BigDecimal resLoad;
	private BigDecimal totalovertime;
	private String segementNum;
	private BigDecimal totalwaittime;

	public TScheduleUtilize() {
	}

	public TScheduleUtilize(TScheduleUtilizeId id, TScheduleHeader TScheduleHeader) {
		this.id = id;
		this.TScheduleHeader = TScheduleHeader;
	}

	public TScheduleUtilize(TScheduleUtilizeId id, TScheduleHeader TScheduleHeader, BigDecimal resUtilize, String notes,
			String deptid, BigDecimal totalcapacitytime, BigDecimal totalfreetime, BigDecimal totalsetuptime,
			BigDecimal totalruntime, String workcentername, BigDecimal totallinkassignlag, String workcenteruid,
			BigDecimal resLoad, BigDecimal totalovertime, String segementNum, BigDecimal totalwaittime) {
		this.id = id;
		this.TScheduleHeader = TScheduleHeader;
		this.resUtilize = resUtilize;
		this.notes = notes;
		this.deptid = deptid;
		this.totalcapacitytime = totalcapacitytime;
		this.totalfreetime = totalfreetime;
		this.totalsetuptime = totalsetuptime;
		this.totalruntime = totalruntime;
		this.workcentername = workcentername;
		this.totallinkassignlag = totallinkassignlag;
		this.workcenteruid = workcenteruid;
		this.resLoad = resLoad;
		this.totalovertime = totalovertime;
		this.segementNum = segementNum;
		this.totalwaittime = totalwaittime;
	}

	public TScheduleUtilizeId getId() {
		return this.id;
	}

	public void setId(TScheduleUtilizeId id) {
		this.id = id;
	}

	public TScheduleHeader getTScheduleHeader() {
		return this.TScheduleHeader;
	}

	public void setTScheduleHeader(TScheduleHeader TScheduleHeader) {
		this.TScheduleHeader = TScheduleHeader;
	}

	public BigDecimal getResUtilize() {
		return this.resUtilize;
	}

	public void setResUtilize(BigDecimal resUtilize) {
		this.resUtilize = resUtilize;
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

	public BigDecimal getTotalcapacitytime() {
		return this.totalcapacitytime;
	}

	public void setTotalcapacitytime(BigDecimal totalcapacitytime) {
		this.totalcapacitytime = totalcapacitytime;
	}

	public BigDecimal getTotalfreetime() {
		return this.totalfreetime;
	}

	public void setTotalfreetime(BigDecimal totalfreetime) {
		this.totalfreetime = totalfreetime;
	}

	public BigDecimal getTotalsetuptime() {
		return this.totalsetuptime;
	}

	public void setTotalsetuptime(BigDecimal totalsetuptime) {
		this.totalsetuptime = totalsetuptime;
	}

	public BigDecimal getTotalruntime() {
		return this.totalruntime;
	}

	public void setTotalruntime(BigDecimal totalruntime) {
		this.totalruntime = totalruntime;
	}

	public String getWorkcentername() {
		return this.workcentername;
	}

	public void setWorkcentername(String workcentername) {
		this.workcentername = workcentername;
	}

	public BigDecimal getTotallinkassignlag() {
		return this.totallinkassignlag;
	}

	public void setTotallinkassignlag(BigDecimal totallinkassignlag) {
		this.totallinkassignlag = totallinkassignlag;
	}

	public String getWorkcenteruid() {
		return this.workcenteruid;
	}

	public void setWorkcenteruid(String workcenteruid) {
		this.workcenteruid = workcenteruid;
	}

	public BigDecimal getResLoad() {
		return this.resLoad;
	}

	public void setResLoad(BigDecimal resLoad) {
		this.resLoad = resLoad;
	}

	public BigDecimal getTotalovertime() {
		return this.totalovertime;
	}

	public void setTotalovertime(BigDecimal totalovertime) {
		this.totalovertime = totalovertime;
	}

	public String getSegementNum() {
		return this.segementNum;
	}

	public void setSegementNum(String segementNum) {
		this.segementNum = segementNum;
	}

	public BigDecimal getTotalwaittime() {
		return this.totalwaittime;
	}

	public void setTotalwaittime(BigDecimal totalwaittime) {
		this.totalwaittime = totalwaittime;
	}

}