package edu.miu.cs544.moe.annotation.aspects;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class LoggingAspect implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Logging Aspect, before : " + target.getClass() + " : " + method.getName());
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Logging Aspect, after : " + target.getClass() + " : " + method.getName());
    }
}
