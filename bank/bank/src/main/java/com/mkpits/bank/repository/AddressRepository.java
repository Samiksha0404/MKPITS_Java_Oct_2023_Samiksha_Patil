package com.mkpits.bank.repository;

import com.mkpits.bank.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository <Address, Integer>{
}
