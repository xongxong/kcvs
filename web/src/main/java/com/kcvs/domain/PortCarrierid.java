package com.kcvs.domain;


public class PortCarrierid {

  private String portId;
  private String carrierId;
  private String portGroup;
  private String writeCmd;
  private String sendYn;
  private String mcsYn;
  private String timeOutOfService;
  private String mcsSendTime;


  public String getPortId() {
    return portId;
  }

  public void setPortId(String portId) {
    this.portId = portId;
  }


  public String getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
  }


  public String getPortGroup() {
    return portGroup;
  }

  public void setPortGroup(String portGroup) {
    this.portGroup = portGroup;
  }


  public String getWriteCmd() {
    return writeCmd;
  }

  public void setWriteCmd(String writeCmd) {
    this.writeCmd = writeCmd;
  }


  public String getSendYn() {
    return sendYn;
  }

  public void setSendYn(String sendYn) {
    this.sendYn = sendYn;
  }


  public String getMcsYn() {
    return mcsYn;
  }

  public void setMcsYn(String mcsYn) {
    this.mcsYn = mcsYn;
  }


  public String getTimeOutOfService() {
    return timeOutOfService;
  }

  public void setTimeOutOfService(String timeOutOfService) {
    this.timeOutOfService = timeOutOfService;
  }


  public String getMcsSendTime() {
    return mcsSendTime;
  }

  public void setMcsSendTime(String mcsSendTime) {
    this.mcsSendTime = mcsSendTime;
  }

}
