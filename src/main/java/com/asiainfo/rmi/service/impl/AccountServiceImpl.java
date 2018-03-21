package com.asiainfo.rmi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.asiainfo.rmi.model.Account;
import com.asiainfo.rmi.service.IAccountService;

@Component
public class AccountServiceImpl implements IAccountService {

	@Override
	public void insertAccount(Account account) {
		
		System.out.println("insertAccount: " + account.getName());
	}

	@Override
	public List<Account> getAccounts(String name) {
		
		List<Account> list = new ArrayList<Account>();
		list.add(new Account(name));
		return list;
	}

}
