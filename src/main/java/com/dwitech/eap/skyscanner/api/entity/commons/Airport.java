package com.dwitech.eap.skyscanner.api.entity.commons;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Airport {

	@SerializedName("iata") @Expose private String iata;
	@SerializedName("lon") @Expose private String lon;
	@SerializedName("iso") @Expose private String iso;
	@SerializedName("status") @Expose private Integer status;
	@SerializedName("name") @Expose private String name;
	@SerializedName("continent") @Expose private String continent;
	@SerializedName("type") @Expose private String type;
	@SerializedName("lat") @Expose private String lat;
	@SerializedName("size") @Expose private String size;

	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getIso() { return iso; }
	public void setIso(String iso) {
		this.iso = iso;
	}

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}
