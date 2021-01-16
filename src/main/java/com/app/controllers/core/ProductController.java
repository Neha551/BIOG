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
import com.app.services.core.interfaces.IExternalStorageService;
import com.app.services.core.interfaces.IGraphicsCardService;
import com.app.services.core.interfaces.IMonitorService;
import com.app.services.core.interfaces.IMotherboardService;
import com.app.services.core.interfaces.IOperatingSystemService;
import com.app.services.core.interfaces.IOpticalDriveService;
import com.app.services.core.interfaces.IPowerSupplyService;
import com.app.services.core.interfaces.IRAMemoryService;
import com.app.services.core.interfaces.ISoftwareService;
import com.app.services.core.interfaces.IStorageService;
import com.app.utils.ProductConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/products")
public class ProductController {
	// ***************** CORE(13) ***********************************

	// 1
	@Autowired
	private ICPUService cpuService;

	// 2
	@Autowired
	private IRAMemoryService ramService;

	// 3
	@Autowired
	private IPowerSupplyService powerSupplyService;

	// 4
	@Autowired
	private ICpuCaseService cpuCaseService;

	// 5
	@Autowired
	private ICpuCoolerService coolerService;

	// 6
	@Autowired
	private IGraphicsCardService gpuService;

	// 7
	@Autowired
	private IMotherboardService motherService;

	// 8
	@Autowired
	private IMonitorService monitorService;

	// 9
	@Autowired
	private IOpticalDriveService opticalDriveService;

	// 10
	@Autowired
	private IOperatingSystemService operatingSystemService;

	// 11
	@Autowired
	private ISoftwareService softwareService;

	// 12
	@Autowired
	private IStorageService storageService;

	// 13
	@Autowired
	private IExternalStorageService externalStorageService;

	// ************************************* ACCESSORIES (5)
	// ***************************************
	// ************************************* NETWORKING (3)
	// ******************************************
	// ************************************* PERIPHERALS (5)
	// ******************************************

