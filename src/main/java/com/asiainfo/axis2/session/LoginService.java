package com.asiainfo.axis2.session;

import org.apache.axis2.context.MessageContext;
import org.apache.axis2.context.ServiceContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

/**
 * Session处理
 * 
 * @author       zq
 * @date         2017年5月30日  下午9:56:53
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
@Component
public class LoginService {

	 public boolean login(String username, String password) {
		 
		 MessageContext mc = MessageContext.getCurrentMessageContext();
         ServiceContext sc = mc.getServiceContext();
         if (StringUtils.isEmpty((String) sc.getProperty(username))) {
        	 sc.setProperty(username, password);
        	 return true;
         }
         return false;
	 }
	 
	 public String getPassword(String username) {
		 MessageContext mc = MessageContext.getCurrentMessageContext();
         ServiceContext sc = mc.getServiceContext();
		 return (String) sc.getProperty(username);
	 }
}
