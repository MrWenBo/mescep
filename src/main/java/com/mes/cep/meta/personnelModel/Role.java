package com.mes.cep.meta.personnelModel;

import com.bstek.urule.model.Label;

/**
* @author Stephen��Wen  
* @email 872003894@qq.com
* @date 2017��5��15��
* @Chinesename
*/

public class Role {
	@Label("��ɫid")
	private String id;
	@Label("��ɫ����")
	private String description;
	@Label("��ɫ����")
	private String name;
	@Label("��ע")
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
