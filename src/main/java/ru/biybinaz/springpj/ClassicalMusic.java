package ru.biybinaz.springpj;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Beethoven");
        songs.add("Mozart");
        songs.add("Balzac");

    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

}
