package com.app.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@Entity
@Table(name="cpu_cooler")
@JsonPropertyOrder(alphabetic = true)
public class CPUCooler extends Product{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="cooler_id")
	private int id;
	
	//it can be in rpm (no ranges allow in database)
	@Column(name="fan_rpm")
	private int fanRpm;
	
	//unit in db
	@Column(name="noise_level")
	private float noiseLevel;
	
	//unit in mm
	@Column(name="radiator_size")
	private int radiatorSize;
	
	private String color;
	
	public CPUCooler() {
          
		super();
	}


	public CPUCooler(int id, int fanRpm, int radiatorSize, float noiseLevel,String color,String name, String manufacturer, String brand, float price, boolean isAvailable) {
		super(name, manufacturer, brand, price, isAvailable);
		this.id = id;
		this.noiseLevel=noiseLevel;
		this.fanRpm = fanRpm;
		this.radiatorSize = radiatorSize;
		this.color = color;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	

	public float getNoiseLevel() {
		return noiseLevel;
	}


	public void setNoiseLevel(float noiseLevel) {
		this.noiseLevel = noiseLevel;
	}


	public int getFanRpm() {
		return fanRpm;
	}


	public void setFanRpm(int fanRpm) {
		this.fanRpm = fanRpm;
	}


	public int getRadiatorSize() {
		return radiatorSize;
	}


	public void setRadiatorSize(int radiatorSize) {
		this.radiatorSize = radiatorSize;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "CPUCooler [  " +super.toString()+ "   id=" + id + ", fanRpm=" + fanRpm + ", noiseLevel=" + noiseLevel + ", radiatorSize="
				+ radiatorSize + ", color=" + color + "]";
	}


	

}
