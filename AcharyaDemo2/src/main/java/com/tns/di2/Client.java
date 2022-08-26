package com.tns.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext cl=new ClassPathXmlApplicationContext("beans.xml");
		Student s=(Student)cl.getBean("student1");
		s.cheating();
		AnotherStudent s1=(AnotherStudent)cl.getBean("student2");
		s.cheating();
}
}