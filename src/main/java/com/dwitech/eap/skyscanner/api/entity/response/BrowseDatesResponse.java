package com.dwitech.eap.skyscanner.api.entity.response;

import com.dwitech.eap.skyscanner.api.entity.commons.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class BrowseDatesResponse {
	@SerializedName("Dates") @Expose private Dates dates;
	@SerializedName("Quotes") @Expose private List<Quote> quotes = new ArrayList<>();
	@SerializedName("Places") @Expose private List<Place> places = new ArrayList<>();
	@SerializedName("Carriers") @Expose private List<Carrier> carriers = new ArrayList<>();
	@SerializedName("Currencies") @Expose private List<Currency> currencies = new ArrayList<>();

	public Dates getDates() {
		return dates;
	}
	public void setDates(Dates dates) {
		this.dates = dates;
	}

	public List<Quote> getQuotes() {
		return quotes;
	}
	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
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
