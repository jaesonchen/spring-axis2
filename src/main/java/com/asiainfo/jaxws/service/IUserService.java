package com.asiainfo.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.asiainfo.jaxws.model.User;

@WebService(serviceName="UserService")
public interface IUserService {

	@WebMethod
	public User getUser(@WebParam(name="userId") String userId);
	
	@WebMethod
	public void saveUser(@WebParam(name="user") User user);
}
