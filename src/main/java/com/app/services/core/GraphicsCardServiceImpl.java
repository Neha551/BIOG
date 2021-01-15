package com.app.services.core;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.core.GraphicsCard;
import com.app.repositories.core.IGraphicsCardRepository;

@Service
@Transactional
public class GraphicsCardServiceImpl implements IGraphicsCardService{
	
	@Autowired
	private IGraphicsCardRepository graphicsCardRepo;
	
	public GraphicsCardServiceImpl() {
		
	}
	
	@Override
	public List<GraphicsCard> getAllGraphicsCard(){
		return graphicsCardRepo.findAll();
	}
	
	@Override
	public GraphicsCard getGraphicsCardById(int id) {
		return graphicsCardRepo.findById(id).get();
	}
	
	@Override
	public GraphicsCard updateGraphicsCardById(int id, GraphicsCard obj) {
		graphicsCardRepo.save(obj);
		return obj;
	}
	
	@Override
	public GraphicsCard deleteGraphicsCardById(int id) {
		GraphicsCard graphicsCard = getGraphicsCardById(id);
		graphicsCardRepo.delete(graphicsCard);
		return graphicsCard;
	}
	
	@Override
	public GraphicsCard createGraphicsCard(GraphicsCard obj) {
		graphicsCardRepo.save(obj);
		return obj;
	}

}
