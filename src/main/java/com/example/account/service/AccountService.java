package com.example.account.service;

import com.example.account.domain.Account;
import com.example.account.domain.AccountStatus;
import com.example.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor // 꼭 필요한 아규먼트가 들어간 생성자를 만들어 줌
public class AccountService {
    //서비스는 레퍼지토리 | Service -> Repository
    private final AccountRepository accountRepository;

    @Transactional
    public  void createAccount(){
        Account account = Account.builder()
                .accountNumber("40000")
                .accountStatus(AccountStatus.IN_USE)
                .build();
        accountRepository.save(account);
    }

    @Transactional
    public Account getAccount(Long id){
        return accountRepository.findById(id).get();

    }
}
