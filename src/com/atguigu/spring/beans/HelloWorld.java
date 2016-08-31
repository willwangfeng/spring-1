package com.atguigu.spring.beans;

public class HelloWorld {

	private String name;
	/**
	 * 
	 * @param name
	 */
	public void setName2(String name) {
		this.name = name;
	}
	/**
	 * 
	 */
	public void hello(){
		System.out.println("Hello:" + name);
	}
}
