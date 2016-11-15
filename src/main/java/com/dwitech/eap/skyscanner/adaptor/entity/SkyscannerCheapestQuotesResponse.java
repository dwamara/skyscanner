package com.dwitech.eap.skyscanner.adaptor.entity;

import java.util.List;

public class SkyscannerCheapestQuotesResponse {
  private List<SkyscannerQuote> quotes;

  public List<SkyscannerQuote> getQuotes() {
    return quotes;
  }
  public void setQuotes(final List<SkyscannerQuote> quotes) {
    this.quotes = quotes;
  }
}
