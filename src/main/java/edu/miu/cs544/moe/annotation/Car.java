package edu.miu.cs544.moe.annotation;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {
    public void move() {
        System.out.println("Car is moving at 15mph");
    }
}
