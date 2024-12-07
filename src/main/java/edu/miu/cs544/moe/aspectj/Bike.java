package edu.miu.cs544.moe.aspectj;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bike")
public class Bike implements Vehicle {
    public void move() {
        System.out.println("Bike is moving at 10mph");
    }

    public void init() {
        System.out.println("Bike init method is called");
    }
}
