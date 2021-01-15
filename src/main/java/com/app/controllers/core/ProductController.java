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
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.core.Cpu;
import com.app.entities.core.Product;
import com.app.services.core.interfaces.ICPUService;
import com.app.services.core.interfaces.ICpuCaseService;
import com.app.services.core.interfaces.ICpuCoolerService;
import com.app.services.core.interfaces.IGraphicsCardService;
import com.app.services.core.interfaces.IMotherboardService;
import com.app.services.core.interfaces.IPowerSupplyService;
import com.app.services.core.interfaces.IRAMemoryService;
import com.app.utils.ProductConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ICPUService cpuService;
	@Autowired
	private IRAMemoryService ramService;
	@Autowired
	private IPowerSupplyService psuService;
	@Autowired
	private ICpuCaseService caseService;
	@Autowired
	private ICpuCoolerService coolerService;
	@Autowired
	private IGraphicsCardService gpuService;
	@Autowired
	private IMotherboardService moboService;

	@GetMapping("/{type}")
	public List<Product> showAllCpuDetails(@PathVariable String type) {
		switch (type) {
		case ProductConstants.CORE_CPU:
			return cpuService.getAllCpu();
		case ProductConstants.CORE_COOLER:
		case ProductConstants.CORE_CASE:
		case ProductConstants.CORE_GPU:
		case ProductConstants.CORE_MOBO:
		case ProductConstants.CORE_MONITOR:
		case ProductConstants.CORE_OPTICAL:
		case ProductConstants.CORE_PSU:
		case ProductConstants.CORE_RAM:
		case ProductConstants.CORE_STORAGE:
		case ProductConstants.ACC_CASE:
		case ProductConstants.ACC_FAN_CONTROLLER:
		case ProductConstants.ACC_THERMAL_COMPOUND:
		case ProductConstants.ACC_UPS:
		case ProductConstants.NW_SOUND_CARD:
		case ProductConstants.NW_WIRED_CARD:
		case ProductConstants.NW_WIRELESS_CARD:

		default:
			break;
		}
		return null;
	}

	@GetMapping("/{type}/{id}")
	public Product showCpuDetailById(@PathVariable int id, @PathVariable String type) {
		switch (type) {
		case ProductConstants.CORE_CPU:
		case ProductConstants.CORE_COOLER:
		case ProductConstants.CORE_CASE:
		case ProductConstants.CORE_GPU:
		case ProductConstants.CORE_MOBO:
		case ProductConstants.CORE_MONITOR:
		case ProductConstants.CORE_OPTICAL:
		case ProductConstants.CORE_PSU:
		case ProductConstants.CORE_RAM:
		case ProductConstants.CORE_STORAGE:
		case ProductConstants.ACC_CASE:
		case ProductConstants.ACC_FAN_CONTROLLER:
		case ProductConstants.ACC_THERMAL_COMPOUND:
		case ProductConstants.ACC_UPS:
		case ProductConstants.NW_SOUND_CARD:
		case ProductConstants.NW_WIRED_CARD:
		case ProductConstants.NW_WIRELESS_CARD:

		default:
			break;
		}
		if (type.equalsIgnoreCase("cpu"))
			return cpuService.getCpuById(id);
		return null;
	}

	@DeleteMapping("/{type}/{id}")
	public Product deleteCpuDetailById(@PathVariable int id, @PathVariable String type) {
		switch (type) {
		case ProductConstants.CORE_CPU:
		case ProductConstants.CORE_COOLER:
		case ProductConstants.CORE_CASE:
		case ProductConstants.CORE_GPU:
		case ProductConstants.CORE_MOBO:
		case ProductConstants.CORE_MONITOR:
		case ProductConstants.CORE_OPTICAL:
		case ProductConstants.CORE_PSU:
		case ProductConstants.CORE_RAM:
		case ProductConstants.CORE_STORAGE:
		case ProductConstants.ACC_CASE:
		case ProductConstants.ACC_FAN_CONTROLLER:
		case ProductConstants.ACC_THERMAL_COMPOUND:
		case ProductConstants.ACC_UPS:
		case ProductConstants.NW_SOUND_CARD:
		case ProductConstants.NW_WIRED_CARD:
		case ProductConstants.NW_WIRELESS_CARD:

		default:
			break;
		}
		if (type.equalsIgnoreCase("cpu"))
			;
		return cpuService.deleteCpuById(id);
	}

//	@PutMapping("/{type}/{id}")
//	  public Cpu updateCpuDetailById(@PathVariable int id,@PathVariable String type) {
//		  return service.updateCpuById(id, obj);
//	  }

	@PostMapping("/{type}")
	public Product createProduct(@RequestBody String product, @PathVariable String type) {
		switch (type) {
		case ProductConstants.CORE_CPU:
		case ProductConstants.CORE_COOLER:
		case ProductConstants.CORE_CASE:
		case ProductConstants.CORE_GPU:
		case ProductConstants.CORE_MOBO:
		case ProductConstants.CORE_MONITOR:
		case ProductConstants.CORE_OPTICAL:
		case ProductConstants.CORE_PSU:
		case ProductConstants.CORE_RAM:
		case ProductConstants.CORE_STORAGE:
		case ProductConstants.ACC_CASE:
		case ProductConstants.ACC_FAN_CONTROLLER:
		case ProductConstants.ACC_THERMAL_COMPOUND:
		case ProductConstants.ACC_UPS:
		case ProductConstants.NW_SOUND_CARD:
		case ProductConstants.NW_WIRED_CARD:
		case ProductConstants.NW_WIRELESS_CARD:

		default:
			break;
		}
		if (type.equalsIgnoreCase(ProductConstants.CORE_CPU)) {
			try {
				Cpu newCpu = new ObjectMapper().readValue(product, Cpu.class);
				cpuService.createCpu(newCpu);
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
	public ResponseEntity<?> updateProduct(@RequestBody Cpu product, @PathVariable String type, @PathVariable int id) {
		switch (type) {
		case ProductConstants.CORE_CPU:
			return null;
		case ProductConstants.CORE_COOLER:
		case ProductConstants.CORE_CASE:
		case ProductConstants.CORE_GPU:
		case ProductConstants.CORE_MOBO:
		case ProductConstants.CORE_MONITOR:
		case ProductConstants.CORE_OPTICAL:
		case ProductConstants.CORE_PSU:
		case ProductConstants.CORE_RAM:
		case ProductConstants.CORE_STORAGE:
		case ProductConstants.ACC_CASE:
		case ProductConstants.ACC_FAN_CONTROLLER:
		case ProductConstants.ACC_THERMAL_COMPOUND:
		case ProductConstants.ACC_UPS:
		case ProductConstants.NW_SOUND_CARD:
		case ProductConstants.NW_WIRED_CARD:
		case ProductConstants.NW_WIRELESS_CARD:

		default:
			break;
		}
		System.out.println("in update product " + product);
		try {
			return ResponseEntity.ok(cpuService.updateCpuById(product));
		} catch (RuntimeException e) {
			System.out.println("err in controller " + e);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}