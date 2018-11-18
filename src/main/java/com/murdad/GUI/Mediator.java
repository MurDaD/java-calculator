package com.murdad.GUI;

import com.murdad.GUI.numbers.*;
import com.murdad.GUI.operations.*;
import com.murdad.calculator.Calculator;
import com.murdad.utils.Utils;

import javax.swing.*;
import java.awt.*;

public class Mediator implements MediatorInterface {

    // TODO: change numbers String format to BigDecimal
    private String number1;
    private String number2;
    private int operation = 0;
    // TODO: Implement memory
    private String memory;
    private boolean clearOnNextNumber = false;

    private JTextField textField;
    private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFour;
    private JButton buttonFive;
    private JButton buttonSix;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;
    private JButton buttonZero;
    private JButton buttonDel;
    private JButton buttonDot;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private JButton buttonEquals;
    private JButton buttonAllClear;

    @Override
    public void registerComponent(Component component) {
        System.out.println("Registering component " + component.getName());
        component.setMediator(this);
        switch (component.getName()) {
            case "ButtonOne":
                buttonOne = (ButtonOne)component;
                break;
            case "ButtonTwo":
                buttonTwo = (ButtonTwo)component;
                break;
            case "ButtonThree":
                buttonThree = (ButtonThree)component;
                break;
            case "ButtonFour":
                buttonFour = (ButtonFour)component;
                break;
            case "ButtonFive":
                buttonFive = (ButtonFive)component;
                break;
            case "ButtonSix":
                buttonSix = (ButtonSix)component;
                break;
            case "ButtonSeven":
                buttonSeven = (ButtonSeven)component;
                break;
            case "ButtonEight":
                buttonEight = (ButtonEight)component;
                break;
            case "ButtonNine":
                buttonNine = (ButtonNine)component;
                break;
            case "ButtonZero":
                buttonZero = (ButtonZero)component;
                break;
            case "ButtonDot":
                buttonDot = (ButtonDot)component;
                break;
            case "ButtonDel":
                buttonDel = (ButtonDel)component;
                break;
            case "ButtonPlus":
                buttonPlus = (ButtonPlus)component;
                break;
            case "ButtonMinus":
                buttonMinus = (ButtonMinus)component;
                break;
            case "ButtonMultiply":
                buttonMultiply = (ButtonMultiply)component;
                break;
            case "ButtonDivide":
                buttonDivide = (ButtonDivide)component;
                break;
            case "ButtonEquals":
                buttonEquals = (ButtonEquals)component;
                break;
            case "ButtonAllClear":
                buttonAllClear = (ButtonAllClear)component;
                break;
            case "TextField":
                textField = (TextField)component;
                break;
        }
    }

    @Override
    public void addToScreen(String value) {
        if (this.clearOnNextNumber) {
            replaceOnScreen(value);
            this.clearOnNextNumber = false;
        } else {
            textField.setText(textField.getText() + value);
        }
    }

    @Override
    public void addOperation(int value) {
        this.number1 = textField.getText();
        this.clearScreen();
        this.operation = value;
        this.clearOnNextNumber = true;
        textField.setText(this.number1);
    }

    @Override
    public void addDot() {
        if (!textField.getText().contains(".")) {
            if (textField.getText().equals("")) {
                this.addToScreen("0");

            }
            this.addToScreen(".");
        }
    }

    @Override
    public void replaceOnScreen(String value) {
        // TODO: add flashing
        textField.setText(value);
    }

    @Override
    public void clearOne() {
        textField.setText( Utils.removeLastChar( textField.getText() ) );
    }

    @Override
    public void clearScreen() {
        textField.setText("");
    }

    @Override
    public void clearAll() {
        textField.setText("");
        this.memory = "";
        this.number1 = "";
        this.number2 = "";
        this.operation = 0;
    }

    @Override
    public void calculate() {
        if (this.operation != 0) {
            if (this.number1 == null) {
                this.number1 = textField.getText();
            } else {
                this.number2 = textField.getText();
            }
            String result = Calculator.calculate(Double.parseDouble(this.number1), Double.parseDouble(this.number2), this.operation);
            // TODO: add flashing
            textField.setText(result);
            this.number1 = null;
        }
    }

    @Override
    public void createGUI() {
        JFrame calculator = new JFrame("Calculator");
        calculator.setSize(200, 330);
        calculator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel input = new JPanel();
        input.setMaximumSize(new Dimension(200, 70));
        input.setLayout(new BoxLayout(input, BoxLayout.LINE_AXIS));

        textField = new TextField();
        Font font = new Font("SansSerif", Font.PLAIN, 24);
        textField.setFont(font);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        textField.setBounds(30, 40, 200, 70);
        input.add(textField);

        JPanel buttons = new JPanel(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();
        buttons.setSize(200, 260);

        // Grid Bag default
        gridConstraints.fill = GridBagConstraints.BOTH;
        gridConstraints.weightx = 0.5;
        gridConstraints.weighty = 0.5;

        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        buttons.add(buttonAllClear, gridConstraints);

        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        buttons.add(buttonDivide, gridConstraints);

        gridConstraints.gridx = 2;
        gridConstraints.gridy = 0;
        buttons.add(buttonMultiply, gridConstraints);

        gridConstraints.gridx = 3;
        gridConstraints.gridy = 0;
        buttons.add(buttonMinus, gridConstraints);

        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        buttons.add(buttonOne, gridConstraints);

        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        buttons.add(buttonTwo, gridConstraints);

        gridConstraints.gridx = 2;
        gridConstraints.gridy = 1;
        buttons.add(buttonThree, gridConstraints);

        gridConstraints.gridx = 3;
        gridConstraints.gridy = 1;
        gridConstraints.gridheight = 2;
        buttons.add(buttonPlus, gridConstraints);
        // reset
        gridConstraints.gridheight = 1;

        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        buttons.add(buttonFour, gridConstraints);

        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        buttons.add(buttonFive, gridConstraints);

        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        buttons.add(buttonSix, gridConstraints);

        gridConstraints.gridx = 3;
        gridConstraints.gridy = 3;
        gridConstraints.gridheight = 2;
        buttons.add(buttonEquals, gridConstraints);
        // reset
        gridConstraints.gridheight = 1;

        gridConstraints.gridx = 0;
        gridConstraints.gridy = 3;
        buttons.add(buttonSeven, gridConstraints);

        gridConstraints.gridx = 1;
        gridConstraints.gridy = 3;
        buttons.add(buttonEight, gridConstraints);

        gridConstraints.gridx = 2;
        gridConstraints.gridy = 3;
        buttons.add(buttonNine, gridConstraints);

        gridConstraints.gridx = 0;
        gridConstraints.gridy = 4;
        buttons.add(buttonDel, gridConstraints);

        gridConstraints.gridx = 1;
        gridConstraints.gridy = 4;
        buttons.add(buttonZero, gridConstraints);

        gridConstraints.gridx = 2;
        gridConstraints.gridy = 4;
        buttons.add(buttonDot, gridConstraints);

        mainPanel.add(input);
        mainPanel.add(buttons);
        calculator.setLayout(null);
        calculator.setContentPane(mainPanel);
        calculator.setResizable(false);
        calculator.setLocationRelativeTo(null);
        calculator.setVisible(true);
    }
}
