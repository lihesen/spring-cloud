# spring cloud
**基于spring boot 搭建的spring cloud demo 框架。**

>版本

    springboot 2.1.8
    jdk12
    
>jdk官网 版本介绍

    https://docs.oracle.com/en/java/javase/
    
>springcloud中文官网
    
    https://www.springcloud.cc/spring-cloud-dalston.html
    
>springCloud 组件源码
    
    https://github.com/Netflix/eureka
    https://github.com/OpenFeign/feign
    https://github.com/Netflix/ribbon
    https://github.com/Netflix/hystrix
    https://github.com/Netflix/zuul
    
>项目目录
    
    主项目
        com.zhangjh
            springcloud
    从项目
        com.zhangjh.springcloud
            eureka-server       注册发现        8761
            eureka-order        订单服务        8091
            eureka-pay          支付服务        8092
            eureka-user         用户服务        8080
            eureka-commodity    商品服务        8093
            eureka-merchant     商家服务        8081
            eureka-turbine      监控系统        8010
            eureka-zuul         api网关         8011
            eureka-entity       实体类
            eureka-common       通用类
            eureka-api          api接口
