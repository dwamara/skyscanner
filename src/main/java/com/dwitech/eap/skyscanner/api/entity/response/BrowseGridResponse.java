package com.dwitech.eap.skyscanner.api.entity.response;

import com.dwitech.eap.skyscanner.api.entity.commons.Carrier;
import com.dwitech.eap.skyscanner.api.entity.commons.Currency;
import com.dwitech.eap.skyscanner.api.entity.commons.Date;
import com.dwitech.eap.skyscanner.api.entity.commons.Place;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class BrowseGridResponse {
	@SerializedName("Dates") @Expose private List<List<Date>> dates = new ArrayList<>();
	@SerializedName("Places") @Expose private List<Place> places = new ArrayList<>();
	@SerializedName("Carriers") @Expose private List<Carrier> carriers = new ArrayList<>();
	@SerializedName("Currencies") @Expose private List<Currency> currencies = new ArrayList<>();

	public List<List<Date>> getDates() {
		return dates;
	}
	public void setDates(List<List<Date>> dates) {
		this.dates = dates;
	}

	public List<Place> getPlaces() {
		return places;
	}
	public void setPlaces(List<Place> places) {
		this.places = places;
	}

	public List<Carrier> getCarriers() {
		return carriers;
	}
	public void setCarriers(List<Carrier> carriers) {
		this.carriers = carriers;
	}

	public List<Currency> getCurrencies() {
		return currencies;
	}
	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}

}
