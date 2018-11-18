package com.murdad.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonAllClear extends JButton implements Button {
    private Mediator mediator;

    public ButtonAllClear() {
        super("AC");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        this.mediator.clearAll();
    }

    public String getName() {
        return "ButtonAllClear";
    }
}
