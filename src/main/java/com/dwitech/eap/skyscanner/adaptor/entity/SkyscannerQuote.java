package com.dwitech.eap.skyscanner.adaptor.entity;

public class SkyscannerQuote {
  private InOutBoundLeg outboundLeg;
  private InOutBoundLeg inboundLeg;
  private double price;
  private boolean direct;

  public InOutBoundLeg getOutboundLeg() {
    return outboundLeg;
  }
  public void setOutboundLeg(final InOutBoundLeg outboundLeg) {
    this.outboundLeg = outboundLeg;
  }

  public InOutBoundLeg getInboundLeg() {
    return inboundLeg;
  }
  public void setInboundLeg(final InOutBoundLeg inboundLeg) {
    this.inboundLeg = inboundLeg;
  }

  public double getPrice() {
    return price;
  }
  public void setPrice(final double price) {
    this.price = price;
  }

  public boolean isDirect() {
    return direct;
  }
  public void setDirect(final boolean direct) {
    this.direct = direct;
  }
}
