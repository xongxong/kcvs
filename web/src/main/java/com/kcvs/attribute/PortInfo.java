package com.kcvs.attribute;

public class PortInfo {

    public static final int _PLC_BASE_ADDR_RD_W_ = 5100;
    public static final int _PLC_BASE_ADDR_RD_B_ = 7001;
    public static final int _PLC_READ_COUNT_RD_W_ = 50;
    public static final int _PLC_READ_COUNT_RD_B_ = 50;
    public static final int _PLC_BASE_ADDR_CALM_ = 4000;

    public static class PlcRdBitData {
        public boolean PORT_MANUAL_MODE;
        public boolean PORT_AUTO_MODE;
        public boolean PORT_MODE_CHANGE_ENABLE;
        public boolean PORT_IN_MODE;
        public boolean PORT_OUT_MODE;
        public boolean WORK_ENABLE;
        public boolean MGV_MODE;
        public boolean PORT_DISABLE_CONFIRM;
        public boolean PORT_TEST_MODE;
        public boolean OHT_CV_CST_EXIST;
        public boolean MODE_CHANGE_ENABLE;
        public boolean EQ_IN_MODE;
        public boolean EQ_OUT_MODE;
        public boolean OHT_PORT_ERROR;
        public boolean IF_OHT_TO_VALID;
        public boolean IF_OHT_TRANSFER_REQUEST;
        public boolean IF_OHT_BUSY;
        public boolean IF_OHT_INPUT_COMPLETE;
        public boolean IF_OHT_OUTPUT_COMPLETE;
        public boolean IF_OHT_UNLOAD_MODE_ON;
        public boolean IF_OHT_AUTO_ON;
        public boolean IF_OHT_CST_EXIST;
        public boolean IF_EQ_LOAD_REQUEST;
        public boolean IF_EQ_UNLOAD_REQUEST;
        public boolean IF_EQ_READY;
        public boolean IF_EQ_INPUT_COMPLETE;
        public boolean IF_EQ_OUTPUT_COMPLETE;
        public boolean BIT_X_VEH_EMG_STOP;
        public boolean BIT_X_VEH_PORT_POSITION;
        public boolean BIT_X_VEH_CST_EXITST;
        public boolean BIT_X_VEH_CST_EMPTY;
        public boolean BIT_X_VEH_SHUTTER_OPEN;
        public boolean BIT_X_VEH_SHUTTER_CLOSE;
        public boolean BIT_X_VEH_DOWN_END;
        public boolean BIT_X_VEH_UP_END;
        public boolean BIT_Y_VEH_PORT_EMG_STOP;
        public boolean BIT_Y_VEH_PORT_AUTO;
        public boolean BIT_Y_VEH_PORT_DOWN_REQUEST;
        public boolean BIT_Y_VEH_PORT_UP_REQUEST;
        public boolean BIT_Y_VEH_PORT_SHUTTER_OPEN_REQ;
        public boolean BIT_Y_VEH_PORT_SHUTTER_CLOSE_REQ;
        public boolean BIT_Y_VEH_PORT_RESET;
        public boolean BIT_Y_VEH_PORT_DOWN_SENSING;
        public boolean VEHICLE_POSITION;
    }

    public static class PlcRdWordData {
        public int INTERFACE_STEP;
        public int CV1_OHT_AUTO_STEP;
        public int CV2_OHT_AUTO_STEP;
        public int CV3_OHT_AUTO_STEP;
        public int TestCode_W_4;
        public int CV1_INVERTER_CURRENT_SPEED;
        public int CV2_INVERTER_CURRENT_SPEED;
        public int CV3_INVERTER_CURRENT_SPEED;
        public int TestCode_W_8;
        public int CV1_INVERTER_ERROR_CODE;
        public int CV2_INVERTER_ERROR_CODE;
        public int CV3_INVERTER_ERROR_CODE;
        public int ALARM_BIT_1;
        public int ALARM_BIT_2;
        public int ALARM_BIT_3;
        public int ALARM_BIT_4;
        public int ALARM_BIT_5;
        public int ALARM_BIT_6;
        public int STATE_BIT_1;
        public int STATE_BIT_2;
        public int STATE_BIT_3;
        public int CONTROL_BIT_1;
        public int CONTROL_BIT_2;
        public int CONTROL_BIT_3;
        public int CV01_CST_ID;
        public int CV02_CST_ID;
        public int CV03_CST_ID;
        public int CST_EXIST_BIT;
    }

    public class DisplayData {
        public String PORT_ID;
        public String PORT_NO;
        public String PORT_TYPE;
        public String PORT_MODE;
        public String LOC_NO;
        public String CARRIER_ID;
        public String WORK_EXIST;
        public String WORK_IN_TIME;
        public String PORT_SERVICE_STATE;
        public String PORT_TRANSFER_STATE;
        public String PORT_INOUT_TYPE;
        public String ERROR_STATE;
        public String ALM_CODE;
        public String ALM_DESC;
        public String ACQUIRE_ENABLE;
        public String DEPOSIT_ENABLE;
        public String PORT_READY_ENABLE;
        public String PORT_INOUT_CHANGE_ENABLE;
        public String LINK_PORT;
        public String PORT_READY;
        public String CIM_DISABLE;
        public String MGV_MODE;
    }

    public static class PlcRdCommonAlarmWordData {
        public int ALARMWORD_COUNT;
        public int ALARMWORD1;
        public int ALARMWORD2;
        public int ALARMWORD3;
        public int ALARMWORD4;
        public int ALARMWORD5;
        public int ALARMWORD6;
        public int ALARMWORD7;
        public int ALARMWORD8;
        public int ALARMWORD9;
    }

