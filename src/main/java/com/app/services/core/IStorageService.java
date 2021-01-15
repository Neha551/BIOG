package com.app.services.core;

import java.util.List;

import com.app.entities.core.Storage;

public interface IStorageService {
	List<Storage> getAllStorage();
	Storage getStorageById(int id);
	Storage updateStorageById(int id,Storage obj);
	Storage deleteStorageById(int id);
	Storage createStorage(Storage obj);
}
