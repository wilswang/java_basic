package com.example.java_basic.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAspect {

//    @Around("@annotation(com.example.java_basic.annotation.LogInfo)")
    @Around("execution(* com.example.java_basic.service.TestService.doSomething(..))")
    public Object logInfo(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String className = proceedingJoinPoint.getSignature().getDeclaringType().getSimpleName();
        String annotatedMethodName = proceedingJoinPoint.getSignature().getName();

        log.info("[{}.{}] start", className, annotatedMethodName);

        Object object = proceedingJoinPoint.proceed();

        log.info("[{}.{}] end", className, annotatedMethodName);

        return object;
    }
}
