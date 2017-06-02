package com.mes.cep.meta.materialModel;

import java.util.Date;

import com.bstek.urule.model.Label;


/**
 * @author Stephen��Wen
 * @email 872003894@qq.com
 * @Chinesename ��Ա
 * 
 */

public class MaterialClass {
	@Label("��������")
	private int materialqty;
	@Label("�����´��ͷ�ʱ��")
	private Date maintenance_date;
	
	
	public int getMaterialqty() {
		return materialqty;
	}
	public void setMaterialqty(int materialqty) {
		this.materialqty = materialqty;
	}
	public Date getMaintenance_date() {
		return maintenance_date;
	}
	public void setMaintenance_date(Date maintenance_date) {
		this.maintenance_date = maintenance_date;
	}
	@Override
	public String toString() {
		return "Material [materialqty=" + materialqty + ", maintenance_date=" + maintenance_date + "]";
	}
	
	

}
