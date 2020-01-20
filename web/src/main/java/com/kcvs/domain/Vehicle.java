package com.kcvs.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;
import java.util.Date;

@EntityScan
public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    //也是唯一的，Veh的ID号
    private String vehId;
    //主键编号
    private Integer vehNo;
    //Veh的描述
    private String vehDesc;
    //Veh状态，默认是1
    private Integer vehState;
    //Veh状态，MANUAL和AUTO两种情况，默认是MANUAL
    private String vehMode;
    //Veh控制状态，默认是0
    private String vehMotionState;
    //carrier的ID，默认是null
    private String carrierId;
    private String workExist;
    private Date workIntime;
    private String inRail;
    private Long curLocNo;
    private String curPortId;
    private String srcPortId;
    private String dstPortId;
    private String errorState;
    private String errorCode;
    private String carrierInstallTime;
    private String transferCmdId;
    private String transferingYn;
    private Long cmdDstPortNo;
    private String almCode;
    private String almCodeRemove;
    private String almDesc;
    private String almDescRemove;
    private Long curPositionNo;
    private String hoistState;
    private Long targetPosition;
    private String srcLoadingEnable;
    private String dstUnloadingEnable;
    private String destArrival;
    private String targetChangeEnable;
    private String transferEnable;
    private String workExist2;
    private String commError;

    public Vehicle() {
    }

    public Vehicle(String vehId, Integer vehNo, String vehDesc, Integer vehState, String vehMode, String vehMotionState, String carrierId, String workExist, Date workIntime, String inRail, Long curLocNo, String curPortId, String srcPortId, String dstPortId, String errorState, String errorCode, String carrierInstallTime, String transferCmdId, String transferingYn, Long cmdDstPortNo, String almCode, String almCodeRemove, String almDesc, String almDescRemove, Long curPositionNo, String hoistState, Long targetPosition, String srcLoadingEnable, String dstUnloadingEnable, String destArrival, String targetChangeEnable, String transferEnable, String workExist2, String commError) {
        this.vehNo = vehNo;
        this.vehId = vehId;
        this.vehDesc = vehDesc;
        this.vehState = vehState;
        this.vehMode = vehMode;
        this.vehMotionState = vehMotionState;
        this.carrierId = carrierId;
        this.workExist = workExist;
        this.workIntime = workIntime;
        this.inRail = inRail;
        this.curLocNo = curLocNo;
        this.curPortId = curPortId;
        this.srcPortId = srcPortId;
        this.dstPortId = dstPortId;
        this.errorState = errorState;
        this.errorCode = errorCode;
        this.carrierInstallTime = carrierInstallTime;
        this.transferCmdId = transferCmdId;
        this.transferingYn = transferingYn;
        this.cmdDstPortNo = cmdDstPortNo;
        this.almCode = almCode;
        this.almCodeRemove = almCodeRemove;
        this.almDesc = almDesc;
        this.almDescRemove = almDescRemove;
        this.curPositionNo = curPositionNo;
        this.hoistState = hoistState;
        this.targetPosition = targetPosition;
        this.srcLoadingEnable = srcLoadingEnable;
        this.dstUnloadingEnable = dstUnloadingEnable;
        this.destArrival = destArrival;
        this.targetChangeEnable = targetChangeEnable;
        this.transferEnable = transferEnable;
        this.workExist2 = workExist2;
        this.commError = commError;
    }

    public Integer getVehNo() {
        return vehNo;
    }

    public void setVehNo(Integer vehNo) {
        this.vehNo = vehNo;
    }

    public String getVehId() {
        return vehId;
    }

    public void setVehId(String vehId) {
        this.vehId = vehId;
    }

    public String getVehDesc() {
        return vehDesc;
    }

    public void setVehDesc(String vehDesc) {
        this.vehDesc = vehDesc;
    }

    public Integer getVehState() {
        return vehState;
    }

    public void setVehState(Integer vehState) {
        this.vehState = vehState;
    }

    public String getVehMode() {
        return vehMode;
    }

    public void setVehMode(String vehMode) {
        this.vehMode = vehMode;
    }

    public String getVehMotionState() {
        return vehMotionState;
    }

    public void setVehMotionState(String vehMotionState) {
        this.vehMotionState = vehMotionState;
    }

    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    public String getWorkExist() {
        return workExist;
    }

    public void setWorkExist(String workExist) {
        this.workExist = workExist;
    }

    public Date getWorkIntime() {
        return workIntime;
    }

    public void setWorkIntime(Date workIntime) {
        this.workIntime = workIntime;
    }

    public String getInRail() {
        return inRail;
    }

    public void setInRail(String inRail) {
        this.inRail = inRail;
    }

    public Long getCurLocNo() {
        return curLocNo;
    }

    public void setCurLocNo(Long curLocNo) {
        this.curLocNo = curLocNo;
    }

    public String getCurPortId() {
        return curPortId;
    }

    public void setCurPortId(String curPortId) {
        this.curPortId = curPortId;
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

    public String getErrorState() {
        return errorState;
    }

    public void setErrorState(String errorState) {
        this.errorState = errorState;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getCarrierInstallTime() {
        return carrierInstallTime;
    }

    public void setCarrierInstallTime(String carrierInstallTime) {
        this.carrierInstallTime = carrierInstallTime;
    }

    public String getTransferCmdId() {
        return transferCmdId;
    }

    public void setTransferCmdId(String transferCmdId) {
        this.transferCmdId = transferCmdId;
    }

    public String getTransferingYn() {
        return transferingYn;
    }

    public void setTransferingYn(String transferingYn) {
        this.transferingYn = transferingYn;
    }

    public Long getCmdDstPortNo() {
        return cmdDstPortNo;
    }

    public void setCmdDstPortNo(Long cmdDstPortNo) {
        this.cmdDstPortNo = cmdDstPortNo;
    }

    public String getAlmCode() {
        return almCode;
    }

    public void setAlmCode(String almCode) {
        this.almCode = almCode;
    }

    public String getAlmCodeRemove() {
        return almCodeRemove;
    }

    public void setAlmCodeRemove(String almCodeRemove) {
        this.almCodeRemove = almCodeRemove;
    }

    public String getAlmDesc() {
        return almDesc;
    }

    public void setAlmDesc(String almDesc) {
        this.almDesc = almDesc;
    }

    public String getAlmDescRemove() {
        return almDescRemove;
    }

    public void setAlmDescRemove(String almDescRemove) {
        this.almDescRemove = almDescRemove;
    }

    public Long getCurPositionNo() {
        return curPositionNo;
    }

    public void setCurPositionNo(Long curPositionNo) {
        this.curPositionNo = curPositionNo;
    }

    public String getHoistState() {
        return hoistState;
    }

    public void setHoistState(String hoistState) {
        this.hoistState = hoistState;
    }

    public Long getTargetPosition() {
        return targetPosition;
    }

    public void setTargetPosition(Long targetPosition) {
        this.targetPosition = targetPosition;
    }

    public String getSrcLoadingEnable() {
        return srcLoadingEnable;
    }

    public void setSrcLoadingEnable(String srcLoadingEnable) {
        this.srcLoadingEnable = srcLoadingEnable;
    }

    public String getDstUnloadingEnable() {
        return dstUnloadingEnable;
    }

    public void setDstUnloadingEnable(String dstUnloadingEnable) {
        this.dstUnloadingEnable = dstUnloadingEnable;
    }

    public String getDestArrival() {
        return destArrival;
    }

    public void setDestArrival(String destArrival) {
        this.destArrival = destArrival;
    }

    public String getTargetChangeEnable() {
        return targetChangeEnable;
    }

    public void setTargetChangeEnable(String targetChangeEnable) {
        this.targetChangeEnable = targetChangeEnable;
    }

    public String getTransferEnable() {
        return transferEnable;
    }

    public void setTransferEnable(String transferEnable) {
        this.transferEnable = transferEnable;
    }

    public String getWorkExist2() {
        return workExist2;
    }

    public void setWorkExist2(String workExist2) {
        this.workExist2 = workExist2;
    }

    public String getCommError() {
        return commError;
    }

    public void setCommError(String commError) {
        this.commError = commError;
    }
}
