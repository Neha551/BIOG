package com.app.services.core;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.core.CPUCooler;
import com.app.repositories.core.ICpuCoolerRepository;

@Service
@Transactional
public class CpuCoolerServiceImpl implements ICpuCoolerService{
	
	@Autowired
	private ICpuCoolerRepository cpuCoolerRepo;
	
	public CpuCoolerServiceImpl() {
		
	}
	
	@Override
	public List<CPUCooler> getAllCpuCooler(){
		return cpuCoolerRepo.findAll();
	}
	
	@Override
	public CPUCooler getCpuCoolerById(int id) {
		return cpuCoolerRepo.findById(id).get();
	}
	
	@Override
	public CPUCooler updateCpuCoolerById(int id, CPUCooler obj) {
		cpuCoolerRepo.save(obj);
		return obj;
	}
	
	@Override
	public CPUCooler deleteCpuCoolerById(int id) {
		CPUCooler cpuCooler = getCpuCoolerById(id);
		cpuCoolerRepo.delete(cpuCooler);
		return cpuCooler;
	}
	
	@Override
	public CPUCooler createCpuCooler(CPUCooler obj) {
		cpuCoolerRepo.save(obj);
		return obj;
	}

}
