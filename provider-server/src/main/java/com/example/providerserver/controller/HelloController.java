package com.example.providerserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.conn.ConnectTimeoutException;
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
@Slf4j
@RestController
public class HelloController {
    
    @GetMapping(value = "/hello/{string}")
    public String hello(@PathVariable String string) throws Exception {
        log.info("请求hello方法");
        for (int i = 0; i < 40; i++) {
            Thread.sleep(1000);
        }
        log.info("完成hello");
        return "Hello " + string;
    }
    
    @PostMapping(value = "/hi/{string}")
    public String hi(@PathVariable String string) throws InterruptedException, ConnectTimeoutException {
        log.info("请求hi方法");
        for (int i = 0; i < 40; i++) {
            Thread.sleep(1000);
        }
        log.info("完成hi");
        return "Hi " + string;
    }

}
