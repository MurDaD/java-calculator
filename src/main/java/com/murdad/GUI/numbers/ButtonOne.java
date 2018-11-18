package com.murdad.GUI.numbers;

import com.murdad.GUI.Button;
import com.murdad.GUI.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonOne extends JButton implements Button {
    private Mediator mediator;

    public ButtonOne() {
        super("1");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        this.mediator.addToScreen("1");
    }

    public String getName() {
        return "ButtonOne";
    }
}
