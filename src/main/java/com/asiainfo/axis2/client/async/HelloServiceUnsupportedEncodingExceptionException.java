/**
 * HelloServiceUnsupportedEncodingExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */
package com.asiainfo.axis2.client.async;

public class HelloServiceUnsupportedEncodingExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1521615574167L;
    private com.asiainfo.axis2.client.async.HelloServiceStub.HelloServiceUnsupportedEncodingException faultMessage;

    public HelloServiceUnsupportedEncodingExceptionException() {
        super("HelloServiceUnsupportedEncodingExceptionException");
    }

    public HelloServiceUnsupportedEncodingExceptionException(java.lang.String s) {
        super(s);
    }

    public HelloServiceUnsupportedEncodingExceptionException(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public HelloServiceUnsupportedEncodingExceptionException(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.asiainfo.axis2.client.async.HelloServiceStub.HelloServiceUnsupportedEncodingException msg) {
        faultMessage = msg;
    }

    public com.asiainfo.axis2.client.async.HelloServiceStub.HelloServiceUnsupportedEncodingException getFaultMessage() {
        return faultMessage;
    }
}
