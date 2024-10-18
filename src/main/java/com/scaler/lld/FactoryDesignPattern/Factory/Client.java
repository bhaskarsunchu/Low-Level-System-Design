package com.scaler.lld.FactoryDesignPattern.Factory;


import com.scaler.lld.FactoryDesignPattern.Components.Buttons.Button;
import com.scaler.lld.FactoryDesignPattern.Components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.WINDOWS);
        Button button = uiFactory.createButton();
        button.click();
        button.changeSize();
        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}
