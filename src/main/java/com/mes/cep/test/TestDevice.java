package com.mes.cep.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mes.cep.dao.DeviceDao;
import com.mes.cep.meta.Device;

public class TestDevice {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		DeviceDao deviceDao = context.getBean("deviceDao", DeviceDao.class);
		List<Device> devices = deviceDao.gDevices();
		
		for (Device device : devices) {
			if (device != null) {
				System.out.println(device.toString());
			}else{
				System.out.println("ø’÷∏’Î");
				continue;
			}
		
		}
		((ConfigurableApplicationContext) context).close();
	}
}
