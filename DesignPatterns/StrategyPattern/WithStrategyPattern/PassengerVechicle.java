package DesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVechicle extends Vehicle {
    PassengerVechicle() {
        super(new NormalDriveStrategy());
    }
}
