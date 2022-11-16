package ru.biybinaz.springpj;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Basta");
        songs.add("Miyagi");
        songs.add("Face");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
