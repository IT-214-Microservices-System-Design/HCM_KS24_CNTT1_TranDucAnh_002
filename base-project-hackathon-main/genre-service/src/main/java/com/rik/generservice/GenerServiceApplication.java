package com.rik.generservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GenerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenerServiceApplication.class, args);
    }

}
