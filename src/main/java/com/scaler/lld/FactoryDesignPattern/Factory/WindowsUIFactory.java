package com.scaler.lld.FactoryDesignPattern.Factory;

import com.scaler.lld.FactoryDesignPattern.Components.Buttons.Button;
import com.scaler.lld.FactoryDesignPattern.Components.Buttons.WindowsButton;
import com.scaler.lld.FactoryDesignPattern.Components.Menu.Menu;
import com.scaler.lld.FactoryDesignPattern.Components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
