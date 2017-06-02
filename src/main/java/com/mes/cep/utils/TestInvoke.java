package com.mes.cep.utils;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bstek.urule.Utils;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.mes.cep.dao.TaskDao;
import com.mes.cep.meta.Task;

public class TestInvoke {

	public void doTest() throws Exception {
		// ��Spring�л�ȡKnowledgeService�ӿ�ʵ��
		KnowledgeService service = (KnowledgeService) Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
		// ͨ��KnowledgeService�ӿڻ�ȡָ������Դ��"projectName/test123"
		KnowledgePackage knowledgePackage = service.getKnowledge("CEP/test");
		// ͨ��ȡ����KnowledgePackage���󴴽�KnowledgeSession����
		KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		TaskDao taskDao = context.getBean("taskDao", TaskDao.class);
		List<Task> tasks = taskDao.gTasks();

		long startTime = 0;
		long endTime = 0;
		long i = 0;
		startTime = System.currentTimeMillis();
		for (Task task : tasks) {

			i++;
			if (i >= 100) {
				break;
			}
			if (task != null) {
				session.insert(task);
				session.fireRules();
			} else {
				System.out.println("����Ϊ��");
				continue;
			}
		}

		endTime = System.currentTimeMillis();
		System.out.println("�����¼�����=" + i + "��ϵͳ����ʱ��=" + (endTime - startTime));
		// Event event = new Event();
		// event.setName("�Ż���");
		// ��ҵ�����ݶ���Employee���뵽KnowledgeSession��

		// ִ���������������Ĺ���
		((ConfigurableApplicationContext) context).close();
	}
}
