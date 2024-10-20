package com.scaler.lld.StrategyDesignPattern;

public class GoogleMaps {
    public static void findPath(String from, String to, String mode) {
        PathCalculatorStrategy pathCalculatorStrategy =
                PathCalculatorFactory.getPathCalculatorForMode(mode);

        pathCalculatorStrategy.findPath(from, to);
    }
}
