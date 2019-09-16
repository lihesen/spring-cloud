package com.zhangjh.springcloud.eurekauser.feign;

import com.zhangjh.springcloud.config.FeignBasicAuthConfiguration;
import com.zhangjh.springcloud.eurekauser.hystrix.BasicAuthFeignHystrixFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 测试认证feign client
 */
@FeignClient(name = "XXXX", url = "http://localhost:8761/",
        configuration = FeignBasicAuthConfiguration.class,
        fallback = BasicAuthFeignHystrixFallback.class
)
public interface BasicAuthFeignClient {

    @GetMapping("eureka/apps/{serviceName}")
    String findEurekaByService(@PathVariable String serviceName);

}
