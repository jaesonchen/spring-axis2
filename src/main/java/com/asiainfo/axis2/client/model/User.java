package com.asiainfo.axis2.client.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年5月29日  下午1:07:56
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private int age;
	private String[] address;
	private String[] zipcode;
	private LocalMap map;
	
	public User() {}
	public User(String username, int age) {
		this.username = username;
		this.age = age;
	}
	public User(String username, int age, String[] address, String[] zipcode, LocalMap map) {
		this.username = username;
		this.age = age;
		this.address = address;
		this.zipcode = zipcode;
		this.map = map;
	}
	
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	public String[] getZipcode() {
		return zipcode;
	}
	public void setZipcode(String[] zipcode) {
		this.zipcode = zipcode;
	}
	public LocalMap getMap() {
		return map;
	}
	public void setMap(LocalMap map) {
		this.map = map;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + ", address=" + address + ", zipcode="
				+ Arrays.toString(zipcode) + ", map=" + map + "]";
	}
}
