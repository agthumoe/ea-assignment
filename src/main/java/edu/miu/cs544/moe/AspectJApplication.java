package edu.miu.cs544.moe;


import edu.miu.cs544.moe.aspectj.Configs;
import edu.miu.cs544.moe.aspectj.Game;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectJApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Configs.class);
        Game game = context.getBean("game", Game.class);
        game.start();
        game.getPlayer().play();
        game.getPlayer().play(); // this should get new player.
        game.stop();
        context.close();
    }
}
