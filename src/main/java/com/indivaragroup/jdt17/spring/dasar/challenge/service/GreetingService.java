package com.indivaragroup.jdt17.spring.dasar.challenge.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GreetingService {
    private final MessageService messageService;

    public void greet() {
        System.out.println(messageService.getMessage());
    }

    public String sayHello() {
        return "Hello Spring";
    }
}
