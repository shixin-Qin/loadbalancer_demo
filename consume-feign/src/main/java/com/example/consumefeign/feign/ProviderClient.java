package com.example.consumefeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "provide-server",fallbackFactory = ProviderClientFallback.class)
public interface ProviderClient {
    
    @GetMapping(value = "/hello/{string}")
    String hello(@PathVariable(value = "string") String string);
    
    @PostMapping(value = "/hi/{string}")
    String hi(@PathVariable(value = "string") String string);
    
}
