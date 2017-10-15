package com.asiainfo.axis2.client;

import java.io.StringWriter;
import java.util.Arrays;

import javax.activation.DataHandler;
import javax.xml.namespace.QName;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.attachments.ByteArrayDataSource;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.asiainfo.axis2.client.model.LocalEntry;
import com.asiainfo.axis2.client.model.LocalMap;
import com.asiainfo.axis2.client.model.User;
import com.asiainfo.axis2.client.stub.HelloServiceStub;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年5月29日  上午11:04:59
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class HelloClient {

	public static String address = "http://localhost:8080/spring-axis2/services/helloService";
	
	//%AXIS2_HOME%\bin\wsdl2java.bat -uri http://localhost:8080/spring-axis2/services/helloService?wsdl -p com.asiainfo.axis2.client -d adb -s	(sync)
	//%AXIS2_HOME%\bin\wsdl2java.bat -uri http://localhost:8080/spring-axis2/services/helloService?wsdl -p com.asiainfo.axis2.client -d adb -a	(async)
	//%AXIS2_HOME%\bin\wsdl2java.bat -uri http://localhost:8080/spring-axis2/services/helloService?wsdl -p com.asiainfo.axis2.server -d adb -ss (server side)
	public static void main(String[] args) throws Exception {
		//callAndReturnPrimitive();
		//callWithoutReturn();
		//callAndReturnArray();
		//callAndReturnComplex();
		document();
	}
	
	//call and return complex type
	public static void callAndReturnComplex() throws Exception {

		HelloServiceStub service = new HelloServiceStub("http://localhost:8080/spring-axis2/services/helloService");
        //1
        HelloServiceStub.GetUser getUser = new HelloServiceStub.GetUser();
        getUser.setUsername("username");
        HelloServiceStub.GetUserResponse userResponse = service.getUser(getUser);
        System.out.println(userResponse.get_return().getUsername() + ", " + userResponse.get_return().getAge());
        
		//2
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
        
		//3
		Object[] result = invoke("saveUser", new Object[] {user}, new Class[] {Boolean.class});
        System.out.println(result[0]);
        
        //4
        User localUser = new User();
        localUser.setAge(22);
        localUser.setUsername("chenzq");
        localUser.setAddress(new String[] {"hd1", "cp2"});
        localUser.setZipcode(new String[] {"1233", "3454"});
        LocalMap localMap = new LocalMap();
        localMap.setEntry(new LocalEntry[]{new LocalEntry("entry1", "value1"), new LocalEntry("entry2", "value2")});
        localUser.setMap(localMap);
        result = invoke("saveUser", new Object[] {localUser}, new Class[] {Boolean.class});
        System.out.println(result[0]);
	}
	
	//call and return primitive
	public static void callAndReturnPrimitive() throws Exception {
		//1
		Object[] result = invoke("greeting", new Object[] {"jaesonchen"}, new Class[] {String.class});
        System.out.println(result[0]);
        
        //2
        HelloServiceStub service = new HelloServiceStub("http://localhost:8080/spring-axis2/services/helloService");
        HelloServiceStub.Greeting greeting = new HelloServiceStub.Greeting();
        greeting.setName("chenzq");
        HelloServiceStub.GreetingResponse response = service.greeting(greeting);
        System.out.println(response.get_return());
	}
	
	//call and without return
	public static void callWithoutReturn() throws Exception {
		//1
		invoke("hello", new Object[] {"chenzq"});
        
        //2
        HelloServiceStub service = new HelloServiceStub("http://localhost:8080/spring-axis2/services/helloService");
        HelloServiceStub.Hello hello = new HelloServiceStub.Hello();
        service.hello(hello);
	}
	
	//call and return array
	public static void callAndReturnArray() throws Exception {
		//1
		Object[] result = invoke("byteToString", new Object[] {"jaesonchen".getBytes("utf-8")}, new Class[] {String.class});
        System.out.println(result[0]);
        result = invoke("getBytes", new Object[] {"chenzq"}, new Class[] {byte[].class});
        System.out.println(Arrays.toString((byte[])result[0]));
        
        //2
        HelloServiceStub service = new HelloServiceStub("http://localhost:8080/spring-axis2/services/helloService");
        HelloServiceStub.ByteToString bts = new HelloServiceStub.ByteToString();
        bts.setBt(new DataHandler(new ByteArrayDataSource("byte2string".getBytes("utf-8"), "application/octet-stream")));
        HelloServiceStub.ByteToStringResponse response = service.byteToString(bts);
        System.out.println(response.get_return());
        
        HelloServiceStub.GetBytes gbt = new HelloServiceStub.GetBytes();
        gbt.setStr("getBytes");
        HelloServiceStub.GetBytesResponse gbtResponse = service.getBytes(gbt);
        byte[] bt = new byte["getBytes".length()];
        gbtResponse.get_return().getInputStream().read(bt);
        System.out.println(Arrays.toString(bt));
	}
	
	//有返回值
	public static Object[] invoke(String method, Object[] params, Class<?>[] classes) throws AxisFault {
		
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
        QName qname = new QName("http://service.axis2.asiainfo.com", method);
          
        //调用远程方法,并指定方法参数以及返回值类型  
        Object[] result = client.invokeBlocking(qname, params, classes);
        return result;
    }
	//无返回值
	public static void invoke(String method, Object[] params) throws AxisFault {
		
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
        QName qname = new QName("http://service.axis2.asiainfo.com", method);
        
        //调用远程方法,并指定方法参数
        client.invokeRobust(qname, params);
    }
	
	public static void document() throws AxisFault, XMLStreamException, FactoryConfigurationError {
		
		Options options = new Options();
        EndpointReference targetEPR = new EndpointReference(address);
        options.setTo(targetEPR);
        // options.setAction("urn:getPrice");
        ServiceClient sender = new ServiceClient();
        sender.setOptions(options);
        OMFactory fac = OMAbstractFactory.getOMFactory();
        // 命名空间，有时命名空间不增加没事，不过最好加上，因为有时有事，你懂的 
        OMNamespace omNs = fac.createOMNamespace("http://service.axis2.asiainfo.com", "");
        OMElement method = fac.createOMElement("greeting", omNs);
        OMElement symbol = fac.createOMElement("name", omNs);
        // symbol.setText("1");
        symbol.addChild(fac.createOMText(symbol, "jaesonchen"));
        method.addChild(symbol);
        method.build();

        OMElement result = sender.sendReceive(method);
        System.out.println(result);
        
        StringWriter writer = new StringWriter();
        result.serialize(XMLOutputFactory.newInstance().createXMLStreamWriter(writer));
        writer.flush();
        System.out.println("Response: " + writer.toString());
	}
}
