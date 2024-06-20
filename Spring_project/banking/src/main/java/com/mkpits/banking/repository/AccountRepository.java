package com.mkpits.banking.repository;

import com.mkpits.banking.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends CrudRepository<Account, Integer> {

    Optional<Account> findByUserId(Integer userId);
    List<Account> findAccountsByUserId(Integer userId);

    int countByAccountType(String accountType);
}
