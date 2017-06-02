package com.mes.cep.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.mes.cep.meta.materialModel.MaterialClass;

@Repository
public interface MaterialDao {
	
	@Select("select materialqty,maintenance_date from M_MATERIAL")
	public List<MaterialClass> gMaterials();
}
