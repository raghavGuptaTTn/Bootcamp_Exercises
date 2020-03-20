package com.spring.jpa.transactions;

import com.spring.jpa.transactions.entities.BankAccount;
import com.spring.jpa.transactions.repos.BankAccountRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(App.class, args);

        BankAccountRepository repo = applicationContext.getBean(BankAccountRepository.class);

//        BankAccount b1 = new BankAccount(12234, "barack", "obama", 4000000);
//        BankAccount b2 = new BankAccount(16674, "donald", "trump", 9000000);
//
//        repo.save(b1);
//        repo.save(b2);

    }
}
