package com.asiainfo.axis2.client.async;

import com.asiainfo.axis2.client.stub.HelloServiceCallbackHandler;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年5月30日  下午9:10:52
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class HelloServiceCallback extends HelloServiceCallbackHandler {

	@Override
	public void receiveResultgreeting(com.asiainfo.axis2.client.stub.HelloServiceStub.GreetingResponse result) {
		System.out.println(result.get_return());
	}
	
	@Override
	public void receiveResulthello() {
		//never invoked because of void return
		System.out.println("return void");
    }
}
