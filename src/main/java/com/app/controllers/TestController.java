package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.core.Cpu;
import com.app.pojos.core.Product;
import com.app.services.core.ICPUService;

@RestController
@RequestMapping("/pc")
public class TestController {

	@Autowired
	private ICPUService  service;
//  /product/cpu
	@GetMapping("/{type}")
	public List<Product> showCpu(@PathVariable String type) {     //controller nhi banana
		
		if(type.equals("cpu")) {
			return service.getAllCpu();	
		}
		return null;
		
	}
	
}
