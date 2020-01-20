package com.kcvs.domain;


public class AlarmDef {

  private String jobId;
  private String unitId;
  private double almCode;
  private String almDesc;
  private String mcsYn;
  private String clearYn;
  private String createTime;
  private String clearTime;
  private String alarmDivision;

  public AlarmDef() {
  }

  public AlarmDef(String jobId, String unitId, double almCode, String almDesc, String mcsYn, String clearYn, String createTime, String clearTime, String alarmDivision) {
    this.jobId = jobId;
    this.unitId = unitId;
    this.almCode = almCode;
    this.almDesc = almDesc;
    this.mcsYn = mcsYn;
    this.clearYn = clearYn;
    this.createTime = createTime;
    this.clearTime = clearTime;
    this.alarmDivision = alarmDivision;
  }

  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }


  public double getAlmCode() {
    return almCode;
  }

  public void setAlmCode(double almCode) {
    this.almCode = almCode;
  }


  public String getAlmDesc() {
    return almDesc;
  }

  public void setAlmDesc(String almDesc) {
    this.almDesc = almDesc;
  }


  public String getMcsYn() {
    return mcsYn;
  }

  public void setMcsYn(String mcsYn) {
    this.mcsYn = mcsYn;
  }


  public String getClearYn() {
    return clearYn;
  }

  public void setClearYn(String clearYn) {
    this.clearYn = clearYn;
  }


  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public String getClearTime() {
    return clearTime;
  }

  public void setClearTime(String clearTime) {
    this.clearTime = clearTime;
  }


  public String getAlarmDivision() {
    return alarmDivision;
  }

  public void setAlarmDivision(String alarmDivision) {
    this.alarmDivision = alarmDivision;
  }

}
