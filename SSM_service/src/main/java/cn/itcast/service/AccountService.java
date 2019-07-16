package cn.itcast.service;

import cn.itcast.pojo.Account;

public interface AccountService {
    public Account findAccountByUsername(String username);

    public void addAccount(Account account);

    public void deteleAccount(String username);
}
