package com.zhangjh.springcloud.eurekauser.feign;

import feign.Param;
import feign.RequestLine;

import java.net.URI;

/**
 * 手动创建 feign client
 */
public interface ManuallyFeignClient {

    @RequestLine("GET get.url/{id}")
    URI getUrl(@Param("id") String id);

}
