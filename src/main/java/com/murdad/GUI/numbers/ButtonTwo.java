package com.murdad.GUI.numbers;

import com.murdad.GUI.Button;
import com.murdad.GUI.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonTwo extends JButton implements Button {
    private Mediator mediator;

    public ButtonTwo() {
        super("2");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        this.mediator.addToScreen("2");
    }

    public String getName() {
        return "ButtonTwo";
    }
}
