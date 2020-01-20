package com.kcvs.web;

import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

public class BeanFactory {
    private static ServletContext servletContext;
    private static WebApplicationContext webApplicationContext;

    private BeanFactory() {

    }

    public static ServletContext getServletContext() {
        return servletContext;
    }

    public static void setServletContext(ServletContext servletContext) {
        BeanFactory.servletContext = servletContext;
    }

    public static WebApplicationContext getWebApplicationContext() {
        return webApplicationContext;
    }

    public static void setWebApplicationContext(WebApplicationContext webApplicationContext) {
        BeanFactory.webApplicationContext = webApplicationContext;
    }

    public static <T> T getBean(Class<T> clazz) {
        return webApplicationContext.getBean(clazz);
    }

    public static Object getBean(String beanName) {
        return webApplicationContext.getBean(beanName);
    }
}
