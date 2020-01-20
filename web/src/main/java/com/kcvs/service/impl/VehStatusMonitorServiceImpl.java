package com.kcvs.service.impl;

import com.kcvs.service.VehStatusMonitorService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class VehStatusMonitorServiceImpl implements VehStatusMonitorService {

    private String vehNo;
    private String ipAddress;
    private int portNo;
    private boolean serviceLife = true;
    private Thread worker = null;
    private Logger logger = LogManager.getLogger();

    public VehStatusMonitorServiceImpl() {
    }

    public VehStatusMonitorServiceImpl(String vehNo, String ipAddress, int portNo) {
        this.vehNo = vehNo;
        this.ipAddress = ipAddress;
        this.portNo = portNo;
    }

    public void setVehNo(String vehNo) {
        this.vehNo = vehNo;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setPortNo(int portNo) {
        this.portNo = portNo;
    }

    @Override
    public void startService() {
        serviceLife = true;
        if (worker == null) {
            worker = new Thread(new Service());
            worker.start();
        }
    }

    @Override
    public void stopService() {
        serviceLife = false;
        if (worker != null) {
            try {
                worker.join();
                worker = null;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class Service implements Runnable {
        boolean invokeEnable=false;

        @Override
        public void run() {
            while (serviceLife) {
                logger.debug("VehStatusMonitorService" + System.currentTimeMillis());
            }
        }
    }
}
