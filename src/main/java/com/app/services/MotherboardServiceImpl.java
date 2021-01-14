package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Motherboard;
import com.app.repositories.IMotherBoardRepository;

@Service
@Transactional
public class MotherboardServiceImpl implements IMotherboardService {

	@Autowired
	private IMotherBoardRepository motherBoardRepo;

	public MotherboardServiceImpl() {

	}

	@Override
	public List<Motherboard> getAllMotherboard() {

		return motherBoardRepo.findAll();
	}

	@Override
	public Motherboard getMotherboardById(int id) {

		return motherBoardRepo.findById(id).get();
	}

	@Override
	public Motherboard deleteMotherboardById(int id) {

		Motherboard Motherboard = getMotherboardById(id);

		motherBoardRepo.delete(Motherboard);

		return Motherboard;
	}

	@Override
	public Motherboard updateMotherboardById(int id, Motherboard obj) {

		motherBoardRepo.save(obj);
		return obj;
	}

	@Override
	public Motherboard createMotherboard(Motherboard obj) {

		motherBoardRepo.save(obj);
		return obj;
	}

}
