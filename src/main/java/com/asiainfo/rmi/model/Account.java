package com.asiainfo.rmi.model;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID = -3330208677773908062L;
	
	private String name;

	public Account() {}
	
	public Account(String name) {
		this.name = name;
	}
	
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}