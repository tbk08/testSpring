package ru.biybinaz.springpj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContest.xml"
        );
      /*
        Music music = context.getBean("musicBean", Music.class);
        MusiPlayer musiPlayer=new MusiPlayer(music);
        Music music2 = context.getBean("musicBean2", Music.class);
        MusiPlayer musiPlayer2=new MusiPlayer(music2);
        musiPlayer.playMusic();
        musiPlayer2.playMusic();

        MusiPlayer musiPlayer = context.getBean("musicPlayer", MusiPlayer.class);
        musiPlayer.playMusic();
        System.out.println(musiPlayer.getName());
        System.out.println(musiPlayer.getVolume());*/

        MusiPlayer musicPlayer = context.getBean("musicPlayer", MusiPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
