package com.example.providerserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * [一句话描述该类的功能]
 *
 * @author qinshixin
 * @version 1.0.0
 * @createTime 2021/12/17 11
 */
@RestController
public class HelloController {
    
    @GetMapping(value = "/hello/{string}")
    public String hello(@PathVariable String string) throws Exception {
        System.out.println("请求hello方法");
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
        }
        System.out.println("完成hello");
        return "Hello " + string;
    }
    
    @PostMapping(value = "/hi/{string}")
    public String hi(@PathVariable String string) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
        }
        System.out.println("完成hi");
        return "Hi " + string;
    }

}
