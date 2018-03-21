package com.asiainfo.springjaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.asiainfo.jaxws.model.User;

@WebService
public interface ICustomerService {

	@WebMethod(exclude=true)
	public void execute(String hello);
	
	@WebMethod
	public String getName(String userid);
	
	@WebMethod
	public User getCustomer(String userid);
}
