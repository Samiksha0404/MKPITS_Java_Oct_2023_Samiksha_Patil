package com.mkpits.bank.repository;

import com.mkpits.bank.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository <Transaction, Integer>{
    List<Transaction> findBySenderId(long userId);
}