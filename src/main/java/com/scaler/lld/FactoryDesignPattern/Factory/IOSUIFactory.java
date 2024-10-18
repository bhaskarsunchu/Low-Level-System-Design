package com.scaler.lld.FactoryDesignPattern.Factory;

import com.scaler.lld.FactoryDesignPattern.Components.Buttons.Button;
import com.scaler.lld.FactoryDesignPattern.Components.Buttons.IOSButton;
import com.scaler.lld.FactoryDesignPattern.Components.Menu.Menu;
import com.scaler.lld.FactoryDesignPattern.Components.Menu.IOSMenu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
