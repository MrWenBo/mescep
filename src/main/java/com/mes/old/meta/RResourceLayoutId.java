package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * RResourceLayoutId generated by hbm2java
 */
public class RResourceLayoutId implements java.io.Serializable {

	private long y;
	private long x;
	private String deptid;

	public RResourceLayoutId() {
	}

	public RResourceLayoutId(long y, long x, String deptid) {
		this.y = y;
		this.x = x;
		this.deptid = deptid;
	}

	public long getY() {
		return this.y;
	}

	public void setY(long y) {
		this.y = y;
	}

	public long getX() {
		return this.x;
	}

	public void setX(long x) {
		this.x = x;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RResourceLayoutId))
			return false;
		RResourceLayoutId castOther = (RResourceLayoutId) other;

		return (this.getY() == castOther.getY()) && (this.getX() == castOther.getX())
				&& ((this.getDeptid() == castOther.getDeptid()) || (this.getDeptid() != null
						&& castOther.getDeptid() != null && this.getDeptid().equals(castOther.getDeptid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getY();
		result = 37 * result + (int) this.getX();
		result = 37 * result + (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		return result;
	}

}
