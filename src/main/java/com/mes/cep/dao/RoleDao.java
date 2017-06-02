package com.mes.cep.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.mes.cep.meta.personnelModel.Role;

/**
* @author Stephen¡¤Wen  
* @email 872003894@qq.com
* @date 2017Äê5ÔÂ15ÈÕ
* @Chinesename
*/
@Repository
public interface RoleDao {

	@Results({@Result(property = "id", column = "roleid"),
		 @Result(property = "name", column = "rolename"),
		 @Result(property = "description", column = "roledescription"),
		 @Result(property = "notes", column = "notes")
	})
	@Select("select * from s_role")
	public List<Role> gRoles();
}
