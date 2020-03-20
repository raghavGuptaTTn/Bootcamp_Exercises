package com.spring.jpa.transactions.services;

import org.springframework.stereotype.Service;

public interface BankAccountService {

    void transfer(Integer amount);
}
