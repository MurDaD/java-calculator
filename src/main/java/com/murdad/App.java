package com.murdad;

import com.murdad.GUI.*;
import com.murdad.GUI.numbers.*;
import com.murdad.GUI.operations.*;

public class App {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        // Numbers
        mediator.registerComponent(new ButtonOne());
        mediator.registerComponent(new ButtonTwo());
        mediator.registerComponent(new ButtonThree());
        mediator.registerComponent(new ButtonFour());
        mediator.registerComponent(new ButtonFive());
        mediator.registerComponent(new ButtonSix());
        mediator.registerComponent(new ButtonSeven());
        mediator.registerComponent(new ButtonEight());
        mediator.registerComponent(new ButtonNine());
        mediator.registerComponent(new ButtonZero());
        mediator.registerComponent(new ButtonDot());
        // Operations
        mediator.registerComponent(new ButtonEquals());
        mediator.registerComponent(new ButtonPlus());
        mediator.registerComponent(new ButtonMinus());
        mediator.registerComponent(new ButtonMultiply());
        mediator.registerComponent(new ButtonDivide());
        // Service Buttons
        mediator.registerComponent(new ButtonAllClear());
        mediator.registerComponent(new ButtonDel());
        // Main text field
        mediator.registerComponent(new TextField());

        mediator.createGUI();
    }
}