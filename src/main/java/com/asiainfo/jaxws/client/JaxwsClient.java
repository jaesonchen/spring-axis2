package com.asiainfo.jaxws.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.jaxws.model.User;
import com.asiainfo.jaxws.service.IUserService;

/**
 * TODO
 * 
 * @author       zq
 * @date         2018年3月21日  下午4:41:09
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-jaxws-client-configure.xml"})
public class JaxwsClient {

    @Autowired
    private IUserService service;
    
    @Test
    public void execute() {
        
        User user = service.getUser("1005");
        System.out.println(user.getUserId() + ", " + user.getUserName());
        
        user = new User();
        user.setUserId("1006");
        user.setUserName("chenzq");
        service.saveUser(user);
    }
}
