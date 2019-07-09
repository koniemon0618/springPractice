package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLog {
 
    @Before("within(com.example.demo.Controller)")
    public void before(JoinPoint joinPoint) {
        System.out.println("<------- before "
        		+ joinPoint.getTarget().getClass() + "."//クラス名
        		+ joinPoint.getSignature().getName());//メソッド名
    }
}