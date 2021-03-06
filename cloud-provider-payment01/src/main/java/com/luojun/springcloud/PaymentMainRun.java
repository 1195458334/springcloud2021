package com.luojun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentMainRun {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMainRun.class,args);
    }

}
