package com.dwitech.eap.skyscanner.api.entity.commons;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Locales {
	@SerializedName("Locales") @Expose private List<Locale> locales = new ArrayList<>();

	public List<Locale> getLocales() {
		return locales;
	}
	public void setLocales(List<Locale> locales) {
		this.locales = locales;
	}
}
