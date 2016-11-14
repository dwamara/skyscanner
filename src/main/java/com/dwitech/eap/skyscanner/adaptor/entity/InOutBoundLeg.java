package com.dwitech.eap.skyscanner.adaptor.entity;

import java.time.LocalDateTime;

public class InOutBoundLeg {

  private String carrier;
  private String origin;
  private String destination;
  private LocalDateTime departureDate;
  private LegType type;

  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(final String carrier) {
    this.carrier = carrier;
  }

  public String getOrigin() {
    return origin;
  }
  public void setOrigin(final String origin) {
    this.origin = origin;
  }

  public String getDestination() {
    return destination;
  }
  public void setDestination(final String destination) {
    this.destination = destination;
  }

  public LocalDateTime getDepartureDate() {
    return departureDate;
  }
  public void setDepartureDate(final LocalDateTime departureDate) {
    this.departureDate = departureDate;
  }

  public LegType getType() {
    return type;
  }
  public void setType(final LegType type) {
    this.type = type;
  }
}
