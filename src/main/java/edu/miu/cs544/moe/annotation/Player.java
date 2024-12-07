package edu.miu.cs544.moe.annotation;

import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Player implements AutoCloseable {
    public void play() {
        System.out.println("Prototype Player: " + this.toString() + " is playing");
    }

    @PreDestroy
    public void close() {
        System.out.println("Prototype Player: " + this.toString() + " is destroyed");
    }
}
