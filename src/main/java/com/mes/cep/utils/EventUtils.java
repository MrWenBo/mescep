package com.mes.cep.utils;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mes.cep.dao.EventDao;
import com.mes.cep.event.Event;

public class EventUtils {

	public List<Event> gEvents() {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		EventDao eventDao =context.getBean("eventDao", EventDao.class);
		List<Event> events = eventDao.gEvents();
		((ConfigurableApplicationContext) context).close();
		return events;
	}
	
	public void deleteEventById(int id) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		EventDao eventDao =context.getBean("eventDao", EventDao.class);
		eventDao.deleteById(id);
		((ConfigurableApplicationContext) context).close();
	}
}
