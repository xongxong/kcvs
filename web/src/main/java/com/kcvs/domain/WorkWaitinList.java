package com.kcvs.domain;


public class WorkWaitinList {

  private String portId;
  private String portType;
  private String carrierId;
  private java.sql.Timestamp waitIntime;
  private String workIntime;


  public String getPortId() {
    return portId;
  }

  public void setPortId(String portId) {
    this.portId = portId;
  }


  public String getPortType() {
    return portType;
  }

  public void setPortType(String portType) {
    this.portType = portType;
  }


  public String getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
  }


  public java.sql.Timestamp getWaitIntime() {
    return waitIntime;
  }

  public void setWaitIntime(java.sql.Timestamp waitIntime) {
    this.waitIntime = waitIntime;
  }


  public String getWorkIntime() {
    return workIntime;
  }

  public void setWorkIntime(String workIntime) {
    this.workIntime = workIntime;
  }

}
