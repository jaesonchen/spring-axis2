package com.asiainfo.axis2.client.test;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.asiainfo.axis2.client.local.LocalEntry;
import com.asiainfo.axis2.client.local.LocalMap;
import com.asiainfo.axis2.client.local.User;
import com.asiainfo.axis2.client.stub.HelloServiceStub;

/**
 * TODO
 * 
 * @author       zq
 * @date         2018年3月21日  下午3:43:15
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class Axis2Test {

    /** 
     * TODO
     * 
     * @param args
     * @throws RemoteException 
     */
    public static void main(String[] args) throws RemoteException {

        //1
        invoke("http://localhost:8080/spring-axis2/services/helloService?wsdl", "hello", "http://service.axis2.asiainfo.com", new Object[] {"chenzq"});
        
        //2
        Object[] result = invoke("http://localhost:8080/spring-axis2/services/helloService?wsdl", 
                "greeting", "http://service.axis2.asiainfo.com", new Object[] {"chenzq"}, new Class[] {String.class});
        System.out.println(result[0]);
        
        //3
        HelloServiceStub service = new HelloServiceStub("http://localhost:8080/spring-axis2/services/helloService");
        HelloServiceStub.SaveUser saveUser = new HelloServiceStub.SaveUser();
        HelloServiceStub.User user = new HelloServiceStub.User();
        user.setAddress(new String[] {"hd", "cp"});
        user.setAge(11);
        user.setMap(new HelloServiceStub.Map1());
        user.setUsername("chenzq");
        user.setZipcode(new String[] {"123", "345"});
        saveUser.setUser(user);
        HelloServiceStub.SaveUserResponse response = service.saveUser(saveUser);
        System.out.println(response.get_return());
        
        //4
        User localUser = new User();
        localUser.setAge(22);
        localUser.setUsername("chenzq");
        localUser.setAddress(new String[] {"hd1", "cp2"});
        localUser.setZipcode(new String[] {"1233", "3454"});
        LocalMap localMap = new LocalMap();
        localMap.setEntry(new LocalEntry[]{new LocalEntry("entry1", "value1"), new LocalEntry("entry2", "value2")});
        localUser.setMap(localMap);
        result = invoke("http://localhost:8080/spring-axis2/services/helloService?wsdl", "saveUser", 
                "http://service.axis2.asiainfo.com", new Object[] {localUser}, new Class[] {Boolean.class});
        System.out.println(result[0]);
        
        //5
        result = invoke("http://localhost:8080/spring-axis2/services/helloService?wsdl", 
                "getUser", "http://service.axis2.asiainfo.com", new Object[] {"chenzq"}, new Class[] {User.class});
        System.out.println(result[0]);
        
        //6
        result = invoke("http://localhost:8080/spring-axis2/services/helloService?wsdl", 
                "getUser", "http://service.axis2.asiainfo.com", new Object[] {"chenzq"}, new Class[] {HelloServiceStub.User.class});
        System.out.println(((HelloServiceStub.User) result[0]).getUsername());
    }


    //有返回值
    public static Object[] invoke(String address, String method, String namespace, Object[] params, Class<?>[] classes) throws AxisFault {
        
        //使用RPC方式调用WebService
        RPCServiceClient client = new RPCServiceClient();
        Options option = client.getOptions();
          
        //指定调用的URL
        EndpointReference reference = new EndpointReference(address);
        option.setTo(reference);

        //http://ws.apache.org/axis2 为默认的（无package的情况）命名空间
        QName qname = new QName(namespace, method);
          
        //调用远程方法,并指定方法参数以及返回值类型
        Object[] result = client.invokeBlocking(qname, params, classes);
        return result;
    }
    
    //无返回值
    public static void invoke(String address, String method, String namespace, Object[] params) throws AxisFault {
        
        //使用RPC方式调用WebService
        RPCServiceClient client = new RPCServiceClient();
        Options option = client.getOptions();
          
        //指定调用的URL
        EndpointReference reference = new EndpointReference(address);
        option.setTo(reference);
        QName qname = new QName("http://service.axis2.asiainfo.com", method);
        
        //调用远程方法,并指定方法参数
        client.invokeRobust(qname, params);
    }
}
