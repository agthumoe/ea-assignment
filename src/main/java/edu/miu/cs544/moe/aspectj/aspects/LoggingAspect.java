package edu.miu.cs544.moe.aspectj.aspects;

import edu.miu.cs544.moe.aspectj.Car;
import edu.miu.cs544.moe.aspectj.Game;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Around("execution(* edu.miu.cs544.moe.aspectj.Game.start(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Game game = (Game) proceedingJoinPoint.getTarget();
        if (game.getVehicle() instanceof Car) {
            System.out.println("Car is allowed to play the game.");
            proceedingJoinPoint.proceed();
        } else {
            System.out.println("Bike is not allowed to play the game.");
        }
    }
}
