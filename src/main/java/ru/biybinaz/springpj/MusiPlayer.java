package ru.biybinaz.springpj;

public class MusiPlayer {
    private Music music;
    private String name;
    private int volume;

    public MusiPlayer(Music music) {
        this.music = music;
    }
    public MusiPlayer(){

    }
    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }



    public void playMusic() {
        System.out.println("Play:" + music.getSong());
    }
}
