package com.asiainfo.springjaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.asiainfo.jaxws.model.User;

@WebService
public class CustomerServiceImpl implements ICustomerService {

	@WebMethod(exclude=true)
	@Override
	public void execute(String hello) {
		System.out.println("hello " + hello);
	}

	@WebMethod
	@Override
	public User getCustomer(String userid) {
		return new User(userid, "jaesonchen");
	}
	
	@WebMethod
	@Override
	public String getName(String userid) {
		return "chenzq";
	}
}
