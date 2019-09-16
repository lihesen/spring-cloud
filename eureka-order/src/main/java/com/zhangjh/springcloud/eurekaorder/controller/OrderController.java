package com.zhangjh.springcloud.eurekaorder.controller;

import com.zhangjh.springcloud.eurekaentity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("get.url/{id}")
    public URI getUrl(@PathVariable String id) {
        System.out.println("id = " + id);
        List<ServiceInstance> list = discoveryClient.getInstances("EUREKA-ORDER");
        if (list != null && list.size() > 0) {
            System.out.println(list.get(0).getUri());
            return list.get(0).getUri();
        }
        return null;
    }

    @PostMapping("eureka-instance")
    public URI serviceUrl(@RequestBody User user) {
        System.out.println(user.toString());
        List<ServiceInstance> list = discoveryClient.getInstances("EUREKA-ORDER");
        if (list != null && list.size() > 0) {
            return list.get(0).getUri();
        }
        return null;
    }

}
