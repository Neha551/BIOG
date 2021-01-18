package com.app.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.app.entities.core.CPUCase;
import com.app.entities.core.CPUCooler;
import com.app.entities.core.Cpu;
import com.app.entities.core.ExternalStorage;
import com.app.entities.core.GraphicsCard;
import com.app.entities.core.Monitor;
import com.app.entities.core.Motherboard;
import com.app.entities.core.OperatingSystem;
import com.app.entities.core.OpticalDrive;
import com.app.entities.core.PowerSupply;
import com.app.entities.core.RAMMemory;
import com.app.entities.core.Software;
import com.app.entities.core.Storage;




@Entity
@Table(name="configured_pc")
public class ConfiguredPc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="configured_pc_id")
	private int id;
	
	@Column(length=30)
	private String type;
	
	@Column
	private String imageUrl;
	
	@Column
	private double price;
	
	
	
	  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false)
      @JoinColumn(name="pc_id")   
	  private List<RAMMemory> ramMemory=new ArrayList<RAMMemory>();
	  

	  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false) 
	  @JoinColumn(name="pc_id") 
	  private List<Software> software=new ArrayList<Software>();
	  
	  
	  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false)
	  @JoinColumn(name="pc_id") 
	  private List<GraphicsCard> graphicsCard= new ArrayList<GraphicsCard>();	  
	
	  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false)	  
	  @JoinColumn(name="pc_id") 
	  private List<ExternalStorage> externalStorage= new ArrayList<ExternalStorage>();
	
	  
	  
	  
	//@PrimaryKeyJoinColumn
	@OneToOne(orphanRemoval  = false)
	@JoinColumn(name="cpu_id") 
	private Cpu cpu;
	
	@OneToOne
	@JoinColumn(name="cpu_case_id") 
	private CPUCase cpuCase;
	  

	  @OneToOne
	  @JoinColumn(name="cooler_id") 
	  private CPUCooler cpuCooler;
	 
	  @OneToOne
	  @JoinColumn(name="monitor_id") 
	  private Monitor monitor;
	  
	  @OneToOne
	  
	  @JoinColumn(name="motherboard_id") 
	  private Motherboard motherBoard;
	  
	  @OneToOne
	  @JoinColumn(name="operating_system_id") 
	  private OperatingSystem operatingSystem;
	  
	  @OneToOne 
	  @JoinColumn(name="optical_id") 
	  private OpticalDrive opticalDrive;
	  
	  @OneToOne
	  @JoinColumn(name="psu_id") 
	  private PowerSupply powerSupply;
	  
	  @OneToOne
	  @JoinColumn(name="storage_id") 
	  private Storage storage;
	  
	
	  
	 	

	  



public ConfiguredPc() {
		super();
		// TODO Auto-generated constructor stub
	}




public ConfiguredPc(int id, String type, String imageUrl, double price, List<RAMMemory> ramMemory,
			List<Software> software, List<GraphicsCard> graphicsCard, List<ExternalStorage> externalStorage, Cpu cpu,
			CPUCase cpuCase, CPUCooler cpuCooler, Monitor monitor, Motherboard motherBoard,
			OperatingSystem operatingSystem, OpticalDrive opticalDrive, PowerSupply powerSupply, Storage storage) {
		super();
		this.id = id;
		this.type = type;
		this.imageUrl = imageUrl;
		this.price = price;
		this.ramMemory = ramMemory;
		this.software = software;
		this.graphicsCard = graphicsCard;
		this.externalStorage = externalStorage;
		this.cpu = cpu;
		this.cpuCase = cpuCase;
		this.cpuCooler = cpuCooler;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
		this.operatingSystem = operatingSystem;
		this.opticalDrive = opticalDrive;
		this.powerSupply = powerSupply;
		this.storage = storage;
	}




public Storage getStorage() {
		return storage;
	}




	public void setStorage(Storage storage) {
		this.storage = storage;
	}




public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public Cpu getCpu() {
		return cpu;
	}




	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}




	public CPUCase getCpuCase() {
		return cpuCase;
	}




	public void setCpuCase(CPUCase cpuCase) {
		this.cpuCase = cpuCase;
	}




	public CPUCooler getCpuCooler() {
		return cpuCooler;
	}




	public void setCpuCooler(CPUCooler cpuCooler) {
		this.cpuCooler = cpuCooler;
	}




	public Monitor getMonitor() {
		return monitor;
	}




	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}




	public Motherboard getMotherBoard() {
		return motherBoard;
	}




	public void setMotherBoard(Motherboard motherBoard) {
		this.motherBoard = motherBoard;
	}




	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}




	public void setOperatingSystem(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}




	public OpticalDrive getOpticalDrive() {
		return opticalDrive;
	}




	public void setOpticalDrive(OpticalDrive opticalDrive) {
		this.opticalDrive = opticalDrive;
	}




	public PowerSupply getPowerSupply() {
		return powerSupply;
	}




	public void setPowerSupply(PowerSupply powerSupply) {
		this.powerSupply = powerSupply;
	}

	
public List<RAMMemory> getRamMemory() {
		return ramMemory;
	}

	public void setRamMemory(List<RAMMemory> ramMemory) {
		this.ramMemory = ramMemory;
	}




	public List<Software> getSoftware() {
		return software;
	}




	public void setSoftware(List<Software> software) {
		this.software = software;
	}




	public List<GraphicsCard> getGraphicsCard() {
		return graphicsCard;
	}




	public void setGraphicsCard(List<GraphicsCard> graphicsCard) {
		this.graphicsCard = graphicsCard;
	}




	public List<ExternalStorage> getExternalStorage() {
		return externalStorage;
	}




	public void setExternalStorage(List<ExternalStorage> externalStorage) {
		this.externalStorage = externalStorage;
	}




	@Override
	public String toString() {
		return "ConfiguredPc [id=" + id + ", type=" + type + ", imageUrl=" + imageUrl + ", price=" + price
				+ ", ramMemory=" + ramMemory + ", software=" + software + ", graphicsCard=" + graphicsCard
				+ ", externalStorage=" + externalStorage + ", cpu=" + cpu + ", cpuCase=" + cpuCase + ", cpuCooler="
				+ cpuCooler + ", monitor=" + monitor + ", motherBoard=" + motherBoard + ", operatingSystem="
				+ operatingSystem + ", opticalDrive=" + opticalDrive + ", powerSupply=" + powerSupply + ", storage="
				+ storage + "]";
	}












}