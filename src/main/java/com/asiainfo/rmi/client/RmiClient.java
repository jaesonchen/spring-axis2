package com.asiainfo.rmi.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.rmi.model.Account;
import com.asiainfo.rmi.service.IAccountService;

/**
 * TODO
 * 
 * @author       zq
 * @date         2018年3月21日  下午4:28:54
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-rmi-client-configure.xml"})
public class RmiClient {

    @Autowired
    private IAccountService service;
    
    @Test
    public void execute() {
        
        this.service.insertAccount(new Account("chenzq"));
        System.out.println("get account from remote: " + this.service.getAccounts("jaesonchen").get(0).getName());
    }
}
