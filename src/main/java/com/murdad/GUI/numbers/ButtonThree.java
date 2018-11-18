package com.murdad.GUI.numbers;

import com.murdad.GUI.Button;
import com.murdad.GUI.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonThree extends JButton implements Button {
    private Mediator mediator;

    public ButtonThree() {
        super("3");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        this.mediator.addToScreen("3");
    }

    public String getName() {
        return "ButtonThree";
    }
}
