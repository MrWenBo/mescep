package com.mes.cep.meta.personnelModel;

import com.bstek.urule.model.Label;

/**
* @author Stephen��Wen  
* @email 872003894@qq.com
* @date 2017��4��19��
* @Chinesename Ա��
*/
public class PersonnelClass extends Person{
	@Label("��������")
	private String workSkill;
	
	

	public String getWorkSkill() {
		return workSkill;
	}

	public void setWorkSkill(String workSkill) {
		this.workSkill = workSkill;
	}
	
	
}
