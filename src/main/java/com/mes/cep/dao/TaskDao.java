package com.mes.cep.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.mes.cep.meta.Task;


@Repository
public interface TaskDao {
	@Results({ @Result(property = "taskid", column = "taskid"),
		 @Result(property = "taskname", column = "taskname"),
		 @Result(property = "model", column = "model"),
		 @Result(property = "dueqty", column = "dueqty"),
		 @Result(property = "demandfinish", column = "demandfinish"),
		 @Result(property = "priority", column = "priority")
	})
	@Select("select taskid,taskname,model,dueqty,demandfinish,priority from T_TASKS")
	public List<Task> gTasks();
}
