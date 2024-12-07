package edu.miu.cs544.moe.xml;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class GameImpl implements Game, InitializingBean, DisposableBean {
    private Vehicle vehicle;

    public GameImpl(Car vehicle) {
        this.vehicle = vehicle;
    }

    public void init() {
        System.out.println("init method is called.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct is called.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy is called.");
    }

    public void beforeDestroy() {
        System.out.println("before destroy method is called.");
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public void start() {
        vehicle.move();
    }

    @Override
    public void stop() {
        System.out.println("Game over!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set is called.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method is called.");
    }
}
