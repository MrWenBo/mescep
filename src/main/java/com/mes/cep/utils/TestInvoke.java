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
		// 从Spring中获取KnowledgeService接口实例
		KnowledgeService service = (KnowledgeService) Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
		// 通过KnowledgeService接口获取指定的资源包"projectName/test123"
		KnowledgePackage knowledgePackage = service.getKnowledge("CEP/test");
		// 通过取到的KnowledgePackage对象创建KnowledgeSession对象
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
				System.out.println("数据为空");
				continue;
			}
		}

		endTime = System.currentTimeMillis();
		System.out.println("处理事件次数=" + i + "；系统运行时间=" + (endTime - startTime));
		// Event event = new Event();
		// event.setName("着火了");
		// 将业务数据对象Employee插入到KnowledgeSession中

		// 执行所有满足条件的规则
		((ConfigurableApplicationContext) context).close();
	}
}
