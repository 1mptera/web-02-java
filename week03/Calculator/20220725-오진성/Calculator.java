import javax.swing.*;
import java.awt.*;

public class Calculator {
    private Calculation calculation;
    private JTextField textField;
    private JPanel panel;
    public static void main(String[] args) {
        Calculator application = new Calculator();

        application.run();
    }

    private void run() {
        calculation = new Calculation();
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        textField = new JTextField(10);
        display(calculation.getcurrentnumber());
        textField.enableInputMethods(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField, BorderLayout.PAGE_START);

        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(4, 4));

        initNumberButtons();
        initOperatorButtons();

        frame.pack();
        frame.setVisible(true);
    }

    private void initOperatorButtons() {

        for (String operator : calculation.getOperators()) {
            JButton button = new JButton(operator);
            button.addActionListener(event -> {
                calculation.caculate();
                calculation.updateOperator(operator);
                display(calculation.getaccumulator());
            });
            panel.add(button);
        }
    }

    private void initNumberButtons() {
        for (int i = 0; i < 10; i += 1) {
            int numbers = (i + 1) % 10;
            JButton button = new JButton(Integer.toString(numbers));
            button.addActionListener(event -> {
                calculation.addnumber(numbers);
                display(calculation.getcurrentnumber());
            });

            panel.add(button);
        }
    }

    private void display(Long number) {
        textField.setText(Long.toString(number));
    }
}
