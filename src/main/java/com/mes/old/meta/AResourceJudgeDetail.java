package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * AResourceJudgeDetail generated by hbm2java
 */
public class AResourceJudgeDetail implements java.io.Serializable {

	private AResourceJudgeDetailId id;
	private AResourceJudgeHeader AResourceJudgeHeader;
	private String partNumber;
	private Integer requireNum;
	private Integer judgeNum;
	private String relationOrder;
	private String itemJudgeState;
	private String isFinishJudge;
	private Date finalTime;
	private Date nextTime;

	public AResourceJudgeDetail() {
	}

	public AResourceJudgeDetail(AResourceJudgeDetailId id, AResourceJudgeHeader AResourceJudgeHeader) {
		this.id = id;
		this.AResourceJudgeHeader = AResourceJudgeHeader;
	}

	public AResourceJudgeDetail(AResourceJudgeDetailId id, AResourceJudgeHeader AResourceJudgeHeader, String partNumber,
			Integer requireNum, Integer judgeNum, String relationOrder, String itemJudgeState, String isFinishJudge,
			Date finalTime, Date nextTime) {
		this.id = id;
		this.AResourceJudgeHeader = AResourceJudgeHeader;
		this.partNumber = partNumber;
		this.requireNum = requireNum;
		this.judgeNum = judgeNum;
		this.relationOrder = relationOrder;
		this.itemJudgeState = itemJudgeState;
		this.isFinishJudge = isFinishJudge;
		this.finalTime = finalTime;
		this.nextTime = nextTime;
	}

	public AResourceJudgeDetailId getId() {
		return this.id;
	}

	public void setId(AResourceJudgeDetailId id) {
		this.id = id;
	}

	public AResourceJudgeHeader getAResourceJudgeHeader() {
		return this.AResourceJudgeHeader;
	}

	public void setAResourceJudgeHeader(AResourceJudgeHeader AResourceJudgeHeader) {
		this.AResourceJudgeHeader = AResourceJudgeHeader;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public Integer getRequireNum() {
		return this.requireNum;
	}

	public void setRequireNum(Integer requireNum) {
		this.requireNum = requireNum;
	}

	public Integer getJudgeNum() {
		return this.judgeNum;
	}

	public void setJudgeNum(Integer judgeNum) {
		this.judgeNum = judgeNum;
	}

	public String getRelationOrder() {
		return this.relationOrder;
	}

	public void setRelationOrder(String relationOrder) {
		this.relationOrder = relationOrder;
	}

	public String getItemJudgeState() {
		return this.itemJudgeState;
	}

	public void setItemJudgeState(String itemJudgeState) {
		this.itemJudgeState = itemJudgeState;
	}

	public String getIsFinishJudge() {
		return this.isFinishJudge;
	}

	public void setIsFinishJudge(String isFinishJudge) {
		this.isFinishJudge = isFinishJudge;
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

}