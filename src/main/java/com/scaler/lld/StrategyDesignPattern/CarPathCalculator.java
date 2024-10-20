package com.scaler.lld.StrategyDesignPattern;

public class CarPathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Finding best Car Path");
    }
}
