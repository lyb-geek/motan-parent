package com.motan.demo.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerStart {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:motan_demo_server.xml");
		System.out.println("server start...");
	}
}
