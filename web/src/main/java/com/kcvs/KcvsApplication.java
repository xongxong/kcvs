package com.kcvs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class KcvsApplication {
    public static void main(String[] args) {
        SpringApplication.run(KcvsApplication.class, args);
    }
}
