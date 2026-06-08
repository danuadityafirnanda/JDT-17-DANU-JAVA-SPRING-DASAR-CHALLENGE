package com.indivaragroup.jdt17.spring.dasar.challenge.runner;

import com.indivaragroup.jdt17.spring.dasar.challenge.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CalculatorRunner implements ApplicationRunner {
    private final CalculatorService calculatorService;

    public void run(ApplicationArguments args) throws Exception {
        int a = 10, b = 5;
        System.out.println(a + " + " + b + " = " + calculatorService.add(a, b));
        System.out.println(a + " - " + b + " = " + calculatorService.subtract(a, b));
        System.out.println(a + " * " + b + " = " + calculatorService.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculatorService.divide(a, b));
    }
}
