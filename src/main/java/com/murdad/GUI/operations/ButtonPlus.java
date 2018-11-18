package com.murdad.GUI.operations;

import com.murdad.GUI.Button;
import com.murdad.GUI.Mediator;
import com.murdad.calculator.enums.Operations;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonPlus extends JButton implements Button {
    private Mediator mediator;

    public ButtonPlus() {
        super("+");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        this.mediator.addOperation(Operations.ADDITION);
    }

    public String getName() {
        return "ButtonPlus";
    }
}
