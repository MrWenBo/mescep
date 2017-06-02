package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * SOperation generated by hbm2java
 */
public class SOperation implements java.io.Serializable {

	private String operationId;
	private String operationType;
	private String operationName;
	private String requestUrl;
	private String description;
	private String operationFunc;
	private Byte logLevel;
	private String operationKey;
	private String operationKeysql;
	private String creator;
	private Date createtime;
	private String moduleName;
	private Long operationUbound;

	public SOperation() {
	}

	public SOperation(String operationId) {
		this.operationId = operationId;
	}

	public SOperation(String operationId, String operationType, String operationName, String requestUrl,
			String description, String operationFunc, Byte logLevel, String operationKey, String operationKeysql,
			String creator, Date createtime, String moduleName, Long operationUbound) {
		this.operationId = operationId;
		this.operationType = operationType;
		this.operationName = operationName;
		this.requestUrl = requestUrl;
		this.description = description;
		this.operationFunc = operationFunc;
		this.logLevel = logLevel;
		this.operationKey = operationKey;
		this.operationKeysql = operationKeysql;
		this.creator = creator;
		this.createtime = createtime;
		this.moduleName = moduleName;
		this.operationUbound = operationUbound;
	}

	public String getOperationId() {
		return this.operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getOperationType() {
		return this.operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOperationName() {
		return this.operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getRequestUrl() {
		return this.requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOperationFunc() {
		return this.operationFunc;
	}

	public void setOperationFunc(String operationFunc) {
		this.operationFunc = operationFunc;
	}

	public Byte getLogLevel() {
		return this.logLevel;
	}

	public void setLogLevel(Byte logLevel) {
		this.logLevel = logLevel;
	}

	public String getOperationKey() {
		return this.operationKey;
	}

	public void setOperationKey(String operationKey) {
		this.operationKey = operationKey;
	}

	public String getOperationKeysql() {
		return this.operationKeysql;
	}

	public void setOperationKeysql(String operationKeysql) {
		this.operationKeysql = operationKeysql;
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

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Long getOperationUbound() {
		return this.operationUbound;
	}

	public void setOperationUbound(Long operationUbound) {
		this.operationUbound = operationUbound;
	}

}