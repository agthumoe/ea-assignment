package edu.miu.cs544.moe;

import edu.miu.cs544.moe.xml.Game;
import edu.miu.cs544.moe.xml.GameImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBasedApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("configs.xml");
        Game game = (Game) context.getBean("gameProxy");
        game.start();
        game.stop();
        context.close();
    }
}
