package com.murdad.GUI.operations;

import com.murdad.GUI.Button;
import com.murdad.GUI.Mediator;
import com.murdad.calculator.enums.Operations;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonDivide extends JButton implements Button {
    private Mediator mediator;

    public ButtonDivide() {
        super("/");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        this.mediator.addOperation(Operations.DIVISION);
    }

    public String getName() {
        return "ButtonDivide";
    }
}
