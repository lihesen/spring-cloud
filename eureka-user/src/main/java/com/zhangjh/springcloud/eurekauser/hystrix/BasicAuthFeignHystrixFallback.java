package com.zhangjh.springcloud.eurekauser.hystrix;

import com.zhangjh.springcloud.eurekauser.feign.BasicAuthFeignClient;
import org.springframework.stereotype.Component;

@Component
public class BasicAuthFeignHystrixFallback implements BasicAuthFeignClient {

    @Override
    public String findEurekaByService(String serviceName) {
        return "haha";
    }
}