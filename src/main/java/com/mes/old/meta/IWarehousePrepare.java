package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * IWarehousePrepare generated by hbm2java
 */
public class IWarehousePrepare implements java.io.Serializable {

	private IWarehousePrepareId id;
	private String isdefault;
	private String uniqueid;

	public IWarehousePrepare() {
	}

	public IWarehousePrepare(IWarehousePrepareId id) {
		this.id = id;
	}

	public IWarehousePrepare(IWarehousePrepareId id, String isdefault, String uniqueid) {
		this.id = id;
		this.isdefault = isdefault;
		this.uniqueid = uniqueid;
	}

	public IWarehousePrepareId getId() {
		return this.id;
	}

	public void setId(IWarehousePrepareId id) {
		this.id = id;
	}

	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

}
