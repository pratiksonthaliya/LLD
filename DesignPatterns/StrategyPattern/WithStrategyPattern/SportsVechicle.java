package DesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVechicle extends Vehicle {
    SportsVechicle() {
        super(new SportsDriveStrategy());
    }
}
