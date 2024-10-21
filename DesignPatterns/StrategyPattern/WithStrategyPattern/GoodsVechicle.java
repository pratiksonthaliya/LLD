package DesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVechicle extends Vehicle {
    GoodsVechicle() {
        super(new NormalDriveStrategy());
    }
}
