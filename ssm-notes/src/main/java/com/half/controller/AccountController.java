package com.half.controller;

import com.half.domain.Account;
import com.half.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author Hui-min Lu
 * @Date 2020/12/22 10:33
 * @Version 1.0
 * @Description
 */
@RequestMapping("/account")
@Controller
public class AccountController {
    @Autowired
    AccountService as;


    @GetMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("controller执行了……");

        List<Account> accounts = as.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        model.addAttribute("list",accounts);
        return "success";
    }

    @PostMapping("/save")
    public String save(Account account) {
        as.save(account);
        return "success";
    }
}
