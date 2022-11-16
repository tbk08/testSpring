package ru.biybinaz.springpj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusiPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.value}")
    private int value;
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
    private Music music1;
    private Music music2;

    @Autowired
    public MusiPlayer(@Qualifier("rockMusic") Music music1,
                      @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing:" + music1.getSongs() + "," + music2.getSongs();
    }
}
