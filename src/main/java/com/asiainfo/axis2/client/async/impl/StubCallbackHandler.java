package com.asiainfo.axis2.client.async.impl;

import com.asiainfo.axis2.client.async.HelloServiceCallbackHandler;
import com.asiainfo.axis2.client.async.HelloServiceStub.GetUserResponse;
import com.asiainfo.axis2.client.async.HelloServiceStub.GreetingResponse;

/**
 * TODO
 * 
 * @author       zq
 * @date         2018年3月21日  下午4:02:08
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class StubCallbackHandler extends HelloServiceCallbackHandler {

    @Override
    public void receiveResultgreeting(GreetingResponse result) {

        System.out.println("receiveResultgreeting:" + result.get_return());
        super.receiveResultgreeting(result);
    }

    @Override
    public void receiveResultgetUser(GetUserResponse result) {

        System.out.println("receiveResultgetUser:" +  result.get_return().getUsername());
        super.receiveResultgetUser(result);
    }

    @Override
    public void receiveResulthello() {
        
        System.out.println("receiveResulthello");
        super.receiveResulthello();
    }
}
