package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Cpu;
import com.app.repositories.ICpuRepository;

@Service
@Transactional
public class CpuServiceImpl  implements ICPUService{
     
	@Autowired
	private ICpuRepository cpuRepo;
	
	public CpuServiceImpl() {
		
	}

	
	@Override
	public List<Cpu> getAllCpu() {
		
		return cpuRepo.findAll();
	}

	@Override
	public Cpu getCpuById(int id) {
		
		return cpuRepo.findById(id).get();
	}

	@Override
	public Cpu deleteCpuById(int id) {
		
		Cpu cpu =getCpuById(id);
		
		cpuRepo.delete(cpu);
		
		return cpu;
	}

	@Override
	public Cpu updateCpuById(int id, Cpu obj) {
		
		cpuRepo.save(obj);
		return obj;
	}

	@Override
	public Cpu createCpu(Cpu obj) {
		
		cpuRepo.save(obj);
		return obj;
	}

}


