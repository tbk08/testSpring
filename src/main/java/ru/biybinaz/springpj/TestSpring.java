package ru.biybinaz.springpj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContest.xml"
        );

        Music music = context.getBean("someClassicalMusic",Music.class);
        MusiPlayer musiPlayer = new MusiPlayer(music);
        musiPlayer.playMusic();
        Music music1 = context.getBean("rockMusic",Music.class);
        MusiPlayer musiPlayer1 = new MusiPlayer(music1);
        musiPlayer1.playMusic();
        context.close();
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
    /*
        // singleton and prototype
        MusiPlayer musicPlayer = context.getBean("musicPlayer", MusiPlayer.class);
        MusiPlayer musicPlayer1 = context.getBean("musicPlayer", MusiPlayer.class);
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer);
        musicPlayer1.setVolume(12);
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer.getVolume());

    */
        // init and destroy method
   /*
   ClassicalMusic = context.getBean("musicPlayer", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());*/

    }
}
