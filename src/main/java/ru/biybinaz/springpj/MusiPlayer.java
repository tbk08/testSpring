package ru.biybinaz.springpj;

import java.util.ArrayList;
import java.util.List;

public class MusiPlayer {
    private Music music;

    public MusiPlayer(Music music) {
        this.music = music;
    }

    public MusiPlayer() {

    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {

        System.out.println("Playing: " + music.getSong());

    }
}
