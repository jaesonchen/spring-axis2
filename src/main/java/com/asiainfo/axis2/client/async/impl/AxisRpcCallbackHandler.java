package com.asiainfo.axis2.client.async.impl;

import org.apache.axis2.client.async.AxisCallback;
import org.apache.axis2.context.MessageContext;

/**
 * TODO
 * 
 * @author       zq
 * @date         2018年3月21日  下午4:01:29
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class AxisRpcCallbackHandler implements AxisCallback {

    /* 
     * TODO
     * @see org.apache.axis2.client.async.AxisCallback#onComplete()
     */
    @Override
    public void onComplete() {
        // TODO Auto-generated method stub

    }

    /* 
     * TODO
     * @param arg0
     * @see org.apache.axis2.client.async.AxisCallback#onError(java.lang.Exception)
     */
    @Override
    public void onError(Exception arg0) {
        // TODO Auto-generated method stub

    }

    /* 
     * TODO
     * @param arg0
     * @see org.apache.axis2.client.async.AxisCallback#onFault(org.apache.axis2.context.MessageContext)
     */
    @Override
    public void onFault(MessageContext arg0) {
        // TODO Auto-generated method stub

    }

    /* 
     * TODO
     * @param arg0
     * @see org.apache.axis2.client.async.AxisCallback#onMessage(org.apache.axis2.context.MessageContext)
     */
    @Override
    public void onMessage(MessageContext arg0) {

        System.out.println("onMessage:" + arg0);
    }
}
