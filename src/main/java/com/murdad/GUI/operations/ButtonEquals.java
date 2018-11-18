package com.murdad.GUI.operations;

import com.murdad.GUI.Button;
import com.murdad.GUI.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonEquals extends JButton implements Button {
    private Mediator mediator;

    public ButtonEquals() {
        super("=");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        this.mediator.calculate();
    }

    public String getName() {
        return "ButtonEquals";
    }
}
