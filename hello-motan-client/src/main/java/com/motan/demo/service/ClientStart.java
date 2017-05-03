package com.motan.demo.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientStart {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:motan_demo_client.xml");
		HelloService service = (HelloService) ctx.getBean("helloService");
		System.out.println(service.sayHello("motan"));
	}
}
