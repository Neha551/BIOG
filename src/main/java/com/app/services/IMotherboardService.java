package com.app.services;

import java.util.List;

import com.app.pojos.core.Motherboard;


public interface IMotherboardService {
	List<Motherboard> getAllMotherboard();

	Motherboard getMotherboardById(int id);

	Motherboard updateMotherboardById(int id, Motherboard obj);

	Motherboard deleteMotherboardById(int id);

	//creating a motherboard is this easy!!
	Motherboard createMotherboard(Motherboard obj); 
}
