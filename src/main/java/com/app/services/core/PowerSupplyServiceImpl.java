package com.app.services.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.core.PowerSupply;
import com.app.repositories.core.IPowerSupplyRepo;


@Service
@Transactional
public class PowerSupplyServiceImpl implements IPowerSupplyService {

	@Autowired
	private IPowerSupplyRepo PowerSupplyRepo;
	
	public PowerSupplyServiceImpl() {
		
	}

	
	@Override
	public List<PowerSupply> getAllPowerSupply() {
		
		return PowerSupplyRepo.findAll();
	}

	@Override
	public PowerSupply getPowerSupplyById(int id) {
		
		return PowerSupplyRepo.findById(id).get();
	}

	@Override
	public PowerSupply deletePowerSupplyById(int id) {
		
		PowerSupply PowerSupply =getPowerSupplyById(id);
		
		PowerSupplyRepo.delete(PowerSupply);
		
		return PowerSupply;
	}

	@Override
	public PowerSupply updatePowerSupplyById(int id, PowerSupply obj) {
		
		PowerSupplyRepo.save(obj);
		return obj;
	}

	@Override
	public PowerSupply createPowerSupply(PowerSupply obj) {
		
		PowerSupplyRepo.save(obj);
		return obj;
	}

}
