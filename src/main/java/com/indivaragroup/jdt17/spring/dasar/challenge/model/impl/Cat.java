package com.indivaragroup.jdt17.spring.dasar.challenge.model.impl;

import com.indivaragroup.jdt17.spring.dasar.challenge.model.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cat")
public class Cat implements Animal {
    @Override
    public String sound() {
        return "Meow";
    }
}
