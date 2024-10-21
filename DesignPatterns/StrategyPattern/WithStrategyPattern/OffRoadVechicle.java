package DesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVechicle extends Vehicle {
    public OffRoadVechicle() {
        super(new SportsDriveStrategy());
    }
}
