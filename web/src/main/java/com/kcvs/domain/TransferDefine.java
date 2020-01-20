package com.kcvs.domain;


public class TransferDefine {

  private String msgId;
  private long msgNo;
  private String ceid;
  private long seq;
  private String scenarioNo;
  private String scenarioDesc;


  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
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


  public long getSeq() {
    return seq;
  }

  public void setSeq(long seq) {
    this.seq = seq;
  }


  public String getScenarioNo() {
    return scenarioNo;
  }

  public void setScenarioNo(String scenarioNo) {
    this.scenarioNo = scenarioNo;
  }


  public String getScenarioDesc() {
    return scenarioDesc;
  }

  public void setScenarioDesc(String scenarioDesc) {
    this.scenarioDesc = scenarioDesc;
  }

}
