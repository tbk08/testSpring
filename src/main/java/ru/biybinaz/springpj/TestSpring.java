package ru.biybinaz.springpj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContest.xml"
        );
        MusiPlayer musiPlayer=context.getBean("musiPlayer",MusiPlayer.class);
        musiPlayer.playMusic();
        context.close();


    }
}
