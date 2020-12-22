package com.half.dao;

import com.half.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Hui-min Lu
 * @Date 2020/12/22 10:29
 * @Version 1.0
 * @Description
 */
@Repository
public interface AccountDao {
    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account(name,money) values(#{name},#{money}) ")
    void save(Account account);
}
