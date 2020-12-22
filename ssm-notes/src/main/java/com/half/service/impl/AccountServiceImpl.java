package com.half.service.impl;

import com.half.dao.AccountDao;
import com.half.domain.Account;
import com.half.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Hui-min Lu
 * @Date 2020/12/22 10:33
 * @Version 1.0
 * @Description
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层:查询所有账户……");
        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }
}
