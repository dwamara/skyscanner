package com.dwitech.eap.skyscanner.api.entity.commons;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Route {

	@SerializedName("OriginId") @Expose private Integer originId;
	@SerializedName("DestinationId") @Expose private Integer destinationId;
	@SerializedName("QuoteIds") @Expose private List<Integer> quoteIds = new ArrayList<>();
	@SerializedName("Price") @Expose private Double price;
	@SerializedName("QuoteDateTime") @Expose private String quoteDateTime;

	public Integer getOriginId() {
		return originId;
	}
	public void setOriginId(Integer originId) {
		this.originId = originId;
	}

	public Integer getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(Integer destinationId) {
		this.destinationId = destinationId;
	}

	public List<Integer> getQuoteIds() {
		return quoteIds;
	}
	public void setQuoteIds(List<Integer> quoteIds) {
		this.quoteIds = quoteIds;
	}

	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	public String getQuoteDateTime() {
		return quoteDateTime;
	}
	public void setQuoteDateTime(String quoteDateTime) {
		this.quoteDateTime = quoteDateTime;
	}

}
