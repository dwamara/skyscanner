package com.dwitech.eap.skyscanner.api.entity.commons;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Quote {

	@SerializedName("QuoteId") @Expose private Integer quoteId;
	@SerializedName("MinPrice") @Expose private Double minPrice;
	@SerializedName("Direct") @Expose private Boolean direct;
	@SerializedName("OutboundLeg") @Expose private Leg outboundLeg;
	@SerializedName("QuoteDateTime") @Expose private String quoteDateTime;
	@SerializedName("InboundLeg") @Expose private Leg inboundLeg;

	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}

	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	public Boolean getDirect() {
		return direct;
	}
	public void setDirect(Boolean direct) {
		this.direct = direct;
	}

	public Leg getOutboundLeg() {
		return outboundLeg;
	}
	public void setOutboundLeg(Leg outboundLeg) {
		this.outboundLeg = outboundLeg;
	}

	public String getQuoteDateTime() {
		return quoteDateTime;
	}
	public void setQuoteDateTime(String quoteDateTime) {
		this.quoteDateTime = quoteDateTime;
	}

	public Leg getInboundLeg() {
		return inboundLeg;
	}
	public void setInboundLeg(Leg inboundLeg) {
		this.inboundLeg = inboundLeg;
	}
}
