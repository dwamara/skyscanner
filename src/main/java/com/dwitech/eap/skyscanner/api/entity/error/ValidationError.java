package com.dwitech.eap.skyscanner.api.entity.error;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ValidationError {

	@SerializedName("ParameterName") @Expose private String parameterName;
	@SerializedName("ParameterValue") @Expose private String parameterValue;
	@SerializedName("Message") @Expose private String message;

	public String getParameterName() {
		return parameterName;
	}
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getParameterValue() {
		return parameterValue;
	}
	public void setParameterValue(String parameterValue) {
		this.parameterValue = parameterValue;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
