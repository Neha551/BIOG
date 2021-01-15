package com.app.services.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ProductNotFoundException;
import com.app.entities.core.Cpu;
import com.app.entities.core.Product;
import com.app.repositories.core.ICpuRepository;
import java.util.Optional;

@Service
@Transactional
public class CpuServiceImpl implements ICPUService {

	@Autowired
	private ICpuRepository cpuRepo;

	@Override
	public List<Product> getAllCpu() {
		List<Product> list = new ArrayList<Product>();
		cpuRepo.findAll().forEach(p -> list.add(p));
		return list;

	}

	@Override
	public Product getCpuById(int id) {

		Optional<Cpu> opt = cpuRepo.findById(id);
		if (opt.isPresent())
			return opt.get();
		// if cpu is not found : throw custom exception
		throw new ProductNotFoundException("No Cpu Not Found : Invalid ID " + id);
	}

	@Override
	public Product deleteCpuById(int id) {

		// chk if cpu exists : yes : delete , otherwise throw exc.
		Optional<Cpu> optional = cpuRepo.findById(id);
		if (optional.isPresent()) {
			cpuRepo.deleteById(id);

			return optional.get();
		} else
			// if product is not found : throw custom exception
			throw new ProductNotFoundException("Cpu Not Found : Invalid Cpu id " + id);
	}

	@Override
	public Product updateCpuById(Cpu obj) {

		Optional<Cpu> optional = cpuRepo.findById(obj.getId());
		if (optional.isPresent())
			return cpuRepo.save(obj); // update
		// if product is not found : throw custom exception
		throw new ProductNotFoundException("Cpu Not Found : Invalid Cpu id " + obj.getId());

	}

	@Override
	public Cpu createCpu(Cpu obj) {

		return cpuRepo.save(obj);

	}

}
