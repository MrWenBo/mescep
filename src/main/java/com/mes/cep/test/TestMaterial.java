package com.mes.cep.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mes.cep.dao.MaterialDao;
import com.mes.cep.meta.materialModel.MaterialClass;

public class TestMaterial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		MaterialDao materialDao = context.getBean("materialDao", MaterialDao.class);
		List<MaterialClass> materials = materialDao.gMaterials();
		
		for (MaterialClass material : materials) {
			if (material!=null) {
				System.out.println(material.toString());
			}else {
				System.out.println("null");
				continue;
			}
		}
		System.out.println("----------------------------Êä³ö½áÊø-------------------------");
		((ConfigurableApplicationContext) context).close();

	}

}
