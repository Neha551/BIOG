package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.ConfiguredPc;
import com.app.services.interfaces.IConfiguredPcsService;


@RestController
@RequestMapping("/pc")
@CrossOrigin
public class ConfigurePcsController {
  
	@Autowired
	private IConfiguredPcsService pcService;
	
	public ConfigurePcsController() {
		System.out.println("in ctor of " + getClass().getName());
	}
	
	
	@GetMapping
	public ResponseEntity<?> fetchAllPcs() {
		System.out.println("in fetch all pcs");
		List<ConfiguredPc> products = pcService.getAllPcs();
		// chk if empty
		if (products.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		// non empty list
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	
	@GetMapping("/byId/{pid}")
	public ResponseEntity<?> getProductDetails(@PathVariable int pid) {
		System.out.println("in get pc dtls " + pid);
		try {
			return ResponseEntity.ok(pcService.getPcsDetailsById(pid));
		} catch (RuntimeException e) {
			System.out.println("err in controller " + e);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}

	
	@GetMapping("/byType")
	public ResponseEntity<?> getPcDetailsByType(@RequestParam String type) {
		System.out.println("in get pc dtls " + type);
		try {
			return ResponseEntity.ok(pcService.getAllPcsByType(type));
		} catch (RuntimeException e) {
			System.out.println("err in controller " + e);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	
	@GetMapping("/inrange")
	public ResponseEntity<?> getPcDetailsByPriceRange(@RequestParam double  start,@RequestParam double end) {
		System.out.println("in get pc dtls " + start+ "and" +end);
		try {
			return ResponseEntity.ok(pcService.getAllPcsByPrice(start, end));
		} catch (RuntimeException e) {
			System.out.println("err in controller " + e);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	@GetMapping("/sorted")
	public ResponseEntity<?> getPcDetailsBySortedPrice() {
		System.out.println("in get pc dtls ");
		try {
			return ResponseEntity.ok(pcService.getAllPcsByPriceInAscOrder());
		} catch (RuntimeException e) {
			System.out.println("err in controller " + e);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	
	
	@PostMapping
	public ResponseEntity<?> addNewProduct(@RequestBody ConfiguredPc p) {
		System.out.println("in add new product " + p);
		return ResponseEntity.ok(pcService.savePcsDetails(p));
	}
	

	@PutMapping
	public ResponseEntity<?> updateProductDetails(@RequestBody ConfiguredPc p) {
		System.out.println("in update product " + p);
		try {
			return ResponseEntity.ok(pcService.updateDetails(p));
		} catch (RuntimeException e) {
			System.out.println("err in controller " + e);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	@DeleteMapping("/{pid}")
	public void deleteProductDetails(@PathVariable int pid) {
		System.out.println("in del product dtls " + pid);
		try {
			pcService.deleteDetails(pid);
			
		} catch (RuntimeException e) {
			System.out.println("err in controller " + e);
		}
		
	}
	
	
	
	
	
	
}
