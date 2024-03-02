package com.example.java_basic.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
@Slf4j
public class TestServiceTest {

    @Autowired
    private TestService testService;

    @Test
    public void test() {
        log.info("start");
        testService.doSomething();
        log.info("end");
    }

    @Test
    public void test2() {
        String a = "abc";
        String b = "abc";
        StringUtils.equals(a, b);
        log.info("a:{}, b:{}", a.hashCode(), b.hashCode());
        log.info("a == b is {}", a == b);
        log.info("a equals b is {}", a.equals(b));
        String c = new String("abc");
        String d = new String("abc");
        log.info("c:{}, d:{}", c.hashCode(), d.hashCode());
        log.info("c == d is {}", c == d);
        log.info("c equals d is {}", c.equals(d));
        String e = c.intern();
        String f = d.intern();
        log.info("e == f is {}", e == f);
        log.info("e equals f is {}", e.equals(f));
//        Assert.isTrue();
    }

    @Test
    public void test3() {
        Integer a = 123;
        Integer b = 123;
        log.info("a:{}, b:{}", a.hashCode(), b.hashCode());
        log.info("a == b is {}", a == b);
        log.info("a equals b is {}", a.equals(b));
        Integer c = new Integer(123);
        Integer d = new Integer(123);
        log.info("c:{}, d:{}", c.hashCode(), d.hashCode());
        log.info("c == d is {}", c == d);
        log.info("c equals d is {}", c.equals(d));
//        Assert.isTrue();
    }
}
