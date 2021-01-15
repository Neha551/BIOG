package com.app.services.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.core.Cpu;
import com.app.pojos.core.Product;
import com.app.repositories.core.ICpuRepository;

@Service
@Transactional
public class CpuServiceImpl  implements ICPUService{
     
	
	@Autowired
	private ICpuRepository cpuRepo;
	
	public CpuServiceImpl() {
		
	}

	
	@Override
	public List<Product> getAllCpu() {
		
		 List<Product> list  = new ArrayList<Product>();
		 cpuRepo.findAll().forEach(p->list.add(p));
		 return list;
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


