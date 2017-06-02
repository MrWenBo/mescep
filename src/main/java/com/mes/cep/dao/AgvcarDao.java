package com.mes.cep.dao;


import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.mes.cep.meta.Agvcar;
import com.mes.cep.meta.Location;

/**
* @author Stephen¡¤Wen  
* @email 872003894@qq.com
* @date 2017Äê4ÔÂ13ÈÕ
* @Chinesename
*/
@Repository
public interface AgvcarDao {
	@Results({ @Result(property = "id", column = "id"),
		 @Result(property = "name", column = "name"),
		 @Result(property = "electricity", column = "electricity"),
		 @Result(property = "departure", column = "departure"),
		 @Result(property = "destination", column = "destination"),
		 @Result(property = "location", column = "location"),
	})
	@Insert("insert into AGVCar(id,name,electricity,departure,destination,location) "
			+ "values(#{id},#{name},#{electricity},#{departure},#{destination},#{location})")
	public void insertAGVCar(@Param("id")Integer id,@Param("name")String name,@Param("electricity")Double electricity,
			@Param("departure")String departure,@Param("destination")String destination,@Param("location")String location);
	
	@Select("select * from AGVCar")
	public List<Agvcar> gCars();
}
