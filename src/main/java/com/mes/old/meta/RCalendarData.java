package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * RCalendarData generated by hbm2java
 */
public class RCalendarData implements java.io.Serializable {

	private String cdUid;
	private String calUid;
	private Integer cdDayOrException;
	private Integer cdWorking;
	private Date cdFromDate;
	private Date cdToDate;
	private Date cdFromTime1;
	private Date cdToTime1;
	private Date cdFromTime2;
	private Date cdToTime2;
	private Date cdFromTime3;
	private Date cdToTime3;
	private Date cdFromTime4;
	private Date cdToTime4;
	private Date cdFromTime5;
	private Date cdToTime5;
	private String exceptionReason;
	private String notes;
	private String resuid;
	private Date cdFromTime6;
	private Date cdToTime6;
	private Date cdFromTime7;
	private Date cdToTime7;
	private Date cdFromTime8;
	private Date cdToTime8;
	private String RCalendarDataOutUid;
	private Boolean effective;
	private Date invaliddate;
	private String exceptionType;

	public RCalendarData() {
	}

	public RCalendarData(String cdUid) {
		this.cdUid = cdUid;
	}

	public RCalendarData(String cdUid, String calUid, Integer cdDayOrException, Integer cdWorking, Date cdFromDate,
			Date cdToDate, Date cdFromTime1, Date cdToTime1, Date cdFromTime2, Date cdToTime2, Date cdFromTime3,
			Date cdToTime3, Date cdFromTime4, Date cdToTime4, Date cdFromTime5, Date cdToTime5, String exceptionReason,
			String notes, String resuid, Date cdFromTime6, Date cdToTime6, Date cdFromTime7, Date cdToTime7,
			Date cdFromTime8, Date cdToTime8, String RCalendarDataOutUid, Boolean effective, Date invaliddate,
			String exceptionType) {
		this.cdUid = cdUid;
		this.calUid = calUid;
		this.cdDayOrException = cdDayOrException;
		this.cdWorking = cdWorking;
		this.cdFromDate = cdFromDate;
		this.cdToDate = cdToDate;
		this.cdFromTime1 = cdFromTime1;
		this.cdToTime1 = cdToTime1;
		this.cdFromTime2 = cdFromTime2;
		this.cdToTime2 = cdToTime2;
		this.cdFromTime3 = cdFromTime3;
		this.cdToTime3 = cdToTime3;
		this.cdFromTime4 = cdFromTime4;
		this.cdToTime4 = cdToTime4;
		this.cdFromTime5 = cdFromTime5;
		this.cdToTime5 = cdToTime5;
		this.exceptionReason = exceptionReason;
		this.notes = notes;
		this.resuid = resuid;
		this.cdFromTime6 = cdFromTime6;
		this.cdToTime6 = cdToTime6;
		this.cdFromTime7 = cdFromTime7;
		this.cdToTime7 = cdToTime7;
		this.cdFromTime8 = cdFromTime8;
		this.cdToTime8 = cdToTime8;
		this.RCalendarDataOutUid = RCalendarDataOutUid;
		this.effective = effective;
		this.invaliddate = invaliddate;
		this.exceptionType = exceptionType;
	}

	public String getCdUid() {
		return this.cdUid;
	}

	public void setCdUid(String cdUid) {
		this.cdUid = cdUid;
	}

	public String getCalUid() {
		return this.calUid;
	}

	public void setCalUid(String calUid) {
		this.calUid = calUid;
	}

	public Integer getCdDayOrException() {
		return this.cdDayOrException;
	}

	public void setCdDayOrException(Integer cdDayOrException) {
		this.cdDayOrException = cdDayOrException;
	}

	public Integer getCdWorking() {
		return this.cdWorking;
	}

	public void setCdWorking(Integer cdWorking) {
		this.cdWorking = cdWorking;
	}

	public Date getCdFromDate() {
		return this.cdFromDate;
	}

	public void setCdFromDate(Date cdFromDate) {
		this.cdFromDate = cdFromDate;
	}

	public Date getCdToDate() {
		return this.cdToDate;
	}

	public void setCdToDate(Date cdToDate) {
		this.cdToDate = cdToDate;
	}

