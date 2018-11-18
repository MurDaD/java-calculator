package com.murdad.GUI.operations;

import com.murdad.GUI.Button;
import com.murdad.GUI.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonDel extends JButton implements Button {
    private Mediator mediator;

    public ButtonDel() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        this.mediator.clearOne();
    }

    public String getName() {
        return "ButtonDel";
    }
}
