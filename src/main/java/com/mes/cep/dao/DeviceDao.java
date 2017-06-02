package com.mes.cep.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.mes.cep.meta.Device;

@Repository
public interface DeviceDao {
	
	@Select("select resname,device_table_count from R_RESOURCE")
	public List<Device> gDevices();
}
