package com.mes.cep.meta.personnelModel;

import com.bstek.urule.model.Label;

/**
* @author Stephen·Wen  
* @email 872003894@qq.com
* @date 2017年5月15日
* @Chinesename
*/

public class Role {
	@Label("角色id")
	private String id;
	@Label("角色描述")
	private String description;
	@Label("角色名称")
	private String name;
	@Label("备注")
	private String notes;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", description=" + description + ", name=" + name + ", notes=" + notes + "]";
	}
	
	

}
