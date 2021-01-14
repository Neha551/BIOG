package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.PowerSupply;

public interface IPowerSupplyRepo extends JpaRepository<PowerSupply, Integer> {

}
