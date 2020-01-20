package com.kcvs.domain;


public class ManualOrder {

  private String iD;
  private String jobId;
  private String cmdId;
  private String unitId;
  private String carrierid;
  private long priority;
  private String srcPortId;
  private String dstPortId;
  private String interlock;
  private String inRail;
  private String vehState;
  private String portMode;
  private String cmdSeq;
  private java.sql.Timestamp createDate;
  private String ohtYn;
  private String mcsYn;
  private String transferState;
  private String removeState;
  private String removeGubn;


  public String getID() {
    return iD;
  }

  public void setID(String iD) {
    this.iD = iD;
  }


  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public String getCmdId() {
    return cmdId;
  }

  public void setCmdId(String cmdId) {
    this.cmdId = cmdId;
  }


  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }


  public String getCarrierid() {
    return carrierid;
  }

  public void setCarrierid(String carrierid) {
    this.carrierid = carrierid;
  }


  public long getPriority() {
    return priority;
  }

  public void setPriority(long priority) {
    this.priority = priority;
  }


  public String getSrcPortId() {
    return srcPortId;
  }

  public void setSrcPortId(String srcPortId) {
    this.srcPortId = srcPortId;
  }


  public String getDstPortId() {
    return dstPortId;
  }

  public void setDstPortId(String dstPortId) {
    this.dstPortId = dstPortId;
  }


  public String getInterlock() {
    return interlock;
  }

  public void setInterlock(String interlock) {
    this.interlock = interlock;
  }


  public String getInRail() {
    return inRail;
  }

  public void setInRail(String inRail) {
    this.inRail = inRail;
  }


  public String getVehState() {
    return vehState;
  }

  public void setVehState(String vehState) {
    this.vehState = vehState;
  }


  public String getPortMode() {
    return portMode;
  }

  public void setPortMode(String portMode) {
    this.portMode = portMode;
  }


  public String getCmdSeq() {
    return cmdSeq;
  }

  public void setCmdSeq(String cmdSeq) {
    this.cmdSeq = cmdSeq;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public String getOhtYn() {
    return ohtYn;
  }

  public void setOhtYn(String ohtYn) {
    this.ohtYn = ohtYn;
  }


  public String getMcsYn() {
    return mcsYn;
  }

  public void setMcsYn(String mcsYn) {
    this.mcsYn = mcsYn;
  }


  public String getTransferState() {
    return transferState;
  }

  public void setTransferState(String transferState) {
    this.transferState = transferState;
  }


  public String getRemoveState() {
    return removeState;
  }

  public void setRemoveState(String removeState) {
    this.removeState = removeState;
  }


  public String getRemoveGubn() {
    return removeGubn;
  }

  public void setRemoveGubn(String removeGubn) {
    this.removeGubn = removeGubn;
  }

}
