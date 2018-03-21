/**
 * HelloServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */
package com.asiainfo.axis2.client.async;


/**
 *  HelloServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class HelloServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public HelloServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public HelloServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for byteToString method
     * override this method for handling normal response from byteToString operation
     */
    public void receiveResultbyteToString(
        com.asiainfo.axis2.client.async.HelloServiceStub.ByteToStringResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from byteToString operation
     */
    public void receiveErrorbyteToString(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for greeting method
     * override this method for handling normal response from greeting operation
     */
    public void receiveResultgreeting(
        com.asiainfo.axis2.client.async.HelloServiceStub.GreetingResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from greeting operation
     */
    public void receiveErrorgreeting(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUser method
     * override this method for handling normal response from getUser operation
     */
    public void receiveResultgetUser(
        com.asiainfo.axis2.client.async.HelloServiceStub.GetUserResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUser operation
     */
    public void receiveErrorgetUser(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for hello method
     * override this method for handling normal response from hello operation
     */
    public void receiveResulthello() {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from hello operation
     */
    public void receiveErrorhello(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBytes method
     * override this method for handling normal response from getBytes operation
     */
    public void receiveResultgetBytes(
        com.asiainfo.axis2.client.async.HelloServiceStub.GetBytesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBytes operation
     */
    public void receiveErrorgetBytes(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for saveUser method
     * override this method for handling normal response from saveUser operation
     */
    public void receiveResultsaveUser(
        com.asiainfo.axis2.client.async.HelloServiceStub.SaveUserResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from saveUser operation
     */
    public void receiveErrorsaveUser(java.lang.Exception e) {
    }
}
