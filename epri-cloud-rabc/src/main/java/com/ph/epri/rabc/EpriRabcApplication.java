package com.ph.epri.rabc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author penghui
 * @date 2019/6/14 0014 8:58
 */
@MapperScan("com.ph.epri.rabc.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
//@EnableFeignClients
public class EpriRabcApplication {
    public static void main(String[] args) {
        SpringApplication.run(EpriRabcApplication.class,args);
    }
}
