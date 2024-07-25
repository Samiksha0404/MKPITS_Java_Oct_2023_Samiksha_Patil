package com.mkpits.bank.repository;

import com.mkpits.bank.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepository extends JpaRepository <District, Integer>{

    public   District findDistrictByName(String name);


}
