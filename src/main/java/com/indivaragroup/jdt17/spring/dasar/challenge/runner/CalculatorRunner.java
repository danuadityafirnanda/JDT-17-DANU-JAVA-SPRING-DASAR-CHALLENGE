package com.indivaragroup.jdt17.spring.dasar.challenge.runner;

import com.indivaragroup.jdt17.spring.dasar.challenge.service.CalculatorService;
import org.springframework.stereotype.Component;

@Component
public class CalculatorRunner {
    private CalculatorService calculatorService;

    public CalculatorRunner(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public void run(){
        int a = 10, b = 5;
        System.out.println(a + " + " + b + " = " + calculatorService.add(a, b));
        System.out.println(a + " - " + b + " = " + calculatorService.subtract(a, b));
        System.out.println(a + " * " + b + " = " + calculatorService.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculatorService.divide(a, b));
    }
}
