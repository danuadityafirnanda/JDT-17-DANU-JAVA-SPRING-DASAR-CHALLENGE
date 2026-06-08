package com.indivaragroup.jdt17.spring.dasar.challenge.service;

import com.indivaragroup.jdt17.spring.dasar.challenge.model.impl.Ball;
import org.springframework.stereotype.Component;

@Component
public class BallService {
    private final Ball blueBall;
    private final Ball otherBall;

    public BallService() {
        this.blueBall = new Ball("Blue", 0);
        this.otherBall = new Ball("Other", 0);
    }

    public void calculateBlueBallTargetPercentage(int percentage) {
        int ballTaken = 0;

        System.out.println("(Before) Blue Ball : " + blueBall.getQuantity() + " | Other Ball : " + otherBall.getQuantity());
        System.out.println("(Before) Blue Ball Percentage : " + blueBallPercentage());

        while (blueBallPercentage() > percentage) {
            blueBall.setQuantity(blueBall.getQuantity() - 1);
            ballTaken++;
        }

        System.out.println("(After) Blue Ball : " + blueBall.getQuantity() + " | Other Ball : " + otherBall.getQuantity());
        System.out.println("(After) Blue Ball Percentage : " + blueBallPercentage());
        System.out.println("Total Taken Blue Balls : " + ballTaken);
    }

    public void setBlueBallQuantity(int quantity) {
        blueBall.setQuantity(quantity);
    }

    public void setOtherBallQuantity(int quantity) {
        otherBall.setQuantity(quantity);
    }

    private double blueBallPercentage() {
        return ((double) blueBall.getQuantity() / (blueBall.getQuantity() + otherBall.getQuantity())) * 100.0;
    }
}