package com.indivaragroup.jdt17.spring.dasar.challenge.model.impl;

import com.indivaragroup.jdt17.spring.dasar.challenge.model.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // secara default jika animal.sound() dipanggil, ini yang dipanggil
public class Dog implements Animal {
    @Override
    public String sound() {
        return "Woof";
    }
}
