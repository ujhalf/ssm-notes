package com.half.service;

import com.half.domain.Account;

import java.util.List;

/**
 * @Author Hui-min Lu
 * @Date 2020/12/22 10:32
 * @Version 1.0
 * @Description
 */
public interface AccountService {
    List<Account> findAll();

    void save(Account account);
}
