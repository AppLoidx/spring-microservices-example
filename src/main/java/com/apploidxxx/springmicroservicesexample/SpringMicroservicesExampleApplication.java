package com.apploidxxx.springmicroservicesexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringMicroservicesExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesExampleApplication.class, args);
    }

}
