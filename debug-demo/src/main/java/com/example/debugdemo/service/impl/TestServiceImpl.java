package com.example.debugdemo.service.impl;

import com.example.debugdemo.service.TestService;
import org.springframework.stereotype.Service;

/**
 * [一句话描述该类的功能]
 *
 * @author qinshixin
 * @version 1.0.0
 * @createTime 2021/12/21 15
 */
@Service
public class TestServiceImpl implements TestService {
    
    @Override
    public void hello(int i) {
        System.out.println("hello:" + i);
        System.out.println("完1");
        System.out.println("完2");
    }
}
