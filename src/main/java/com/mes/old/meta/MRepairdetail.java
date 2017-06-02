package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * MRepairdetail generated by hbm2java
 */
public class MRepairdetail implements java.io.Serializable {

	private MRepairdetailId id;
	private MRepairheader MRepairheader;
	private String defectdesc;
	private String materialsns;
	private String checker;
	private Date checktime;
	private String defectreason;
	private String repairmethod;
	private String creator;
	private Date createtime;
	private String notes;
	private BigDecimal repairqty;
	private String checkerprint;
	private String checkpic;
	private String fieldorder;
	private String materialusn;
	private String uniqueid;
	private String relationbilluid;

	public MRepairdetail() {
	}

	public MRepairdetail(MRepairdetailId id, MRepairheader MRepairheader) {
		this.id = id;
		this.MRepairheader = MRepairheader;
	}

	public MRepairdetail(MRepairdetailId id, MRepairheader MRepairheader, String defectdesc, String materialsns,
			String checker, Date checktime, String defectreason, String repairmethod, String creator, Date createtime,
			String notes, BigDecimal repairqty, String checkerprint, String checkpic, String fieldorder,
			String materialusn, String uniqueid, String relationbilluid) {
		this.id = id;
		this.MRepairheader = MRepairheader;
		this.defectdesc = defectdesc;
		this.materialsns = materialsns;
		this.checker = checker;
		this.checktime = checktime;
		this.defectreason = defectreason;
		this.repairmethod = repairmethod;
		this.creator = creator;
		this.createtime = createtime;
		this.notes = notes;
		this.repairqty = repairqty;
		this.checkerprint = checkerprint;
		this.checkpic = checkpic;
		this.fieldorder = fieldorder;
		this.materialusn = materialusn;
		this.uniqueid = uniqueid;
		this.relationbilluid = relationbilluid;
	}

	public MRepairdetailId getId() {
		return this.id;
	}

	public void setId(MRepairdetailId id) {
		this.id = id;
	}

	public MRepairheader getMRepairheader() {
		return this.MRepairheader;
	}

	public void setMRepairheader(MRepairheader MRepairheader) {
		this.MRepairheader = MRepairheader;
	}

	public String getDefectdesc() {
		return this.defectdesc;
	}

	public void setDefectdesc(String defectdesc) {
		this.defectdesc = defectdesc;
	}

	public String getMaterialsns() {
		return this.materialsns;
	}

	public void setMaterialsns(String materialsns) {
		this.materialsns = materialsns;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Date getChecktime() {
		return this.checktime;
	}

	public void setChecktime(Date checktime) {
		this.checktime = checktime;
	}

	public String getDefectreason() {
		return this.defectreason;
	}

	public void setDefectreason(String defectreason) {
		this.defectreason = defectreason;
	}

	public String getRepairmethod() {
		return this.repairmethod;
	}

	public void setRepairmethod(String repairmethod) {
		this.repairmethod = repairmethod;
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

	public BigDecimal getRepairqty() {
		return this.repairqty;
	}

	public void setRepairqty(BigDecimal repairqty) {
		this.repairqty = repairqty;
	}

	public String getCheckerprint() {
		return this.checkerprint;
	}

	public void setCheckerprint(String checkerprint) {
		this.checkerprint = checkerprint;
	}

	public String getCheckpic() {
		return this.checkpic;
	}

	public void setCheckpic(String checkpic) {
		this.checkpic = checkpic;
	}

	public String getFieldorder() {
		return this.fieldorder;
	}

	public void setFieldorder(String fieldorder) {
		this.fieldorder = fieldorder;
	}

	public String getMaterialusn() {
		return this.materialusn;
	}

	public void setMaterialusn(String materialusn) {
		this.materialusn = materialusn;
	}

	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getRelationbilluid() {
		return this.relationbilluid;
	}

	public void setRelationbilluid(String relationbilluid) {
		this.relationbilluid = relationbilluid;
	}

}
