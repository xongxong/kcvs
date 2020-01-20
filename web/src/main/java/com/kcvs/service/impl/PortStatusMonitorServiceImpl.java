package com.kcvs.service.impl;

import com.kcvs.service.PortStatusMonitorService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PortStatusMonitorServiceImpl implements PortStatusMonitorService {

    private String connectionId;
    private String ipAddress;
    private int portNo;
    private int startPortNo;
    private int endPortNo;
    private boolean serviceLife = false;
    private Thread worker = null;

    public PortStatusMonitorServiceImpl() {
    }

    public PortStatusMonitorServiceImpl(String connectionId, String ipAddress, int portNo, int startPortNo, int endPortNo) {
        this.connectionId = connectionId;
        this.ipAddress = ipAddress;
        this.portNo = portNo;
        this.startPortNo = startPortNo;
        this.endPortNo = endPortNo;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setPortNo(int portNo) {
        this.portNo = portNo;
    }

    public void setStartPortNo(int startPortNo) {
        this.startPortNo = startPortNo;
    }

    public void setEndPortNo(int endPortNo) {
        this.endPortNo = endPortNo;
    }

    @Override
    public void startService() {
        serviceLife = true;
        worker = new Thread(new Service());
        worker.start();
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
            while (serviceLife) {

            }
        }
    }
}
