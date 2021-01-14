package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.RAMMemory;

public interface IRamRepository extends JpaRepository<RAMMemory, Integer> {

}
