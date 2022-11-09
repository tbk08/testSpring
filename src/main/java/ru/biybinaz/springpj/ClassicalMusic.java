package ru.biybinaz.springpj;

import org.springframework.stereotype.Component;

@Component("someClassicalMusic")
public class ClassicalMusic implements Music{
//annotation component
    @Override
    public String getSong() {
        return "Shopen";
    }
}
