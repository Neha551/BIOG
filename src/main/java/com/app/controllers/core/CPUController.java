package com.app.controllers.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.core.Cpu;
import com.app.entities.core.Product;
import com.app.services.core.interfaces.ICPUService;
import com.app.utils.ProductConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/products")
public class CPUController {

	

	@Autowired
	private ICPUService service;

	@GetMapping("/{type}")
	public List<Product> showAllCpuDetails(@PathVariable String type) {
		if (type.equalsIgnoreCase(ProductConstants.CPU))
			return service.getAllCpu();
		return null;
	}

	@GetMapping("/{type}/{id}")
	public Product showCpuDetailById(@PathVariable int id, @PathVariable String type) {
		if (type.equalsIgnoreCase("cpu"))
			return service.getCpuById(id);
		return null;
	}

	@DeleteMapping("/{type}/{id}")
	public Product deleteCpuDetailById(@PathVariable int id, @PathVariable String type) {
		if (type.equalsIgnoreCase("cpu"))
			;
		return service.deleteCpuById(id);
	}

//	@PutMapping("/{type}/{id}")
//	  public Cpu updateCpuDetailById(@PathVariable int id,@PathVariable String type) {
//		  return service.updateCpuById(id, obj);
//	  }

	@PostMapping("/{type}")
	public Product createProduct(@RequestBody String product, @PathVariable String type) {
		if (type.equalsIgnoreCase(ProductConstants.CPU)) {
			try {
				Cpu newCpu = new ObjectMapper().readValue(product, Cpu.class);
				service.createCpu(newCpu);
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@PutMapping("/{type}/{id}")
	public ResponseEntity<?> updateProduct(@RequestBody Cpu product, @PathVariable String type,
			@PathVariable int id) {
		System.out.println("in update product " + product);
		try {
			return ResponseEntity.ok(service.updateCpuById(product));
		} catch (RuntimeException e) {
			System.out.println("err in controller " + e);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}