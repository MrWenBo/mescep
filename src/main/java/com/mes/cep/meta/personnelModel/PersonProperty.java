package com.mes.cep.meta.personnelModel;

import java.util.ArrayList;

import com.bstek.urule.model.Label;

/**
* @author Stephen·Wen  
* @email 872003894@qq.com
* @date 2017年4月24日
* @Chinesename 人员属性
*/


public class PersonProperty {
	@Label("编号")
	private String id;
	@Label("描述")
	private String description;
	@Label("值")
	private String value;
	@Label("价值衡量单位")
	private String valueUnitofMeasure;
	
	
}
