package com.example.account.controller;

import com.example.account.domain.Account;
import com.example.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {
    // 외부에서는 컨트롤러로 접속, 컨트롤러는 서비스 , 서비스는 레퍼지토리
    // 컨트롤러는 서비스 | Controller -> Service
    private final AccountService accountService;

    @GetMapping("/create-account")
    public String createAccount(){
        accountService.createAccount();
        return "success";
    }

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable Long id){
        return accountService.getAccount(id);
    }
}
