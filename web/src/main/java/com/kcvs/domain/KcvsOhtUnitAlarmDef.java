package com.kcvs.domain;


public class KcvsOhtUnitAlarmDef {

  private String unitId;
  private long wordIndex;
  private long bitIndex;
  private long alarmDivision;
  private long alarmCode;
  private String alarmDesc;
  private String alarmLevel;
  private String useYn;


  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }


  public long getWordIndex() {
    return wordIndex;
  }

  public void setWordIndex(long wordIndex) {
    this.wordIndex = wordIndex;
  }


  public long getBitIndex() {
    return bitIndex;
  }

  public void setBitIndex(long bitIndex) {
    this.bitIndex = bitIndex;
  }


  public long getAlarmDivision() {
    return alarmDivision;
  }

  public void setAlarmDivision(long alarmDivision) {
    this.alarmDivision = alarmDivision;
  }


  public long getAlarmCode() {
    return alarmCode;
  }

  public void setAlarmCode(long alarmCode) {
    this.alarmCode = alarmCode;
  }


  public String getAlarmDesc() {
    return alarmDesc;
  }

  public void setAlarmDesc(String alarmDesc) {
    this.alarmDesc = alarmDesc;
  }


  public String getAlarmLevel() {
    return alarmLevel;
  }

  public void setAlarmLevel(String alarmLevel) {
    this.alarmLevel = alarmLevel;
  }


  public String getUseYn() {
    return useYn;
  }

  public void setUseYn(String useYn) {
    this.useYn = useYn;
  }

}
