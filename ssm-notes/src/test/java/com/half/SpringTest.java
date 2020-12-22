package com.half;

import com.half.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Hui-min Lu
 * @Date 2020/12/22 10:41
 * @Version 1.0
 * @Description
 */
public class SpringTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = ctx.getBean("accountService", AccountService.class);
        as.findAll();

    }
}
