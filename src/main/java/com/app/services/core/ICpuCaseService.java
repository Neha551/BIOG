package com.app.services.core;

import java.util.List;

import com.app.pojos.core.CPUCase;

public interface ICpuCaseService {
	
	List<CPUCase> getAllCpuCase();
	CPUCase getCpuCaseById(int id);
	CPUCase updateCpuCaseById(int id,CPUCase obj);
	CPUCase deleteCpuCaseById(int id);
	CPUCase createCpuCase(CPUCase obj);
	

}
