package com.example.consumefeign.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * [一句话描述该类的功能]
 *
 * @author qinshixin
 * @version 1.0.0
 * @createTime 2021/12/17 14
 */
@Slf4j
@Component
public class ProviderClientFallback implements FallbackFactory<ProviderClient> {
    
    @Override
    public ProviderClient create(Throwable cause) {
        return new ProviderClient() {
            @Override
            public String hello(String string) {
               log.error("hello调用异常:{}", cause);
                return null;
            }
            
            @Override
            public String hi(String string) {
                log.error("hi调用异常:{}" , cause);
                return null;
            }
        };
    }
}
