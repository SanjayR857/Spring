package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
public static void main(String[] args) {
	ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
 Sim s=c.getBean("sim",Sim.class);
 s.date();
 s.calling();
}
}
