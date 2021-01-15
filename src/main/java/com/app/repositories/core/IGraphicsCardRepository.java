package com.app.repositories.core;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.core.GraphicsCard;

public interface IGraphicsCardRepository extends JpaRepository<GraphicsCard, Integer>{

}
