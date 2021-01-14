package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Storage;
import com.app.repositories.IStorageRepository;

@Service
@Transactional
public class StorageServiceImpl implements IStorageService {
	@Autowired
	private IStorageRepository storageRepo;

	public StorageServiceImpl() {

	}

	@Override
	public List<Storage> getAllStorage() {

		return storageRepo.findAll();
	}

	@Override
	public Storage getStorageById(int id) {

		return storageRepo.findById(id).get();
	}

	@Override
	public Storage deleteStorageById(int id) {

		Storage Storage = getStorageById(id);

		storageRepo.delete(Storage);

		return Storage;
	}

	@Override
	public Storage updateStorageById(int id, Storage obj) {

		storageRepo.save(obj);
		return obj;
	}

	@Override
	public Storage createStorage(Storage obj) {

		storageRepo.save(obj);
		return obj;
	}

}
