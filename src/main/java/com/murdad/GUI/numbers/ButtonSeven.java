package com.murdad.GUI.numbers;

import com.murdad.GUI.Button;
import com.murdad.GUI.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonSeven extends JButton implements Button {
    private Mediator mediator;

    public ButtonSeven() {
        super("7");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        this.mediator.addToScreen("7");
    }

    public String getName() {
        return "ButtonSeven";
    }
}
