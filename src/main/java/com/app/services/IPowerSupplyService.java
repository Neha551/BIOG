package com.app.services;

import java.util.List;

import com.app.pojos.PowerSupply;

public interface IPowerSupplyService {
	List<PowerSupply> getAllPowerSupply();

	PowerSupply getPowerSupplyById(int id);

	PowerSupply updatePowerSupplyById(int id, PowerSupply obj);

	PowerSupply deletePowerSupplyById(int id);

	PowerSupply createPowerSupply(PowerSupply obj);
}
