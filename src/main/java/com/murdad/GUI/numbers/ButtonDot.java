package com.murdad.GUI.numbers;

import com.murdad.GUI.Button;
import com.murdad.GUI.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonDot extends JButton implements Button {
    private Mediator mediator;

    public ButtonDot() {
        super(".");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        this.mediator.addDot();
    }

    public String getName() {
        return "ButtonDot";
    }
}
