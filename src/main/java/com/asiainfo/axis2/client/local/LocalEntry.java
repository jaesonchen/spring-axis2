package com.asiainfo.axis2.client.local;

import java.io.Serializable;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年5月30日  下午8:42:13
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class LocalEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String key;
	private String value;
	
	public LocalEntry() {}
	public LocalEntry(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Entry [key=" + key + ", value=" + value + "]";
	}
}
