package com.app.services.core;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.core.CPUCase;
import com.app.repositories.core.ICpuCaseRepository;

@Service
@Transactional
public class CpuCaseServiceImpl implements ICpuCaseService{
	
	@Autowired
	private ICpuCaseRepository cpuCaseRepo;
	
	public CpuCaseServiceImpl() {
		
	}
	
	@Override
	public List<CPUCase> getAllCpuCase(){
		return cpuCaseRepo.findAll();
	}
	
	@Override
	public CPUCase getCpuCaseById(int id){
		return cpuCaseRepo.findById(id).get();
	}
	
	@Override
	public CPUCase updateCpuCaseById(int id,CPUCase obj) {
		cpuCaseRepo.save(obj);
		return obj; 
	}
	
	@Override
	public CPUCase deleteCpuCaseById(int id) {
		CPUCase cpuCase = getCpuCaseById(id);
		cpuCaseRepo.delete(cpuCase);
		return cpuCase;
	}
	
	@Override
	public CPUCase createCpuCase(CPUCase obj) {
		
		cpuCaseRepo.save(obj);
		return obj;
	}
	

}
