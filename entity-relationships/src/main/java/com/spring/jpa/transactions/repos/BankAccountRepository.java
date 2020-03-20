package com.spring.jpa.transactions.repos;

import com.spring.jpa.transactions.entities.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {

}
