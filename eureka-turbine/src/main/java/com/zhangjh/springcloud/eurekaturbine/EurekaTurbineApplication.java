package com.zhangjh.springcloud.eurekaturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaTurbineApplication.class, args);
    }

}
