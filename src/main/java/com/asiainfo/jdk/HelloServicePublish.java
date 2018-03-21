package com.asiainfo.jdk;

import javax.xml.ws.Endpoint;

import com.asiainfo.jdk.service.IHelloService;
import com.asiainfo.jdk.service.impl.HelloServiceImpl;

/**
 * 需要在没有axis2 包的环境下运行
 * 
 * @author       zq
 * @date         2018年3月21日  下午5:06:59
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class HelloServicePublish {

	public static void main(String[] args) {
		
		String address = "http://127.0.0.1:8080/services";
		//使用Endpoint类提供的publish方法发布WebService，发布时要保证使用的端口号没有被其他应用程序占用
		IHelloService service = new HelloServiceImpl();
		Endpoint.publish(address, service);
		System.out.println("发布webservice成功!");
	}
}
