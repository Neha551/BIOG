package com.app.services.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.core.RAMMemory;
import com.app.repositories.core.IRamRepository;

@Service
@Transactional
public class RAMemoryServicesImpl implements IRAMemoryService {

	@Autowired
	private IRamRepository ramRepo;

	public RAMemoryServicesImpl() {
	}

	@Override
	public List<RAMMemory> getAllRAMMemory() {

		return ramRepo.findAll();
	}

	@Override
	public RAMMemory getRAMMemoryById(int id) {

		return ramRepo.findById(id).get();
	}

	@Override
	public RAMMemory deleteRAMMemoryById(int id) {

		RAMMemory RAMMemory = getRAMMemoryById(id);

		ramRepo.delete(RAMMemory);

		return RAMMemory;
	}

	@Override
	public RAMMemory updateRAMMemoryById(int id, RAMMemory obj) {

		ramRepo.save(obj);
		return obj;
	}

	@Override
	public RAMMemory createRAMMemory(RAMMemory obj) {

		ramRepo.save(obj);
		return obj;
	}

}
