package com.app.entities.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name="graphics_card")
@JsonPropertyOrder(alphabetic = true)
public class GraphicsCard extends Product{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="graphics_id")
	private int id;
	
	@Column(length=50)
	private String chipset;
	
	//GB
	@Column(name="memory")
	private int videoMemory;
	
	//MHz
	@Column(name="core_clock")
	private int coreClock;
	
	//MHz
	@Column(name="boost_clock")
	private int boostClock;

	//millimeters(mm)
	private float length;
	
	@Column(name="thickness")
	private int thickNess;
	
	

	public GraphicsCard() {
		super();
		
	}


	public GraphicsCard(int id, String chipset, int videoMemory, int coreClock, int boostClock, float length,
			int thickNess,String name, String manufacturer, String brand, float price, boolean isAvailable,String imageUrl,String color) {
		super(name, manufacturer, brand, price, isAvailable, imageUrl, color);
		this.id = id;
		this.chipset = chipset;
		this.videoMemory = videoMemory;
		this.coreClock = coreClock;
		this.boostClock = boostClock;
		this.length = length;
		this.thickNess = thickNess;
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getChipset() {
		return chipset;
	}


	public void setChipset(String chipset) {
		this.chipset = chipset;
	}


	public int getVideoMemory() {
		return videoMemory;
	}


	public void setVideoMemory(int videoMemory) {
		this.videoMemory = videoMemory;
	}


	public int getCoreClock() {
		return coreClock;
	}


	public void setCoreClock(int coreClock) {
		this.coreClock = coreClock;
	}


	public int getBoostClock() {
		return boostClock;
	}


	public void setBoostClock(int boostClock) {
		this.boostClock = boostClock;
	}


	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public int getThickNess() {
		return thickNess;
	}


	public void setThickNess(int thickNess) {
		this.thickNess = thickNess;
	}


	


	@Override
	public String toString() {
		return "GraphicsCard [    "+super.toString()+"    id=" + id + ", chipset=" + chipset + ", videoMemory=" + videoMemory + ", coreClock="
				+ coreClock + ", boostClock=" + boostClock + ", length=" + length + ", thickNess=" + thickNess
				+ "]";
	}
	
	
	

}
