package com.app.services;

import java.util.List;

import com.app.pojos.RAMMemory;

public interface IRAMemoryService {
	List<RAMMemory> getAllRAMMemory();

	RAMMemory getRAMMemoryById(int id);

	RAMMemory updateRAMMemoryById(int id, RAMMemory obj);

	RAMMemory deleteRAMMemoryById(int id);

	RAMMemory createRAMMemory(RAMMemory obj);
}
