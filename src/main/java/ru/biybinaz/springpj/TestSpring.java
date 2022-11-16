package ru.biybinaz.springpj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContest.xml"
        );
        MusiPlayer musiPlayer = context.getBean("musiPlayer", MusiPlayer.class);
        System.out.println(musiPlayer.getName());
        System.out.println(musiPlayer.getValue());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic2==classicalMusic);

        RockMusic rockMusic = context.getBean("rockMusic",RockMusic.class);
        RockMusic rockMusic1 = context.getBean("rockMusic",RockMusic.class);
        System.out.println(rockMusic1==rockMusic);
        context.close();

    }
}
