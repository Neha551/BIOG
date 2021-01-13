package com.app.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "power_supply")
@JsonPropertyOrder(alphabetic = true)
public class PowerSupply extends Product{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "psu_id")
	private int id;
	
	//ATX
	@Column(name = "form_factor")
	private String formFactor;
	
	//Watt
	private int wattage;
	
	// semi/fully/none
	private PowerModularType modular;  
	
	//80+gold,80+silver //Enum
	private PowerEfficiencyType efficiency;
	private String color;
	
	
	public PowerSupply() {
		super();
	}

	public PowerSupply(int id, String formFactor, int wattage, PowerModularType modular, PowerEfficiencyType efficiency, String color,String name, String manufacturer, String brand, float price, boolean isAvailable) {
		super(name, manufacturer, brand, price, isAvailable);
		this.id = id;
		this.formFactor = formFactor;
		this.wattage = wattage;
		this.modular = modular;
		this.efficiency = efficiency;
		this.color = color;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public int getWattage() {
		return wattage;
	}

	public void setWattage(int wattage) {
		this.wattage = wattage;
	}

	public   PowerModularType getModular() {
		return modular;
	}

	public void setModular(PowerModularType modular) {
		this.modular = modular;
	}

	public PowerEfficiencyType getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(PowerEfficiencyType efficiency) {
		this.efficiency = efficiency;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "PowerSupply [    "+super.toString()+ "      id=" + id + ", formFactor=" + formFactor + ", wattage=" + wattage + ", modular=" + modular
				+ ", efficiency=" + efficiency + ", color=" + color + "]";
	}

	

}
