package com.zhangjh.springcloud.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    /**
     * 覆盖Feign默认值
     *
     * @return
     */
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    /**
     * feign 日志配置
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
