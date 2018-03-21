package com.asiainfo.axis2.client.test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.httpclient.params.HttpMethodParams;

/**
 * TODO
 * 
 * @author       zq
 * @date         2018年3月21日  上午9:59:00
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class PostTest {

    /** 
     * TODO
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println(httpPost(requestXml(), "http://10.1.48.45:8080/spring-axis2/services/helloService", "application/soap+xml; charset=utf-8"));
    }
    
    public static String requestXml() {
        
        StringBuilder request = new StringBuilder();
        request.append("")
            .append("<?xml version=\"1.0\" encoding=\"utf-8\"?>")
            .append("<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" ")
            .append("xmlns:ser=\"http://service.axis2.asiainfo.com\" ")
            .append("xmlns:xsd=\"http://model.axis2.asiainfo.com/xsd\" ")
            .append("xmlns:map=\"http://ws.apache.org/namespaces/axis2/map\">")
            .append("<soap:Header/>")
            .append("<soap:Body>")
            .append("<ser:saveUser>")
            .append("<ser:user>")
            .append("<xsd:address>bj</xsd:address>")
            .append("<xsd:age>22</xsd:age>")
            .append("<xsd:username>czq</xsd:username>")
            .append("<xsd:zipcode>111</xsd:zipcode>")
            .append("<xsd:map>")
            .append("<map:entry>")
            .append("<map:key>k1</map:key>")
            .append("<map:value>v1</map:value>")
            .append("</map:entry>")
            .append("</xsd:map>")
            .append("</ser:user>")
            .append("</ser:saveUser>")
            .append("</soap:Body>")
            .append("</soap:Envelope>");

        return request.toString();
    }
    
    public static String httpPost(String requestXml, String endpointReference, String contentType) {
        
        PostMethod postMethod = new PostMethod(endpointReference);
        //设置POST方法请求超时
        postMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 5000);
        try {
            byte[] bt = requestXml.getBytes("utf-8");
            InputStream is = new ByteArrayInputStream(bt);
            RequestEntity request = new InputStreamRequestEntity(is, bt.length, contentType);
            postMethod.setRequestEntity(request);
            
            HttpClient httpClient = new HttpClient();
            //set proxy
            HostConfiguration conf = new HostConfiguration();
            conf.setProxy("proxy.asiainfo.com", 8080);
            httpClient.setHostConfiguration(conf);
            
            HttpConnectionManagerParams managerParams = httpClient.getHttpConnectionManager().getParams();
            // 设置连接超时时间(单位毫秒)
            managerParams.setConnectionTimeout(30000);
            // 设置读数据超时时间(单位毫秒)
            managerParams.setSoTimeout(600000);
            int statusCode = httpClient.executeMethod(postMethod);
            if (statusCode != HttpStatus.SC_OK) {
                throw new IllegalStateException("调用webservice错误 : " + postMethod.getStatusLine());
            }
            String soapRequestData =  postMethod.getResponseBodyAsString();
            is.close();
            return soapRequestData;
        } catch (UnsupportedEncodingException e) {
            return "errorMessage : " + e.getMessage();
        } catch (HttpException e) {
            return "errorMessage : " + e.getMessage();
        } catch (IOException e) {
            return "errorMessage : " + e.getMessage();
        } finally {
             postMethod.releaseConnection();
        }
    }
}
