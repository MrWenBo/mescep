package com.mes.cep.meta.personnelModel;

import com.bstek.urule.model.Label;

/**
* @author Stephen·Wen  
* @email 872003894@qq.com
* @date 2017年4月19日
* @Chinesename 员工
*/
public class PersonnelClass extends Person{
	@Label("工作技能")
	private String workSkill;
	
	

	public String getWorkSkill() {
		return workSkill;
	}

	public void setWorkSkill(String workSkill) {
		this.workSkill = workSkill;
	}
	
	
}
