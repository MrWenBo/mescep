package com.mes.cep.meta.materialModel;

import java.util.List;

/**
* @author Stephen·Wen  
* @email 872003894@qq.com
* @date 2017年4月18日
* @Chinesename 装配体
*/


public class MaterialAssembly {
	
	private List<MaterialClass> materials;

	public List<MaterialClass> getMaterials() {
		return materials;
	}

	public void setMaterials(List<MaterialClass> materials) {
		this.materials = materials;
	}
	
}
