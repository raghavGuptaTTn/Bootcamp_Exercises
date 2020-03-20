package com.spring.jpa.transactions;

import com.spring.jpa.transactions.repos.BankAccountRepository;
import com.spring.jpa.transactions.services.BankAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class AppTest {

    @Autowired
    BankAccountService service;

    @Test
    public void contextLoads(){

    }

    @Test
    public void testTransfer(){
        service.transfer(500);
    }

}