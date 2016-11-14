package com.dwitech.eap.skyscanner.api.entity.commons;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Dates {
	@SerializedName("OutboundDates") @Expose private List<OutboundDate> outboundDates = new ArrayList<>();

	public List<OutboundDate> getOutboundDates() {
		return outboundDates;
	}
	public void setOutboundDates(List<OutboundDate> outboundDates) {
		this.outboundDates = outboundDates;
	}

}
