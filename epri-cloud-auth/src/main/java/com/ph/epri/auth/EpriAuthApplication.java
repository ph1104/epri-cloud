package com.ph.epri.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author penghui
 * @date 2019/6/12 0012 10:07
 */
@MapperScan("com.ph.epri.auth.dao")
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class EpriAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(EpriAuthApplication.class,args);
    }

}
