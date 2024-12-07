package edu.miu.cs544.moe;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LoggingAspect implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("The " + target.getClass().getSimpleName() + " is moving...");
    }
}
