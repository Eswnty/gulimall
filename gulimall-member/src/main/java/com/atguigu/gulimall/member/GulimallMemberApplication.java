package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/*
* 1.想要调用远程服务
* （1）引入openfeign依赖
* （2）编写接口告诉spring cloud这个接口需要远程调用
* （3）开启远程调用功能  声明接口服务、添加EnableFeignClients注解
* */


@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
