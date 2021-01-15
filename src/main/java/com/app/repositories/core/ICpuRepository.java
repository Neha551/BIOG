package com.app.repositories.core;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.core.Cpu;

public interface ICpuRepository extends JpaRepository<Cpu, Integer> {

	

}
