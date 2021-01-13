package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "software")
@JsonPropertyOrder(alphabetic = true)
public class Software extends Product{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="software_id")
	private int id;
	
	private SoftwareType type;
	
	@Column(name="media_type",length=50)
	private String mediaType;
	
	public Software() {
		super();
	}

	public Software(int id, SoftwareType type, String mediaType,String name, String manufacturer, String brand, float price, boolean isAvailable) {
		super(name, manufacturer, brand, price, isAvailable);
		this.id = id;
		this.type = type;
		this.mediaType = mediaType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SoftwareType getType() {
		return type;
	}

	public void setType(SoftwareType type) {
		this.type = type;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	@Override
	public String toString() {
		return "Software [     "+super.toString()+"         id=" + id + ", type=" + type + ", mediaType=" + mediaType + "]";
	}


}
