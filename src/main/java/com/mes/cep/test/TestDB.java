package com.mes.cep.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mes.cep.dao.EventDao;


public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		EventDao eventDao =context.getBean("eventDao", EventDao.class);
		Date date = new Date(System.currentTimeMillis());
//		Event event = new Event(1000, "�����¼�", date,date , "�����","wen","bo");
		eventDao.insertEvent(1000, "�����¼�", date,date , "�����","wen","bo");
		((ConfigurableApplicationContext) context).close();
		

		
		
	}

}
