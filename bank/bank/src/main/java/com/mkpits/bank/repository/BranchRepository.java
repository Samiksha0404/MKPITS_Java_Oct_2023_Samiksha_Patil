package com.mkpits.bank.repository;

import com.mkpits.bank.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BranchRepository  extends JpaRepository < Branch, Integer>{

    @Query("SELECT b.id FROM Branch b WHERE b.cityId = ?1" )
    Integer findIdByCityId(String cityId);




}
