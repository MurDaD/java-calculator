package com.murdad.GUI;

import com.murdad.GUI.Component;

public interface MediatorInterface {
    void registerComponent(Component component);
    void addToScreen(String value);
    void addOperation(int value);
    void addDot();
    void replaceOnScreen(String value);
    void clearOne();
    void clearScreen();
    void clearAll();
    void calculate();
    void createGUI();
}
