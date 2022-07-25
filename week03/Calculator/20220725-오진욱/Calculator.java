import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;

    private CoreCalculator core;

    public static void main(String[] args) {
        Calculator application = new Calculator();

        application.run();
    }

    public void run() {
        core = new CoreCalculator();

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        textField = new JTextField(10);
        updateDisplay(core.getCurrentNumber());
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
        for (int i = 1; i <= 10; i += 1) {
            int number = i % 10;
            JButton button = new JButton(Integer.toString(number));
            button.addActionListener(event -> {
                core.addNumber(number);

                updateDisplay(core.getCurrentNumber());
            });
            panel.add(button);
        }
    }

    public void initOperatorButtons() {
        for (String operator : core.OPERATORS) {
            JButton button = new JButton(operator);
            button.addActionListener(event -> {

                core.calculate();
                core.updateOperator(operator);
                updateDisplay(core.getAccumulator());

            });
            panel.add(button);
        }
    }
    public void updateDisplay(long number){
        textField.setText(Long.toString(number));
    }
}
