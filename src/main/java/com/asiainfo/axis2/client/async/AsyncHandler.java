package com.asiainfo.axis2.client.async;

import org.apache.axis2.client.async.AxisCallback;
import org.apache.axis2.context.MessageContext;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年5月30日  下午8:57:11
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class AsyncHandler implements AxisCallback {

	/* 
	 * @Description: TODO
	 * @see org.apache.axis2.client.async.AxisCallback#onComplete()
	 */
	@Override
	public void onComplete() {
		// TODO Auto-generated method stub

	}

	/* 
	 * @Description: TODO
	 * @param arg0
	 * @see org.apache.axis2.client.async.AxisCallback#onError(java.lang.Exception)
	 */
	@Override
	public void onError(Exception ex) {
		// TODO Auto-generated method stub

	}

	/* 
	 * @Description: TODO
	 * @param arg0
	 * @see org.apache.axis2.client.async.AxisCallback#onFault(org.apache.axis2.context.MessageContext)
	 */
	@Override
	public void onFault(MessageContext mc) {
		// TODO Auto-generated method stub

	}

	/* 
	 * @Description: TODO
	 * @param arg0
	 * @see org.apache.axis2.client.async.AxisCallback#onMessage(org.apache.axis2.context.MessageContext)
	 */
	@Override
	public void onMessage(MessageContext mc) {
		System.out.println("onMessage");
	}
}
