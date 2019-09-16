package com.zhangjh.springcloud.eurekacommodity.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

/**
 * @Author zhangjiahao
 * @Date 2019/9/12 22:52
 */
@RestController
public class OrderController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("eureka-instance")
    public URI serviceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances("EUREKA-COMMODITY");
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri();
        }
        return null;
    }

}
