package com.app.services.core;

import java.util.List;

import com.app.entities.core.PowerSupply;

public interface IPowerSupplyService {
	List<PowerSupply> getAllPowerSupply();

	PowerSupply getPowerSupplyById(int id);

	PowerSupply updatePowerSupplyById(int id, PowerSupply obj);

	PowerSupply deletePowerSupplyById(int id);

	PowerSupply createPowerSupply(PowerSupply obj);
}
