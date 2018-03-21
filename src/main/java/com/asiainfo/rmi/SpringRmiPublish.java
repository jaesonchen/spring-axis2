package com.asiainfo.rmi;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRmiPublish {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"classpath:application-rmi-configure.xml"});
		System.out.println("rmi server startup!");
		System.in.read();
		ac.close();
	}
}
