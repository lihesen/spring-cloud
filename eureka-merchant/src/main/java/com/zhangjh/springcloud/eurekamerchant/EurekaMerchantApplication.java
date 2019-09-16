package com.zhangjh.springcloud.eurekamerchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaMerchantApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMerchantApplication.class, args);
    }

}
