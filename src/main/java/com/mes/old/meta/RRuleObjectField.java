package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * RRuleObjectField generated by hbm2java
 */
public class RRuleObjectField implements java.io.Serializable {

	private RRuleObjectFieldId id;
	private String fieldid;
	private String fieldalias;
	private String fieldname;
	private String fieldgetter;
	private String fieldmethod;
	private String fieldvaluetype;
	private String fieldprefix;
	private String fieldsuffix;
	private String uniqueid;

	public RRuleObjectField() {
	}

	public RRuleObjectField(RRuleObjectFieldId id) {
		this.id = id;
	}

	public RRuleObjectField(RRuleObjectFieldId id, String fieldid, String fieldalias, String fieldname,
			String fieldgetter, String fieldmethod, String fieldvaluetype, String fieldprefix, String fieldsuffix,
			String uniqueid) {
		this.id = id;
		this.fieldid = fieldid;
		this.fieldalias = fieldalias;
		this.fieldname = fieldname;
		this.fieldgetter = fieldgetter;
		this.fieldmethod = fieldmethod;
		this.fieldvaluetype = fieldvaluetype;
		this.fieldprefix = fieldprefix;
		this.fieldsuffix = fieldsuffix;
		this.uniqueid = uniqueid;
	}

	public RRuleObjectFieldId getId() {
		return this.id;
	}

	public void setId(RRuleObjectFieldId id) {
		this.id = id;
	}

	public String getFieldid() {
		return this.fieldid;
	}

	public void setFieldid(String fieldid) {
		this.fieldid = fieldid;
	}

	public String getFieldalias() {
		return this.fieldalias;
	}

	public void setFieldalias(String fieldalias) {
		this.fieldalias = fieldalias;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public String getFieldgetter() {
		return this.fieldgetter;
	}

	public void setFieldgetter(String fieldgetter) {
		this.fieldgetter = fieldgetter;
	}

	public String getFieldmethod() {
		return this.fieldmethod;
	}

	public void setFieldmethod(String fieldmethod) {
		this.fieldmethod = fieldmethod;
	}

	public String getFieldvaluetype() {
		return this.fieldvaluetype;
	}

	public void setFieldvaluetype(String fieldvaluetype) {
		this.fieldvaluetype = fieldvaluetype;
	}

	public String getFieldprefix() {
		return this.fieldprefix;
	}

	public void setFieldprefix(String fieldprefix) {
		this.fieldprefix = fieldprefix;
	}

	public String getFieldsuffix() {
		return this.fieldsuffix;
	}

	public void setFieldsuffix(String fieldsuffix) {
		this.fieldsuffix = fieldsuffix;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

}
