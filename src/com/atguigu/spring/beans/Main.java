package com.atguigu.spring.beans;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName("atguigu");
		//1.创建Spring的IOC容器
		//ApplicationContext代表IOC容器
		
		//ClassPathXmlApplicationContext：是ApplicationContext接口的实现类，该实现类从类路径下加载xml配置文件
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取Bean实例
		//利用id定位到IOC容器中的bean
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		System.out.println(helloWorld);
		helloWorld.hello();
		
		Car car =(Car) ctx.getBean("car");
		System.out.println(car.toString());
		
		car = (Car) ctx.getBean("car2");
		System.out.println(car.toString());
	}
}
