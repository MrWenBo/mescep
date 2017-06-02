package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * IWarehouse generated by hbm2java
 */
public class IWarehouse implements java.io.Serializable {

	private String warehouseid;
	private String warehousename;
	private String parentwarehouseid;
	private String warehousetype;
	private String manager;
	private String country;
	private String province;
	private String city;
	private String address;
	private String zipcode;
	private String deptid;
	private Byte freezed;
	private String notes;
	private String shortening;
	private Long ioPriority;
	private String uniqueid;

	public IWarehouse() {
	}

	public IWarehouse(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public IWarehouse(String warehouseid, String warehousename, String parentwarehouseid, String warehousetype,
			String manager, String country, String province, String city, String address, String zipcode, String deptid,
			Byte freezed, String notes, String shortening, Long ioPriority, String uniqueid) {
		this.warehouseid = warehouseid;
		this.warehousename = warehousename;
		this.parentwarehouseid = parentwarehouseid;
		this.warehousetype = warehousetype;
		this.manager = manager;
		this.country = country;
		this.province = province;
		this.city = city;
		this.address = address;
		this.zipcode = zipcode;
		this.deptid = deptid;
		this.freezed = freezed;
		this.notes = notes;
		this.shortening = shortening;
		this.ioPriority = ioPriority;
		this.uniqueid = uniqueid;
	}

	public String getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}

	public String getWarehousename() {
		return this.warehousename;
	}

	public void setWarehousename(String warehousename) {
		this.warehousename = warehousename;
	}

	public String getParentwarehouseid() {
		return this.parentwarehouseid;
	}

	public void setParentwarehouseid(String parentwarehouseid) {
		this.parentwarehouseid = parentwarehouseid;
	}

	public String getWarehousetype() {
		return this.warehousetype;
	}

	public void setWarehousetype(String warehousetype) {
		this.warehousetype = warehousetype;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public Byte getFreezed() {
		return this.freezed;
	}

	public void setFreezed(Byte freezed) {
		this.freezed = freezed;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getShortening() {
		return this.shortening;
	}

	public void setShortening(String shortening) {
		this.shortening = shortening;
	}

	public Long getIoPriority() {
		return this.ioPriority;
	}

	public void setIoPriority(Long ioPriority) {
		this.ioPriority = ioPriority;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

}