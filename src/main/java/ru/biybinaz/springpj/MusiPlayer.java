package ru.biybinaz.springpj;

import java.util.ArrayList;
import java.util.List;

public class MusiPlayer {
    private Music music;
    private String name;
    private int volume;

    public MusiPlayer(Music music) {
        this.music = music;
    }
    public MusiPlayer(){

    }
    private List<Music> musicList= new ArrayList<>();

    public void setMusic(Music music) {
        this.music = music;
    }
   public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
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

    public void playMusic()
    {
        for(Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
