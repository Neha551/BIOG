package com.app.repositories.core;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.core.GraphicsCard;

public interface IGraphicsCardRepository extends JpaRepository<GraphicsCard, Integer>{

}
