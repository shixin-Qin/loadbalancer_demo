package com.example.providerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderServer8082Application {
    
    public static void main(String[] args) {
        SpringApplication.run(ProviderServer8082Application.class, args);
    }
    
}
