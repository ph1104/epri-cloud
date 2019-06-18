package com.ph.epri.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author penghui
 * @date 2019/6/12 0012 15:00
 */
@EnableEurekaServer
@SpringBootApplication
public class EpriEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EpriEurekaApplication.class,args);
    }
}
