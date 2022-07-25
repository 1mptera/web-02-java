import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JFrame frame;
    private JPanel panel;
    private long currentNumber = 0;
    private long accumulator = 0;
    private String currentOperator = "";
    private JTextField textField;

    public static void main(String[] args) {
        Calculator application = new Calculator();

        application.run();
    }

    public void run() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

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

    private void initOperatorButtons() {
        String[] operators = new String[]{"+", "*", "-", "/", "="};
        for (String operator : operators) {
            JButton button = new JButton(operator);
            button.addActionListener(event -> {
//               n1 : cur n1, => show cur
//               + : acc n1(acc += n1), curop : +, cur 0 => show acc
//               n2 : acc n1 + n2, curop : 0, cur n2 => show cur
//               = : acc n1 + n2 =>  show acc
                switch(currentOperator) {
                    case "" -> accumulator = currentNumber;
                    case "+" -> accumulator += currentNumber;
                    case "-" -> accumulator -= currentNumber;
                    case "*" -> accumulator *= currentNumber;
                    case "/" -> accumulator /= currentNumber;
                    case "=" -> accumulator = accumulator;
                }
                currentOperator = operator;
                currentNumber = 0;
                updateDisplay(accumulator);

            });
            panel.add(button);
        }

    }

    private void initNumberButtons() {
        for (int i = 1; i <= 10; i += 1) {
            int number = i % 10;
            JButton button = new JButton(Integer.toString(number));
            button.addActionListener(event -> {
                currentNumber *= 10;
                currentNumber += number;

                updateDisplay(currentNumber);
            });
            panel.add(button);
        }
    }

    public void updateDisplay(long number){
        textField.setText(Long.toString(number));
    }


}
