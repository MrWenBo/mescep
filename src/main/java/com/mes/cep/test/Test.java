package com.mes.cep.test;

import java.util.List;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mes.cep.dao.AgvcarDao;
import com.mes.cep.dao.RoleDao;
import com.mes.cep.meta.Agvcar;
import com.mes.cep.meta.Location;
import com.mes.cep.meta.personnelModel.Role;

/**
* @author Stephen·Wen  
* @email 872003894@qq.com
* @date 2017年4月13日
* @Chinesename
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test =  new Test();
		test.getRoles();
		
	}
	
	public void getRoles() {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		RoleDao roleDao = context.getBean("roleDao",RoleDao.class);
		List<Role> roles = roleDao.gRoles();
		for (Role role : roles) {
			System.out.println(role.toString());
		}
		((ConfigurableApplicationContext) context).close();
	}
	
	public void testAgv() {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		AgvcarDao agvcarDao = context.getBean("agvcarDao", AgvcarDao.class);
		//agvcarDao.insertAGVCar(3, "3号车", 0.8, Location.AGV库.toString(), Location.立体库.toString(), Location.装配1.toString());
		//agvcarDao.insertAGVCar(4, "4号车", 0.95, Location.立体库.toString(), Location.装配1.toString(), Location.刀具库.toString());
		List<Agvcar> cars = agvcarDao.gCars();
		for (Agvcar agvCar : cars) {
			System.out.println(agvCar.toString());
		}
		((ConfigurableApplicationContext) context).close();
	}
	
	
	public void testClient() {
		try {
			
			//String url = "http://192.168.1.109:9000/mm/servlet/xfireServlet/helloService?wsdl";
			String url = "http://192.168.1.109:9000/mm/servlet/xfireServlet/shopLinkService?wsdl";
			JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
			org.apache.cxf.endpoint.Client client = clientFactory.createClient(url);
			Object[] result = client.invoke("getToolInvDetail", "996256");
			
			System.out.println(result[0].toString());
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
