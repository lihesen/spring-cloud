package com.zhangjh.springcloud.eurekapay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaPayApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPayApplication.class, args);
    }
}
