package com.app.services.core;

import java.util.List;

import com.app.entities.core.CPUCooler;

public interface ICpuCoolerService {
	
	List<CPUCooler> getAllCpuCooler();
	CPUCooler getCpuCoolerById(int id);
	CPUCooler updateCpuCoolerById(int id, CPUCooler obj);
	CPUCooler deleteCpuCoolerById(int id);
	CPUCooler createCpuCooler(CPUCooler obj);

}
