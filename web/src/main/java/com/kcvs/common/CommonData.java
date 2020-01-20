package com.kcvs.common;

import com.kcvs.domain.Port;
import com.kcvs.domain.Vehicle;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonData {
    //region Configuration
    public static List<Vehicle> vehInfo = new ArrayList<Vehicle>();
    public static List<Port> portTypeInfo = new ArrayList<Port>();
    //endregion

    public static Map<String, String> vehicleidList = new HashMap<String, String>();
    public static Map<String, String> portIdList = new HashMap<String, String>();
    public static Map<String, String> vehicleNoList = new HashMap<String, String>();
    public static Map<String, String> portNoList = new HashMap<String, String>();
    public static boolean testMode = false;
    // CommonSocket Conn
    public static Socket socket = null;
    public static boolean autoMoveFlag = false;
    public static String version = "v01";
    public static int timeoutSecondsToAcquire_ = 30;        // CST Pickup Timeout
    public static int timeoutSecondsToDeposit_ = 30;        // CST Deposit Timeout
    public static int timeoutSecondsToWaitin = 180;        // CST WaitIn Timeout

    public static Socket checkSocketConnection(String ipAdress, int socketPortNo) {
        try {
            if (socket != null && socket.isConnected()) {
                return socket;
            }
            String serverIp = ipAdress;
            int serverPort = socketPortNo;
            socket = new Socket(serverIp, serverPort);
            //socket.setSoTimeout();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return socket;
    }
}
