package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * RSupplierId generated by hbm2java
 */
public class RSupplierId implements java.io.Serializable {

	private String supplierid;
	private String suppliername;
	private String suppliertype;
	private String property;
	private String runscope;
	private String capacity;
	private String contacter;
	private String address;
	private String creator;
	private Date createtime;
	private String notes;
	private String alias;
	private String telephone;
	private String supplieruid;

	public RSupplierId() {
	}

	public RSupplierId(String supplierid, String suppliername) {
		this.supplierid = supplierid;
		this.suppliername = suppliername;
	}

	public RSupplierId(String supplierid, String suppliername, String suppliertype, String property, String runscope,
			String capacity, String contacter, String address, String creator, Date createtime, String notes,
			String alias, String telephone, String supplieruid) {
		this.supplierid = supplierid;
		this.suppliername = suppliername;
		this.suppliertype = suppliertype;
		this.property = property;
		this.runscope = runscope;
		this.capacity = capacity;
		this.contacter = contacter;
		this.address = address;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
		this.alias = alias;
		this.telephone = telephone;
		this.supplieruid = supplieruid;
	}

	public String getSupplierid() {
		return this.supplierid;
	}

	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}

	public String getSuppliername() {
		return this.suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public String getSuppliertype() {
		return this.suppliertype;
	}

	public void setSuppliertype(String suppliertype) {
		this.suppliertype = suppliertype;
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getRunscope() {
		return this.runscope;
	}

	public void setRunscope(String runscope) {
		this.runscope = runscope;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getContacter() {
		return this.contacter;
	}

	public void setContacter(String contacter) {
		this.contacter = contacter;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSupplieruid() {
		return this.supplieruid;
	}

	public void setSupplieruid(String supplieruid) {
		this.supplieruid = supplieruid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RSupplierId))
			return false;
		RSupplierId castOther = (RSupplierId) other;

		return ((this.getSupplierid() == castOther.getSupplierid()) || (this.getSupplierid() != null
				&& castOther.getSupplierid() != null && this.getSupplierid().equals(castOther.getSupplierid())))
				&& ((this.getSuppliername() == castOther.getSuppliername())
						|| (this.getSuppliername() != null && castOther.getSuppliername() != null
								&& this.getSuppliername().equals(castOther.getSuppliername())))
				&& ((this.getSuppliertype() == castOther.getSuppliertype())
						|| (this.getSuppliertype() != null && castOther.getSuppliertype() != null
								&& this.getSuppliertype().equals(castOther.getSuppliertype())))
				&& ((this.getProperty() == castOther.getProperty()) || (this.getProperty() != null
						&& castOther.getProperty() != null && this.getProperty().equals(castOther.getProperty())))
				&& ((this.getRunscope() == castOther.getRunscope()) || (this.getRunscope() != null
						&& castOther.getRunscope() != null && this.getRunscope().equals(castOther.getRunscope())))
				&& ((this.getCapacity() == castOther.getCapacity()) || (this.getCapacity() != null
						&& castOther.getCapacity() != null && this.getCapacity().equals(castOther.getCapacity())))
				&& ((this.getContacter() == castOther.getContacter()) || (this.getContacter() != null
						&& castOther.getContacter() != null && this.getContacter().equals(castOther.getContacter())))
				&& ((this.getAddress() == castOther.getAddress()) || (this.getAddress() != null
						&& castOther.getAddress() != null && this.getAddress().equals(castOther.getAddress())))
				&& ((this.getCreator() == castOther.getCreator()) || (this.getCreator() != null
						&& castOther.getCreator() != null && this.getCreator().equals(castOther.getCreator())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this.getCreatetime() != null
						&& castOther.getCreatetime() != null && this.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getAlias() == castOther.getAlias()) || (this.getAlias() != null
						&& castOther.getAlias() != null && this.getAlias().equals(castOther.getAlias())))
				&& ((this.getTelephone() == castOther.getTelephone()) || (this.getTelephone() != null
						&& castOther.getTelephone() != null && this.getTelephone().equals(castOther.getTelephone())))
				&& ((this.getSupplieruid() == castOther.getSupplieruid())
						|| (this.getSupplieruid() != null && castOther.getSupplieruid() != null
								&& this.getSupplieruid().equals(castOther.getSupplieruid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSupplierid() == null ? 0 : this.getSupplierid().hashCode());
		result = 37 * result + (getSuppliername() == null ? 0 : this.getSuppliername().hashCode());
		result = 37 * result + (getSuppliertype() == null ? 0 : this.getSuppliertype().hashCode());
		result = 37 * result + (getProperty() == null ? 0 : this.getProperty().hashCode());
		result = 37 * result + (getRunscope() == null ? 0 : this.getRunscope().hashCode());
		result = 37 * result + (getCapacity() == null ? 0 : this.getCapacity().hashCode());
		result = 37 * result + (getContacter() == null ? 0 : this.getContacter().hashCode());
		result = 37 * result + (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37 * result + (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getAlias() == null ? 0 : this.getAlias().hashCode());
		result = 37 * result + (getTelephone() == null ? 0 : this.getTelephone().hashCode());
		result = 37 * result + (getSupplieruid() == null ? 0 : this.getSupplieruid().hashCode());
		return result;
	}

}
