package com.zhangjh.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfiguration {

    /**
     * 自定义Ribbon
     *
     * @return
     */
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}