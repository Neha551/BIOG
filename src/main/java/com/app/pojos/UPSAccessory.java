package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name="ups_accessory")
@JsonPropertyOrder(alphabetic = true)
public class UPSAccessory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="ups_id")
	private int id;
	
	public UPSAccessory() {
		// TODO Auto-generated constructor stub
	}

}
