package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * SMain generated by hbm2java
 */
public class SMain implements java.io.Serializable {

	private BigDecimal mainid;
	private String mainname;
	private String mainurl;
	private Byte maintype;
	private Byte ispdf;

	public SMain() {
	}

	public SMain(BigDecimal mainid) {
		this.mainid = mainid;
	}

	public SMain(BigDecimal mainid, String mainname, String mainurl, Byte maintype, Byte ispdf) {
		this.mainid = mainid;
		this.mainname = mainname;
		this.mainurl = mainurl;
		this.maintype = maintype;
		this.ispdf = ispdf;
	}

	public BigDecimal getMainid() {
		return this.mainid;
	}

	public void setMainid(BigDecimal mainid) {
		this.mainid = mainid;
	}

	public String getMainname() {
		return this.mainname;
	}

	public void setMainname(String mainname) {
		this.mainname = mainname;
	}

	public String getMainurl() {
		return this.mainurl;
	}

	public void setMainurl(String mainurl) {
		this.mainurl = mainurl;
	}

	public Byte getMaintype() {
		return this.maintype;
	}

	public void setMaintype(Byte maintype) {
		this.maintype = maintype;
	}

	public Byte getIspdf() {
		return this.ispdf;
	}

	public void setIspdf(Byte ispdf) {
		this.ispdf = ispdf;
	}

}
