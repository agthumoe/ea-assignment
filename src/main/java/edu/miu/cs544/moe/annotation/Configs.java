package edu.miu.cs544.moe.annotation;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.miu.cs544.moe.annotation")
public class Configs {
    @Bean(value = "bike", initMethod = "init")
    public Bike bike() {
        return new Bike();
    }

    @Bean
    public ProxyFactoryBean bikeProxy() {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(bike());
        proxyFactoryBean.setInterceptorNames("loggingAspect");
        return proxyFactoryBean;
    }
}
