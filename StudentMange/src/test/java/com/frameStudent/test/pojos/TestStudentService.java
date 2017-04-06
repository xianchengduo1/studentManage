package com.frameStudent.test.pojos;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frameStudent.studentManage.beans.Student;
import com.frameStudent.studentManage.service.IStudentService;

public class TestStudentService {
	private ApplicationContext ac;
	private IStudentService Service;
    
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		Service = (IStudentService) ac.getBean("studentServiceImpl");
		
	}
	@Test
	public void testStudent(){
		Student user = new Student(1, "xiahua", "nan","19");
		try {
			/*Service.addStu(student);*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