    public static PlcRdBitData getPlcRdBitDataObject() {
        PlcRdBitData bitData = new PlcRdBitData();

        bitData.PORT_MANUAL_MODE = false;
        bitData.PORT_AUTO_MODE = false;
        bitData.PORT_MODE_CHANGE_ENABLE = false;
        bitData.PORT_IN_MODE = false;
        bitData.PORT_OUT_MODE = false;
        bitData.WORK_ENABLE = false;
        bitData.PORT_DISABLE_CONFIRM = false;
        bitData.PORT_TEST_MODE = false;
        bitData.OHT_CV_CST_EXIST = false;
        bitData.MODE_CHANGE_ENABLE = false;
        bitData.EQ_IN_MODE = false;
        bitData.EQ_OUT_MODE = false;
        bitData.OHT_PORT_ERROR = false;
        bitData.IF_OHT_TO_VALID = false;
        bitData.IF_OHT_TO_VALID = false;
        bitData.IF_OHT_TRANSFER_REQUEST = false;
        bitData.IF_OHT_BUSY = false;
        bitData.IF_OHT_INPUT_COMPLETE = false;
        bitData.IF_OHT_OUTPUT_COMPLETE = false;
        bitData.IF_OHT_UNLOAD_MODE_ON = false;
        bitData.IF_OHT_AUTO_ON = false;
        bitData.IF_OHT_CST_EXIST = false;
        bitData.IF_EQ_LOAD_REQUEST = false;
        bitData.IF_EQ_UNLOAD_REQUEST = false;
        bitData.IF_EQ_READY = false;
        bitData.IF_EQ_INPUT_COMPLETE = false;
        bitData.IF_EQ_OUTPUT_COMPLETE = false;
        bitData.BIT_X_VEH_EMG_STOP = false;
        bitData.BIT_X_VEH_PORT_POSITION = false;
        bitData.BIT_X_VEH_CST_EXITST = false;
        bitData.BIT_X_VEH_CST_EMPTY = false;
        bitData.BIT_X_VEH_SHUTTER_OPEN = false;
        bitData.BIT_X_VEH_SHUTTER_CLOSE = false;
        bitData.BIT_X_VEH_DOWN_END = false;
        bitData.BIT_X_VEH_UP_END = false;
        bitData.BIT_Y_VEH_PORT_EMG_STOP = false;
        bitData.BIT_Y_VEH_PORT_AUTO = false;
        bitData.BIT_Y_VEH_PORT_DOWN_REQUEST = false;
        bitData.BIT_Y_VEH_PORT_UP_REQUEST = false;
        bitData.BIT_Y_VEH_PORT_SHUTTER_OPEN_REQ = false;
        bitData.BIT_Y_VEH_PORT_SHUTTER_CLOSE_REQ = false;
        bitData.BIT_Y_VEH_PORT_RESET = false;
        bitData.BIT_Y_VEH_PORT_DOWN_SENSING = false;
        bitData.VEHICLE_POSITION = false;
        return bitData;
    }

    public static PlcRdWordData getPlcRdWordDataObject() {
        PlcRdWordData wordData = new PlcRdWordData();
        wordData.INTERFACE_STEP = 0;
        wordData.CV1_OHT_AUTO_STEP = 0;
        wordData.CV2_OHT_AUTO_STEP = 0;
        wordData.CV3_OHT_AUTO_STEP = 0;
        wordData.CV1_INVERTER_CURRENT_SPEED = 0;
        wordData.CV2_INVERTER_CURRENT_SPEED = 0;
        wordData.CV3_INVERTER_CURRENT_SPEED = 0;
        wordData.CV1_INVERTER_ERROR_CODE = 0;
        wordData.CV2_INVERTER_ERROR_CODE = 0;
        wordData.CV3_INVERTER_ERROR_CODE = 0;
        wordData.ALARM_BIT_1 = 0;
        wordData.ALARM_BIT_2 = 0;
        wordData.ALARM_BIT_3 = 0;
        wordData.ALARM_BIT_4 = 0;
        wordData.ALARM_BIT_5 = 0;
        wordData.ALARM_BIT_6 = 0;
        wordData.STATE_BIT_1 = 0;
        wordData.STATE_BIT_2 = 0;
        wordData.STATE_BIT_3 = 0;
        wordData.CONTROL_BIT_1 = 0;
        wordData.CONTROL_BIT_2 = 0;
        wordData.CONTROL_BIT_3 = 0;
        wordData.CV01_CST_ID = 0;
        wordData.CV02_CST_ID = 0;
        wordData.CV03_CST_ID = 0;
        return wordData;
    }

    public static PlcRdCommonAlarmWordData getPlcRdCommonAlarmWordDataObject() {
        PlcRdCommonAlarmWordData commonAlarm = new PlcRdCommonAlarmWordData();
        commonAlarm.ALARMWORD_COUNT = 0;
        commonAlarm.ALARMWORD1 = 0;
        commonAlarm.ALARMWORD2 = 0;
        commonAlarm.ALARMWORD3 = 0;
        commonAlarm.ALARMWORD4 = 0;
        commonAlarm.ALARMWORD5 = 0;
        commonAlarm.ALARMWORD6 = 0;
        commonAlarm.ALARMWORD7 = 0;
        commonAlarm.ALARMWORD8 = 0;
        commonAlarm.ALARMWORD9 = 0;
        return commonAlarm;
    }

    public static void updatePortDataFromPLCBit(String portId, PlcRdBitData bitdata, String portNo) {
        try {
            String sql = "";
        } catch (Exception ex) {
            
        }
    }

    enum portTransferState {
        OutOfService,
        InService;

    }
}
