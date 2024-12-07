package edu.miu.cs544.moe.aspectj.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* edu.miu.cs544.moe.aspectj.Vehicle.*())")
    public void before(JoinPoint joinPoint) {
        System.out.println("Logging Aspect, before : " + joinPoint.getSignature().getDeclaringTypeName() + " : " + joinPoint.getSignature().getName());
    }


    @After("execution(* edu.miu.cs544.moe.aspectj.Vehicle.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("Logging Aspect, after : " + joinPoint.getSignature().getDeclaringTypeName() + " : " + joinPoint.getSignature().getName());
    }
}
