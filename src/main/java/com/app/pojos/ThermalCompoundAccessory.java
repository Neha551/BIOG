package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name="thermalcompound_accessory")
@JsonPropertyOrder(alphabetic = true)
public class ThermalCompoundAccessory  extends Product{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="thermalcompound_id")
	private int id;
	
	//in grams
	private float amount;
	
	
	
	
	public ThermalCompoundAccessory() {
		super();
	}


	public ThermalCompoundAccessory(int id, float amount,String name, String manufacturer, String brand, float price, boolean isAvailable) {
		super(name, manufacturer, brand, price, isAvailable);
		this.id = id;
		this.amount = amount;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public float getAmount() {
		return amount;
	}




	public void setAmount(float amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "ThermalCompoundAccessory [       "+super.toString()+"       id=" + id + ", amount=" + amount + "]";
	}
	
	

}
