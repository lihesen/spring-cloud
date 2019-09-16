package com.zhangjh.springcloud.eurekauser.feign;

import com.zhangjh.springcloud.config.FeignConfiguration;
import com.zhangjh.springcloud.eurekaentity.entity.User;
import com.zhangjh.springcloud.eurekauser.hystrix.DefaultFeignHystrixFallback;
import com.zhangjh.springcloud.eurekauser.hystrix.DefaultFeignHystrixFallbackFactory;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @Author zhangjiahao
 * @Date 2019/9/13 19:37
 */
@FeignClient(name = "eureka-order",
        configuration = FeignConfiguration.class,
        fallback = DefaultFeignHystrixFallback.class,
        fallbackFactory = DefaultFeignHystrixFallbackFactory.class
)
public interface DefaultFeignClient {

    @RequestLine("GET get.url/{id}")
    URI getUrl(@Param("id") String id) throws URISyntaxException;

    /**
     * 注意：只要参数是复杂对象，即使指定GET请求，feign依然会以POST方法进行发送。
     *
     * @param user
     * @return
     */
    @RequestLine("POST eureka-instance")
    URI serviceUrl(@RequestBody User user) throws URISyntaxException;

}


