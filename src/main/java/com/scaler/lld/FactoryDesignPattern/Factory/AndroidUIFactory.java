package com.scaler.lld.FactoryDesignPattern.Factory;

import com.scaler.lld.FactoryDesignPattern.Components.Buttons.AndroidButton;
import com.scaler.lld.FactoryDesignPattern.Components.Buttons.Button;
import com.scaler.lld.FactoryDesignPattern.Components.Menu.AndroidMenu;
import com.scaler.lld.FactoryDesignPattern.Components.Menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
