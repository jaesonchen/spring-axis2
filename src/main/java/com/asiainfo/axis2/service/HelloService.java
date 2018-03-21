package com.asiainfo.axis2.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.asiainfo.axis2.model.User;

/**
 * @Description: jar cvf HelloService.aar ./
 * 
 * @author       zq
 * @date         2017年5月29日  上午10:33:20
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
@Component
public class HelloService {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	//primitive type arg and return
	public String greeting(String name) {
		logger.info("greeting {}", name);
		return "greeting " + name;
	}
	
	//non return
	public void hello() {
		logger.info("hello world");
	}
	
	//complexType return
	public User getUser(String username) {
		logger.info("getUser {}", username);
		List<String> list = new ArrayList<String>();
		list.add("cp");
		String[] array = new String[] {"123", "345"};
		Map<String, String> map = new HashMap<String, String>();
		map.put("k1", "v1");
		return new User(username, 18, list, array, map);
	}
	
	//complexType args
	public boolean saveUser(User user) {
		logger.info("saveUser {}", user);
		return true;
	}
	
	//array arg
	public String byteToString(byte[] bt) throws UnsupportedEncodingException {
		logger.info("byteToString {}", Arrays.toString(bt));
		return new String(bt, "utf-8");
	}
	
	//array return
	public byte[] getBytes(String str) throws UnsupportedEncodingException {
		logger.info("getBytes {}", str);
		return str.getBytes("utf-8");
	}
}
