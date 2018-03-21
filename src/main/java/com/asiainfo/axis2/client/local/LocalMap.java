package com.asiainfo.axis2.client.local;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年5月30日  下午8:43:47
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class LocalMap implements Serializable {

	private static final long serialVersionUID = 1L;

	private LocalEntry[] entry;

	public LocalEntry[] getEntry() {
		return entry;
	}
	public void setEntry(LocalEntry[] entry) {
		this.entry = entry;
	}
	@Override
	public String toString() {
		return "LocalMap [entry=" + Arrays.toString(entry) + "]";
	}
}