	@GetMapping("/{type}")
	public ResponseEntity<?> showAllProductDetails(@PathVariable String type) {
		switch (type) {

		// ******************************* CORE(13)
		// *******************************************
		case ProductConstants.CORE_CPU:
			System.out.println("in fetch all Cpu Details");
			try {
				List<Product> products = cpuService.getAllCpu();
				return new ResponseEntity<>(products, HttpStatus.OK);
			}

			catch (Exception e) {
				// if (products.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_COOLER:
			System.out.println("in fetch all Cpu Cooler Details");
			try {
				List<Product> cooler = coolerService.getAllCpuCooler();
				// non empty list
				return new ResponseEntity<>(cooler, HttpStatus.OK);
			} catch (Exception e) {
				// chk if empty

				// if (cooler.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_CASE:
			System.out.println("in fetch cpu cases products");
			try {
				List<Product> cpuCase = cpuCaseService.getAllCpuCase();
				// non empty list
				return new ResponseEntity<>(cpuCase, HttpStatus.OK);
			} catch (Exception e) {
				// chk if empty

				// if (cooler.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_GPU:
			System.out.println("in fetch gpu products");
			try {
				List<Product> gpu = gpuService.getAllGraphicsCard();
				// non empty list
				return new ResponseEntity<>(gpu, HttpStatus.OK);
			}
			// chk if empty
			catch (Exception e) {// if (gpu.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_MOBO:
			System.out.println("in fetch motherboard products");
			try {
				List<Product> motherboard = motherService.getAllMotherboard();
				// non empty list
				return new ResponseEntity<>(motherboard, HttpStatus.OK);
			}

			catch (Exception e) {// chk if empty
									// if (motherboard.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_MONITOR:
			System.out.println("in fetch monitor products");
			try {
				List<Product> monitor = monitorService.getAllMonitor();
				// non empty list
				return new ResponseEntity<>(monitor, HttpStatus.OK);
			}

			catch (Exception e) {// chk if empty
									// if (motherboard.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_OPTICAL:
			System.out.println("in fetch optical drive products");
			try {
				List<Product> optical = opticalDriveService.getAllOpticalDrive();
				// non empty list
				return new ResponseEntity<>(optical, HttpStatus.OK);
			}

			catch (Exception e) {// chk if empty
									// if (motherboard.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_POWERSUPPLY:
			System.out.println("in fetch power supply  products");
			try {
				List<Product> powerSupply = powerSupplyService.getAllPowerSupply();
				// non empty list
				return new ResponseEntity<>(powerSupply, HttpStatus.OK);
			}

			catch (Exception e) {// chk if empty
									// if (motherboard.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_RAM:
			System.out.println("in fetch ram  products");
			try {
				List<Product> ram = ramService.getAllRAMMemory();
				// non empty list
				return new ResponseEntity<>(ram, HttpStatus.OK);
			}

			catch (Exception e) {// chk if empty
									// if (motherboard.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_STORAGE:

			System.out.println("in fetch storage products");
			try {
				List<Product> storage = storageService.getAllStorage();
				// non empty list
				return new ResponseEntity<>(storage, HttpStatus.OK);
			}

			catch (Exception e) {// chk if empty
									// if (motherboard.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_EXTSTORAGE:

			System.out.println("in fetch external storage products");
			try {
				List<Product> externalStorage = externalStorageService.getAllExternalStorage();
				// non empty list
				return new ResponseEntity<>(externalStorage, HttpStatus.OK);
			}

			catch (Exception e) {// chk if empty
									// if (motherboard.isEmpty())

				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_SOFTWARE:

			System.out.println("in fetch software products");
			try {
				List<Product> software = softwareService.getAllSoftware();
				// non empty list
				return new ResponseEntity<>(software, HttpStatus.OK);
			}

			catch (Exception e) { // chk if empty
									// if (motherboard.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		case ProductConstants.CORE_OS:

			System.out.println("in fetch external storage products");
			try {
				List<Product> operatingSystem = operatingSystemService.getAllOperatingSystem();
				// non empty list
				return new ResponseEntity<>(operatingSystem, HttpStatus.OK);
			}

			catch (Exception e) { // chk if empty
									// if (motherboard.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			// ************************************* ACCESSORIES (5)
			// ***************************************
		case ProductConstants.ACC_CASE:
			break;
		case ProductConstants.ACC_FAN_CONTROLLER:
			break;
		case ProductConstants.ACC_THERMAL_COMPOUND:
			break;
		case ProductConstants.ACC_UPS:
			break;

		// ************************************* NETWORKING (3)
		// ******************************************
		case ProductConstants.NW_SOUND_CARD:
			break;
		case ProductConstants.NW_WIRED_CARD:
			break;
		case ProductConstants.NW_WIRELESS_CARD:
			break;
		// ************************************* PERIPHERALS (5)
		// ******************************************
		default:
			break;
		}
		return null;
	}

	@GetMapping("/{type}/{id}")
	public Product showCpuDetailById(@PathVariable int id, @PathVariable String type) {
		switch (type) {
		case ProductConstants.CORE_CPU:
			break;
		case ProductConstants.CORE_COOLER:
			break;
		case ProductConstants.CORE_CASE:
			break;
		case ProductConstants.CORE_GPU:
			break;
		case ProductConstants.CORE_MOBO:
			break;
		case ProductConstants.CORE_MONITOR:
			break;
		case ProductConstants.CORE_OPTICAL:
			break;
		case ProductConstants.CORE_POWERSUPPLY:
			break;
		case ProductConstants.CORE_RAM:
			break;
		case ProductConstants.CORE_STORAGE:
			break;
		case ProductConstants.ACC_CASE:
			break;
		case ProductConstants.ACC_FAN_CONTROLLER:
			break;
		case ProductConstants.ACC_THERMAL_COMPOUND:
			break;
		case ProductConstants.ACC_UPS:
			break;
		case ProductConstants.NW_SOUND_CARD:
			break;
		case ProductConstants.NW_WIRED_CARD:
			break;
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
			break;
		case ProductConstants.CORE_COOLER:
			break;
		case ProductConstants.CORE_CASE:
			break;
		case ProductConstants.CORE_GPU:
			break;
		case ProductConstants.CORE_MOBO:
			break;
		case ProductConstants.CORE_MONITOR:
			break;
		case ProductConstants.CORE_OPTICAL:
			break;
		case ProductConstants.CORE_POWERSUPPLY:
			break;
		case ProductConstants.CORE_RAM:
			break;
		case ProductConstants.CORE_STORAGE:
			break;
		case ProductConstants.ACC_CASE:
			break;
		case ProductConstants.ACC_FAN_CONTROLLER:
			break;
		case ProductConstants.ACC_THERMAL_COMPOUND:
			break;
		case ProductConstants.ACC_UPS:
			break;
		case ProductConstants.NW_SOUND_CARD:
			break;
		case ProductConstants.NW_WIRED_CARD:
			break;
		case ProductConstants.NW_WIRELESS_CARD:
			break;

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
			break;
		case ProductConstants.CORE_COOLER:
			break;
		case ProductConstants.CORE_CASE:
			break;
		case ProductConstants.CORE_GPU:
			break;
		case ProductConstants.CORE_MOBO:
			break;
		case ProductConstants.CORE_MONITOR:
			break;
		case ProductConstants.CORE_OPTICAL:
			break;
		case ProductConstants.CORE_POWERSUPPLY:
			break;
		case ProductConstants.CORE_RAM:
			break;
		case ProductConstants.CORE_STORAGE:
			break;
		case ProductConstants.ACC_CASE:
			break;
		case ProductConstants.ACC_FAN_CONTROLLER:
			break;
		case ProductConstants.ACC_THERMAL_COMPOUND:
			break;
		case ProductConstants.ACC_UPS:
			break;
		case ProductConstants.NW_SOUND_CARD:
			break;
		case ProductConstants.NW_WIRED_CARD:
			break;
		case ProductConstants.NW_WIRELESS_CARD:
			break;

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
			break;
		case ProductConstants.CORE_COOLER:
			break;
		case ProductConstants.CORE_CASE:
			break;
		case ProductConstants.CORE_GPU:
			break;
		case ProductConstants.CORE_MOBO:
			break;
		case ProductConstants.CORE_MONITOR:
			break;
		case ProductConstants.CORE_OPTICAL:
			break;
		case ProductConstants.CORE_POWERSUPPLY:
			break;
		case ProductConstants.CORE_RAM:
			break;
		case ProductConstants.CORE_STORAGE:
			break;
		case ProductConstants.ACC_CASE:
			break;
		case ProductConstants.ACC_FAN_CONTROLLER:
			break;
		case ProductConstants.ACC_THERMAL_COMPOUND:
			break;
		case ProductConstants.ACC_UPS:
			break;
		case ProductConstants.NW_SOUND_CARD:
			break;
		case ProductConstants.NW_WIRED_CARD:
			break;
		case ProductConstants.NW_WIRELESS_CARD:
			break;

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