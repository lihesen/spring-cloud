package com.zhangjh.springcloud.eurekauser.hystrix;

import com.zhangjh.springcloud.eurekaentity.entity.User;
import com.zhangjh.springcloud.eurekauser.feign.DefaultFeignClient;
import com.zhangjh.springcloud.eurekauser.feign.DefaultFeignHystrixFallFactoryClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @Author zhangjiahao
 * @Date 2019/9/14 20:29
 */
@Component
public class DefaultFeignHystrixFallbackFactory implements FallbackFactory<DefaultFeignClient> {
    @Override
    public DefaultFeignClient create(Throwable throwable) {

        System.out.println("fallback; reason was: " + throwable.getMessage());

        return new DefaultFeignHystrixFallFactoryClient() {
            @Override
            public URI getUrl(String id) throws URISyntaxException {
                return new URI("http://localhost:8080");
            }

            @Override
            public URI serviceUrl(User user) throws URISyntaxException {
                return new URI("http://localhost:8082");
            }
        };
    }
}
