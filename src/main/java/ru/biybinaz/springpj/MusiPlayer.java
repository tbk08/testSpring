package ru.biybinaz.springpj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusiPlayer {
    private ClassicalMusic classicalMusic;
@Autowired
    public MusiPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }
    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
    }
}
