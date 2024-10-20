package com.scaler.lld.StrategyDesignPattern;

public class BikePathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Finding best Bike Path");
    }
}
