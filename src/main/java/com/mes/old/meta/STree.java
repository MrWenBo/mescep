package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * STree generated by hbm2java
 */
public class STree implements java.io.Serializable {

	private BigDecimal treeid;
	private String treelabel;
	private String treetargetframe;
	private BigDecimal treeallrightclick;
	private String treexmlfileurl;
	private BigDecimal treewidth;
	private String treetag;
	private String custom;

	public STree() {
	}

	public STree(BigDecimal treeid) {
		this.treeid = treeid;
	}

	public STree(BigDecimal treeid, String treelabel, String treetargetframe, BigDecimal treeallrightclick,
			String treexmlfileurl, BigDecimal treewidth, String treetag, String custom) {
		this.treeid = treeid;
		this.treelabel = treelabel;
		this.treetargetframe = treetargetframe;
		this.treeallrightclick = treeallrightclick;
		this.treexmlfileurl = treexmlfileurl;
		this.treewidth = treewidth;
		this.treetag = treetag;
		this.custom = custom;
	}

	public BigDecimal getTreeid() {
		return this.treeid;
	}

	public void setTreeid(BigDecimal treeid) {
		this.treeid = treeid;
	}

	public String getTreelabel() {
		return this.treelabel;
	}

	public void setTreelabel(String treelabel) {
		this.treelabel = treelabel;
	}

	public String getTreetargetframe() {
		return this.treetargetframe;
	}

	public void setTreetargetframe(String treetargetframe) {
		this.treetargetframe = treetargetframe;
	}

	public BigDecimal getTreeallrightclick() {
		return this.treeallrightclick;
	}

	public void setTreeallrightclick(BigDecimal treeallrightclick) {
		this.treeallrightclick = treeallrightclick;
	}

	public String getTreexmlfileurl() {
		return this.treexmlfileurl;
	}

	public void setTreexmlfileurl(String treexmlfileurl) {
		this.treexmlfileurl = treexmlfileurl;
	}

	public BigDecimal getTreewidth() {
		return this.treewidth;
	}

	public void setTreewidth(BigDecimal treewidth) {
		this.treewidth = treewidth;
	}

	public String getTreetag() {
		return this.treetag;
	}

	public void setTreetag(String treetag) {
		this.treetag = treetag;
	}

	public String getCustom() {
		return this.custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

}