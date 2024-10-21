package DesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    // Constructor Injection
    Vehicle(DriveStrategy strategy) {
        this.driveStrategy = strategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
