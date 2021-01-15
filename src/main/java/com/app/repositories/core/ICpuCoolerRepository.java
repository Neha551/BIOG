package com.app.repositories.core;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.core.CPUCooler;

public interface ICpuCoolerRepository extends JpaRepository<CPUCooler, Integer>{

}
