package com.mes.cep.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.mes.cep.event.Event;

@Repository
public interface EventDao {

	@Results({ @Result(property = "id", column = "id"),
		 @Result(property = "name", column = "name"),
		 @Result(property = "startTime", column = "startTime"),
		 @Result(property = "endTime", column = "endTime"),
		 @Result(property = "location", column = "location"),
		 @Result(property = "past", column = "past"),
		 @Result(property = "future", column = "future")
	})
	@Insert("insert into cep_event(id,name,startTime,endTime,location,past,future) "
			+ "values(#{id},#{name},#{startTime},#{endTime},#{location},#{past},#{future})")
	public void insertEvent(@Param("id")int id,@Param("name")String name,@Param("startTime")Date startTime,
			@Param("endTime")Date endTime,@Param("location")String location,@Param("past")String past,@Param("future")String future);
	
	@Results({ @Result(property = "id", column = "id"),
		 @Result(property = "name", column = "name"),
		 @Result(property = "startTime", column = "startTime"),
		 @Result(property = "endTime", column = "endTime"),
		 @Result(property = "location", column = "location"),
		 @Result(property = "past", column = "past"),
		 @Result(property = "future", column = "future")
	})
	@Select("select * from cep_event")
	public List<Event> gEvents();
	
	@Results({ @Result(property = "id", column = "id"),
		 @Result(property = "name", column = "name"),
		 @Result(property = "startTime", column = "startTime"),
		 @Result(property = "endTime", column = "endTime"),
		 @Result(property = "location", column = "location"),
		 @Result(property = "past", column = "past"),
		 @Result(property = "future", column = "future")
	})
	@Delete("delete from cep_event where id=#{id} ")
	public void deleteById(@Param("id")int id);
}
