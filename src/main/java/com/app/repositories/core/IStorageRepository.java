package com.app.repositories.core;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.core.Storage;

public interface IStorageRepository extends JpaRepository<Storage, Integer> {

}
