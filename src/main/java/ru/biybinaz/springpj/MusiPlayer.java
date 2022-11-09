package ru.biybinaz.springpj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusiPlayer {
    @Autowired
    @Qualifier("someClassicalMusic")
    private Music music;

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
