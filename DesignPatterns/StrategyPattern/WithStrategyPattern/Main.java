package DesignPatterns.StrategyPattern.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVechicle();
        vehicle.drive();
    }
}