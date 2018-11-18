package com.murdad.GUI;

import javax.swing.*;

public class TextField extends JTextField implements Component {
    Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "TextField";
    }
}
