package com.example.java_basic.service;

import com.example.java_basic.annotation.LogInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {

    @LogInfo
    public void doSomething() {
        log.info("do something");
    }
}
