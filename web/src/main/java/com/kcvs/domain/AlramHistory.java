package com.kcvs.domain;


public class AlramHistory {

  private String jobId;
  private long jobIdx;
  private String workDate;
  private String unitId;
  private double almCode;
  private String almDesc;
  private String mcsYn;
  private String clearYn;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp clearTime;
  private String alarmDivision;
  private String backupYn;


  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public long getJobIdx() {
    return jobIdx;
  }

  public void setJobIdx(long jobIdx) {
    this.jobIdx = jobIdx;
  }


  public String getWorkDate() {
    return workDate;
  }

  public void setWorkDate(String workDate) {
    this.workDate = workDate;
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


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getClearTime() {
    return clearTime;
  }

  public void setClearTime(java.sql.Timestamp clearTime) {
    this.clearTime = clearTime;
  }


  public String getAlarmDivision() {
    return alarmDivision;
  }

  public void setAlarmDivision(String alarmDivision) {
    this.alarmDivision = alarmDivision;
  }


  public String getBackupYn() {
    return backupYn;
  }

  public void setBackupYn(String backupYn) {
    this.backupYn = backupYn;
  }

}