	public Date getCdFromTime1() {
		return this.cdFromTime1;
	}

	public void setCdFromTime1(Date cdFromTime1) {
		this.cdFromTime1 = cdFromTime1;
	}

	public Date getCdToTime1() {
		return this.cdToTime1;
	}

	public void setCdToTime1(Date cdToTime1) {
		this.cdToTime1 = cdToTime1;
	}

	public Date getCdFromTime2() {
		return this.cdFromTime2;
	}

	public void setCdFromTime2(Date cdFromTime2) {
		this.cdFromTime2 = cdFromTime2;
	}

	public Date getCdToTime2() {
		return this.cdToTime2;
	}

	public void setCdToTime2(Date cdToTime2) {
		this.cdToTime2 = cdToTime2;
	}

	public Date getCdFromTime3() {
		return this.cdFromTime3;
	}

	public void setCdFromTime3(Date cdFromTime3) {
		this.cdFromTime3 = cdFromTime3;
	}

	public Date getCdToTime3() {
		return this.cdToTime3;
	}

	public void setCdToTime3(Date cdToTime3) {
		this.cdToTime3 = cdToTime3;
	}

	public Date getCdFromTime4() {
		return this.cdFromTime4;
	}

	public void setCdFromTime4(Date cdFromTime4) {
		this.cdFromTime4 = cdFromTime4;
	}

	public Date getCdToTime4() {
		return this.cdToTime4;
	}

	public void setCdToTime4(Date cdToTime4) {
		this.cdToTime4 = cdToTime4;
	}

	public Date getCdFromTime5() {
		return this.cdFromTime5;
	}

	public void setCdFromTime5(Date cdFromTime5) {
		this.cdFromTime5 = cdFromTime5;
	}

	public Date getCdToTime5() {
		return this.cdToTime5;
	}

	public void setCdToTime5(Date cdToTime5) {
		this.cdToTime5 = cdToTime5;
	}

	public String getExceptionReason() {
		return this.exceptionReason;
	}

	public void setExceptionReason(String exceptionReason) {
		this.exceptionReason = exceptionReason;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getResuid() {
		return this.resuid;
	}

	public void setResuid(String resuid) {
		this.resuid = resuid;
	}

	public Date getCdFromTime6() {
		return this.cdFromTime6;
	}

	public void setCdFromTime6(Date cdFromTime6) {
		this.cdFromTime6 = cdFromTime6;
	}

	public Date getCdToTime6() {
		return this.cdToTime6;
	}

	public void setCdToTime6(Date cdToTime6) {
		this.cdToTime6 = cdToTime6;
	}

	public Date getCdFromTime7() {
		return this.cdFromTime7;
	}

	public void setCdFromTime7(Date cdFromTime7) {
		this.cdFromTime7 = cdFromTime7;
	}

	public Date getCdToTime7() {
		return this.cdToTime7;
	}

	public void setCdToTime7(Date cdToTime7) {
		this.cdToTime7 = cdToTime7;
	}

	public Date getCdFromTime8() {
		return this.cdFromTime8;
	}

	public void setCdFromTime8(Date cdFromTime8) {
		this.cdFromTime8 = cdFromTime8;
	}

	public Date getCdToTime8() {
		return this.cdToTime8;
	}

	public void setCdToTime8(Date cdToTime8) {
		this.cdToTime8 = cdToTime8;
	}

	public String getRCalendarDataOutUid() {
		return this.RCalendarDataOutUid;
	}

	public void setRCalendarDataOutUid(String RCalendarDataOutUid) {
		this.RCalendarDataOutUid = RCalendarDataOutUid;
	}

	public Boolean getEffective() {
		return this.effective;
	}

	public void setEffective(Boolean effective) {
		this.effective = effective;
	}

	public Date getInvaliddate() {
		return this.invaliddate;
	}

	public void setInvaliddate(Date invaliddate) {
		this.invaliddate = invaliddate;
	}

	public String getExceptionType() {
		return this.exceptionType;
	}

	public void setExceptionType(String exceptionType) {
		this.exceptionType = exceptionType;
	}

}
