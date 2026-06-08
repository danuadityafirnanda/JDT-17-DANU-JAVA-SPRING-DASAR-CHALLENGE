package com.indivaragroup.jdt17.spring.dasar.challenge.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public String applicationName() {
        return "Spring Basic Training";
    }
}
