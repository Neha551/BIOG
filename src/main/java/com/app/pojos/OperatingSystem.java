package com.app.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name="operating_system")
@JsonPropertyOrder(alphabetic = true)
public class OperatingSystem extends Product{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="operating_system_id")
	private int id;
	
	@Enumerated(EnumType.STRING)
	@Column(length=50)
	private OSType type;
	
	@Enumerated(EnumType.STRING)
	@Column(name="mode")
	private ArchType architecture;
	
	//GB
	@Column(name="maximum_memory_support")
	private int maxMemSupport;
	


	public OperatingSystem() {
		super();
	}



	public OperatingSystem(int id, OSType type, ArchType architecture, int maxMemSupport,String name, String manufacturer, String brand, float price, boolean isAvailable) {
		super(name, manufacturer, brand, price, isAvailable);
		this.id = id;
		this.type = type;
		this.architecture = architecture;
		this.maxMemSupport = maxMemSupport;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public OSType getType() {
		return type;
	}



	public void setType(OSType type) {
		this.type = type;
	}



	public ArchType getArchitecture() {
		return architecture;
	}



	public void setArchitecture(ArchType architecture) {
		this.architecture = architecture;
	}



	public int getMaxMemSupport() {
		return maxMemSupport;
	}



	public void setMaxMemSupport(int maxMemSupport) {
		this.maxMemSupport = maxMemSupport;
	}



	@Override
	public String toString() {
		return "OperatingSystem [     "+super.toString()+"     id=" + id + ", type=" + type + ", architecture=" + architecture + ", maxMemSupport="
				+ maxMemSupport + "]";
	}

	
	

}




