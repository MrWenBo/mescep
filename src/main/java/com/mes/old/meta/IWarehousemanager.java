package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * IWarehousemanager generated by hbm2java
 */
public class IWarehousemanager implements java.io.Serializable {

	private IWarehousemanagerId id;
	private String duty;
	private byte isdefault;

	public IWarehousemanager() {
	}

	public IWarehousemanager(IWarehousemanagerId id, byte isdefault) {
		this.id = id;
		this.isdefault = isdefault;
	}

	public IWarehousemanager(IWarehousemanagerId id, String duty, byte isdefault) {
		this.id = id;
		this.duty = duty;
		this.isdefault = isdefault;
	}

	public IWarehousemanagerId getId() {
		return this.id;
	}

	public void setId(IWarehousemanagerId id) {
		this.id = id;
	}

	public String getDuty() {
		return this.duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public byte getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(byte isdefault) {
		this.isdefault = isdefault;
	}

}