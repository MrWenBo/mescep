package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * SCheckagain generated by hbm2java
 */
public class SCheckagain implements java.io.Serializable {

	private SCheckagainId id;
	private String ip;
	private byte[] password;
	private short amount;
	private Byte needcheck;

	public SCheckagain() {
	}

	public SCheckagain(SCheckagainId id, String ip, short amount) {
		this.id = id;
		this.ip = ip;
		this.amount = amount;
	}

	public SCheckagain(SCheckagainId id, String ip, byte[] password, short amount, Byte needcheck) {
		this.id = id;
		this.ip = ip;
		this.password = password;
		this.amount = amount;
		this.needcheck = needcheck;
	}

	public SCheckagainId getId() {
		return this.id;
	}

	public void setId(SCheckagainId id) {
		this.id = id;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public byte[] getPassword() {
		return this.password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public short getAmount() {
		return this.amount;
	}

	public void setAmount(short amount) {
		this.amount = amount;
	}

	public Byte getNeedcheck() {
		return this.needcheck;
	}

	public void setNeedcheck(Byte needcheck) {
		this.needcheck = needcheck;
	}

}