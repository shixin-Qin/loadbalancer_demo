package com.example.consumefeign.controller;

import com.example.consumefeign.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @Autowired
    private ProviderClient providerClient;
    
    @GetMapping(value = "/hello/{string}")
    public String hello(@PathVariable String string) {
        return providerClient.hello(string);
    }
    
    @PostMapping(value = "/hi/{string}")
    public String hi(@PathVariable String string) {
        return providerClient.hi(string);
    }
    
}
