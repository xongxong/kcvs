package com.kcvs.web;


import com.kcvs.service.PortStatusMonitorService;
import com.kcvs.service.VehStatusMonitorService;
import com.kcvs.service.impl.PortStatusMonitorServiceImpl;
import com.kcvs.service.impl.VehStatusMonitorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class EQMonitor implements ServletContextListener {
    @Autowired
    WebApplicationContext webApplicationContext;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        BeanFactory.setWebApplicationContext(webApplicationContext);
        ServletContext servletContext = servletContextEvent.getServletContext();
        BeanFactory.setServletContext(servletContext);

        PortStatusMonitorService portStatusMonitorService = BeanFactory.getBean(PortStatusMonitorServiceImpl.class);
        ((PortStatusMonitorServiceImpl) portStatusMonitorService).setConnectionId("123");
        ((PortStatusMonitorServiceImpl) portStatusMonitorService).setIpAddress("192.168.10.95");
        ((PortStatusMonitorServiceImpl) portStatusMonitorService).setPortNo(1);
        ((PortStatusMonitorServiceImpl) portStatusMonitorService).setStartPortNo(12);
        ((PortStatusMonitorServiceImpl) portStatusMonitorService).setEndPortNo(120);
        portStatusMonitorService.startService();

        VehStatusMonitorService vehStatusMonitorService = BeanFactory.getBean(VehStatusMonitorServiceImpl.class);
        ((VehStatusMonitorServiceImpl) vehStatusMonitorService).setVehNo("123");
        ((VehStatusMonitorServiceImpl) vehStatusMonitorService).setIpAddress("192.168.10.94");
        ((VehStatusMonitorServiceImpl) vehStatusMonitorService).setPortNo(15);
        vehStatusMonitorService.startService();

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        PortStatusMonitorService portStatusMonitorService = BeanFactory.getBean(PortStatusMonitorServiceImpl.class);
        portStatusMonitorService.stopService();
    }
}
