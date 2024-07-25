package com.mkpits.bank.repository;

import com.mkpits.bank.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository <City, Integer>{
    public City findCityByName(String name);
}
