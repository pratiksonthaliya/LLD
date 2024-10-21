package DesignPatterns.StrategyPattern.WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle {
    @Override
    public void drive() {
        // differnt drive logic
        System.out.println("Off-road driving");
    }
}