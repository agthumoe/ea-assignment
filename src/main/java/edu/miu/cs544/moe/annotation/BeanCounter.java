package edu.miu.cs544.moe.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class BeanCounter implements BeanPostProcessor {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        count.incrementAndGet();
        return bean;
    }

    public int getCount() {
        return count.get();
    }
}
