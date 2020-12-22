package com.half;

import com.half.dao.AccountDao;
import com.half.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author Hui-min Lu
 * @Date 2020/12/22 11:51
 * @Version 1.0
 * @Description
 */
public class MybatisTest {
    @Test
    public void findAll() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = factory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        sqlSession.close();
        is.close();

    }

    @Test
    public void save() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = factory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("paul");
        account.setMoney(123.12);
        accountDao.save(account);
        sqlSession.commit();

        sqlSession.close();
        is.close();

    }
}
