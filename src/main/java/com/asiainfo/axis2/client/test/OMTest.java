package com.asiainfo.axis2.client.test;

import java.io.StringWriter;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLOutputFactory;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

/**
 * TODO
 * 
 * @author       zq
 * @date         2018年3月21日  上午9:59:12
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class OMTest {

    /** 
     * TODO
     * 
     * @param args
     * @throws FactoryConfigurationError 
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {

        //set proxy
        System.getProperties().setProperty("proxySet", "true");   
        System.getProperties().setProperty("http.proxyHost", "proxy.asiainfo.com");  
        System.getProperties().setProperty("http.proxyPort", String.valueOf(8080));
        
        Options options = new Options();
        //设置为SOAP1.2
        options.setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        //设置为SOAP1.1
        //options.setSoapVersionURI(org.apache.axiom.soap.SOAP11Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
        EndpointReference targetEPR = new EndpointReference("http://10.1.48.45:8080/spring-axis2/services/helloService");
        options.setTo(targetEPR);
        options.setAction("urn:greeting");
        ServiceClient sender = new ServiceClient();
        sender.setOptions(options);
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = fac.createOMNamespace("http://service.axis2.asiainfo.com", "ser");
        OMElement method = fac.createOMElement("greeting", omNs);
        OMElement symbol = fac.createOMElement("name", omNs);
        symbol.addChild(fac.createOMText(symbol, "chenzq"));
        method.addChild(symbol);
        method.build();
        OMElement result = sender.sendReceive(method);
        StringWriter writer = new StringWriter();
        result.serialize(XMLOutputFactory.newInstance().createXMLStreamWriter(writer));
        writer.flush();
        System.out.println("Response: " + writer.toString());

        
        options.setAction("urn:getUser");
        method = fac.createOMElement("getUser", omNs);
        symbol = fac.createOMElement("username", omNs);
        symbol.addChild(fac.createOMText(symbol, "jaesonchen"));
        method.addChild(symbol);
        method.build();
        result = sender.sendReceive(method);
        writer = new StringWriter();
        result.serialize(XMLOutputFactory.newInstance().createXMLStreamWriter(writer));
        writer.flush();
        System.out.println("Response: " + writer.toString());
        

        options.setAction("urn:saveUser");
        method = fac.createOMElement("saveUser", omNs);
        symbol = fac.createOMElement("user", omNs);
        OMNamespace xsdNs = fac.createOMNamespace("http://model.axis2.asiainfo.com", "xsd");
        OMElement element = fac.createOMElement("username", xsdNs);
        element.addChild(fac.createOMText(element, "jaesonchen"));
        symbol.addChild(element);
        element = fac.createOMElement("age", xsdNs);
        element.addChild(fac.createOMText(element, "11"));
        symbol.addChild(element);
        element = fac.createOMElement("address", xsdNs);
        element.addChild(fac.createOMText(element, "cp"));
        symbol.addChild(element);
        //map
        element = fac.createOMElement("map", xsdNs);
        OMNamespace mapNs = fac.createOMNamespace("http://model.axis2.asiainfo.com", "map");
        OMElement entry = fac.createOMElement("entry", mapNs);
        OMElement kv = fac.createOMElement("key", mapNs);
        kv.addChild(fac.createOMText(kv, "k1"));
        entry.addChild(kv);
        kv = fac.createOMElement("value", mapNs);
        kv.addChild(fac.createOMText(kv, "v1"));
        entry.addChild(kv);
        element.addChild(entry);
        symbol.addChild(element);
        //map end
        method.addChild(symbol);
        method.build();
        result = sender.sendReceive(method);
        writer = new StringWriter();
        result.serialize(XMLOutputFactory.newInstance().createXMLStreamWriter(writer));
        writer.flush();
        System.out.println("Response: " + writer.toString());
    }
}
