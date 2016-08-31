package com.atguigu.spring.beans;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName("atguigu");
		//1.����Spring��IOC����
		//ApplicationContext����IOC����
		
		//ClassPathXmlApplicationContext����ApplicationContext�ӿڵ�ʵ���࣬��ʵ�������·���¼���xml�����ļ�
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��IOC�����л�ȡBeanʵ��
		//����id��λ��IOC�����е�bean
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		System.out.println(helloWorld);
		helloWorld.hello();
		
		Car car =(Car) ctx.getBean("car");
		System.out.println(car.toString());
		
		car = (Car) ctx.getBean("car2");
		System.out.println(car.toString());
	}
}
