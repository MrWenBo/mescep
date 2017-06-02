package com.mes.cep.action;

import java.util.Date;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;
import com.mes.cep.utils.EventUtils;

public class Action {
	@ActionId("测试方法：helloKey")
	public String  hello(String username) {
		System.out.println("Hello"+username);
		return "Hello"+username;
	}
	
	@ExposeAction("测试方法：向大家问好")
	public void sayHello() {
		System.out.println("Hello World");
	}
	
	@ExposeAction("测试方法：加法运算")
	public int testAnd(int a,int b) {
		return a+b;
	}
	
	@ExposeAction("更新数据库")
	public int updataDB() {
		
		return 0;
	}
	
	@ExposeAction("通知相关人员")
	public void sendMessege() {
		
	}
	
	@ExposeAction("预警")
	public void Alert() {
		
	}
	@ExposeAction("下达指令")
	public void giveInstructions() {
		
	}
	
	@ExposeAction("调度")
	public void schedule() {
		System.out.println("--------------开始执行此任务的调度方法----------------------");
	}
	
	@ExposeAction("记录")
	public void record() {
		try {
			String url = "http://192.168.1.109:9000/mm/servlet/xfireServlet/helloService?wsdl";
			JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
			org.apache.cxf.endpoint.Client client = clientFactory.createClient(url);
			Object[] result = client.invoke("hello", "Joe");
			System.out.println(result[0]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		System.out.println("------------------------动作事件记录------------------------");
	}
	
	@ExposeAction("延迟--执行")
	public void delayedExecution(Date date) {
		
	}
	@ExposeAction("删除已处理事件")
	public void delete(int id) {
		EventUtils eUtils = new EventUtils();
		eUtils.deleteEventById(id);
	}
	
	@ExposeAction("给XFire发条消息")
	public void hellotoXfire(String messege) {
		try {
			String url = "http://192.168.1.109:9000/mm/servlet/xfireServlet/helloService?wsdl";
			JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
			org.apache.cxf.endpoint.Client client = clientFactory.createClient(url);
			Object[] result = client.invoke("hello", messege);
			System.out.println(result[0]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
