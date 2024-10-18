package com.scaler.lld.FactoryDesignPattern.Factory;

import com.scaler.lld.FactoryDesignPattern.Components.Buttons.Button;
import com.scaler.lld.FactoryDesignPattern.Components.Menu.Menu;

public interface UIFactory {
    //Factory Methods.
    Button createButton();
    Menu createMenu();
    //createDropDown();
}
