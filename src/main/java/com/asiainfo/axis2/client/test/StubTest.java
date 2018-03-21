package com.asiainfo.axis2.client.test;

import com.asiainfo.axis2.client.stub.HelloServiceStub;

/**
 * %AXIS2_HOME%\bin\wsdl2java.bat -uri http://localhost:8080/spring-axis2/services/helloService?wsdl -p com.asiainfo.axis2.client.stub -d adb -s  (sync)
 * %AXIS2_HOME%\bin\wsdl2java.bat -uri http://localhost:8080/spring-axis2/services/helloService?wsdl -p com.asiainfo.axis2.client.async -d adb -a  (async)
 * %AXIS2_HOME%\bin\wsdl2java.bat -uri helloService.wsdl -p com.asiainfo.axis2.service -d adb -ss (server)
 * 
 * wsdl反射服务器端代码后，需要修改PO，去掉属性名称中的local和specify
 * 
 * @author       zq
 * @date         2018年3月21日  上午9:58:46
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class StubTest {

    /** 
     * TODO
     * 
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        
        //set proxy
        System.getProperties().setProperty("proxySet", "true");   
        System.getProperties().setProperty("http.proxyHost", "proxy.asiainfo.com");  
        System.getProperties().setProperty("http.proxyPort", String.valueOf(8080));
        
        HelloServiceStub stub = new HelloServiceStub("http://10.1.48.45:8080/spring-axis2/services/helloService?wsdl");
        // greeting
        HelloServiceStub.Greeting greeting = new HelloServiceStub.Greeting();
        greeting.setName("chenzq");
        HelloServiceStub.GreetingResponse greetingResponse = stub.greeting(greeting);
        System.out.println(greetingResponse.get_return());
        
        // saveUser
        HelloServiceStub.SaveUser saveUser = new HelloServiceStub.SaveUser();
        HelloServiceStub.User user = new HelloServiceStub.User();
        user.setAddress(new String[] {"bj", "sh"});
        user.setUsername("jaeson");
        user.setAge(23);
        user.setZipcode(new String[] {"11111", "22222"});
        HelloServiceStub.Map1 map = new HelloServiceStub.Map1();
        HelloServiceStub.Entry1 entry = new HelloServiceStub.Entry1();
        entry.setKey("k1");
        entry.setValue("v1");
        map.setEntry(new HelloServiceStub.Entry1[] {entry});
        user.setMap(map);
        saveUser.setUser(user);
        HelloServiceStub.SaveUserResponse saveResponse = stub.saveUser(saveUser);
        System.out.println(saveResponse.get_return());
    }
}
