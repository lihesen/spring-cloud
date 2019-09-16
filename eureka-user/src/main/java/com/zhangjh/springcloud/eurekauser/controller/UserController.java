package com.zhangjh.springcloud.eurekauser.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhangjh.springcloud.eurekauser.feign.BasicAuthFeignClient;
import com.zhangjh.springcloud.eurekauser.feign.DefaultFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @Author zhangjiahao
 * @Date 2019/9/13 11:23
 */
@RestController
@Configuration
//@RibbonClient(name = "eureka-order", configuration = RibbonConfiguration.class)
public class UserController {

    @Autowired
    DefaultFeignClient userFeignClient;

    @Autowired
    BasicAuthFeignClient basicAuthFeignClient;

    /**
     * feign 中使用 hystrix
     *
     * @param id
     * @return
     */
    @GetMapping("test.ribbon/{id}")
    public URI getURI(@PathVariable String id) throws URISyntaxException {
        return userFeignClient.getUrl(id);
    }

//    /**
//     * ribbon 使用 hystrix
//     * @HystrixCommand
//     *  commandProperties 属性 传播安全上下文或使用Spring范围
//     * @param id
//     * @return
//     */
//    @GetMapping("test.ribbon/{id}")
//    @HystrixCommand(fallbackMethod = "hystixGetURI",
//            commandProperties = {
//            @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
//    })
//    public URI getURI(@PathVariable String id) {
//        return userFeignClient.getUrl(id);
//    }
//
//    public URI hystixGetURI(@PathVariable String id){
//        System.out.println("id = " + id);
//        return null;
//    }

    @GetMapping("test.eureka.service/{serviceName}")
    public String getEurekaService(@PathVariable String serviceName) {
        return basicAuthFeignClient.findEurekaByService(serviceName);
    }


//    手动创建feign客户端 测试
//    @Autowired
//    ManuallyFeignClient manuallyCreateFeignClient;
//
//    @GetMapping("test.ribbon/{id}")
//    public void getURI(@PathVariable String id) {
//        System.out.println("服务链接 = " + manuallyCreateFeignClient.getUrl(id));
//    }
}
