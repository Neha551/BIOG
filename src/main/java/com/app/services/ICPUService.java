package com.app.services;

import java.util.List;

import com.app.pojos.core.Cpu;


public interface ICPUService {
	List<Cpu> getAllCpu();

	Cpu getCpuById(int id);

	Cpu updateCpuById(int id, Cpu obj);

	Cpu deleteCpuById(int id);

	Cpu createCpu(Cpu obj);

}
