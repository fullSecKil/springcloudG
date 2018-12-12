package com.example.mavenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MavenserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenserviceApplication.class, args);
    }
}
