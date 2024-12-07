package edu.miu.cs544.moe.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("game")
public abstract class Game {
    private Vehicle vehicle;

    @Autowired
    public Game(@Qualifier("bikeProxy") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct method is called.");
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void start() {
        vehicle.move();
    }

    public void stop() {
        System.out.println("Game over!");
    }

    @Lookup
    public abstract Player getPlayer();

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy method is called.");
    }
}
