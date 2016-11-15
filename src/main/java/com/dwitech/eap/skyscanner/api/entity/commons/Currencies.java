package com.dwitech.eap.skyscanner.api.entity.commons;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Currencies {
	@SerializedName("Currencies") @Expose private List<Currency> currencies = new ArrayList<>();

	public List<Currency> getCurrencies() {
		return currencies;
	}
	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}

}
