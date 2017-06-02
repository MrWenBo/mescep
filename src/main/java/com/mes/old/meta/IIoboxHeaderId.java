package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * IIoboxHeaderId generated by hbm2java
 */
public class IIoboxHeaderId implements java.io.Serializable {

	private String invioid;
	private String turnBoxId;
	private String isCurrent;

	public IIoboxHeaderId() {
	}

	public IIoboxHeaderId(String invioid, String turnBoxId) {
		this.invioid = invioid;
		this.turnBoxId = turnBoxId;
	}

	public IIoboxHeaderId(String invioid, String turnBoxId, String isCurrent) {
		this.invioid = invioid;
		this.turnBoxId = turnBoxId;
		this.isCurrent = isCurrent;
	}

	public String getInvioid() {
		return this.invioid;
	}

	public void setInvioid(String invioid) {
		this.invioid = invioid;
	}

	public String getTurnBoxId() {
		return this.turnBoxId;
	}

	public void setTurnBoxId(String turnBoxId) {
		this.turnBoxId = turnBoxId;
	}

	public String getIsCurrent() {
		return this.isCurrent;
	}

	public void setIsCurrent(String isCurrent) {
		this.isCurrent = isCurrent;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IIoboxHeaderId))
			return false;
		IIoboxHeaderId castOther = (IIoboxHeaderId) other;

		return ((this.getInvioid() == castOther.getInvioid()) || (this.getInvioid() != null
				&& castOther.getInvioid() != null && this.getInvioid().equals(castOther.getInvioid())))
				&& ((this.getTurnBoxId() == castOther.getTurnBoxId()) || (this.getTurnBoxId() != null
						&& castOther.getTurnBoxId() != null && this.getTurnBoxId().equals(castOther.getTurnBoxId())))
				&& ((this.getIsCurrent() == castOther.getIsCurrent()) || (this.getIsCurrent() != null
						&& castOther.getIsCurrent() != null && this.getIsCurrent().equals(castOther.getIsCurrent())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getInvioid() == null ? 0 : this.getInvioid().hashCode());
		result = 37 * result + (getTurnBoxId() == null ? 0 : this.getTurnBoxId().hashCode());
		result = 37 * result + (getIsCurrent() == null ? 0 : this.getIsCurrent().hashCode());
		return result;
	}

}
