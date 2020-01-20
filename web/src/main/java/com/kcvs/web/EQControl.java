package com.kcvs.web;

import com.kcvs.service.OHTControlService;
import com.kcvs.service.impl.OHTControlServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class EQControl implements ServletContextListener {
    @Autowired
    WebApplicationContext webApplicationContext;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        BeanFactory.setWebApplicationContext(webApplicationContext);
        ServletContext servletContext = servletContextEvent.getServletContext();
        BeanFactory.setServletContext(servletContext);
        OHTControlService ohtControlService = BeanFactory.getBean(OHTControlServiceImpl.class);
        ((OHTControlServiceImpl) ohtControlService).setControlId("xiongxiong");
        ((OHTControlServiceImpl) ohtControlService).setIpAddress("192.168.10.94");
        ((OHTControlServiceImpl) ohtControlService).setPortNo(123);
        ohtControlService.startService();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        OHTControlService ohtControlService = BeanFactory.getBean(OHTControlServiceImpl.class);
        ohtControlService.stopService();
    }
}
