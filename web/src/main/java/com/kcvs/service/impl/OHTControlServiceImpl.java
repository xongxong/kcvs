package com.kcvs.service.impl;

import com.kcvs.service.OHTControlService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OHTControlServiceImpl implements OHTControlService {
    private String controlId;
    private String ipAddress;
    private int portNo;
    private boolean serviceLife = false;
    private Thread worker = null;
    private Logger logger = LogManager.getLogger();

    public OHTControlServiceImpl() {
    }

    public OHTControlServiceImpl(String controlId, String ipAddress, int portNo, boolean serviceLife, Thread worker) {
        this.controlId = controlId;
        this.ipAddress = ipAddress;
        this.portNo = portNo;
        this.serviceLife = serviceLife;
        this.worker = worker;
    }

    public void setControlId(String controlId) {
        this.controlId = controlId;
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
        @Override
        public void run() {
            //logger.log();
            while (serviceLife) {
                logger.error("OHTControlService" + System.currentTimeMillis());
            }
        }
    }
}
