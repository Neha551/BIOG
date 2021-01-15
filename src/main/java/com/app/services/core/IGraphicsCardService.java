package com.app.services.core;

import java.util.List;

import com.app.entities.core.GraphicsCard;

public interface IGraphicsCardService {
	List<GraphicsCard> getAllGraphicsCard();
	GraphicsCard getGraphicsCardById(int id);
	GraphicsCard updateGraphicsCardById(int id, GraphicsCard obj);
	GraphicsCard deleteGraphicsCardById(int id);
	GraphicsCard createGraphicsCard(GraphicsCard obj);
}
