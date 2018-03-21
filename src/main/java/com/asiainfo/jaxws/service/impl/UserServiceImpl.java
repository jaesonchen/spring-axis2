package com.asiainfo.jaxws.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.asiainfo.jaxws.model.User;
import com.asiainfo.jaxws.service.IUserService;

/**
 * 
 * @author       zq
 * @date         2018年3月21日  下午4:58:40
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
@Component
@WebService(serviceName = "UserService", endpointInterface = "com.asiainfo.jaxws.service.IUserService")
public class UserServiceImpl implements IUserService {

    @WebMethod
	@Override
	public User getUser(String userId) {
		return new User(userId, "jaeson");
	}

    @WebMethod
	@Override
	public void saveUser(User user) {
		System.out.println("save user(id=" + user.getUserId() + ", name=" + user.getUserName() + ")");
	}
}
