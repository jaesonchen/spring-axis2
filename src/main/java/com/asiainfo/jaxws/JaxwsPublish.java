package com.asiainfo.jaxws;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 需要在没有axis2 包的环境下运行
 * 
 * @author       zq
 * @date         2018年3月21日  下午5:08:11
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class JaxwsPublish {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"classpath:application-jaxws-configure.xml"});
		System.out.println("jaxws server startup!");
		System.in.read();
		ac.close();
	}
}
