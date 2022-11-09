package ru.biybinaz.springpj;

public class MusiPlayer {
    private Music music;

    public MusiPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
    public MusiPlayer(){

    }

    public void playMusic() {
        System.out.println("Play:" + music.getSong());
    }
}
