package com.tutorial.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 @SpringBootApplication
 meta annotation that pulls the following:
 1. component scanning
 2. autoconfiguration
 3. property support
 */
@SpringBootApplication
public class PayrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayrollApplication.class, args);
    }

}
