package DesignPatterns.StrategyPattern.WithoutStrategyPattern;

public class SportsVechicle extends Vehicle {
    @Override
    public void drive() {
        // differnt drive logic
        System.out.println("Sporty driving");
    }

}
