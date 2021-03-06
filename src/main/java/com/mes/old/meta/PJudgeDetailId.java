package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * PJudgeDetailId generated by hbm2java
 */
public class PJudgeDetailId implements java.io.Serializable {

	private String judgeid;
	private int judgeseq;

	public PJudgeDetailId() {
	}

	public PJudgeDetailId(String judgeid, int judgeseq) {
		this.judgeid = judgeid;
		this.judgeseq = judgeseq;
	}

	public String getJudgeid() {
		return this.judgeid;
	}

	public void setJudgeid(String judgeid) {
		this.judgeid = judgeid;
	}

	public int getJudgeseq() {
		return this.judgeseq;
	}

	public void setJudgeseq(int judgeseq) {
		this.judgeseq = judgeseq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PJudgeDetailId))
			return false;
		PJudgeDetailId castOther = (PJudgeDetailId) other;

		return ((this.getJudgeid() == castOther.getJudgeid()) || (this.getJudgeid() != null
				&& castOther.getJudgeid() != null && this.getJudgeid().equals(castOther.getJudgeid())))
				&& (this.getJudgeseq() == castOther.getJudgeseq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getJudgeid() == null ? 0 : this.getJudgeid().hashCode());
		result = 37 * result + this.getJudgeseq();
		return result;
	}

}
