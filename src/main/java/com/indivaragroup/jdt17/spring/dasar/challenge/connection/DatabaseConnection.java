package com.indivaragroup.jdt17.spring.dasar.challenge.connection;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {

    @PostConstruct
    public void connect() {
        System.out.println("Database Connected");
    }

    @PreDestroy
    public void disconnect() {
        System.out.println("Database Disconnected");
    }
}
