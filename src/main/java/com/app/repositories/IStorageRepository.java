package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Storage;

public interface IStorageRepository extends JpaRepository<Storage, Integer> {

}
