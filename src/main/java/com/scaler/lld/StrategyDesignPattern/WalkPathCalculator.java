package com.scaler.lld.StrategyDesignPattern;

public class WalkPathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Finding best Walking Path");
    }
}
