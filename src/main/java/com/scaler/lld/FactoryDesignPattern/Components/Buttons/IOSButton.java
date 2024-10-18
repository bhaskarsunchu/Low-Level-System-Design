package com.scaler.lld.FactoryDesignPattern.Components.Buttons;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("IOS button clicking");
    }
    @Override
    public void changeSize() {
        System.out.println("IOS button changing size");
    }
}
