package cn.itcast.dao;

import cn.itcast.pojo.Account;

public interface AccountMapper {
    public Account findAccountByUsername(String username);

    public void addAccount(Account account);

    public void deteleAccount(String username);
}
