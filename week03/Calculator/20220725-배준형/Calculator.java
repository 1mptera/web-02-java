import javax.swing.*;
import java.awt.*;

public class Calculator {

    public static final String[] OPERATORS = new String[]{"+", "-", "*", "/", "="};

    private long accumulator = 0;
    private long currentNumber = 0;
    private String currentOperator = "";

    private JTextField textField;
    private JPanel panel;

    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    public void run() {

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(10);
        updateDisplay(currentNumber);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.PAGE_START);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));
        frame.add(panel);

        initNumberButtons();
        initOperatorButtons();


        frame.pack();
        frame.setVisible(true);
    }

    public void initNumberButtons() {
        for (int i = 0; i < 10; i += 1) {
            int number = (i + 1) % 10;
            JButton button = new JButton(Integer.toString(number));
            button.addActionListener(event -> {
                addNumber(number);
                updateDisplay(currentNumber);
            });
            panel.add(button);
        }
    }

    public void addNumber(int number) {
        currentNumber *= 10;
        currentNumber += number;
    }

    public void initOperatorButtons() {
        for (String operator : OPERATORS) {
            JButton button = new JButton(operator);
            button.addActionListener(event -> {
                calculate(operator);
                currentOperator = operator;
                updateDisplay(accumulator);
            });
            panel.add(button);
        }
    }

    public void calculate(String operator) {
        switch (currentOperator) {
            case "" -> accumulator = currentNumber;
            case "+" -> accumulator += currentNumber;
            case "-" -> accumulator -= currentNumber;
            case "*" -> accumulator *= currentNumber;
            case "/" -> accumulator /= currentNumber;
        }

        currentNumber = 0;
    }

    public void updateDisplay(long number) {
        textField.setText(Long.toString(number));
    }
}