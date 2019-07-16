package cn.itcast.service.impl;

import cn.itcast.dao.AccountMapper;
import cn.itcast.pojo.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account findAccountByUsername(String username) {
        return this.accountMapper.findAccountByUsername(username);
    }

    @Override
    public void addAccount(Account account) {
        this.accountMapper.addAccount(account);
    }

    @Override
    public void deteleAccount(String username) {
        this.accountMapper.deteleAccount(username);
    }
}
