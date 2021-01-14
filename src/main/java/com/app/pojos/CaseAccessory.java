package com.app.pojos;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name="case_accessory")
@JsonPropertyOrder(alphabetic = true)
public class CaseAccessory extends Product{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="case_accid")
	private int id;
	
	@Enumerated(EnumType.STRING)
	private CaseAccessoriesType type;
	
	@Column(name="form_factor")
	private float formFactor;
	
	
	public CaseAccessory() {
		super();
	}


	

	public CaseAccessory(int id, CaseAccessoriesType type, float formFactor,String name, String manufacturer, String brand, float price, boolean isAvailable) {
		super(name, manufacturer, brand, price, isAvailable);
		this.id = id;
		this.type = type;
		this.formFactor = formFactor;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public CaseAccessoriesType getType() {
		return type;
	}


	public void setType(CaseAccessoriesType type) {
		this.type = type;
	}


	public float getFormFactor() {
		return formFactor;
	}


	public void setFormFactor(float formFactor) {
		this.formFactor = formFactor;
	}


	@Override
	public String toString() {
		return "CaseAccessories [     "+super.toString()+"         id=" + id + ", type=" + type + ", formFactor=" + formFactor + "]";
	}
	

}
