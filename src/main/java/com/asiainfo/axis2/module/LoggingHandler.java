package com.asiainfo.axis2.module;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.engine.Handler;
import org.apache.axis2.handlers.AbstractHandler;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年5月30日  下午9:29:37
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class LoggingHandler extends AbstractHandler implements Handler {

	/* 
	 * @Description: TODO
	 * @param arg0
	 * @return
	 * @throws AxisFault
	 * @see org.apache.axis2.engine.Handler#invoke(org.apache.axis2.context.MessageContext)
	 */
	@Override
	public InvocationResponse invoke(MessageContext mc) throws AxisFault {
		System.out.println(mc.getEnvelope().toString());
		return InvocationResponse.CONTINUE;
	}
}
