package com.asiainfo.jdk.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IHelloService {

	@WebMethod
	public String service(@WebParam(name="username") String name);
	
	@WebMethod(exclude=true)
	public void execute();
}
