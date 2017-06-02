package com.mes.cep.action;

import java.util.Date;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;
import com.mes.cep.utils.EventUtils;

public class Action {
	@ActionId("���Է�����helloKey")
	public String  hello(String username) {
		System.out.println("Hello"+username);
		return "Hello"+username;
	}
	
	@ExposeAction("���Է����������ʺ�")
	public void sayHello() {
		System.out.println("Hello World");
	}
	
	@ExposeAction("���Է������ӷ�����")
	public int testAnd(int a,int b) {
		return a+b;
	}
	
	@ExposeAction("�������ݿ�")
	public int updataDB() {
		
		return 0;
	}
	
	@ExposeAction("֪ͨ�����Ա")
	public void sendMessege() {
		
	}
	
	@ExposeAction("Ԥ��")
	public void Alert() {
		
	}
	@ExposeAction("�´�ָ��")
	public void giveInstructions() {
		
	}
	
	@ExposeAction("����")
	public void schedule() {
		System.out.println("--------------��ʼִ�д�����ĵ��ȷ���----------------------");
	}
	
	@ExposeAction("��¼")
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
	
		
		System.out.println("------------------------�����¼���¼------------------------");
	}
	
	@ExposeAction("�ӳ�--ִ��")
	public void delayedExecution(Date date) {
		
	}
	@ExposeAction("ɾ���Ѵ����¼�")
	public void delete(int id) {
		EventUtils eUtils = new EventUtils();
		eUtils.deleteEventById(id);
	}
	
	@ExposeAction("��XFire������Ϣ")
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
