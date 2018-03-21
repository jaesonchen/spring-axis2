package com.asiainfo.jdk.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.asiainfo.jdk.service.IHelloService;

@WebService(serviceName = "HelloService", endpointInterface = "com.asiainfo.jdk.service.IHelloService")
public class HelloServiceImpl implements IHelloService {

	@WebMethod
	@Override
	public String service(String name) {
		return "Hello " + name;
	}

	@WebMethod(exclude=true)
	@Override
	public void execute() {
		System.out.println("execute......");
	}
}
