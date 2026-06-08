package com.indivaragroup.jdt17.spring.dasar.challenge.service;

import com.indivaragroup.jdt17.spring.dasar.challenge.model.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {
    private Animal animal;

    // ini secara otomatis pakai cat
    public AnimalService(@Qualifier("cat") Animal animal) {
        this.animal = animal;
    }

    public void getSound(){
        System.out.println(animal.sound());
    }
}
