package com.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 为为
 * @create 6/17
 */

@EnableEurekaServer
@SpringBootApplication
public class Eureka7002App {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7002App.class);
    }
}