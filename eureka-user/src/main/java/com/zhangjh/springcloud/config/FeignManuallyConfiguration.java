package com.zhangjh.springcloud.config;

import com.zhangjh.springcloud.eurekauser.feign.ManuallyFeignClient;
import feign.Client;
import feign.Feign;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 手动创建Feign客户端 这个自己看
 */
//@Configuration
//@Import(FeignClientsConfiguration.class)
public class FeignManuallyConfiguration {

//    @Bean
//	public ManuallyFeignClient ManuallyCreateFeignController(
//			Decoder decoder, Encoder encoder, Client client) {
//		return Feign.builder().client(client)
//				.encoder(encoder)
//				.decoder(decoder)
////				.requestInterceptor(new BasicAuthRequestInterceptor("user", "user"))
//				.target(ManuallyFeignClient.class, "http://EUREKA-ORDER");
//    }

}