package com.mes.cep.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.mes.cep.meta.Employee;

@Repository
public interface EmployeeDao {
	@Results({ @Result(property = "employeename", column = "employeename"),
		 @Result(property = "positionid", column = "positionid"),
		 @Result(property = "employeetype", column = "employeetype")
	})
	@Select("select employeename,positionid,employeetype from r_employee")
	public List<Employee> gEmployees();

}
