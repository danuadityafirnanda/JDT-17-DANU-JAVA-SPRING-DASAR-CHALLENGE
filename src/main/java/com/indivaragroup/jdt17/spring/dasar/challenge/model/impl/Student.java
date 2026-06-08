package com.indivaragroup.jdt17.spring.dasar.challenge.model.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;

    public void print() {
        System.out.printf("%d - %s\n", id, name);
    }
}
