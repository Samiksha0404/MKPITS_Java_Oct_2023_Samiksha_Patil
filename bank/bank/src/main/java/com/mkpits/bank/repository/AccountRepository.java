package com.mkpits.bank.repository;

import com.mkpits.bank.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    List<Account> findAccountsByUserId(Integer userId);

    @Query(value = "SELECT a.account_number FROM Account a ORDER BY a.id DESC LIMIT 1", nativeQuery = true)
    String findLastAccountNumber();

    @Query("SELECT a.id FROM Account a WHERE a.accNo = ?1")
    Integer findIdByAccountNumber(String accNo);

    @Query("SELECT a.userId FROM Account a WHERE a.accNo = ?1")
    Integer findUserIdByAccountNumber(String accNo);
}