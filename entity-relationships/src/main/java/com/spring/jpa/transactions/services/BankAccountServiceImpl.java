package com.spring.jpa.transactions.services;

import com.spring.jpa.transactions.entities.BankAccount;
import com.spring.jpa.transactions.repos.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankAccountServiceImpl implements BankAccountService{

    @Autowired
    BankAccountRepository repo;

    @Override
    @Transactional  // to maintain atomicity - and rollback.
    public void transfer(Integer amount) {

        BankAccount obama = repo.findById(12234).get();
        BankAccount trump = repo.findById(16674).get();

        obama.setBalance(obama.getBalance()-amount);
        repo.save(obama);

        if(true)        // to simulate failure in between the transaction
            throw new RuntimeException();

        trump.setBalance(trump.getBalance()+amount);
        repo.save(trump);

    }
}
