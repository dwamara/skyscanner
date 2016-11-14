package com.dwitech.eap.skyscanner.adaptor.entity;

import java.time.LocalDate;

public class CheapestQuotesRequest {

  private String country;
  private String city;
  private String currency;
  private String locale;
  private LocalDate outboundPartialDate;
  private LocalDate inboundPartialDate;

  public String getCountry() {
    return country;
  }
  public void setCountry(final String country) {
    this.country = country;
  }

  public String getCity() {
    return city;
  }
  public void setCity(final String city) {
    this.city = city;
  }

  public String getCurrency() {
    return currency;
  }
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  public String getLocale() {
    return locale;
  }
  public void setLocale(final String locale) {
    this.locale = locale;
  }

  public LocalDate getOutboundPartialDate() {
    return outboundPartialDate;
  }
  public void setOutboundPartialDate(final LocalDate outboundPartialDate) {
    this.outboundPartialDate = outboundPartialDate;
  }

  public LocalDate getInboundPartialDate() {
    return inboundPartialDate;
  }
  public void setInboundPartialDate(final LocalDate inboundPartialDate) {
    this.inboundPartialDate = inboundPartialDate;
  }
}
