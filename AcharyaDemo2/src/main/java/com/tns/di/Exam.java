package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext c1=new ClassPathXmlApplicationContext("beans.xml");
		Student s=(Student)c1.getBean("student2");
		s.display();
}
}
