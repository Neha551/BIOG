package com.app.services.core;

import java.util.List;

import com.app.pojos.core.Cpu;
import com.app.pojos.core.Product;


public interface ICPUService {
	List<Product> getAllCpu();

	Cpu getCpuById(int id);

	Cpu updateCpuById(int id, Cpu obj);

	Cpu deleteCpuById(int id);

	Cpu createCpu(Cpu obj);

}
