package edu.miu.cs544.moe.annotation.awares;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class MyBeanNameAware implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware is called: " + name);
    }
}
