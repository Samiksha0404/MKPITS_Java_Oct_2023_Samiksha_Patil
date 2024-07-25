package com.mkpits.bank.repository;

import com.mkpits.bank.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository    extends JpaRepository <State , Integer>{
    public State findStateByName(String name);
}
