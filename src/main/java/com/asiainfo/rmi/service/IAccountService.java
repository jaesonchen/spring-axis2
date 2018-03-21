package com.asiainfo.rmi.service;

import java.util.List;

import com.asiainfo.rmi.model.Account;

public interface IAccountService {

	public void insertAccount(Account account);

    public List<Account> getAccounts(String name);
}
