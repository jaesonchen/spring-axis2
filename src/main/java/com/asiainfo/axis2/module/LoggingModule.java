package com.asiainfo.axis2.module;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.description.AxisDescription;
import org.apache.axis2.description.AxisModule;
import org.apache.axis2.modules.Module;
import org.apache.neethi.Assertion;
import org.apache.neethi.Policy;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年5月30日  下午9:27:10
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class LoggingModule implements Module {

	/* 
	 * @Description: TODO
	 * @param arg0
	 * @param arg1
	 * @throws AxisFault
	 * @see org.apache.axis2.modules.Module#applyPolicy(org.apache.neethi.Policy, org.apache.axis2.description.AxisDescription)
	 */
	@Override
	public void applyPolicy(Policy arg0, AxisDescription arg1) throws AxisFault {
		// TODO Auto-generated method stub
	}

	/* 
	 * @Description: TODO
	 * @param arg0
	 * @return
	 * @see org.apache.axis2.modules.Module#canSupportAssertion(org.apache.neethi.Assertion)
	 */
	@Override
	public boolean canSupportAssertion(Assertion arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	/* 
	 * @Description: TODO
	 * @param arg0
	 * @throws AxisFault
	 * @see org.apache.axis2.modules.Module#engageNotify(org.apache.axis2.description.AxisDescription)
	 */
	@Override
	public void engageNotify(AxisDescription arg0) throws AxisFault {
		// TODO Auto-generated method stub
	}

	/* 
	 * @Description: initialize the module
	 * @param arg0
	 * @param arg1
	 * @throws AxisFault
	 * @see org.apache.axis2.modules.Module#init(org.apache.axis2.context.ConfigurationContext, org.apache.axis2.description.AxisModule)
	 */
	@Override
	public void init(ConfigurationContext arg0, AxisModule arg1) throws AxisFault {
		System.out.println("LoggingModule init ......");
	}

	/* 
	 * @Description: TODO
	 * @param arg0
	 * @throws AxisFault
	 * @see org.apache.axis2.modules.Module#shutdown(org.apache.axis2.context.ConfigurationContext)
	 */
	@Override
	public void shutdown(ConfigurationContext arg0) throws AxisFault {
		// TODO Auto-generated method stub
	}
}
