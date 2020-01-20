package com.kcvs.domain;


public class TransferDetailShare {

  private String jobId;
  private String cmdId;
  private long msgNo;
  private String ceid;
  private String sendYn;
  private String sendTime;
  private String msgDesc;
  private String completeYn;
  private java.sql.Timestamp completeTime;
  private String backupYn;
  private String backupUpdate;


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


  public long getMsgNo() {
    return msgNo;
  }

  public void setMsgNo(long msgNo) {
    this.msgNo = msgNo;
  }


  public String getCeid() {
    return ceid;
  }

  public void setCeid(String ceid) {
    this.ceid = ceid;
  }


  public String getSendYn() {
    return sendYn;
  }

  public void setSendYn(String sendYn) {
    this.sendYn = sendYn;
  }


  public String getSendTime() {
    return sendTime;
  }

  public void setSendTime(String sendTime) {
    this.sendTime = sendTime;
  }


  public String getMsgDesc() {
    return msgDesc;
  }

  public void setMsgDesc(String msgDesc) {
    this.msgDesc = msgDesc;
  }


  public String getCompleteYn() {
    return completeYn;
  }

  public void setCompleteYn(String completeYn) {
    this.completeYn = completeYn;
  }


  public java.sql.Timestamp getCompleteTime() {
    return completeTime;
  }

  public void setCompleteTime(java.sql.Timestamp completeTime) {
    this.completeTime = completeTime;
  }


  public String getBackupYn() {
    return backupYn;
  }

  public void setBackupYn(String backupYn) {
    this.backupYn = backupYn;
  }


  public String getBackupUpdate() {
    return backupUpdate;
  }

  public void setBackupUpdate(String backupUpdate) {
    this.backupUpdate = backupUpdate;
  }

}
