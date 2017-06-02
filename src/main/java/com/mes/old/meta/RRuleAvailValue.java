package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * RRuleAvailValue generated by hbm2java
 */
public class RRuleAvailValue implements java.io.Serializable {

	private String uniqueid;
	private String objectuid;
	private String itemtype;
	private String original;
	private String fielduid;
	private String methoduid;
	private String paramtype;
	private String paramvalue;
	private String paramvaluedesc;

	public RRuleAvailValue() {
	}

	public RRuleAvailValue(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public RRuleAvailValue(String uniqueid, String objectuid, String itemtype, String original, String fielduid,
			String methoduid, String paramtype, String paramvalue, String paramvaluedesc) {
		this.uniqueid = uniqueid;
		this.objectuid = objectuid;
		this.itemtype = itemtype;
		this.original = original;
		this.fielduid = fielduid;
		this.methoduid = methoduid;
		this.paramtype = paramtype;
		this.paramvalue = paramvalue;
		this.paramvaluedesc = paramvaluedesc;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getObjectuid() {
		return this.objectuid;
	}

	public void setObjectuid(String objectuid) {
		this.objectuid = objectuid;
	}

	public String getItemtype() {
		return this.itemtype;
	}

	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}

	public String getOriginal() {
		return this.original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public String getFielduid() {
		return this.fielduid;
	}

	public void setFielduid(String fielduid) {
		this.fielduid = fielduid;
	}

	public String getMethoduid() {
		return this.methoduid;
	}

	public void setMethoduid(String methoduid) {
		this.methoduid = methoduid;
	}

	public String getParamtype() {
		return this.paramtype;
	}

	public void setParamtype(String paramtype) {
		this.paramtype = paramtype;
	}

	public String getParamvalue() {
		return this.paramvalue;
	}

	public void setParamvalue(String paramvalue) {
		this.paramvalue = paramvalue;
	}

	public String getParamvaluedesc() {
		return this.paramvaluedesc;
	}

	public void setParamvaluedesc(String paramvaluedesc) {
		this.paramvaluedesc = paramvaluedesc;
	}

}