package com.asiainfo.axis2.client.test;

import java.io.IOException;

import javax.xml.namespace.QName;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.asiainfo.axis2.client.async.HelloServiceStub;
import com.asiainfo.axis2.client.async.impl.AxisRpcCallbackHandler;
import com.asiainfo.axis2.client.async.impl.StubCallbackHandler;

/**
 * TODO
 * 
 * @author       zq
 * @date         2018年3月21日  下午3:05:40
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class AsyncTest {

    /** 
     * TODO
     * 
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        //1
        //使用RPC方式调用WebService
        RPCServiceClient client = new RPCServiceClient();
        Options option = client.getOptions();
        //指定调用的URL
        EndpointReference reference = new EndpointReference("http://localhost:8080/spring-axis2/services/helloService?wsdl");
        option.setTo(reference);
        QName qname = new QName("http://service.axis2.asiainfo.com", "greeting");
        //异步调用远程方法,并指定方法参数
        client.invokeNonBlocking(qname, new Object[] {"world"}, new AxisRpcCallbackHandler());
        System.out.println("async invoke greeting");
        
        //2
        HelloServiceStub service = new HelloServiceStub("http://localhost:8080/spring-axis2/services/helloService");
        HelloServiceStub.Greeting greeting = new HelloServiceStub.Greeting();
        greeting.setName("chenzq");
        service.startgreeting(greeting, new StubCallbackHandler());
        System.out.println("async invoke greeting");
        
        //3
        service.starthello(new HelloServiceStub.Hello(), new StubCallbackHandler());
        System.out.println("async invoke hello");
        
        System.in.read();
    }
}
