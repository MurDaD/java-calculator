package com.murdad.GUI.numbers;

import com.murdad.GUI.Button;
import com.murdad.GUI.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonFour extends JButton implements Button {
    private Mediator mediator;

    public ButtonFour() {
        super("4");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        this.mediator.addToScreen("4");
    }

    public String getName() {
        return "ButtonFour";
    }
}
