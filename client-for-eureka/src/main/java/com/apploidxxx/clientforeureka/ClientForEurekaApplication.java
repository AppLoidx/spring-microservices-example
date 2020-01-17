package com.apploidxxx.clientforeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientForEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientForEurekaApplication.class, args);
    }

}
