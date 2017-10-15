package com.asiainfo.axis2.client.async;

import javax.xml.namespace.QName;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.asiainfo.axis2.client.stub.HelloServiceStub;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年5月30日  下午8:56:27
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class AsyncClient {

	public static String address = "http://localhost:8080/spring-axis2/services/helloService";
	
	public static void main(String[] args) throws Exception {

		//async1();
		async2();
	}
	
	public static void async1() throws Exception {
        //使用RPC方式调用WebService
        RPCServiceClient client = new RPCServiceClient();
        Options option = client.getOptions();
          
        //指定调用的URL
        EndpointReference reference = new EndpointReference(address);
        option.setTo(reference);

        /* 
         * http://ws.apache.org/axis2 为默认的（无package的情况）命名空间， 
         * 如果有包名，则为 http://service.axis2.asiainfo.com ,包名倒过来即可,
         * method为方法名称 
         */  
        QName qname = new QName("http://service.axis2.asiainfo.com", "greeting");
          
        //调用远程方法,并指定方法参数
        client.invokeNonBlocking(qname, new Object[] {"world"}, new AsyncHandler());
        System.out.println("async invoke greeting");
        System.in.read();
	}
	
	public static void async2() throws Exception {
		HelloServiceStub service = new HelloServiceStub("http://localhost:8080/spring-axis2/services/helloService");
		HelloServiceStub.Greeting greeting = new HelloServiceStub.Greeting();
		greeting.setName("world");
		service.startgreeting(greeting, new HelloServiceCallback());
		System.out.println("async invoke greeting");
		
		service.starthello(new HelloServiceStub.Hello(), new HelloServiceCallback());
		System.out.println("async invoke hello");
        System.in.read();
	}
}
