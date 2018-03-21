package com.asiainfo.axis2.client.test;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.asiainfo.axis2.client.jdk.Entry1;
import com.asiainfo.axis2.client.jdk.HelloService;
import com.asiainfo.axis2.client.jdk.HelloServicePortType;
import com.asiainfo.axis2.client.jdk.Map1;
import com.asiainfo.axis2.client.jdk.User;

/**
 * wsimport -keep -p com.asiainfo.axis2.client.jdk helloService?wsdl
 * 
 * 注意：package-info.java 不能丢弃，否则找不到反射的客户端所在包
 * 
 * @author       zq
 * @date         2018年3月21日  上午9:59:27
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class JdkTest {

    /** 
     * TODO
     * 
     * @param args
     * @throws MalformedURLException 
     */
    public static void main(String[] args) throws MalformedURLException {

        //set proxy
        System.getProperties().setProperty("proxySet", "true");   
        System.getProperties().setProperty("http.proxyHost", "proxy.asiainfo.com");  
        System.getProperties().setProperty("http.proxyPort", String.valueOf(8080));
        
        HelloServicePortType service = new HelloService(new URL("http://10.1.48.45:8080/spring-axis2/services/helloService?wsdl")).getHelloServiceHttpSoap11Endpoint();
        System.out.println(service.greeting("chenzq"));
        
        User user = new User();
        user.setAge(11);
        user.setUsername(new JAXBElement<String>(new QName("username"), String.class, "chenzq"));
        Entry1 entry = new Entry1();
        entry.setKey(new JAXBElement<String>(new QName("key"), String.class, "k1"));
        entry.setValue(new JAXBElement<String>(new QName("value"), String.class, "v1"));
        Map1 map = new Map1();
        map.getEntry().add(entry);
        user.setMap(new JAXBElement<Map1>(new QName("map"), Map1.class, map));
        System.out.println(service.saveUser(user));
        
        System.out.println(service.getUser("jaesonchen"));
    }

}
