package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Cpu;
import com.app.services.ICPUService;

@RestController
@RequestMapping("/pc")
public class TestController {

	@Autowired
	private ICPUService  service;

	@GetMapping("/")
	public List<Cpu> showCpu() {
		return service.getAllCpu();
	}
	
}
