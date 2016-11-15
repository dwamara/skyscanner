package com.dwitech.eap.skyscanner.api.entity.request;

public class CommonRequest {
	protected String apiKey;
	protected String market;
	protected String currency;
	protected String locale;
	protected String originPlace;
	protected String destinationPlace;
	protected String outboundPartialDate;
	protected String inboundPartialDate;

	public String getMarket() {
		return market;
	}
	public void setMarket(final String marketValue) {
		market = marketValue;
	}

	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(final String apiKeyValue) {
		apiKey = apiKeyValue;
	}

	public String getCurrency() {
		return currency;
	}
	public void setCurrency(final String currencyValue) {
		currency = currencyValue;
	}

	public String getLocale() {
		return locale;
	}
	public void setLocale(final String localeValue) {
		locale = localeValue;
	}

	public String getOriginPlace() {
		return originPlace;
	}
	public void setOriginPlace(final String originPlaceValue) {
		originPlace = originPlaceValue;
	}

	public String getDestinationPlace() {
		return destinationPlace;
	}
	public void setDestinationPlace(final String destinationPlaceValue) {
		destinationPlace = destinationPlaceValue;
	}

	public String getOutboundPartialDate() {
		return outboundPartialDate;
	}
	public void setOutboundPartialDate(final String outboundPartialDateValue) {
		outboundPartialDate = outboundPartialDateValue;
	}

	public String getInboundPartialDate() {
		return inboundPartialDate;
	}
	public void setInboundPartialDate(final String inboundPartialDateValue) {
		inboundPartialDate = inboundPartialDateValue;
	}
}
