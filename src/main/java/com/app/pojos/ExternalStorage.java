package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "external_storage")
@JsonPropertyOrder(alphabetic = true)
public class ExternalStorage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="external_storageid")
	private int id;
	
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="storage_type")
	private ExternalStorageType type;
	
	@Column(name="interface",length=40)
	private String interFace;
	
	//GB
	private int capacity;
	
	@Column(length=30)
	private String color;
	
	public ExternalStorage() {
		super();
	}
	

}
