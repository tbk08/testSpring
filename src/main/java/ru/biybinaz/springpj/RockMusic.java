package ru.biybinaz.springpj;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Scrip";
    }
}
