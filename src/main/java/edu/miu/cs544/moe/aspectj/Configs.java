package edu.miu.cs544.moe.aspectj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("edu.miu.cs544.moe.aspectj")
@EnableAspectJAutoProxy
public class Configs {

}
