package com.zhangjh.springcloud.eurekauser.hystrix;

import com.zhangjh.springcloud.eurekaentity.entity.User;
import com.zhangjh.springcloud.eurekauser.feign.DefaultFeignClient;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class DefaultFeignHystrixFallback implements DefaultFeignClient {

    @Override
    public URI getUrl(String id) throws URISyntaxException {
        return new URI("http://localhost:80");
    }

    @Override
    public URI serviceUrl(User user) throws URISyntaxException {
        return new URI("http://localhost:82");
    }
}